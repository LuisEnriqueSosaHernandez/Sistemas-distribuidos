package Interfaces;

/**
* Interfaces/ClienteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interfaces.idl
* mi�rcoles 12 de junio de 2019 04:44:16 AM CDT
*/

public final class ClienteHolder implements org.omg.CORBA.portable.Streamable
{
  public Interfaces.Cliente value = null;

  public ClienteHolder ()
  {
  }

  public ClienteHolder (Interfaces.Cliente initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Interfaces.ClienteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Interfaces.ClienteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Interfaces.ClienteHelper.type ();
  }

}
