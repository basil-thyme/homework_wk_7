/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,  otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */

public class Exercise4 {

    public static boolean isLeapYear(int year) {
        boolean outcome = false; // declaring empty variable so we can assign the outcome to this variable.

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                outcome = true;
            } else if (year % 100 != 0) {
                outcome = false;
            } else if (year % 400 == 0) {
                outcome = true;
            }
        } else {
            outcome = false;
        }

        return outcome;
    }

    /**
     * Write another method getDaysInMonth with two parameter month and year. Both of type int.
     * If parameter month is < 1 or >12 return -1.
     * If parameter year is <1 or >9999 than return -1.
     * This method needs to return the number of days in the month. Be careful about leap years  they have 29 days in month 2 (February).
     * You should check if the year is a leap year using the method isLeapYear describe above.
     */
    public static int getDaysInMonth(int month, int year) {
        String monthOfName = "";
        int numberOfDaysInMonth = 0;

        if (month < 1 || month > 12 && year < 1 || year > 9999) {
            int result = -1;
            return result;
        }
        switch (month) {

            case 1:
                monthOfName = "January";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                monthOfName = "February";
                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            case 3:
                monthOfName = "March";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                monthOfName = "April";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                monthOfName = "May";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                monthOfName = "June";
                numberOfDaysInMonth = 30;
                break;
            case 7:
                monthOfName = "July";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                monthOfName = "August";
                numberOfDaysInMonth = 31;
                break;
            case 9:
                monthOfName = "September";
                numberOfDaysInMonth = 30;
                break;
            case 10:
                monthOfName = "October";
                numberOfDaysInMonth = 31;
                break;
            case 11:
                monthOfName = "November";
                numberOfDaysInMonth = 30;
                break;
            case 12:
                monthOfName = "December";
                numberOfDaysInMonth = 31;

        }
        return numberOfDaysInMonth;

    }

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2000));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(-1, -2020));

    }

}
