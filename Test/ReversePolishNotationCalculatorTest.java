import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator reverse = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int answer = reverse.calculatePolishNotation("3 4 +");
        assertEquals(7, answer);
    }
    @Test
    public void shouldCalculateSubtraction() {
        int answer = reverse.calculatePolishNotation("7 3 -");
        assertEquals(4, answer);
    }
    @Test
    public void shouldCalculateMultiplication() {
        int answer = reverse.calculatePolishNotation("3 4 *");
        assertEquals(12, answer);
    }
    @Test
    public void shouldCalculateNegativeNumber() {
        int answer = reverse.calculatePolishNotation("1 3 7 - +");
        assertEquals(-3, answer);
    }
    @Test
    public void shouldCalculateSpaces() {
        int answer = reverse.calculatePolishNotation("   1 3   7  -   +    ");
        assertEquals(-3, answer);
    }

}
