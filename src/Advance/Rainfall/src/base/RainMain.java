/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author DomanGlad
 */
public class RainMain {

    public static void main(String[] c) {

        Rain rainfall = new Rain();

        rainfall.saveData();
        rainfall.monthRain(6);
        rainfall.listRainAmounts();
        rainfall.getHighestAmount();
        rainfall.getLowestAmount();
        rainfall.getTotalAndAverageAmount();

    }

}
