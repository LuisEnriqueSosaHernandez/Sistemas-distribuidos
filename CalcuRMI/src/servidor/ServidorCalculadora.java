/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author k_ike
 */
public class ServidorCalculadora {
    public static void main(String[]args){
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            CalculadoraImpl calculadoraImpl = new CalculadoraImpl();
            reg.rebind("calculadora", calculadoraImpl);
            System.out.println("Server ready");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
