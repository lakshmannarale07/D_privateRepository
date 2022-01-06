import oop.DivisionOfTwoNum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisionOfTwoNumTest {
    @DisplayName("test for Complete Number")
    @Test
    void divTest() {
        DivisionOfTwoNum d = new DivisionOfTwoNum();
        var num1 = 10;
        var num2 = 10;
        var expected = 1;
        var actual = d.division(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Test for zero num")
    @Test
    void testunexpectedNumbers() {
        var num1 = 4;
        var num2 = 0;
        DivisionOfTwoNum d = new DivisionOfTwoNum();
        var expected = 0;
        var actual = d.division(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Testing Exceptions")
    @Test
    void testUnexpectedNumbersWithException() {
        var num1 = 4.5;
        var num2 = 0;

        Assertions.assertThrows(RuntimeException.class, () -> {
            var dvDr = new DivisionOfTwoNum();
            dvDr.divideNumbersException(num1, num2);
        });
    }
}
