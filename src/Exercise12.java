import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Exercise12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input value is number or an alphabet: ");
        char inputChar = sc.next().charAt(0);
        // CHECKING FOR ALPHABET
        if ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'A' && inputChar <= 'Z')) {
            System.out.println(inputChar + " is an alphabet");

        // CHECKING FOR NUMBER
        } else if ((inputChar >= '0' && inputChar <= '9')) {
            System.out.println(inputChar + " is a digit");

        } else {
            System.out.println(inputChar + " is a Symbol");

        }
        sc.close();
    }
}