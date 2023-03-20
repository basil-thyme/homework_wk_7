/**
 * 19. Write a Java program to calculate the average value of array
 */

public class Exercise19 {

    public static void avgArray() {
        int a[] = {10, 20, 30, 40, 50};
        int length = a.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + a[i];
        }
        int average = sum / length;

        System.out.println("Average of array : " + average);
    }

    public static void main(String[] args) {
        avgArray();
    }


}
