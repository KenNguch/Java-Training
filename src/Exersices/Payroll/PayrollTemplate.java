package Exersices.Payroll;


public class PayrollTemplate {

    float payee, deduction, tax, salary, pension, netSalary, allDeductions;

    public void payee(float salary) {

        if (salary <= 147580) {
            tax = (float) 0.1;
        } else if (salary > 147580 && salary <= 286623) {

            tax = (float) 1.5;

        } else if (salary > 286623 && salary <= 425666) {

            tax = (float) 0.2;

        } else if (salary > 425666 && salary <= 564709) {

            tax = (float) 2.5;

        } else {
            tax = (float) 0.3;
        }

        payee = tax * salary;

        System.out.println("Your Payee is : Ksh " + payee);

    }

    public void NHIFDeductions(float salary) {


        if (salary < 6000) {
            deduction = 150;

        } else if (salary >= 6000 && salary < 8000) {
            deduction = 300;
        } else if (salary >= 8000 && salary < 12000) {
            deduction = 400;

        } else if (salary >= 12000 && salary < 15000) {
            deduction = 500;

        } else if (salary >= 15000 && salary < 20000) {
            deduction = 600;
        } else if (salary >= 20000 && salary < 25000) {
            deduction = 750;

        } else if (salary >= 25000 && salary < 30000) {
            deduction = 850;
        } else if (salary >= 30000 && salary < 35000) {
            deduction = 900;

        } else if (salary >= 35000 && salary < 40000) {
            deduction = 950;
        } else if (salary >= 40000 && salary < 45000) {
            deduction = 1000;

        } else if (salary >= 45000 && salary < 50000) {
            deduction = 1100;

        } else if (salary >= 50000 && salary < 60000) {
            deduction = 1200;
        } else if (salary >= 60000 && salary < 70000) {
            deduction = 1300;

        } else if (salary >= 70000 && salary < 80000) {
            deduction = 1400;
        } else if (salary >= 80000 && salary < 90000) {
            deduction = 1500;
        } else if (salary >= 90000 && salary < 100000) {
            deduction = 1600;
        } else if (salary >= 100000) {
            deduction = 1700;

        } else {
            System.out.println("invalid Salary type/range");
        }

        System.out.println("Your Deductions is : Ksh " + deduction);


    }

    public void NSSFDeductions(float salary) {


        if (salary <= 6000 && salary >= 0) {
            pension = 360;
        } else if (salary > 6000) {
            pension = (float) (0.06 * 18000);
        }
        System.out.println("Your Pension is : Ksh " + pension);

    }


    public void grossSalary(float salary) {

        System.out.println("Your Gross Salary is : Ksh " + (int) salary);


    }

    public void netSalary() {
        allDeductions = payee + pension + deduction;
        System.out.println("Your All Deductions are : Ksh " + allDeductions);

        netSalary = salary - allDeductions;
        System.out.println("Your Net Salary is : Ksh " + netSalary);


    }

}
