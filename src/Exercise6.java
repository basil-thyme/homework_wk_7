/**6. Write a java program to input any number and find out if it’s odd or even */

import java.util.Scanner;

public class Exercise6 {
    public static void oddEvenNumb(int number) {
        if (number % 2 == 0) {
            System.out.println("Entered number is Even ");

        } else {
            System.out.println("Entered number is Odd");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number: ");
        int num = sc.nextInt();
        oddEvenNumb(num);
        sc.close();
    }
}
