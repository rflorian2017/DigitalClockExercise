package com.company.utils;

public class DisplayDigit {
    public static String displayDigitDigital(String character, int number) {
        String toReturn = "";
        switch (number) {
            //TODO Luci : Display number 0. Create the case
            case 0:
                toReturn +=
                        displayLine(Constants.CHARACTER,
                        Constants.LINE_HEIGHT,
                        false,
                        0) + "\n" +

                        displayOnSameLine("#",3) + "\n" +

                        displayLine(Constants.CHARACTER,
                                Constants.LINE_HEIGHT,
                                false,
                                0);
                break;
            case 1:
                //TODO Rolly, display number 1. Use displayLine
                toReturn += displayLine(Constants.CHARACTER,Constants.LINE_HEIGHT,true,0) + "\n" +
                displayLine(Constants.CHARACTER,Constants.LINE_HEIGHT,true,0);
                break;
            case 3:
                toReturn += displayLine(Constants.CHARACTER,
                        Constants.LINE_WIDTH,
                        false,
                        0) + "\n" +
                        displayLine(Constants.CHARACTER,
                                Constants.LINE_HEIGHT,
                                true,
                                Constants.SPACE_WIDTH) +
                        "\n" +
                        displayLine(Constants.CHARACTER,
                                Constants.LINE_WIDTH,
                                false,
                                0) + "\n" +
                        displayLine(Constants.CHARACTER,
                                Constants.LINE_HEIGHT,
                                true,
                                Constants.SPACE_WIDTH) +
                        "\n" +
                        displayLine(Constants.CHARACTER,
                                Constants.LINE_WIDTH,
                                false,
                                0);
            case 8:
                toReturn += displayLine(Constants.CHARACTER,Constants.LINE_WIDTH,false,0) +"\n"+
                        displayOnSameLine(Constants.CHARACTER,Constants.LINE_HEIGHT)+"\n"+
                        displayLine(Constants.CHARACTER,Constants.LINE_WIDTH,false,0)+"\n"+
                        displayOnSameLine(Constants.CHARACTER,Constants.LINE_HEIGHT)+"\n"+
                        displayLine(Constants.CHARACTER,Constants.LINE_WIDTH,false,0);
                break;

            // TODO Anamaria : Display number 9
            //TODO: Rolly display number 6

            case 6:
                toReturn += displayLine(Constants.CHARACTER,Constants.LINE_WIDTH,false,0) + "\n" +
                        displayLine(Constants.CHARACTER,Constants.LINE_HEIGHT,true,0) + "\n" +
                        displayLine(Constants.CHARACTER,Constants.LINE_WIDTH,false,0) + "\n" +
                        displayOnSameLine(Constants.CHARACTER,Constants.LINE_HEIGHT) + "\n" +
                        displayLine(Constants.CHARACTER,Constants.LINE_WIDTH,false,0);
                break;

            //TODO : Alessio : display numbers 4, 2, 5
        }
        return toReturn;
    }

    /**
     * @param character   - character to be used to display a certain line
     * @param length      - length of the line
     * @param isVertical  - vertical or horizontal line
     * @param spaceOffset - to the right or to the left
     * @return the string representing the line
     */

    // TODO : Valy display a line
    private static String displayLine(String character,
                                      int length,
                                      boolean isVertical,
                                      int spaceOffset) {

        String toReturn = "";
        if (!isVertical) {
            for (int i = 0; i < length; i++) {
                toReturn += character;
            }
        } else {
            for (int i = 0; i < length; i++) {
                if (i == length - 1)
                    toReturn += generateSpaces(spaceOffset) + character;
                else toReturn += generateSpaces(spaceOffset) + character + "\n";


            }
        }
        return toReturn;
    }


    // TODO Rolly generate number of spaces based on the parameter
    public static String generateSpaces(int length)
    {

        String toReturn = "";

        for (int a = 1; a <= length; a++)
        {
            toReturn += " ";


        }



        return toReturn;
    }

    // TODO Andreea: Display for example portions of 0 on the same line
    private static String displayOnSameLine(String character, int length) {
        String toReturn = "";

        return toReturn;
    }
}
