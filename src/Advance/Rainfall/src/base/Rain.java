/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.Scanner;

/**
 *
 * @author DomanGlad
 */
public class Rain {

    public int rainArray[] = new int[12];
    Scanner scan = new Scanner(System.in);

    public void saveData() {

        for (int i = 0; i < rainArray.length; i++) {

            System.out.println("Enter Rain amount for month : " + decodeMonth(i));

            rainArray[i] = scan.nextInt();

        }

    }

    public void monthRain(int month) {

        System.out.println("Rainfall Amount for month :" + decodeMonth(month) + "  is :  " + rainArray[month]);

    }

    public void listRainAmounts() {

        for (int i = 0; i < rainArray.length; i++) {

            System.out.println("Rainfall Amount for month :" + decodeMonth(i) + "  is :  " + rainArray[i]);

        }
    }

    public void getHighestAmount() {

        int highestMonthIndex = 0;
        for (int i = 1; i < rainArray.length; i++) {
            if (rainArray[i] > rainArray[highestMonthIndex]) {

                highestMonthIndex = i;
            }

        }

        System.out.println("Highest Rainfall Amount is for month :" + decodeMonth(highestMonthIndex) + "  and it is :  " + rainArray[highestMonthIndex]);
    }

    public void getLowestAmount() {

        int lowestMonthIndex = 0;
        for (int i = 1; i < rainArray.length; i++) {
            if (rainArray[i] < rainArray[lowestMonthIndex]) {

                lowestMonthIndex = i;
            }

        }

        System.out.println("Lowest Rainfall Amount is for month :" + decodeMonth(lowestMonthIndex) + "  and it is :  " + rainArray[lowestMonthIndex]);

    }

    public void getTotalAndAverageAmount() {
        int total = 0;

        for (int i = 0; i < rainArray.length; i++) {

            total = total + rainArray[i];

        }

        System.out.println("Total amount of rain is: " + total + " The average amout is " + total / rainArray.length);

    }

    public String decodeMonth(int monthIndex) {

        String month = "";

        switch (monthIndex) {

            case 0:
                month = "January";
                break;

            case 1:
                month = "February";
                break;

            case 2:
                month = "March";
                break;

            case 3:
                month = "April";
                break;

            case 4:
                month = "May";
                break;

            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "Ocober";
                break;
            case 10:
                month = "November";
                break;

            case 11:
                month = "December";
                break;

        }

        return month;
    }

}


