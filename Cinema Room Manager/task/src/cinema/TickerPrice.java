package cinema;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TickerPrice {
int sum=0;
int ticket=0;

    public int getSum() {
        return sum;
    }

    int[][] ticetPrice(int rowsImport, int seatsRowImport, int[][]arr){
       Zal z = new Zal();
boolean bol=true;

       Scanner scanner = new Scanner(System.in);
while (bol==true){
    try {
        System.out.println("Enter a row number:");
        int rows= scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatsRow= scanner.nextInt();
        if (arr[rows-1][seatsRow-1]!=66){
         arr[rows-1][seatsRow-1]=66;
         System.out.print("Ticket price: $");
         if(seatsRowImport* rowsImport<60) {
             System.out.print("10");
             sum=sum+10;ticket+=1; bol=false;
         }else if((rowsImport/2)<=(rowsImport-(rowsImport/2))&&(seatsRowImport* rowsImport>=60)){
             if(rows<=rowsImport/2){ System.out.print("10");
             sum=sum+10;ticket+=1; bol=false;}
             else{ System.out.print("8");
                 sum=sum+8;ticket+=1; bol=false;}
         }}else {
            System.out.println("\nThat ticket has already been purchased!\n");///!!!
            }
    } catch (Exception e) {
        System.out.println("Wrong input!\n");
        continue;
    }
}
       System.out.println();
       System.out.println();

return  arr;
   }
    void statistic(int rowsImport, int seatsRowImport, int[][]arr){
        int smallHallPrice=0;
        int bigHallPrice=0; int temp;int temp1;double percentage;int temp3;
        System.out.println("Number of purchased tickets: "+ticket);

         percentage=((double)ticket/((double)rowsImport*(double)seatsRowImport))*100;

        System.out.print("Percentage: ");
        System.out.printf("%.2f", percentage);
        System.out.println("%");
        System.out.println("Current income: $"+sum);
        if (rowsImport*seatsRowImport<60){smallHallPrice=rowsImport*seatsRowImport*10;
        System.out.println("Total income: $"+smallHallPrice);}
        if(rowsImport*seatsRowImport>=60){
            temp=(rowsImport/2);
        temp1=rowsImport-temp;
        bigHallPrice=(temp*seatsRowImport*10)+(temp1*seatsRowImport*8);
            System.out.println("Total income: $"+bigHallPrice);
        }




    }

}
