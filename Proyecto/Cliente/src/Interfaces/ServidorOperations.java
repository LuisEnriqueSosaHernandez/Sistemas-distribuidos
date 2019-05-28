package Interfaces;


/**
* Interfaces/ServidorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interfaces.idl
* domingo 26 de mayo de 2019 03:23:54 PM CDT
*/

public interface ServidorOperations 
{
  String ruta ();
  void escribirCliente (Interfaces.Cliente cliente);
  void borrarCliente (Interfaces.Cliente cliente);
  boolean subirImagen (String nombre, String ruta, Interfaces.Cliente cliente);
  boolean eliminarImagen (String ruta, Interfaces.Cliente cliente);
  void notificar (String mensaje, Interfaces.Cliente cliente);
} // interface ServidorOperations
