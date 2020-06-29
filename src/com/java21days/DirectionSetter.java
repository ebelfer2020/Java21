package com.java21days;

public class DirectionSetter {
    Compass current;
public void setDirection(Compass dir) {
    current  = dir;
}

public static void main (String [] arguments) {
    DirectionSetter app = new DirectionSetter ();
    app.setDirection(Compass.WEST);
    System.out.println(app.current);
 }
}