package Animal;

public class TestObject {

    public static void main(String[] args) {
        Mammals myMammals = new Mammals();
        Mammals myPig = new Pig();  // Create a Pig object
        Mammals myDog = new Dog();  // Create a dog object
        myMammals.mammalsSound();
        myPig.mammalsSound();
        myDog.mammalsSound();
    }
}
