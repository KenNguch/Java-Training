package Throw;

public class Stanley {

    static void checkAge(int age) {
        if (age < 15) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
