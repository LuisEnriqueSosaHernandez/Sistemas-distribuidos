
import CBCount.CounterClient;
import CBCount.CounterPOA;
import java.util.ArrayList;
import java.util.List;
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
public class CounterObj extends CounterPOA{
private int count;
private ORB orb;
private List<CounterClient> clients = new ArrayList<>();
public CounterObj(){
    count=0;
}
public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public int value() {
       return count;
    }

    @Override
    public void inc() {
        count++;
        _notify();
    }

    @Override
    public void dec() {
       count--;
       _notify();
    }

    @Override
    public synchronized void add(CounterClient cc) {
       clients.add(cc);
    }

    @Override
    public synchronized void remove(CounterClient cc) {
        clients.remove(cc);
    }
   
    public synchronized void _notify(){
        for(CounterClient cc:clients){
            if(cc!=null){
                try {
                    cc.update(count);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
