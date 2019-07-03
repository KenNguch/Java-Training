package Basics.Loops;

public class Loop {
    public String names[] = {"Ken", "Kichwa", "Joseph Kabaya", "Tony Spark", "Nichlous Walkthrough"};


    public void forLoop() {

        System.out.println("\nThis is a For Loop");

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }

    public void whileLoop() {
        System.out.println("\nThis is a  While Loop ");

        int i = 0, j = 0;

        System.out.println("This is pre-increment " + i++ + " This is post increment " + ++i);

        while (i < 11 && j < 11) {
            System.out.println(i);
            i++;

        }
    }

    public void doWhileLoop() {

        System.out.println("\nThis is a Do While Loop");

        int i = 0, j = 0;

        System.out.println("This is pre-increment " + i++ + " This is post increment " + ++i);
        do {

            System.out.println(i);
            i++;

        }
        while (i < 11 && j < 11);

        for (String name : names) {


            System.out.println(name);

        }
    }

    public void forEachLoop() {
        System.out.println("\nThis is a For Each Loop");


        for (String name : names) {


            System.out.println(name);

        }
    }
}