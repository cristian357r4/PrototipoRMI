/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.IPrestamos;
import oracle.jdbc.pool.OracleDataSource;


/**
 * @author xazak
 */
public class ConectaOracleUsuario implements IPrestamos {

    @Override
    public String validarUsuario(String noCuenta, String unip) throws RemoteException {
        String resultado = null;
        OracleDataSource ods;        
        try {
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:prestamos/123@localhost:1521:ORCL");
            Connection conn = ods.getConnection();
            Statement stamnt = conn.createStatement();

            ResultSet resultquery = stamnt.executeQuery("Select *from USUARIOS where NOCUENTA = "+Integer.parseInt(noCuenta)+" and UNIP= "+Integer.parseInt(unip));
            while (resultquery.next()) {
                resultado = resultquery.getString("NOMBRE");
            }
            stamnt.close();
            resultquery.close();            
            
        } catch (SQLException ex) {
            ex.printStackTrace();            
        }
        return resultado;
    }

    /*public static void main(String[] args) throws RemoteException {

        System.out.println(new ConectaOracleUsuario().validarUsuario("1220757", "275927227"));

    }*/
}
