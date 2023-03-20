import java.util.Scanner;
/**
1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
*/
public class Exercise1 {
    public static void oddOrEven(int number) {
        String msg = (number % 2 == 0) ? "The number is even!" : "The number is odd!";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number:");
        int result = sc.nextInt();
        oddOrEven(result);
        sc.close();

    }

}
