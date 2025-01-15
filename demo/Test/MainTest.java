import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {



    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Main.Calculate(5, 0, Main.Rechenoperation.DIVISION);
    }
}