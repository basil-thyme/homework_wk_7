/**
5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|
*/

import java.util.Scanner;

public class Exercise5 {
    public void salarySlip(int empID, String empName, int empSalary) {
        int salary = empSalary;
        double hra = ((salary * 10) / 100);

        double da = ((salary * 8) / 100);

        double ta = ((salary * 9) / 100);

        double pf = ((salary * 20) / 100);

        double grossSalary = ((salary + hra + da + ta) - pf);

        System.out.println("|-----------------------------------|");
        System.out.println("|Salary Slip                        |");
        System.out.println("|Employee Id : " +empID +"                 |");
        System.out.println("|Employee Id : " +empName +"                  |");
        System.out.println("|-----------------------------------|");
        System.out.println("|Basic Salary : " + empSalary +  "               |");
        System.out.println("|HRA 10% : " + hra +  "                   |");
        System.out.println("|TA 8% : " +ta +  "                     |");
        System.out.println("|DA 9% : " + da +  "                     |");
        System.out.println("|PF - 20& : " + pf +  "                  |");
        System.out.println("|-----------------------------------|");
        System.out.println("|Gross Salary : " + grossSalary + "             |");
        System.out.println("|===================================|");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Employee ID: ");
        int empId = sc.nextInt();

        System.out.println("Input Name: ");
        String empName = sc.next();

        System.out.println("Input basic salary: ");
        int empSalary = sc.nextInt();

        Exercise5 obj = new Exercise5();
        obj.salarySlip(empId, empName, empSalary);

        sc.close();

    }

}
