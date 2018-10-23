package com.application.vista;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
  private JLabel noCuentaLabel, unipLabel;
  private JTextField noCuentaField, unipField;
  public FormPanel(){
    setLayout(new BorderLayout());

    noCuentaLabel = new JLabel("No. Cuenta: ");
    Dimension dimension = new Dimension();
    dimension.width= 350;
    dimension.height = 650;
    setPreferredSize(dimension);
    setBorder(BorderFactory.createTitledBorder("Credenciales de Usuario"));

    add(noCuentaLabel, BorderLayout.NORTH);


  }
}
