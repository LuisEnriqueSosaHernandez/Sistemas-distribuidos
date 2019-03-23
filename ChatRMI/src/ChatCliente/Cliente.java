/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatCliente;

import ChatServidor.ServidorInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author k_ike
 */
public class Cliente {

    public static void main(String[] args) {
        Registry reg;
        ServidorInterface servidorInterface;
        Scanner scanner;
        String nombre;
        try {
            reg = LocateRegistry.getRegistry("localhost", 1099);
            servidorInterface = (ServidorInterface) reg.lookup("chatServidor");
            System.out.println("Cual es tu nombre: ");
            scanner = new Scanner(System.in);
            nombre = scanner.nextLine().trim();
            new Thread(new ClienteImplementacion(nombre, servidorInterface)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
