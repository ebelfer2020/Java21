package com.java21days;

public class Recursion  {
   public int dex = -1;

  public Recursion() {
      dex = getValue (17);  
  }
  
  public int getValue (int dexValue) {
      if (dexValue > 100) {
          System.out.println(dexValue);
          return dexValue;
      } else {
          System.out.println(dexValue);
          return getValue(dexValue * 2);         
      }  
  }
   public static void main (String [] arguments) {
       Recursion r = new Recursion();
       System.out.println(r.dex);
       
   }
}
    
        

