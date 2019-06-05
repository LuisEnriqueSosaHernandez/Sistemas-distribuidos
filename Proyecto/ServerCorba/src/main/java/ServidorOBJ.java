
import Interfaces.Cliente;
import Interfaces.ServidorPOA;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author k_ike
 */
public class ServidorOBJ extends ServidorPOA {

    private String ruta;
    private ORB orb;
    private static final String ACCESS_TOKEN = "aK0Z1gEpabAAAAAAAAABh1FQmIJjVuBBq5hX86WFvk-9teLshcZtpw2H9EgOCaaq";
    DbxRequestConfig config;
    DbxClientV2 client;
    FullAccount account;
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ServidorOBJ() throws DbxException {
        ruta = "";
        config = DbxRequestConfig.newBuilder("dropbox/proyecto-distribuido").build();
        client = new DbxClientV2(config, ACCESS_TOKEN);
        account = client.users().getCurrentAccount();
    }

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    @Override
    public String ruta() {
        return ruta;
    }

    @Override
    public synchronized void escribirCliente(Cliente cliente) {
        clientes.add(cliente);
        notificar(" ha ingresado a la sala de: " + account.getName().getDisplayName(), cliente);
    }

    @Override
    public synchronized void borrarCliente(Cliente cliente) {
        notificar(" ha abandonado la sala de: " + account.getName().getDisplayName(), cliente);
        clientes.remove(cliente);
    }

    @Override
    public synchronized boolean subirImagen(String nombre, String ruta, Cliente cliente) {
        try (InputStream in = new FileInputStream(ruta)) {
            FileMetadata metadata = client.files().uploadBuilder("/SistemasDistribuidos/" + nombre)
                    .uploadAndFinish(in);
            notificar(" ha subido la imagen: " + metadata.getName(), cliente);
            return true;
        } catch (FileNotFoundException ex) {
            notificar(" ha cometido un error", cliente);
            Logger.getLogger(ServidorOBJ.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            notificar(" ha cometido un error", cliente);
            Logger.getLogger(ServidorOBJ.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DbxException ex) {
            notificar(" ha cometido un error", cliente);
            Logger.getLogger(ServidorOBJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public synchronized boolean eliminarImagen(String ruta, Cliente cliente) {
        try {
            DeleteResult metadata = client.files().deleteV2(ruta);
            notificar(" ha eliminado la imagen: " + metadata.getMetadata().getName(), cliente);
            return true;
        } catch (DbxException ex) {
            notificar(" ha cometido un error", cliente);
            Logger.getLogger(ServidorOBJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public synchronized void notificar(String mensaje, Cliente cliente) {
        for (Cliente cc : clientes) {
            if (cc != null) {
                try {
                    cc.mostrarNotificacion(mensaje, cc);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
