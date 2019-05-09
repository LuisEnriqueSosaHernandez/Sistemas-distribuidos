package Fibonacci;


/**
* Fibonacci/fibonaPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Fibonacci.idl
* martes 7 de mayo de 2019 03:30:01 PM CDT
*/

public abstract class fibonaPOA extends org.omg.PortableServer.Servant
 implements Fibonacci.fibonaOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("fibonacci", new java.lang.Integer (0));
    _methods.put ("shutdown", new java.lang.Integer (1));
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
       case 0:  // Fibonacci/fibona/fibonacci
       {
         int f = in.read_long ();
         org.omg.CORBA.IntHolder x = new org.omg.CORBA.IntHolder ();
         this.fibonacci (f, x);
         out = $rh.createReply();
         out.write_long (x.value);
         break;
       }

       case 1:  // Fibonacci/fibona/shutdown
       {
         this.shutdown ();
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
    "IDL:Fibonacci/fibona:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public fibona _this() 
  {
    return fibonaHelper.narrow(
    super._this_object());
  }

  public fibona _this(org.omg.CORBA.ORB orb) 
  {
    return fibonaHelper.narrow(
    super._this_object(orb));
  }


} // class fibonaPOA