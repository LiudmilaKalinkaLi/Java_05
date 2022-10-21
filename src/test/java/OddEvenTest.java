import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OddEvenTest {

    @Test
    public void testOddEven() {
        int n1 = -345;
        String expectedN1 = "Odd";
        String actualN1 = OddEven.oddEven(n1);
        assertEquals(expectedN1, actualN1);
        int n2 = 0;
        String expectedN2 = "Even";
        String actualN2 = OddEven.oddEven(n2);
        assertEquals(expectedN2, actualN2);
        int n3 = 222222;
        String expectedN3 = "Even";
        String actualN3 = OddEven.oddEven(n3);
        assertEquals(expectedN3, actualN3);
    }
}