package Calculator1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.addi(2, 2);
        assertThat(result).isEqualTo(4);;
    }
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        // Vérification avec AssertJ
        assertThat(result).isEqualTo(7);  // Correction : 2 + 3 doit être égal à 5
    }
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        int res = calculator.divide(10,2);
        assertThat(res).isEqualTo(8);
    }
}
