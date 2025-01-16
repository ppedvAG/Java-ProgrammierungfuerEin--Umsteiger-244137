import org.junit.Test;
import packageJavaGrundkurs.Main;

public class MainTest {



    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
//        Main.Calculate(5, 0, Main.Rechenoperation.DIVISION);
    }
}