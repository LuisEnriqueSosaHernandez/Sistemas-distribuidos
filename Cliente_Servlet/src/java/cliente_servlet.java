/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import itver.ws.TestWS_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author k_ike
 */
@WebServlet(urlPatterns = {"/cliente_servlet"})
public class cliente_servlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SD_WS_EneJun2019_2/TestWS.wsdl")
    private TestWS_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cliente_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cliente_servlet at " + request.getContextPath() + "</h1>");
            out.println("<p>"+hello("Kike")+"</p>");
            out.println("<p>10/2 = "+div(10.0,2.0)+"</p>");
            out.println("<p>6*3 = "+mult(6.0,3.0)+"</p>");
            out.println("<p>2^3 = "+pot(2.0,3.0)+"</p>");
            out.println("<p>60-59 = "+resta(60.0,59.0)+"</p>");
            out.println("<p>90+15 = "+suma(90.0,15.0)+"</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String hello(java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        itver.ws.TestWS port = service.getTestWSPort();
        return port.hello(name);
    }

    private Double div(java.lang.Double x, java.lang.Double y) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        itver.ws.TestWS port = service.getTestWSPort();
        return port.div(x, y);
    }

    private Double mult(java.lang.Double x, java.lang.Double y) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        itver.ws.TestWS port = service.getTestWSPort();
        return port.mult(x, y);
    }

    private Double pot(java.lang.Double x, java.lang.Double y) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        itver.ws.TestWS port = service.getTestWSPort();
        return port.pot(x, y);
    }

    private Double resta(java.lang.Double x, java.lang.Double y) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        itver.ws.TestWS port = service.getTestWSPort();
        return port.resta(x, y);
    }

    private Double suma(java.lang.Double x, java.lang.Double y) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        itver.ws.TestWS port = service.getTestWSPort();
        return port.suma(x, y);
    }

}
