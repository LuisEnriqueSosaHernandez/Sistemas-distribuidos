/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatServidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author k_ike
 */
public class Servidor {

    public static void main(String[] args) {
        Registry reg;
        ServidorImplementacion servidorImplementacion;
        try {
            reg = LocateRegistry.createRegistry(1099);
            servidorImplementacion = new ServidorImplementacion();
            reg.rebind("chatServidor", servidorImplementacion);
            System.out.println("Servidor Listo! :D");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
