/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;

/**
 * @author xazak
 */
public interface IPrestamos extends Remote{
    public String validarUsuario(String noCuenta, String unip) throws RemoteException;
}

