package cinema;

import java.util.Scanner;

public class Controller {
    TickerPrice tickerPrice = new TickerPrice();
    Zal z = new Zal();
    Scanner sc = new Scanner(System.in);



    int[][] controller(int rows,int seatsRow,int arr[][]) {
        while (true) {
            System.out.println("\n1. Show the seats" + "\n2. Buy a ticket" +
                    "\n3. Statistics" +"\n0. Exit\n");

            int temp = sc.nextInt();
            if (temp == 1) z.printZal(arr);
            if (temp == 2) {
                tickerPrice.ticetPrice(rows, seatsRow, arr);
            }
            if (temp==3) tickerPrice.statistic(rows, seatsRow, arr);
            if (temp == 0) break;

        } return arr;
    }

    }





