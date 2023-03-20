import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 * find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

public class Exercise10 {
    public static void signCalculation(int num1, int num2, char symbolSign) {
        if (symbolSign == '+') {
            System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
        } else if (symbolSign == '-') {
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
        } else if (symbolSign == '*') {
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
        } else if (symbolSign == '/') {
            System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
        } else {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num01 = sc.nextInt();

        System.out.println("Input second number: ");
        int num02 = sc.nextInt();

        System.out.println("Enter a Symbol: " );
        char symbolSign = sc.next().charAt(0);

        signCalculation(num01, num02, symbolSign);
        sc.close();
    }

}
