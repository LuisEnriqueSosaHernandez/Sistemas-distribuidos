package calc;

/**
* calc/NumeroIncorrectoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from calculadora.idl
* martes 7 de mayo de 2019 02:13:57 PM CDT
*/

public final class NumeroIncorrectoHolder implements org.omg.CORBA.portable.Streamable
{
  public calc.NumeroIncorrecto value = null;

  public NumeroIncorrectoHolder ()
  {
  }

  public NumeroIncorrectoHolder (calc.NumeroIncorrecto initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = calc.NumeroIncorrectoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    calc.NumeroIncorrectoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return calc.NumeroIncorrectoHelper.type ();
  }

}
