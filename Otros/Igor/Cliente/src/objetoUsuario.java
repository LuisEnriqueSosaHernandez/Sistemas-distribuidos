
import Corba.Usuario;
import Corba.UsuarioPOA;
import javax.naming.Context;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.omg.CORBA.ORB;

public class objetoUsuario extends UsuarioPOA{
    private String usuario;
    private ORB orb;
    public objetoUsuario(String usuario){
        this.usuario=usuario;
    }
public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public String usuario() {
       return usuario;
    }

    @Override
    public void notificacion(String mensaje, Usuario usuario) {
        System.out.println(usuario.usuario()+mensaje);
    }
    
}
