package com.java21days;

import java.awt.*;
import javax.swing.*;

class CalMonth extends JFrame {
    JLabel[] days;
    JLabel[] dayTitles;
    JLabel monthTitle;

    CalMonth() {
        super("November 2020");
        this.monthTitle = new JLabel("November 2020");
        this.dayTitles = new JLabel[7];
        this.days = new JLabel[30];
        setSize(260, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        JPanel titlePane = new JPanel();
        titlePane.setLayout(flow);
        titlePane.add(monthTitle);
        add(titlePane);
        JPanel monthPane = new JPanel();
        GridLayout calLayout = new GridLayout(6, 7);
        monthPane.setLayout(calLayout);
        String[] dayNames = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        for (int i = 0; i < 7; i++) {
            dayTitles[i] = new JLabel(dayNames[i]);
            monthPane.add(dayTitles[i]);
        }
        for (int i = 0; i < days.length; i++) {
            days[i] = new JLabel("" + (i+1));
            monthPane.add(days[i]);
        }
        add(monthPane);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + e);
        }
    }

    
    public static void main(String[] arguments) {
        CalMonth.setLookAndFeel();
        CalMonth cal = new CalMonth();
    }
}

