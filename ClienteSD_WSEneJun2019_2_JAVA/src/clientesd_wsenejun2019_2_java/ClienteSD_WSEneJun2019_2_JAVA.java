/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesd_wsenejun2019_2_java;

/**
 *
 * @author k_ike
 */
public class ClienteSD_WSEneJun2019_2_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(hello("Enrique"));
    }

    private static String hello(java.lang.String name) {
        itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
        itver.ws.TestWS port = service.getTestWSPort();
        return port.hello(name);
    }

   
    
}
