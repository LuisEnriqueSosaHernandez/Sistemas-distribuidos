
import Timer.DateTimeServer;
import Timer.DateTimeServerHelper;
import Timer.DateTimeServerPackage.DateTime;
import Timer.TimeServer;
import Timer.TimeServerHelper;
import Timer.TimeServerPackage.Time;
import java.util.Scanner;
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
public class TimerStart {
     public static void main(String[] args) {
          int opcion;
          String nombre;
          String password;
          Scanner l=new Scanner(System.in);
          Time time;
          DateTime dateTime;
        try {
	    ORB orb = ORB.init(args, null);
	    org.omg.CORBA.Object objRef =   orb.resolve_initial_references("NameService");
	    NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            NamingContextExt ncRef2 = NamingContextExtHelper.narrow(objRef);
            TimeServer timeServer=TimeServerHelper.narrow(ncRef.resolve_str("ABC"));
            DateTimeServer dateTimeServer=DateTimeServerHelper.narrow(ncRef2.resolve_str("ABCD"));
            do{
                System.out.println("0.Salir\n1.Hora\n2.Fecha y Hora");
                System.out.print("Elige una opción: ");
                opcion=l.nextInt();
                switch(opcion){
                    case 0:
                        timeServer.shutdown();
                        break;
                    case 1:
                       time =timeServer.get_time();
                       System.out.println("La hora es: "+time.hours+":"+time.minutes+":"+time.seconds);
                        break;
                    case 2:
                        dateTime=dateTimeServer.get_date_time();
                        time=dateTime.hms;
                          System.out.println("La fecha es: "+dateTime.day+"-"+dateTime.month+"-"+dateTime.day
                                  + " Y la  hora es: "+time.hours+":"+time.minutes+":"+time.seconds);
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
