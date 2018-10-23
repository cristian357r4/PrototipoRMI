/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author xazak
 */
import common.IPrestamos;
import common.Utils;

public class ServiciosUsuarioServidor extends UnicastRemoteObject {
    private static final long serialVersionUID = 2131283281736213281L;
    public ServiciosUsuarioServidor () throws RemoteException{ }

    public static void main(String[] args) throws Exception, RemoteException {
        new ServiciosUsuarioServidor().iniciarServidor();
    }

    private void iniciarServidor() {
        try {
            Utils.setCodeBase(IPrestamos.class);
            ConectaOracleUsuario conectaOracleUsuario = new ConectaOracleUsuario();
            IPrestamos remoteInterfaz = (IPrestamos)UnicastRemoteObject.exportObject(conectaOracleUsuario, 8888);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Prestamos", remoteInterfaz);
            System.out.println("Servicio iniciado");
            System.in.read();
            registry.unbind("Prestamos");
            UnicastRemoteObject.unexportObject(conectaOracleUsuario, true);
            System.exit(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
