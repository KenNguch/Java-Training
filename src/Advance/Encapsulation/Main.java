package Advance.Encapsulation;


public class Main {
    public static void main(String[] args) {

        Person njau = new Person("Kichwa Njau", 34567890, 89);
        System.out.println("The following are the first method variable values : " + njau.getAge() + "  " + njau.getId() + "  " + njau.getName());

        Person ngombe = new Person();
        ngombe.setName("Kichwa Marenge");
        ngombe.setAge(15);
        ngombe.setId(455678);

        System.out.println("The following are the Second method variable values : " + ngombe.getAge() + "  " + ngombe.getId() + "  " + ngombe.getName());

    }

}
