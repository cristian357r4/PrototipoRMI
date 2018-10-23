/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import common.IPrestamos;

/**
 * @author xazak
 */

public class ProyectoRMI {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws RemoteException, NotBoundException {
    // TODO code application logic here
    try {
      final Registry registry = LocateRegistry.getRegistry();
      IPrestamos server = (IPrestamos)(registry.lookup("Prestamos"));
      String nombreUsuario = server.validarUsuario("1220758", "275927228");
      if (nombreUsuario == null) {
        System.out.println("Usuario No registrado!!!!");
      } else {
        System.out.println(nombreUsuario);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
