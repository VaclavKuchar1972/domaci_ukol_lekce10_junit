package cz.domaciukollekce10;

import java.util.List;

public class Find {

    /** The method returns the first number from the list that belongs to the interval.
     *
     * @param listOfNumbers A sheet that returns matching search values.
     * @param lowerLimit
     * @param upperLimit
     * @return A sheet that returns matching search values.
     */
    public static Double findMatchingNumber(List<Double> list, Double lowerLimit, Double upperLimit) {
        if (list == null || list.isEmpty() || lowerLimit == null || upperLimit == null
                || lowerLimit >= upperLimit) {
            throw new IllegalArgumentException("Neplatné parametry...");
        }
        for (Double item : list) {if (item >= lowerLimit && item <= upperLimit) {return item;}}
        throw new IllegalArgumentException("Žádné vhodné číslo nebylo nalezeno...");
    }

}
