package cz.domaciukollekce10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindMatchingTest {

    private Find findNumber;

    @Test
    @DisplayName("Zero task - exercise")
    public void middle1Test () {
        List<Double> testList = List.of(10.0, 15.45, 5.811, 175.0);
        Double testResult = Find.findMatchingNumber(testList, 4.0, 9.3);
        Assertions.assertEquals(5.811, testResult);
    }

    @Test
    @DisplayName("Exception test")
    public void emptyTest () {
        List<Double> testList = new ArrayList<>();
        Assertions.assertThrows(Exception.class, () -> Find.findMatchingNumber
                (testList, 10.0, 12.0));
    }




    /*
    public static Double findMatchingNumber(List<Double> list, Double lowerLimit, Double upperLimit) {
        if (list == null || list.isEmpty() || lowerLimit == null || upperLimit == null
                || lowerLimit >= upperLimit) {
            throw new IllegalArgumentException("Neplatné parametry...");
        }
        for (Double item : list) {if (item >= lowerLimit && item <= upperLimit) {return item;}}
        throw new IllegalArgumentException("Žádné vhodné číslo nebylo nalezeno...");
    }

     */



}
