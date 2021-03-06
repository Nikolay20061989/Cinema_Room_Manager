package cinema;

import java.util.Scanner;

public class Zal {
    int zal[][];



   int[][] fillZal(int zal [][]) {



    for(int i = 0;i <zal.length;i++){
    for (int j = 0; j < zal[0].length; j++) {
      zal[i][j] = 83;
    }
  }
       return zal;
   }
   void printZal(int zal[][]) {
       System.out.println("Cinema:");
       System.out.print(" ");
       for (int i = 1; i <= zal[0].length; i++) {
           System.out.print(" " + i);
       }
       System.out.println();
       for (int i = 0; i < zal.length; i++) {
           System.out.print(i + 1 + " ");
           for (int j = 0; j < zal[i].length; j++) {
               System.out.print((char) zal[i][j] + " ");
           }
           System.out.println();
       }

   }

}
