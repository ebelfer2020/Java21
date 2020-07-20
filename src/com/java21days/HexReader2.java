package com.java21days;
        
import java.io.*;

public class HexReader2 {
   public void readFile() {
        try {
            BufferedReader buff = new BufferedReader(
                new FileReader("hexfile.txt"));
            String line;
            while ((line = buff.readLine()) != null) {
                readLine(line);
            }
        } catch (IOException ex) {
            System.out.println("IO error " + ex.getMessage());
        }
   }

   void readLine(String code) {
       try {
            for (int j = 0; j + 1 < code.length(); j += 2) {
                String sub = code.substring(j, j + 2);
                int num = Integer.parseInt(sub, 16);
                if (num == 255) {
                    return;
                }
                System.out.print(num + " ");
            }
       } finally {
            System.out.println("**");
       }
   }
   
   public static void main(String[] arguments) {
       HexReader2 app = new HexReader2();
       app.readFile();
   }
}
