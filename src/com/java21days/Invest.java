package com.java21days;

public class Invest {
   
    public static void main (String[] arguments){
        float startInv = 14000;
        float firstYearRate = .40F;
        int secondYearChange = -1500;
        float thirdYearRate = .12F;
        float firstYearValue= 1F;
        float secondYearValue = 1F;
        float thirdYearValue = 1F;
        
        firstYearValue = startInv * ( 1+ firstYearRate);
        secondYearValue = firstYearValue + secondYearChange;
        thirdYearValue =  secondYearValue * (1 + thirdYearRate);    
        
        System.out.println("The intial investment is $"+ startInv);
        System.out.println("The first year value is $" + firstYearValue);
        System.out.println("The second year value is $"+ secondYearValue);
        System.out.println("The third year value is $" +thirdYearValue); 
    }
}