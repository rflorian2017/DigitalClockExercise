package com.company.utils;

public class DisplayBinary {

    //TODO Pteruta

    /**
     * Accepts a number as param and displays a line corresponding to the binary number
     * Ex: 5
     * X
     * O
     * X
     *
     * @param number
     * @return
     */
    public static String displayBinaryDecimals(int number) {
        String toReturn = "";
        return toReturn;

    }

    //TODO : Alin M

    /**
     * Accepts a number as param and displays a line corresponding to the binary number
     * Ex: 5
     * X
     * O
     * X
     *
     * @param number
     * @return
     */
    public static String displayBinaryUnits(int number) {
        String toReturn = "";


        if (number == 0){
            return "OOOO";
        }
        else (number >= 10){
            return null;
        }

        if (number == 1){
            return "OOOX";
        }
        else (number >= 10){
            return null;
        }

        if (number == 2){
            return "OOXO";
        }
        else (number >= 10){
            return null;
        }

        if (number == 3){
            return "OOXX";
        }
        else (number >= 10){
            return null;
        }

        if (number == 4){
            return "OXOO";
        }
        else (number >= 10){
            return null;
        }

        if (number == 5){
            return "OXOX";
        }
        else (number >= 10){
            return null;
        }

        if (number == 6){
            return "OXXO";
        }
        else (number >= 10){
            return null;
        }

        if (number == 7){
            return "OXXX";
        }
        else (number >= 10){
            return null;
        }
        if (number == 8){
            return "XOOO";
        }
        else (number >= 10){
            return null;
        }
        if (number == 9){
            return "XOOX";
        }
        else (number >= 10){
            return null;
        }

        return toReturn;
    }

    /*
    private String displayBinaryUnits(0) {
        String toReturn = "OOOO"
        return toReturn;
    }
    */

}