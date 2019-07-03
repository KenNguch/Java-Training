package Basics.Switch;


public class Switch {

    public void sockets() {
        String x = "2";
        String y = "34";
        int grade = 40;


        System.out.println(Integer.parseInt(x) + Integer.parseInt(y));

        switch (grade) {
            case 30:
                System.out.println("Points E");
                break;
            case 40:
                System.out.println("Points D");
                break;
            case 50:
                System.out.println("Points C");
                break;
            case 60:
                System.out.println("Points B");
                break;
            default:
                System.out.println("Points A");


        }


    }

}