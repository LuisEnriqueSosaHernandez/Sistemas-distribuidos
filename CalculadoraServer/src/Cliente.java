//
// Cliente.java
//
// Importamos clases de CORBA necesarias
import org.omg.CORBA.*;
import org.omg.CORBA.ORB;
import calc.*;

// Importamos clases Java necesarias
import java.io.*;
public class Cliente {
public static void main (String args[ ]) {
try {
// INICIAMOS ORB
ORB orb = ORB.init(args, null);
// LEEMOS EN ARCHIVO UBICACION DEL OBJETO REMOTO
// PARA CALCULO ENTERO
FileInputStream file = new FileInputStream("entero.ref");
BufferedReader in = new BufferedReader(new InputStreamReader(file));
String ref = in.readLine();
file.close();
// CREAMOS REFERENCIA AL OBJETO REMOTO PARA CALCULO ENTERO
entero e = enteroHelper.narrow(orb.string_to_object(ref));
// LEEMOS EN ARCHIVO UBICACION DEL OBJETO REMOTO
// PARA CALCULO REAL
file = new FileInputStream("real.ref");
in = new BufferedReader(new InputStreamReader(file));
ref = in.readLine();
// CREAMOS REFERENCIA AL OBJETO REMOTO PARA CALCULO REAL
real r = realHelper.narrow(orb.string_to_object(ref));
// UNA VEZ OBTENIDA LA REFERENCIA PODEMOS LLAMAR
// A LOS METODOS DEL OBJETO REMOTO
System.out.println("PRUEBAS CON ENTEROS:");
System.out.println("--------------------");
System.out.println();
System.out.println("Resultado suma remota: " + e.suma(4,7));
System.out.println("Resultado resta remota: " + e.resta(4,7));
System.out.println("Resultado multiplicación remota: " + e.multiplica(4,7));
// LA DIVISION REQUIERE USAR UNA CLASE HOLDER
IntHolder resto = new IntHolder();
System.out.println("Resultado división remota: " + e.divide(3,7,resto));
System.out.println("Resto división remota: " + resto.value);
System.out.println();
System.out.println();
System.out.println("PRUEBAS CON REALES:");
System.out.println("--------------------");
System.out.println();
System.out.println("Resultado suma remota: " + r.suma(4,7));
System.out.println("Resultado resta remota: " + r.resta(4,7));
System.out.println("Resultado multiplicación remota: " + r.multiplica(4,7));
System.out.println("Resultado división remota: " + r.divide(3,7));
try {
System.out.println("Prueba división por 0 remota: ");
System.out.println(r.divide(3,0));
} catch (calc.NumeroIncorrecto ni) {
System.out.println("Excepción de NumeroIncorrecto capturada");
}
System.out.println();
System.out.println();
} catch(Exception e) {
System.out.println("ERROR : " + e);
e.printStackTrace(System.out);
}
}
}
