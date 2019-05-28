/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author k_ike
 */
@XmlType
@XmlRootElement
public class alumnos {
    String numcontrol;
    String nombre;
    String password;

    public alumnos(String numcontrol, String nombre, String password) {
        this.numcontrol = numcontrol;
        this.nombre = nombre;
        this.password = password;
    }
    public alumnos(){
        
    }

    
    public String getNumcontrol() {
        return numcontrol;
    }

    public void setNumcontrol(String numcontrol) {
        this.numcontrol = numcontrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
