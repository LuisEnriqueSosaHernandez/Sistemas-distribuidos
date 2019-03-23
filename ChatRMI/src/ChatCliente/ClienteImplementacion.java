/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatCliente;

import ChatServidor.ServidorInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 *
 * @author k_ike
 */
public class ClienteImplementacion extends UnicastRemoteObject implements ClienteInterface, Runnable {

    private ServidorInterface servidorInterface;
    private String name;
    Scanner scanner;
    String mensaje;

    public ClienteImplementacion(String nombre, ServidorInterface servidorInterface) throws RemoteException {
        this.name = nombre;
        this.servidorInterface = servidorInterface;
        servidorInterface.registrarCliente(this, name);
    }

    @Override
    public void recibirMensaje(String mensaje) throws RemoteException {
        System.out.println(mensaje);
    }

    @Override
    public void run() {
        scanner = new Scanner(System.in);

        while (true) {
            mensaje = scanner.nextLine().trim();
            try {
                servidorInterface.trasmitirMensaje(name + ": " + mensaje);
            } catch (RemoteException e) {
                e.printStackTrace();
            }

        }
    }
}
