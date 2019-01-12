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
                toReturn += "";
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
                //TODO Stefan : generate number 8. With the corresponding case
            // TODO Anamaria : Display number 9
            //TODO: Rolly display number 6
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


        return toReturn;

    }

    // TODO Rolly generate number of spaces based on the parameter
    private static String generateSpaces(int lenth) {
        String toRetun = "";

        return toRetun;
    }

    // TODO Andreea: Display for example portions of 0 on the same line
    private static String displayOnSameLine(String character, int length) {
        String toReturn = "";

        return toReturn;
    }
}
