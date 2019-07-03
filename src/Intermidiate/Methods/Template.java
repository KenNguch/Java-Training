package Intermidiate.Methods;

public class Template {


    public char grader(int grade) {

        char grades;
        switch (grade) {
            case 30:
                grades = 'F';
                break;
            case 40:
                grades = 'D';
                break;
            case 50:
                grades = 'C';
                break;
            case 60:
                grades = 'B';
                break;
            default:
                grades = 'A';
        }
        return grades;
    }
}
