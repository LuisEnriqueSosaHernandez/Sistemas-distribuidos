/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatServidor;

import ChatCliente.ClienteInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author k_ike
 */
public class ServidorImplementacion extends UnicastRemoteObject implements ServidorInterface {

    private ArrayList<ClienteInterface> clientes;
    int i;

    public ServidorImplementacion() throws RemoteException {
        inicializarComponentes();

    }

    private void inicializarComponentes() {
        clientes = new ArrayList<>();
        i = 0;
    }

    @Override
    public synchronized void registrarCliente(ClienteInterface cliente, String nombre) throws RemoteException {
        clientes.add(cliente);
        i = 0;
        while (i < clientes.size()) {

            this.clientes.get(i).recibirMensaje(nombre + " se ha unido a la conversación");

            i++;
        }
    }

    @Override
    public synchronized void trasmitirMensaje(String mensaje) throws RemoteException {
        i = 0;
        while (i < clientes.size()) {
            clientes.get(i).recibirMensaje(mensaje);
            i++;
        }
    }

}
