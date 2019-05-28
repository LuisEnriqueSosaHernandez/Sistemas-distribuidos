package Interfaces;


/**
* Interfaces/_ClienteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interfaces.idl
* domingo 26 de mayo de 2019 03:23:54 PM CDT
*/

public class _ClienteStub extends org.omg.CORBA.portable.ObjectImpl implements Interfaces.Cliente
{

  public String nombre ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_nombre", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return nombre (        );
            } finally {
                _releaseReply ($in);
            }
  } // nombre

  public void mostrarNotificacion (String mensaje, Interfaces.Cliente cliente)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("mostrarNotificacion", true);
                $out.write_string (mensaje);
                Interfaces.ClienteHelper.write ($out, cliente);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                mostrarNotificacion (mensaje, cliente        );
            } finally {
                _releaseReply ($in);
            }
  } // mostrarNotificacion

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Interfaces/Cliente:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ClienteStub
