package Corba;


/**
* Corba/ServidorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from corba.idl
* s�bado 8 de junio de 2019 02:38:43 PM CDT
*/

public interface ServidorOperations 
{
  String path ();
  void notificar (String mostrar, Corba.Usuario usuario);
  void registrarUsuario (Corba.Usuario usuario);
  void eliminarUsuario (Corba.Usuario usuario);
  boolean cargarImagen (String nombreImagen, String path, Corba.Usuario usuario);
  boolean borrarImagen (String path, Corba.Usuario usuario);
} // interface ServidorOperations
