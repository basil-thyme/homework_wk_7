/**
 * 7.Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Exercise7 {

    public static void salesCommission(int salesAmount) {

        if (salesAmount >= 50000) {
            int commission = ((50000 * 35) / 100);
            System.out.println("Sales commission :  " + commission);
        } else if (salesAmount >= 30000) {
            int commission = ((30000 * 20) / 100);
            System.out.println("Sales commission :  " + commission);

        } else if (salesAmount >= 20000) {
            int commission = ((20000 * 10) / 100);
            System.out.println("Sales commission :  " + commission);

        } else if (salesAmount > 10000) {
            int commission = ((10000 * 5) / 100);
            System.out.println("Sales commission :  " + commission);

        } else {
            int commission = ((10000 * 2) / 100);
            System.out.println("Sales commission :  " + commission);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Sales id: ");
        int salesId = sc.nextInt();

        System.out.println("Input Seller's name: ");
        String sellerName = sc.next();

        System.out.println("Input sales amount: ");
        int salesAmount = sc.nextInt();

        System.out.println("Input salary basic: ");
        int salaryBasic = sc.nextInt();

        salesCommission(salesAmount);

        sc.close();


    }
}
