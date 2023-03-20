import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days  name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Exercise13 {

    public void daysSelection() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number between 1 to 7 : ");
        int days = sc.nextInt();

        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Week contains 1 to 7 days");


        }
        sc.close();
    }

    public static void main(String[] args) {

        Exercise13 obj = new Exercise13();
        obj.daysSelection();

    }

}
