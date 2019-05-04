/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k_ike
 */
import AdditionApp.*;

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.io.*;
import java.util.*;

public class StartClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            Addition obj = (Addition) AdditionHelper.narrow(ncRef.resolve_str("ABC"));

            Scanner l = new Scanner(System.in);
            System.out.println("Welcome to the calculator system:");
            int opcion, a, b;
            double a1, b1;
            do {

                System.out.println("0.Exit\n"
                        + "1.Add\n"
                        + "2.Minus\n"
                        + "3.Multiply \n"
                        + "4.Divided ");
                System.out.print("Choose a option: ");
                opcion = l.nextInt();
                switch (opcion) {
                    case 0:
                        System.out.println("Bye!");
                        break;
                    case 1:
                        System.out.print("a: ");
                        a = l.nextInt();
                        System.out.print("b: ");
                        b = l.nextInt();
                        System.out.println("Add  = " + obj.add(a, b));
                        break;
                    case 2:
                         System.out.print("a: ");
                        a = l.nextInt();
                        System.out.print("b: ");
                        b = l.nextInt();
                        System.out.println("Minus = " + obj.minus(a, b));
                        break;
                    case 3:
                        System.out.print("a: ");
                        a = l.nextInt();
                        System.out.print("b: ");
                        b = l.nextInt();
                        System.out.println("Multiply = " + obj.multiplyBy(a, b));
                        break;
                    case 4:
                        System.out.print("a: ");
                        a1 = l.nextDouble();
                        System.out.print("b: ");
                        b1 = l.nextDouble();
                        System.out.println("Divided = " + obj.dividedBy(a1, b1));
                        break;
                    default:
                        System.out.println("Incorrect choose");
                        break;
                }
            } while (opcion != 0);
        } catch (Exception e) {
            System.out.println("Hello Client exception: " + e);
            e.printStackTrace();
        }

    }

}
