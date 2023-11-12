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

    @Test
    @DisplayName("First self-test according homework")
    public void middle2Test() {
        List<Double> testList = List.of(12.0, 8.126, 6.0);
        Double testResult = Find.findMatchingNumber(testList, 11.0, 12.6);
        Assertions.assertEquals(12.0, testResult);
    }

    @Test
    @DisplayName("Second self-test according homework - Lamda")
    public void middle3Test() {
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        Assertions.assertDoesNotThrow(
                // pokus o zápis dle Lambda zápisu - tak snad...
                () -> {
                    Double testResult = Find.findMatchingNumber(testList, 8.0, 10.0);
            Assertions.assertEquals(8.126, testResult);
                }
        );
    }


}
