
import Fibonacci.fibona;
import Fibonacci.fibonaHelper;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.omg.CORBA.IntHolder;
import org.omg.CORBA.ORB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author k_ike
 */
public class FibonacciClient {

    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);
            FileInputStream file = new FileInputStream("fibona.ref");
            BufferedReader in = new BufferedReader(new InputStreamReader(file));
            String ref = in.readLine();
            file.close();
            fibona f = fibonaHelper.narrow(orb.string_to_object(ref));
            IntHolder fibonacci = new IntHolder();
            Scanner l=new Scanner(System.in);
            int fibito,opcion;
            do{
                System.out.println("0.Salir\n1.Fibonacci");
                System.out.println("Ingresa una opción");
                opcion=l.nextInt();
                switch(opcion){
                    case 0:
                        f.shutdown();
                        break;
                    case 1:
                        System.out.println("Ingresa una posición para saber el fibonacci");
                        fibito=l.nextInt();
                        f.fibonacci(fibito, fibonacci);
                        System.out.println(fibonacci.value);
                        break;
                }
            }while(opcion!=0);
            
        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }
}
