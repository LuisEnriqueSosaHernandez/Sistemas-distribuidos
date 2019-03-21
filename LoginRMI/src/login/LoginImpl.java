/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

/**
 *
 * @author k_ike
 */
public class LoginImpl extends UnicastRemoteObject implements LoginInterfaz {

    HashMap<String, String> data;

    public LoginImpl() throws RemoteException {
        initializeComponents();
    }

    private void initializeComponents() {
        data = new HashMap<>();
        data.put("E14021304", "kike12345");
        data.put("E14021305", "perlita10");
        data.put("E14021306", "kerina");
        data.put("E14021307", "tacodepastor");
        data.put("E14021308", "antonela");
    }

    public boolean validateForm(String numControl, String password) throws RemoteException {

        try {
            if(data.containsKey(numControl)){
             if(data.get(numControl).equals(password)){
                 return true;
             }else{
                 return false;
             }  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
