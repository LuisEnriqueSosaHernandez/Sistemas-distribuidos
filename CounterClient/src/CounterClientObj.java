
import CBCount.CounterClientPOA;
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
public class CounterClientObj extends CounterClientPOA{
private ORB orb;
public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public void update(int value) {
        System.out.println("Alguien ha cambiado el valor a: "+value);
    }
    
}
