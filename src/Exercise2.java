/**2. Write a java program to input any year like (ex.2007) and find out if it is leap year or  not? */

import java.util.Scanner;

public class Exercise2 {

    public void leapYear(int year) {
        if (year != 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            System.out.println("Year can not be 0");
        }
    }
       /*public String leapYearReturnMessage(int year) {
        if (year != 0) {
            if (year % 400 == 0) {
                return year + " is a leap year";
            } else if (year % 100 == 0) {
                return year + " is not a leap year";
            } else if (year % 4 == 0) {
                return year + " is a leap year";
            } else {
                return year + " is not a leap year";
            }
        } else {
            return year + "can not be 0";
        }
    }*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input any year:");
        int year = sc.nextInt();
        Exercise2 obj = new Exercise2();
        obj.leapYear(year);
        //System.out.println(obj.leapYearReturnMessage(year));
        sc.close();
    }
}
