package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=1; rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsRow=1; seatsRow = sc.nextInt();
        int[][] zal = new int[rows][seatsRow];
        Zal zal1 = new Zal();
        zal1.fillZal(zal);//метод заполняет масив int83("S" в char) после ввода размера

Controller controller = new Controller();
zal=controller.controller(rows,seatsRow,zal);







    }
}