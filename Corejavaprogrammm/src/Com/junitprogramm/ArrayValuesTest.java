package Com.junitprogramm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ArrayValuesTest {

	@Test
    public void testArrayValues() {
        int[] values = {25, 30, 22, 18, 40}; // Example array of int values
        
        for (int value : values) {
            if (value < 20) {
                fail("Value less than 20 found: " + value);
            }
            
    }
        System.out.println("Value less than 20 not found.");
    }
}
