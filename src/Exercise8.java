import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
 */

public class Exercise8 {
    public static void alphabetEntry() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any alphabet from A to F :");
        char alphabet = sc.next().charAt(0);// next() function returns the next token/word in the input as a string and charAt(0) function returns the first character in that string.

        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("City name is Athens");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("City name is Berlin");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("City name is Casablanca");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("City name is Delhi");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("City name is Edmonton");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("City name is Fargo");
        } else
            System.out.println("Invalid entry of alphabet");
        sc.close();
    }

    public static void main(String[] args) {
        alphabetEntry();
    }
}
