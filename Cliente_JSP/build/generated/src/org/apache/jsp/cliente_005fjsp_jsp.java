package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_005fjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
	itver.ws.TestWS port = service.getTestWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "kike";
	// TODO process result here
	java.lang.String result = port.hello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
	itver.ws.TestWS port = service.getTestWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Double x = Double.valueOf(100.0d);
	java.lang.Double y = Double.valueOf(20.0d);
	// TODO process result here
	java.lang.Double result = port.div(x, y);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
	itver.ws.TestWS port = service.getTestWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Double x = Double.valueOf(40.0d);
	java.lang.Double y = Double.valueOf(5.0d);
	// TODO process result here
	java.lang.Double result = port.mult(x, y);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
	itver.ws.TestWS port = service.getTestWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Double x = Double.valueOf(2.0d);
	java.lang.Double y = Double.valueOf(3.0d);
	// TODO process result here
	java.lang.Double result = port.pot(x, y);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
	itver.ws.TestWS port = service.getTestWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Double x = Double.valueOf(600.0d);
	java.lang.Double y = Double.valueOf(78.0d);
	// TODO process result here
	java.lang.Double result = port.resta(x, y);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	itver.ws.TestWS_Service service = new itver.ws.TestWS_Service();
	itver.ws.TestWS port = service.getTestWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Double x = Double.valueOf(15.0d);
	java.lang.Double y = Double.valueOf(15.0d);
	// TODO process result here
	java.lang.Double result = port.suma(x, y);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}