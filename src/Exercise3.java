/**
3. Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format _______________________________
|                               |
| Mark Sheet                    |
|_______________________________|
| Name : Jay                    |
| Roll No: 08                   |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
 */

import java.util.Scanner;

public class Exercise3 {

    static String result;  //declaring static variable to store the value for different outcome
    static String grade;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name:");
        String name = sc.nextLine();
        System.out.println("Enter a roll number:");
        int rollNum = sc.nextInt();
        System.out.println("Enter Maths Marks: ");
        int mathsMarks = sc.nextInt();
        System.out.println("Enter English Marks: ");
        int englishMarks = sc.nextInt();
        System.out.println("Enter Science Marks: ");
        int scienceMarks = sc.nextInt();
        markSheet(name, rollNum, mathsMarks, englishMarks, scienceMarks);
        sc.close();
    }

    public static void markSheet(String name, int rollNum, int mathsMarks, int englishMarks, int scienceMarks) {

        double percentage = 0;
        double total = 0;
        if ((mathsMarks < 0 || mathsMarks > 100) || (englishMarks < 0 || englishMarks > 100) || (scienceMarks < 0 || scienceMarks > 100)) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        } else {
            total = englishMarks + scienceMarks + mathsMarks;
            System.out.println(total);
            percentage = (total * 100) / 300;
            System.out.println(percentage);

            if (percentage >= 80) {
                System.out.println("Grade is A+");
                Exercise3.grade= "A+";
                Exercise3.result = "Pass";
                System.out.println(Exercise3.result);
            } else if (percentage >= 60) {
                System.out.println("Grade is A");
                Exercise3.grade = "A";
                Exercise3.result = "Pass";
                System.out.println(Exercise3.result);
            } else if (percentage >= 50) {
                System.out.println("Grade is B");
                Exercise3.grade = "B";
                Exercise3.result = "Pass";
                System.out.println(Exercise3.result);
            } else if (percentage >= 35) {
                System.out.println("Grade is C");
                Exercise3.grade = "C";
                Exercise3.result = "Pass";
                System.out.println(Exercise3.result);
            } else if (percentage < 35) {
                System.out.println("Failed");
                Exercise3.grade= "";
            }
        }

        System.out.println("|_______________________________|");
        System.out.println("| Mark Sheet                    |");
        System.out.println("|_______________________________|");
        System.out.println("| Name: " + name + "                     |");
        System.out.println("| Roll No: " + rollNum + "                    |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks              |");
        System.out.println("| Math: " + mathsMarks + "                      |");
        System.out.println("| Science: " + scienceMarks + "                   |");
        System.out.println("| English: " + englishMarks + "                   |");
        System.out.println("|_______________________________|");
        System.out.println("| Total: " + total + "                  |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage: " + percentage + " |");
        System.out.println("| Result: " +  result + "                  |");
        System.out.println("| Grade: " + grade  + "                     |");
        System.out.println("|_______________________________|");


    }
}


