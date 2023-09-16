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
    public void testThatSumWorksCorrectWith1() {

        int actual = sumCal.sum(1);


        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrectWith3() {

        int actual = sumCal.sum(3);


        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrectWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCal.sum(0);
        });
    }
}
