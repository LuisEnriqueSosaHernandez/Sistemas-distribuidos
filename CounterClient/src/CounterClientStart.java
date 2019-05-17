
import CBCount.Counter;
import CBCount.CounterClient;
import CBCount.CounterClientHelper;
import CBCount.CounterHelper;
import java.awt.HeadlessException;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
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
public class CounterClientStart {

    public static void main(String[] args) {
        int opcion;
        Scanner l;
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            Counter counter = CounterHelper.narrow(ncRef.resolve_str("ABC"));

            //Creacion del objeto local 
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            CounterClientObj counterClientObj = new CounterClientObj();
            counterClientObj.setORB(orb);

            // get object reference from the servant
            org.omg.CORBA.Object ref2 = rootpoa.servant_to_reference(counterClientObj);
            CounterClient href2 = CounterClientHelper.narrow(ref2);

            //org.omg.CORBA.Object objRef2 =  orb.resolve_initial_references("NameService");
            NamingContextExt ncRef2 = NamingContextExtHelper.narrow(objRef);

            NameComponent path2[] = ncRef2.to_name("ABCD");
            ncRef.rebind(path2, href2);

            CounterClient counterClient = CounterClientHelper.narrow(ncRef2.resolve_str("ABCD"));
            counter.add(counterClient);
            l = new Scanner(System.in);
            opcion = 0;
            do {
                System.out.println("1.Incrementar\n2.Decrementar\n3.Salir");
                opcion = l.nextInt();
                switch (opcion) {
                    case 1:
                        counter.inc();
                        break;
                    case 2:
                        counter.dec();
                        break;
                    case 3:
                        counter.remove(counterClient);
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }
            } while (opcion != 3);
        } catch (Exception e) {
            System.out.println("Hello Client exception: " + e);
            e.printStackTrace();
        }
    }
}
