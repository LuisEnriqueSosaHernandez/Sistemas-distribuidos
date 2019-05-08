
import Fibonacci.fibona;
import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author k_ike
 */
public class FibonacciServer {

    private static Object fibonaIMPL;

    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();
            FibonacciObj fibo = new FibonacciObj();
            fibona f = fibo._this(orb);
            String refe = orb.object_to_string(f);
            java.io.FileOutputStream file = new java.io.FileOutputStream("fibona.ref");
            java.io.PrintWriter out = new java.io.PrintWriter(file);
            out.println(refe);
            out.flush();
            file.close();
            System.out.println("waiting");
// ESPERAMOS INVOCACIONES DE LOS CLIENTES
            orb.run();
        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }
}
