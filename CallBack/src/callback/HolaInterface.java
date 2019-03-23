package callback;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Ana_J
 */
public interface HolaInterface extends Remote{
    public String diHola() throws RemoteException;
    public void registerCallback(CallbackInterface obj) throws RemoteException;
    public void recibeMensaje(String mensaje)throws RemoteException;
}
