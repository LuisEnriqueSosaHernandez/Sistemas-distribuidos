
import Corba.ServidorPOA;
import Corba.Usuario;
import java.util.ArrayList;
import org.omg.CORBA.ORB;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.DeleteResult;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.users.FullAccount;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class objetoServidor extends ServidorPOA {

    private String path;
    private ORB orb;
    private static final String ACCESS_TOKEN = "GSBWjjzUlnAAAAAAAAAAc6qH2pGyPsviBVNo4459HIcGnVbhEoDtkmN0ZNn02hFW";
    DbxRequestConfig config;
    DbxClientV2 client;
    FullAccount account;
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public objetoServidor() throws DbxException {
        path = "";
        config = DbxRequestConfig.newBuilder("dropbox/ProyectoFinalDistribuidas").build();
        client = new DbxClientV2(config, ACCESS_TOKEN);
        account = client.users().getCurrentAccount();
    }

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    @Override
    public String path() {
        return path;
    }

    @Override
    public synchronized void notificar(String mostrar, Usuario usuario) {
        for (Usuario cc : usuarios) {
            if (cc != null) {
                try {
                    cc.notificacion(mostrar, usuario);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public synchronized void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        notificar(" nuevo usuario: ", usuario);
    }

    @Override
    public synchronized void eliminarUsuario(Usuario usuario) {
        notificar(" El siguiente usuario ha cerrado sesión: ", usuario);
        usuarios.remove(usuario);
    }

    @Override
    public synchronized boolean cargarImagen(String nombre, String path, Usuario usuario) {
        try (InputStream in = new FileInputStream(path)) {
            FileMetadata metadata = client.files().uploadBuilder("/" + nombre)
                    .uploadAndFinish(in);
            notificar(" ha cargado la imagen: " + metadata.getName(), usuario);
            return true;
        } catch (FileNotFoundException ex) {
            notificar(" ha hecho algo mal", usuario);
            ex.printStackTrace();
            Logger.getLogger(objetoServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            notificar(" ha hecho algo mal", usuario);
             ex.printStackTrace();
            Logger.getLogger(objetoServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DbxException ex) {
            notificar(" ha hecho algo mal", usuario);
             ex.printStackTrace();
            Logger.getLogger(objetoServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public synchronized boolean borrarImagen(String ruta, Usuario usuario) {
        try {
            DeleteResult metadata = client.files().deleteV2(ruta);
            notificar(" ha borrado la imagen: " + metadata.getMetadata().getName(), usuario);
            return true;
        } catch (DbxException ex) {
            notificar(" ha hecho algo mal", usuario);
            ex.printStackTrace();
            Logger.getLogger(objetoServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}