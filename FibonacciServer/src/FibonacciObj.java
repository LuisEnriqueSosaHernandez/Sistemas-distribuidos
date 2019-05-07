
import FibonacciApp.FibonacciPOA;
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
public class FibonacciObj extends FibonacciPOA{
private ORB orb;
 
  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public int fibonacci(int x) {
       if(x==0){
           return 0;
       }else if(x==1||x==2){
           return 1;
       }else{
           return fibonacci(x-1)+fibonacci(x-2);
       }
    }

    @Override
    public void shutdown() {
       orb.shutdown(false);
    }
    
}
