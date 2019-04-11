/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienterest;

import cliente.NewJerseyClient;

/**
 *
 * @author k_ike
 */
public class ClienteRest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><customer><addressline1>8989 Red Albatross Drive</addressline1><addressline2>Suite 9897</addressline2><city>Houston</city><creditLimit>25000</creditLimit><customerId>26</customerId><discountCode><discountCode>M</discountCode><rate>11.00</rate></discountCode><email>www.wrencomp.example.com</email><fax>214-555-0134</fax><name>Wren Computers</name><phone>214-555-0133</phone><state>TX</state><zip><areaLength>328.963</areaLength><areaWidth>482.164</areaWidth><radius>758.648</radius><zipCode>85638</zipCode></zip></customer>";
        NewJerseyClient client=new NewJerseyClient();
        System.out.println(client.countREST());
        System.out.println(client.findAll_JSON(String.class));
        System.out.println(client.findAll_XML(String.class));
        System.out.println(client.find_JSON(String.class, "25"));
        System.out.println(client.find_XML(String.class, "25"));
        client.create_XML(cadena);
        System.out.println(client.countREST());
        client.close();
    }
    
}
