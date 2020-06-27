/* Solution to Chapter 4, Exercise 2 in Teach Yourself Java in 21 Days (Eighth
   Edition) by Rogers Cadenhead. */
package com.java21days;

class WordNumber {
    public static void main(String[] arguments) {
            long num = 0;
            String word = "seven";
            char firstChar = word.charAt(0);
            char secondChar = word.charAt(1);
            System.out.println(word);
            switch (firstChar) {
                case 'o':
                    num = 1L;
                    break;
                case 't':
                    if (secondChar == 'w')
                        num = 2L;
                    if (secondChar == 'h')
                        num = 3L;
                    if (secondChar == 'e')
                        num = 10L;
                    break;
                case 'f':
                    if (secondChar == 'o')
                        num = 4L;
                    if (secondChar == 'i')
                        num = 5L;
                    break;
                case 's':
                    if (secondChar == 'i')
                        num = 6L;
                    if (secondChar == 'e')
                        num = 7L;
                    break;
                case 'e':
                    if (secondChar == 'i')
                        num = 8L;
                    break;
                case 'n':
                    num = 9L;
            }
            System.out.println("The number is " + num);
        }
    }




