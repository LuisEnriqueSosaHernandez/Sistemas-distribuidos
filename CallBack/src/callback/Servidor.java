package callback;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Ana_J
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            HolaImpl hola = new HolaImpl();
            reg.rebind("Hola", hola);
            System.out.println("Servidor Listo! :D");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
