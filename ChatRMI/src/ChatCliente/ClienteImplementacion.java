/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatCliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author k_ike
 */
public class ClienteImplementacion extends UnicastRemoteObject implements ClienteInterface {
    
    Scanner scanner;
    String mensaje;
    JTextArea textAreaChat;

    public ClienteImplementacion(JTextArea textAreaChat) throws RemoteException {
        
        this.textAreaChat=textAreaChat;
        
    }

    @Override
    public void recibirMensaje(String mensaje) throws RemoteException {
        textAreaChat.append(mensaje+"\n");
    }
    
   
}
