package com.java21days;

import javax.swing.*;

public class Subscriptions extends JFrame {
    String[] subs = {"Burningbird", "Freefom Goodness",
        "Inessential","Manton.org","Mirco Throughts", "Rasterweb.", 
       "Self Made Minds", "Whole Lotta Nothing","Workbench" };
    
    JList <String> subList = new JList <> (subs);
   public Subscriptions () {
       super ("Subscriptions");
       setSize (150, 335);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JPanel panel = new JPanel();
       JLabel subLabel = new JLabel ("RSS Subscription:");
       panel.add(subLabel);
       subList.setVisibleRowCount(8);
       JScrollPane scroller = new JScrollPane(subList);
       panel.add(scroller);
       add (panel);
       setVisible(true);
   }
   
    private static void setLookandFeel() {
        try {
            UIManager.setLookAndFeel(
            "javax.swing.plaf.nimbus.NimbusLookAndFeel"
                    );
        } catch (Exception exc) {
                System.out.println(exc.getMessage());
        
        }
    }
        public static void main (String [] arguments) {
            Subscriptions.setLookandFeel();
                Subscriptions app = new Subscriptions();
        }
}