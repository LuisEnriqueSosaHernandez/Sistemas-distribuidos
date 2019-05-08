
import FibonacciApp.FibonacciPOA;
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
public class FibonacciObj extends FibonacciPOA {
private ORB orb;
 
  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public void Fibonacci(IntHolder x) {
      int siguiente = 1, actual = 0, temporal = 0;
		for (long i = 1; i <= x.value; i++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		x.value=actual;
    }

    @Override
    public void shutdown() {
       orb.shutdown(false);
    }
    
}
