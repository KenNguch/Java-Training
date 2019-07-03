package Intermidiate.Overloading;

public class Main {
    public void main(String[] args) {
        Template calculator = new Template();
        calculator.calculator(23, 34);
        calculator.calculator(34.5f, 45.6f);
        calculator.calculator(45, 56.7f);

    }
}
