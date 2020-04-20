package Advance.Arrays;


public class Template {

    void arrayPrinting() {


        int[][] arr = {{0, 0}, {1, 2}, {2, 4}, {3, 6}, {4, 8}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; (arr[i] != null && j < arr[i].length); j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }

}