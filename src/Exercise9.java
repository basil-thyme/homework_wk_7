import java.util.Scanner;

/**
 * 9. Same as above program-8 using switch statement.
 */
public class Exercise9 {
    public void alphaCity(char alphabet) {
        switch (alphabet) {

            case 'A':
            case 'a':
                System.out.println("City name is Athens");
                break;
            case 'B':
            case 'b':
                System.out.println("City name is Berlin");
                break;
            case 'C':
            case 'c':
                System.out.println("City name is Casablanca");
                break;
            case 'D':
            case 'd':
                System.out.println("City name is Delhi");
                break;
            case 'E':
            case 'e':
                System.out.println("City name is Edmonton");
                break;
            case 'F':
            case 'f':
                System.out.println("City name is Fargo");
                break;
            default:
                System.out.println("Invalid entry of alphabet");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any alphabet from A to F : ");
        char alphabet = sc.next().charAt(0);
        Exercise9 obj = new Exercise9();
        obj.alphaCity(alphabet);
        sc.close();

    }

}
