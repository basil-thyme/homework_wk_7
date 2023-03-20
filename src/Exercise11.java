/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.
 */

public class Exercise11 {

    public static void main(String[] args) {
        System.out.println("Divided by 3: ");
        for (int num = 1; num < 100; num++) {

            if (num % 3 == 0) {
                System.out.println(num + ",");
               // num++;
            }
        }
        System.out.println("Divided by 5: ");
        for (int num1 = 1; num1 < 100; num1++) {

            if (num1 % 5 == 0) {
                System.out.println(num1 + ",");
                //num1++;
            }

        }


    }

}
