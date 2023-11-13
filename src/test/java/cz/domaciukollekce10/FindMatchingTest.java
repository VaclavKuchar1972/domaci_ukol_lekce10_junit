import cz.domaciukollekce10.Find;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindMatchingTest {

    private Find findNumber;
    private List<Double> testList;

    @BeforeEach
    public void setUp() {testList = new ArrayList<>();}

    @Test
    @DisplayName("Exception test")
    public void emptyTest () {
        Assertions.assertThrows(Exception.class, () -> Find.findMatchingNumber
                (testList, 10.0, 12.0));
    }

    @Test
    @DisplayName("Zero task - exercise")
    public void middle1Test () {
        testList = List.of(10.0, 15.45, 5.811, 175.0);
        Double testResult = Find.findMatchingNumber(testList, 4.0, 9.3);
        Assertions.assertEquals(5.811, testResult);
    }

    @Test
    @DisplayName("First self-test according homework")
    public void middle2Test() {
        testList = List.of(12.0, 8.126, 6.0);
        Double testResult = Find.findMatchingNumber(testList, 11.0, 12.6);
        Assertions.assertEquals(12.0, testResult);
    }

    @Test
    @DisplayName("Second self-test according homework - Lambda")
    public void middle3Test() {
        testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        Assertions.assertDoesNotThrow(() -> {
            Double testResult = Find.findMatchingNumber(testList, 8.0, 10.0);
            Assertions.assertEquals(8.126, testResult);
        });
    }

    // Tak toto bylo logický peklo! A vůbec si nejsem jist, že tento kód je v pořádku...
    @RepeatedTest(100)
    @DisplayName("Random test")
    @Disabled
    public void randomTest() {
        Random random = new Random();
        testList.clear();
        int size = random.nextInt(10) + 1;
        for (int i = 0; i < size; i++) {testList.add(random.nextDouble() * 100);}
        double lowerLimit = random.nextDouble() * 100;
        double upperLimit = lowerLimit + random.nextDouble() * (100 - lowerLimit); // tady to mám určitě OK
        try {
            Double testResult = findNumber.findMatchingNumber(testList, lowerLimit, upperLimit);
            Assertions.assertTrue(testList.contains(testResult) && testResult >= lowerLimit
                            && testResult <= upperLimit,
                    "Výsledek testu NENÍ v mezích rozsahu¨!");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Žádné vhodné číslo nebylo nalezeno...", e.getMessage());
        }

    }


}
