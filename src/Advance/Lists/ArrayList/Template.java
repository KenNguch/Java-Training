package Advance.Lists.ArrayList;

import java.util.ArrayList;

public class Template {

    public void arrayLists() {

        ArrayList<String> NamesList = new ArrayList<String>();
        NamesList.add("Steve");
        NamesList.add("Tim");
        NamesList.add("Lucy");
        NamesList.add("Pat");
        NamesList.add("Angela");
        NamesList.add("Tom");

        //displaying elements
        System.out.println(NamesList);

        //Adding "Steve" at the fourth position
        NamesList.add(3, "Steve");

        //displaying elements
        System.out.println(NamesList);
    }


}
