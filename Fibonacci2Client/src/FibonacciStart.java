
import FibonacciApp.Fibonacci;
import FibonacciApp.FibonacciHelper;
import java.util.Scanner;
import org.omg.CORBA.IntHolder;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k_ike
 */
public class FibonacciStart {
    public static void main(String[] args) {
        int opcion;
        Scanner l;
        IntHolder x=new IntHolder();
        try {
	    ORB orb = ORB.init(args, null);
	    org.omg.CORBA.Object objRef =   orb.resolve_initial_references("NameService");
	    NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            Fibonacci fibo = FibonacciHelper.narrow(ncRef.resolve_str("ABC"));
            l=new Scanner(System.in);
            do{
                System.out.println("0.Salir\n1.Número Fibonacci");
                System.out.print("Elige una opción: ");
                opcion=l.nextInt();
                switch(opcion){
                    case 0:
                        fibo.shutdown();
                        break;
                    case 1:
                        System.out.print("Escribe el número: ");
                        x.value=l.nextInt();
                        fibo.Fibonacci(x);
                        System.out.println(x.value);
                        break;
                    default:
                        System.out.println("Opción incorrecta...");
                        break;
                }
            }while(opcion!=0);
           
       }
       catch (Exception e) {
          System.out.println("Hello Client exception: " + e);
	  e.printStackTrace();
       }
    }  
}
