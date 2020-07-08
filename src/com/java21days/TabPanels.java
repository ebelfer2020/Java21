package com.java21days;

import java.awt.*;
import javax.swing.*;

public class TabPanels extends JFrame {
    
    public TabPanels() {
    super ("Tabbed Panels");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLookAndFeel();
    setSize (480, 218);
    JPanel mainSettings = new JPanel();
    JPanel advancedSettings = new JPanel();
    JPanel privacySettings = new JPanel();
    JPanel emailSettings = new JPanel();
    JPanel securitySettings = new JPanel();
    JTabbedPane tabs = new JTabbedPane();
    tabs.addTab("Main", mainSettings);
    tabs.addTab("Advanced", advancedSettings);
    tabs.addTab("Privacy", privacySettings);
    tabs.addTab("E-mail",emailSettings);
    tabs.addTab("Secuirty", securitySettings);
    add (tabs);
    setVisible(true);
    }
    
    private void setLookAndFeel() {
      try {
          UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
          );
      } catch (Exception e) {
          System.err.println("Couldn't use the system "
          + "look and feel: " + e);
      }
     }
    
    
    public static void main (String [] arguments) {
        TabPanels frame = new TabPanels();
    }
}   
