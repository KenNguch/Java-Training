package Exersices.Payroll;

import java.util.Scanner;

public class Main {

    public static void main(String[] pay) {

        PayrollTemplate income = new PayrollTemplate();

        System.out.println("Enter Your Salary");
        Scanner scan = new Scanner(System.in);
        income.salary = scan.nextInt();

        income.payee(income.salary);
        income.NHIFDeductions(income.salary);
        income.NSSFDeductions(income.salary);
        income.grossSalary(income.salary);
        income.netSalary();

    }


}
