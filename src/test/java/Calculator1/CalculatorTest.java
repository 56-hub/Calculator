package Calculator1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        // Correction ici : la somme de 2 + 3 est égale à 5
        assertEquals(6, result, "2 + 3 doit être égal à 5");
    }


}
