package com.java21days;

import javax.swing.*;

public class Authenticator extends javax.swing.JFrame {
    JTextField username = new JTextField (15);
    JPasswordField password = new JPasswordField (15);
    JTextArea comments = new JTextArea (4, 15);
    JButton ok = new JButton ("Ok");
    JButton cancel = new JButton ("Cancel");
    
    public Authenticator () {
        super ("Account Information");
        setSize (100, 220);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        JPanel pane = new JPanel ();
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        JLabel commentsLabel = new JLabel("Comments: ");
        comments.setLineWrap (true);
        comments.setWrapStyleWord(true);
        pane.add (usernameLabel);
        pane.add (username);
        pane.add (passwordLabel);
        pane.add (password);
        pane.add (commentsLabel);
        pane.add (comments);
        pane.add (ok);
        pane.add (cancel);
        add (pane);
        setVisible(true);
       }
    
    public static void setLookAneFeel() {
        try {
            UIManager.setLookAndFeel (
              "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.print(exc.getMessage());
        }
    }    
            
       public static void main (String [] arguments) {
           Authenticator.setLookAneFeel();
           Authenticator auth = new Authenticator ();
        }
      }

