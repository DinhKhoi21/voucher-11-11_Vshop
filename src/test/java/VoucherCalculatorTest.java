import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoucherCalculatorTest {

    @Test
    void testVoucherExceedsTotal_shouldNotReturnNegative() {
        VoucherCalculator calculator = new VoucherCalculator();

        double result = calculator.calculateFinalPrice(100, 10, 200);

        // Kỳ vọng đúng: không được âm → phải = 0
        assertEquals(0, result);
    }
}
