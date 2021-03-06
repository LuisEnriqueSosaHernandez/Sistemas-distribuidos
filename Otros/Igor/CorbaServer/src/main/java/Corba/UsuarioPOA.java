package Corba;


/**
* Corba/UsuarioPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from corba.idl
* s�bado 8 de junio de 2019 02:38:43 PM CDT
*/

public abstract class UsuarioPOA extends org.omg.PortableServer.Servant
 implements Corba.UsuarioOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_usuario", new java.lang.Integer (0));
    _methods.put ("notificacion", new java.lang.Integer (1));
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
       case 0:  // Corba/Usuario/_get_usuario
       {
         String $result = null;
         $result = this.usuario ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // Corba/Usuario/notificacion
       {
         String mostrar = in.read_string ();
         Corba.Usuario usuario = Corba.UsuarioHelper.read (in);
         this.notificacion (mostrar, usuario);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Corba/Usuario:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Usuario _this() 
  {
    return UsuarioHelper.narrow(
    super._this_object());
  }

  public Usuario _this(org.omg.CORBA.ORB orb) 
  {
    return UsuarioHelper.narrow(
    super._this_object(orb));
  }


} // class UsuarioPOA
