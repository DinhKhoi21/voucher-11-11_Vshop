import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoucherCalculatorTest {

    @Test
    void testVoucherCannotExceedTotal() {
        int total = 100;
        int discount = 200;

        int result = VoucherCalculator.applyDiscount(total, discount);

        assertEquals(0, result); // expected đúng
    }
}
