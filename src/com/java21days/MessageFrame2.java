package com.java21days;

import javax.swing.*;

public class MessageFrame2 extends JFrame {
   public MessageFrame2() {
        super("Message");
        setSize(440, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MessagePanel2 mPanel = new MessagePanel2();
        add(mPanel);
        setVisible(true);
  }

   private static void setLookAndFeel() {
       try {
           UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
       } catch (Exception exc) {
           System.out.println("Look and feel error: " + exc.getMessage());
       }
   }

   public static void main(String[] arguments) {
       MessageFrame2.setLookAndFeel();
       MessageFrame2 frame = new MessageFrame2();
   }
}

