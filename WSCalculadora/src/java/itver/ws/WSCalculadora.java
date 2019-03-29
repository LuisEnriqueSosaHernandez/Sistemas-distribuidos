/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itver.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author k_ike
 */
@WebService(serviceName = "WSCalculadora")
public class WSCalculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "suma")
    public Double suma(@WebParam(name = "x") Double x,@WebParam(name = "y") Double y) {
        return x+y;
    }
    
    @WebMethod(operationName = "resta")
    public Double resta(@WebParam(name = "x") Double x,@WebParam(name = "y") Double y) {
        return x-y;
    }
    
    @WebMethod(operationName = "mult")
    public Double mult(@WebParam(name = "x") Double x,@WebParam(name = "y") Double y) {
        return x*y;
    }
    
    @WebMethod(operationName = "div")
    public Double div(@WebParam(name = "x") Double x,@WebParam(name = "y") Double y) {
        return x/y;
    }
    
    @WebMethod(operationName = "pot")
    public Double pot(@WebParam(name = "x") Double x,@WebParam(name = "y") Double y) {
        return Math.pow(x, y);
    }
}
