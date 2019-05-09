
import ContactoApp.ContactoHolder;
import ContactoApp.IContato;
import ContactoApp.IContatoHelper;
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
 * @author Uriel Alejandro
 */
public class ContactoStart {
      public static void main(String[] args) {
          int opcion;
          String nombre;
          String password;
          Scanner l=new Scanner(System.in);
          ContactoHolder cHolder=new ContactoHolder();
        try {
	    ORB orb = ORB.init(args, null);
	    org.omg.CORBA.Object objRef =   orb.resolve_initial_references("NameService");
	    NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            IContato icon=IContatoHelper.narrow(ncRef.resolve_str("ABC"));
            do{
                System.out.println("0.Salir\n1.Loguearse");
                System.out.print("Elige una opción: ");
                opcion=l.nextInt();
                switch(opcion){
                    case 0:
                        icon.shutdown();
                        break;
                    case 1:
                        System.out.println("Escribe el nombre: ");
                        nombre=l.next();
                        System.out.println("Escribe la contraseña:");
                        password=l.next();
                        icon.validar(nombre, password, cHolder);
                        System.out.println(cHolder.value.usuario+" "+cHolder.value.correo+" "+cHolder.value.tipo);
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
