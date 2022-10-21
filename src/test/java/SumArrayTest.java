import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumArrayTest {

    @Test
    public void testSumArray15() {
        int expected = 15;
        int actual = SumArray.sumArray(new int[]{0, 1, 2, 3, 4, 5});
        assertEquals(expected, actual);
    }

    @Test
    public void testSumArrayNegative10() {
        int expected = -10;
        int actual = SumArray.sumArray(new int[]{-7, -3});
        assertEquals(expected, actual);
    }
}