
import Timer.DateTimeServerPOA;
import Timer.DateTimeServerPackage.DateTime;
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
public class DateTimeObj extends DateTimeServerPOA{
 private ORB orb;
Calendar calendario;
Time time;
DateTime dateTime;
public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public DateTime get_date_time() {
        calendario=new GregorianCalendar();
        time=new Time(calendario.get(Calendar.HOUR_OF_DAY),calendario.get(Calendar.MINUTE),calendario.get(Calendar.SECOND));
     return dateTime=new DateTime(calendario.get(Calendar.DAY_OF_MONTH),calendario.get(Calendar.MONTH),calendario.get(Calendar.YEAR),time);
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
