package com.application.vista;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
  private  FormPanel formPanel;
  private InformatioPanel infoPanel;
  public MainFrame(){
    super("Inicio");
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Dimension dimensiones = new Dimension();


    dimensiones.height = 650;
    dimensiones.width = 900;
    setSize(dimensiones);

    formPanel = new FormPanel();
    infoPanel = new InformatioPanel();

    setLayout(new BorderLayout());

    add(formPanel, BorderLayout.WEST);
    add(infoPanel, BorderLayout.EAST);
  }
}
