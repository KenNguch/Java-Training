package Advance.Lists.HashMap;

import java.util.HashMap;

public class Template {

    public void hashMaps() {
        /* This is how to declare HashMap */
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hm.put(12, "geeks");
        hm.put(2, "practice");
        hm.put(7, "contribute");

        System.out.println("\nHashMap object output :\n\n" + hm);

        // store data with duplicate key
        hm.put(12, "geeks");

        System.out.println("\nAfter inserting duplicate key :\n\n" + hm);
    }
}
