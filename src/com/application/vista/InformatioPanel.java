package com.application.vista;

import javax.swing.*;
import java.awt.*;


public class InformatioPanel extends JPanel {
  private JLabel imageLabel;

  public InformatioPanel() {

    Dimension dimension = getPreferredSize();
    dimension.width = 300;
    setPreferredSize(dimension);
    setBorder(BorderFactory.createEmptyBorder());
    setVisible(true);
    setLayout(new BorderLayout());

    imageLabel = new JLabel("imagen");

    ImageIcon imageIcon = new ImageIcon("./Images/proyector2.jpg"); // load the image to a imageIcon
    Image image = imageIcon.getImage(); // transform it
    Image newimg = image.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
    imageIcon = new ImageIcon(newimg);  // transform it back
    imageLabel.setIcon(imageIcon);
    this.add(imageLabel,BorderLayout.NORTH);

  }

}

