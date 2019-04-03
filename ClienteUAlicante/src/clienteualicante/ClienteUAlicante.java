/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteualicante;

import uasi.ws_gral.ArrayOfClaseAlojamiento;

/**
 *
 * @author k_ike
 */
public class ClienteUAlicante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayOfClaseAlojamiento alojamiento=wsalojamientos();
        for(int i=0;i<alojamiento.getClaseAlojamiento().size();i++){
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getCodigoregimen());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getCodigotipo());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getContacto());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getDescripcionregimen());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getDescripciontipo());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getDescripcionzona());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getDireccion());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getEmailcontacto());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getFecha());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getFechaalta());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getHabitaciones());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getIdalojamiento());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getIdregimen());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getIdtipo());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getIdzona());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getLatitud());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getLongitud());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getObservaciones());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getPlazas());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getPrecio());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getTelefono());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getUrladicional());
            System.out.println(alojamiento.getClaseAlojamiento().get(i).getUrlinfo());
            System.out.println("===================================================");
        }
    }

    private static ArrayOfClaseAlojamiento wsalojamientos() {
        uasi.ws_gral.PubGral service = new uasi.ws_gral.PubGral();
        uasi.ws_gral.PubGralSoap port = service.getPubGralSoap();
        return port.wsalojamientos();
    }
    
}
