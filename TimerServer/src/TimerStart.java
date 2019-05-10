
import Timer.DateTimeServer;
import Timer.DateTimeServerHelper;
import Timer.TimeServer;
import Timer.TimeServerHelper;
import org.omg.CORBA.ORB;
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
public class TimerStart {
     public static void main(String args[]) {
    try{
      // create and initialize the ORB //// get reference to rootpoa &amp; activate the POAManager
      ORB orb = ORB.init(args, null);      
      POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
      rootpoa.the_POAManager().activate();
 
      // create servant and register it with the ORB
      TimeObj time=new TimeObj();
      time.setORB(orb); 
 
      // get object reference from the servant
      org.omg.CORBA.Object ref = rootpoa.servant_to_reference(time);
      TimeServer href = TimeServerHelper.narrow(ref);
 
      org.omg.CORBA.Object objRef =  orb.resolve_initial_references("NameService");
      NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
 
      NameComponent path[] = ncRef.to_name( "ABC" );
      ncRef.rebind(path, href);
      
      //Segundo objeto****************************
 
       DateTimeObj dateTime=new DateTimeObj();
      dateTime.setORB(orb); 
 
      // get object reference from the servant
      org.omg.CORBA.Object ref2 = rootpoa.servant_to_reference(dateTime);
      DateTimeServer href2=DateTimeServerHelper.narrow(ref2);
      
      //org.omg.CORBA.Object objRef2 =  orb.resolve_initial_references("NameService");
      NamingContextExt ncRef2 = NamingContextExtHelper.narrow(objRef);
      
      NameComponent path2[] = ncRef2.to_name( "ABCD" );
      ncRef.rebind(path2, href2);  
      
      System.out.println("Server ready and waiting ...");
 
      // wait for invocations from clients
      for (;;){
	  orb.run();
      }
    } 
 
      catch (Exception e) {
        System.err.println("ERROR: " + e);
        e.printStackTrace(System.out);
      }
 
      System.out.println("HelloServer Exiting ...");
 
  }
}
