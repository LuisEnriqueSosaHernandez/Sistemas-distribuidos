
import ContactoApp.Contacto;
import ContactoApp.ContactoHolder;
import ContactoApp.IContatoPOA;
import org.omg.CORBA.ORB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uriel Alejandro
 */
public class ContactoObj extends IContatoPOA{
  private ORB orb;
 
  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    @Override
    public void validar(String user, String pwd, ContactoHolder contacto) {
        if(user.equals("kike")&&pwd.equals("12345")){
contacto.value = new Contacto("Luis Enrique","kiquesasuke@gmail.com","La polla con cebolla");
}else {
           contacto.value= new Contacto("none","none","none");
       
       }
    }

    @Override
    public void shutdown() {
      orb.shutdown(false);
    }
    
}
