package callback;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Ana_J
 */
public class HolaImpl extends UnicastRemoteObject implements HolaInterface{
    CallbackInterface cliente;

    public HolaImpl() throws RemoteException{
        super();
    }

    @Override
    public String diHola() throws RemoteException {
        cliente.notificame("Te saludo...");
        return "Hola como estas";
    }

    @Override
    public void registerCallback(CallbackInterface obj) throws RemoteException {
        cliente=obj;
        cliente.notificame("registrado...");
    }

    @Override
    public void recibeMensaje(String mensaje) throws RemoteException {
        System.out.println(mensaje);
    }
}