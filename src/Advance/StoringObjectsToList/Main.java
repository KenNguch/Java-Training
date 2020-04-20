package Advance.StoringObjectsToList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] ken) {
        StudentTemplate joyce = new StudentTemplate();
        joyce.setAdmNumber(45678);
        joyce.setName("Joyce");

        StudentTemplate joseph = new StudentTemplate();
        joseph.setAdmNumber(345678);
        joseph.setName("Joseph");

        ArrayList<StudentTemplate> studentList = new ArrayList<>();
        studentList.add(joyce);
        studentList.add(joseph);


        for (int i = 0; i < studentList.size(); i++) {

            String selectedName = studentList.get(i).getName();
            System.out.println(selectedName);
        }

    }
}
