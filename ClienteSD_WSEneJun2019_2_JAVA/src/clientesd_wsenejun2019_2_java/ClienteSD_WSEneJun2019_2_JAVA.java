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
        System.out.println("10/5 = "+div(10.0,2.0));
        System.out.println("10*5 = "+mult(10.0,5.0));
        System.out.println("2^3 = "+pot(2.0,3.0));
        System.out.println("90-65 = "+resta(90.0,65.0));
        System.out.println("500+600 = "+suma(500.0,600.0));
    }

    private static String hello(java.lang.String name) {
        itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
        itver.ws.TestWS port = service.getTestWSPort();
        return port.hello(name);
    }

    private static Double div(java.lang.Double x, java.lang.Double y) {
        itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
        itver.ws.TestWS port = service.getTestWSPort();
        return port.div(x, y);
    }

    private static Double mult(java.lang.Double x, java.lang.Double y) {
        itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
        itver.ws.TestWS port = service.getTestWSPort();
        return port.mult(x, y);
    }

    private static Double pot(java.lang.Double x, java.lang.Double y) {
        itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
        itver.ws.TestWS port = service.getTestWSPort();
        return port.pot(x, y);
    }

    private static Double resta(java.lang.Double x, java.lang.Double y) {
        itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
        itver.ws.TestWS port = service.getTestWSPort();
        return port.resta(x, y);
    }

    private static Double suma(java.lang.Double x, java.lang.Double y) {
        itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
        itver.ws.TestWS port = service.getTestWSPort();
        return port.suma(x, y);
    }

   
    
}
