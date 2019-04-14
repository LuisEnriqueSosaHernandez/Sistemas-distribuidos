/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author k_ike
 */
@XmlType(name = "alumnoss", propOrder = {
    "alumnos"
})
public class Alumnoss {
     @XmlElement(name = "alumnos", nillable = true)
    private List<Alumnos> alumnos=new ArrayList<Alumnos>();

    public Alumnoss() {
    }
    
    public Alumnoss(List<Alumnos> alumnos){
        this.alumnos=alumnos;
    }
     
    public List<Alumnos> getAlumnos() {
        return alumnos;
    }
    
}
