//
// Servidor.java
//  start orbd -ORBInitialPort 1050
//  
// Importamos las clases de CORBA necesarias
import org.omg.CORBA.*;
import org.omg.CORBA.ORB;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import calc.*;
// *****************************************************
// IMPLEMENTACION DE LOS METODOS REMOTOS
// SE REALIZA A TRAVES DE HERENCIA
// *****************************************************
class enteroImplementacion extends enteroPOA
{
public int suma(int a, int b) {
return a+b;
}
public int resta(int a, int b) {
return a-b;
}
public int multiplica(int a, int b) {
return a*b;
}
public int divide(int a, int b, IntHolder resto) throws calc.NumeroIncorrecto {
if (b==0) {
throw new calc.NumeroIncorrecto();
}
resto.value = a % b;
return a/b;
}
}
class realImplementacion extends realPOA
{
public double suma(double a, double b) {
return a+b;
}
public double resta(double a, double b) {
return a-b;
}
public double multiplica(double a, double b) {
return a*b;
}
public double divide(double a, double b) throws calc.NumeroIncorrecto {
if (b==0) {
throw new calc.NumeroIncorrecto();
}
return a/b;
}
}

// ****************************************************************
// PROGRAMA SERVIDOR: RECIBE PETICIONES Y LAS ENVÍA A LOS DELEGADOS 70
// SIMILAR PARA CUALQUIER PROGRAMA SERVIDOR QUE USE CORBA
// ****************************************************************
public class Servidor {
public static void main (String args[ ]) {
try{
    // INICIAMOS ORB Y POA
ORB orb = ORB.init(args, null);
POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
rootPOA.the_POAManager().activate();
// CREAMOS LOS OBJETOS QUE DARAN SERVICIO Y LOS CONECTAMOS AL ORB
// UNO POR CADA INTERFAZ
enteroImplementacion enteroIMPL = new enteroImplementacion();
entero e = enteroIMPL._this(orb);
realImplementacion realIMPL = new realImplementacion();
real r = realIMPL._this(orb);
// CREAMOS UNA CADENA CON LA IDENTIFICACION DE CADA OBJETO
String refe = orb.object_to_string(e);
String refr = orb.object_to_string(r);
// VOLCAMOS LA IDENTIFICACION A SENDOS ARCHIVOS PARA
// PERMITIR AL CLIENTE HALLAR LOS OBJETOS REMOTOS
java.io.FileOutputStream file = new java.io.FileOutputStream("entero.ref");
java.io.PrintWriter out = new java.io.PrintWriter(file);
out.println(refe);
out.flush();
file.close();
file = new java.io.FileOutputStream("real.ref");
out = new java.io.PrintWriter(file);
out.println(refr);
out.flush();
file.close();
    System.out.println("waiting");
// ESPERAMOS INVOCACIONES DE LOS CLIENTES
orb.run();
} catch(Exception e) {
System.out.println("ERROR : " + e);
e.printStackTrace(System.out);
}
}
}
