package callback;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Ana_J
 */
public class CallBack2 {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost",1099);
            HolaInterface svr = (HolaInterface) reg.lookup("Hola");
            ClienteImpl cliente = new ClienteImpl();
            svr.registerCallback(cliente);
            System.out.println(svr.diHola());
            svr.recibeMensaje("Hola servidor");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
