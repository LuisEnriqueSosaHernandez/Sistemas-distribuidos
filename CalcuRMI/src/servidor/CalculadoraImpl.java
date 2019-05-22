/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author k_ike
 */
public class CalculadoraImpl extends UnicastRemoteObject implements CalculadoraInterfaz{
    
    public CalculadoraImpl() throws RemoteException{
        
    }

    @Override
    public Double suma(Double x, Double y) throws RemoteException {
       return x+y;
    }

    @Override
    public Double resta(Double x, Double y) throws RemoteException {
        return x-y;
    }

    @Override
    public Double mult(Double x, Double y) throws RemoteException {
       return x*y;
    }

    @Override
    public Double div(Double x, Double y) throws RemoteException {
        return x/y;
    }

    @Override
    public Double pot(Double x, Double y) throws RemoteException {
       return Math.pow(x, y);
    }

    @Override
    public Double raiz(Double x) throws RemoteException {
        return Math.sqrt(x);
    }

    @Override
    public Double factorial(Double x) throws RemoteException {
        double factorial=1;
       for(int i=1;i<=x;i++){
           factorial*=i;
       }
       return factorial;
    }
    
}
