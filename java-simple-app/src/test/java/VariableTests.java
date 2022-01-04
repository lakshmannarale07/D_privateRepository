import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VariableTests {
    @DisplayName("Check variable value are correct")
    @Test // this annotation
    void learnTheVariablesValidCase()
    {
        int osNUm = 12;
        int expectedValue = 12;
        Assertions.assertEquals(expectedValue,osNUm);
    }
    @DisplayName("Check variable values are incorrect")
    @Test
    void learnVariablrInvalidCase()
    {
        int osNum = 12;
        int expectedValue = 13;
        Assertions.assertNotEquals(expectedValue,osNum);
    }
}
