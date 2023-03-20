/**
 * 18. Write a Java program to sum values of an array.
 */
public class Exercise18 {

    public static void sumArray() {
        int a[] = {10, 23, 45, 12, 36};
        int sum = 0;
        int length = a.length;

        for (int i = 0; i <length; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of the array is: "+ sum);
    }

    public static void main(String[] args) {
        sumArray();
    }

}
