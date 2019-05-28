
import Interfaces.Cliente;
import Interfaces.ClientePOA;
import javax.naming.Context;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.omg.CORBA.ORB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k_ike
 */
public class ClienteOBJ extends ClientePOA{
    private String nombre;
    private ORB orb;
    private JTextArea txtNotificaciones;
    public ClienteOBJ(String nombre,JTextArea txtNotificaciones){
        this.nombre=nombre;
        this.txtNotificaciones=txtNotificaciones;
    }
public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public String nombre() {
       return nombre;
    }

    @Override
    public void mostrarNotificacion(String mensaje, Cliente cliente) {
        txtNotificaciones.append(cliente.nombre()+mensaje+"\n");
    }
    
}
