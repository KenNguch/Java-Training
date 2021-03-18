package Mammals;

public class TestObject {

    public static void main(String args[]) {
        int num;
        num = 9;

        Dog b = new Dog();
        b.bark();
        for (int i = 0; i < num; i++) {
            System.out.println("woof ");
        }
    }
}
