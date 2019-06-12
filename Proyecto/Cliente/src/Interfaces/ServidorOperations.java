package Interfaces;


/**
* Interfaces/ServidorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interfaces.idl
* mi�rcoles 12 de junio de 2019 04:44:16 AM CDT
*/

public interface ServidorOperations 
{
  String ruta ();
  void escribirCliente (Interfaces.Cliente cliente);
  void borrarCliente (Interfaces.Cliente cliente);
  boolean subirImagen (String imagen, String nombre, String extension, Interfaces.Cliente cliente);
  boolean eliminarImagen (String ruta, Interfaces.Cliente cliente);
  void notificar (String mensaje, Interfaces.Cliente cliente);
} // interface ServidorOperations
