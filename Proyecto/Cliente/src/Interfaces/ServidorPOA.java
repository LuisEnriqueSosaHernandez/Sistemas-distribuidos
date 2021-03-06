package Interfaces;


/**
* Interfaces/ServidorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interfaces.idl
* mi�rcoles 12 de junio de 2019 04:44:16 AM CDT
*/

public abstract class ServidorPOA extends org.omg.PortableServer.Servant
 implements Interfaces.ServidorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_ruta", new java.lang.Integer (0));
    _methods.put ("escribirCliente", new java.lang.Integer (1));
    _methods.put ("borrarCliente", new java.lang.Integer (2));
    _methods.put ("subirImagen", new java.lang.Integer (3));
    _methods.put ("eliminarImagen", new java.lang.Integer (4));
    _methods.put ("notificar", new java.lang.Integer (5));
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
       case 0:  // Interfaces/Servidor/_get_ruta
       {
         String $result = null;
         $result = this.ruta ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // Interfaces/Servidor/escribirCliente
       {
         Interfaces.Cliente cliente = Interfaces.ClienteHelper.read (in);
         this.escribirCliente (cliente);
         out = $rh.createReply();
         break;
       }

       case 2:  // Interfaces/Servidor/borrarCliente
       {
         Interfaces.Cliente cliente = Interfaces.ClienteHelper.read (in);
         this.borrarCliente (cliente);
         out = $rh.createReply();
         break;
       }

       case 3:  // Interfaces/Servidor/subirImagen
       {
         String imagen = in.read_string ();
         String nombre = in.read_string ();
         String extension = in.read_string ();
         Interfaces.Cliente cliente = Interfaces.ClienteHelper.read (in);
         boolean $result = false;
         $result = this.subirImagen (imagen, nombre, extension, cliente);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // Interfaces/Servidor/eliminarImagen
       {
         String ruta = in.read_string ();
         Interfaces.Cliente cliente = Interfaces.ClienteHelper.read (in);
         boolean $result = false;
         $result = this.eliminarImagen (ruta, cliente);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 5:  // Interfaces/Servidor/notificar
       {
         String mensaje = in.read_string ();
         Interfaces.Cliente cliente = Interfaces.ClienteHelper.read (in);
         this.notificar (mensaje, cliente);
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
    "IDL:Interfaces/Servidor:1.0"};

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
