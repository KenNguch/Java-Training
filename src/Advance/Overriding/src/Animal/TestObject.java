package Animal;

public class TestObject {
   public static void main(String args[]) {
      Cat a = new Cat();   // Animal reference and object
      Dog b = new Dog();   // Animal reference but dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in dog class
   } 
}
