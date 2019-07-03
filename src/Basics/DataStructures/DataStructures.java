package Basics.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class DataStructures {

    public void array() {
        String[] names = {"KJ"};
        System.out.println(names[0]);
        int[] currencies = {12, 34, 56, 76, 89};

    }

    public void arrayList() {
        String[] names = {"Kichwa"};

        ArrayList<String[]> department = new ArrayList<String[]>();

        department.add(names);

        System.out.println(department.get(0));
    }

    public void conditions() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Value");
        int firstValue = scan.nextInt();

        System.out.println("Enter Second Value");
        int secondValue = scan.nextInt();

        System.out.println("Enter Third Value");
        int thirdValue = scan.nextInt();


        if (firstValue > secondValue && firstValue > thirdValue)
            System.out.println("First Value is Greater than all");

        else if (secondValue > firstValue && secondValue > firstValue)
            System.out.println("Second Value is Greater than all");

        else if (thirdValue > firstValue && thirdValue > secondValue)
            System.out.println("Third Value is Greater than all");
        else
            System.out.println("All the values are equal");


    }

}