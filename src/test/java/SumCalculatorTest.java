import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCal;

    @BeforeEach
    public void beforeEach() {
        sumCal = new SumCalculator();
    }

    @Test
    void testThatSumWorksCorrectWith1() {
        Assertions.assertEquals(1, sumCal.sum(1));
    }

    @Test
    void testThatSumWorksCorrectWith3() {
        Assertions.assertEquals(6, sumCal.sum(3));
    }

    @Test
    void testThatSumWorksCorrectWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCal.sum(0);
        });
    }
}
