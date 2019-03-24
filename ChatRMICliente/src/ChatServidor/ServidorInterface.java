/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatServidor;

import ChatCliente.ClienteInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author k_ike
 */
public interface ServidorInterface extends Remote {

    public void registrarCliente(ClienteInterface cliente, String nombre) throws RemoteException;

    public void trasmitirMensaje(String mensaje) throws RemoteException;
}
