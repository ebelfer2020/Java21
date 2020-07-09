package com.java21days;

import javax.swing.SwingWorker;

public class PrimeWorker extends SwingWorker {

    // set up the SwingWorker
    public PrimeWorker() {
        super();
    }
    
    // check whether a number is prime
    public static boolean isPrime(int checkNumber) {
       double root = Math.sqrt(checkNumber);
       for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0)
                return false;
       }
       return true;
   }

    // define the task the worker performs
    @Override
    protected int[] doInBackground() {
        int[] primes = new int[10000];
        int numPrimes = 0;
        // candidate: the number that might be prime
        int candidate = 2;
        while (numPrimes < 10000) {
            if (isPrime(candidate)) {
                // add this prime to the array
                primes[numPrimes++] = candidate;
            }
            candidate++;
        }
        return primes;
    }
}
