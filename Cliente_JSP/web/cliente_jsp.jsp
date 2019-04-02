<%-- 
    Document   : cliente_jsp
    Created on : 1/04/2019, 10:00:03 PM
    Author     : k_ike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>    <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>

    <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>


