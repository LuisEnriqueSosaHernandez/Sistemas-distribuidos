
import Timer.TimeServerPOA;
import Timer.TimeServerPackage.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
public class TimeObj extends TimeServerPOA{
     private ORB orb;
    Calendar calendario;
    Time time;
  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public Time get_time() {
      calendario=new GregorianCalendar();
     return time=new Time(calendario.get(Calendar.HOUR_OF_DAY),calendario.get(Calendar.MINUTE),calendario.get(Calendar.SECOND));
    }
    @Override
    public void shutdown() {
      orb.shutdown(false);
    }
    
}
