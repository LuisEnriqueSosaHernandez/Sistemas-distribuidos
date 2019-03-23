package callback;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Ana_J
 */
public interface CallbackInterface extends Remote{
    public void notificame(String msg) throws RemoteException;
    
}
