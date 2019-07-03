package Advance.Inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] nest) {

        Scanner scan = new Scanner(System.in);
        float width;

        scan.nextFloat();


        Triangle triangle = new Triangle();
        triangle.setValues(width, 10);
        System.out.println("The Area Of This Triangle is " +triangle.area());
    }

}
