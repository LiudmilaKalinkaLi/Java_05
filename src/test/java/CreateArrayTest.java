import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateArrayTest {

    @Test
    public void testCreateIntArray() {
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] actual = CreateArray.createIntArray(1, 2, 3, 4, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateDoubleArray() {
        double[] expected = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        double[] actual = CreateArray.createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5);
        assertEquals(expected, actual);
    }
    @Test
    public void testCreateStringArray() {
        String[] expected = new String[]{"It", "was", "an", "apple", "pie"};
        String[] actual = CreateArray.createStringArray("It", "was", "an", "apple", "pie");
        assertEquals(expected, actual);
    }
}