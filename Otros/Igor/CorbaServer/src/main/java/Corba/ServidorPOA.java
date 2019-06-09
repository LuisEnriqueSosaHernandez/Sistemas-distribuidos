package Corba;


/**
* Corba/ServidorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from corba.idl
* s�bado 8 de junio de 2019 02:38:43 PM CDT
*/

public abstract class ServidorPOA extends org.omg.PortableServer.Servant
 implements Corba.ServidorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_path", new java.lang.Integer (0));
    _methods.put ("notificar", new java.lang.Integer (1));
    _methods.put ("registrarUsuario", new java.lang.Integer (2));
    _methods.put ("eliminarUsuario", new java.lang.Integer (3));
    _methods.put ("cargarImagen", new java.lang.Integer (4));
    _methods.put ("borrarImagen", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Corba/Servidor/_get_path
       {
         String $result = null;
         $result = this.path ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // Corba/Servidor/notificar
       {
         String mostrar = in.read_string ();
         Corba.Usuario usuario = Corba.UsuarioHelper.read (in);
         this.notificar (mostrar, usuario);
         out = $rh.createReply();
         break;
       }

       case 2:  // Corba/Servidor/registrarUsuario
       {
         Corba.Usuario usuario = Corba.UsuarioHelper.read (in);
         this.registrarUsuario (usuario);
         out = $rh.createReply();
         break;
       }

       case 3:  // Corba/Servidor/eliminarUsuario
       {
         Corba.Usuario usuario = Corba.UsuarioHelper.read (in);
         this.eliminarUsuario (usuario);
         out = $rh.createReply();
         break;
       }

       case 4:  // Corba/Servidor/cargarImagen
       {
         String nombreImagen = in.read_string ();
         String path = in.read_string ();
         Corba.Usuario usuario = Corba.UsuarioHelper.read (in);
         boolean $result = false;
         $result = this.cargarImagen (nombreImagen, path, usuario);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 5:  // Corba/Servidor/borrarImagen
       {
         String path = in.read_string ();
         Corba.Usuario usuario = Corba.UsuarioHelper.read (in);
         boolean $result = false;
         $result = this.borrarImagen (path, usuario);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Corba/Servidor:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Servidor _this() 
  {
    return ServidorHelper.narrow(
    super._this_object());
  }

  public Servidor _this(org.omg.CORBA.ORB orb) 
  {
    return ServidorHelper.narrow(
    super._this_object(orb));
  }


} // class ServidorPOA
