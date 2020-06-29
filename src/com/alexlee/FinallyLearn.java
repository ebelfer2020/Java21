package com.alexlee;

public class FinallyLearn {
   
   public static void main (String [] args) {
       int a = 5;
       int b = 1;
       
       try {
       int c = a/b;
        
       } catch (Exception e) {
           System.out.println (e);
       } finally {
           System.out.println ("This is in 'finally, it always gets run!");
       }
       }
}