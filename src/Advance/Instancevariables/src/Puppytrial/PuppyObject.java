package Puppytrial;

public class PuppyObject {
    public static void main(String []args){
/* Object creation */
Puppy myPuppy = new Puppy( "Stanley" );
/* Call class method to set puppy's age */
myPuppy.setAge( 29 );
/* Call another class method to get puppy's age */
myPuppy.getAge( );
/* You can access instance variable as follows as well */
System.out.println("Variable Value :" + myPuppy.puppyAge );
}
}
