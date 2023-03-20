import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

public class Exercise16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        numberCheck(num);
        sc.close();

    }

    public static void numberCheck(int num1) {
        if (num1 > 0) {
            System.out.println(num1 + " is a Positive number ");
        } else if (num1 < 0) {
            System.out.println(num1 + " is a Negative number ");
        } else if (num1 == 0) {
            System.out.println(num1 + " is a Zero");
        }

    }

}
