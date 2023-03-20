import java.util.Arrays;
import java.util.Scanner;
/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Exercise20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < length; i++) {
            myArray[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Enter any value:");
        int toFind = sc.nextInt();
        boolean found = false;

        //this is a for each loop
        for (int n : myArray) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(toFind + " is found.");
        } else {
            System.out.println(toFind + " is not found.");
        }
        sc.close();
    }

}

