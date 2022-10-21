import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OddIndicesTest {

    @Test
    void testOddIndices() {
        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedArray = new int[]{590, 985, 68};
        int[] actual = OddIndices.oddIndices(array);
        assertEquals(expectedArray, actual);
    }
}