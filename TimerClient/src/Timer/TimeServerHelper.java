package Timer;


/**
* Timer/TimeServerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Timer.idl
* jueves 9 de mayo de 2019 03:01:08 PM CDT
*/

abstract public class TimeServerHelper
{
  private static String  _id = "IDL:Timer/TimeServer:1.0";

  public static void insert (org.omg.CORBA.Any a, Timer.TimeServer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Timer.TimeServer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Timer.TimeServerHelper.id (), "TimeServer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Timer.TimeServer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_TimeServerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Timer.TimeServer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Timer.TimeServer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Timer.TimeServer)
      return (Timer.TimeServer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Timer._TimeServerStub stub = new Timer._TimeServerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Timer.TimeServer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Timer.TimeServer)
      return (Timer.TimeServer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Timer._TimeServerStub stub = new Timer._TimeServerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
