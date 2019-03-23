package callback;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Ana_J
 */
public class ClienteImpl extends UnicastRemoteObject implements CallbackInterface{
    public ClienteImpl() throws RemoteException{
        super();
    }

    @Override
    public void notificame(String msg) throws RemoteException {
        System.out.println(msg);
    }
}
