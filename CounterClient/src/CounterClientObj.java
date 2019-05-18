
import CBCount.CounterClientPOA;
import javax.swing.JLabel;
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
private JLabel lblCounter;
public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
public CounterClientObj(JLabel lblCounter){
    this.lblCounter=lblCounter;
}

    @Override
    public void update(int value) {
       lblCounter.setText(""+value);
    }
    
   
}
