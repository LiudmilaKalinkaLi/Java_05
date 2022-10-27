import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringMethodsTest {

    @Test
    public void testRemoveSpaces() {
        String expected = "Trimmed";
        String actual = StringMethods.removeSpaces("   hgkfhkhgvkhg    ");
        assertEquals(actual, expected);
    }

    @Test
    public void testRemoveSpaces1() {
        String expected = "Not trimmed";
        String actual = StringMethods.removeSpaces("gicfdsresrsdxtddtsdtd");
        assertEquals(actual, expected);
    }

    @Test
    public void testRemoveSpaces2() {
        String expected = "Empty String";
        String actual = StringMethods.removeSpaces("");
        assertEquals(actual, expected);
    }

    @Test
    public void testRemoveSpaces3() {
        String expected = "Empty String";
        String actual = StringMethods.removeSpaces(null);
        assertEquals(actual, expected);
    }

    @Test
    public void testCountAs() {
        String expected = "5, 6";
        String actual = StringMethods.countAs("Abracadabra");
        assertEquals(actual, expected);
    }

    @Test
    public void testCountAs1() {
        String expected = "0, 15";
        String actual = StringMethods.countAs("Homenum Revelio");
        assertEquals(actual, expected);
    }

    @Test
    public void testCountAs2() {
        String expected = "6, 8";
        String actual = StringMethods.countAs("3 tarAmasAlatA");
        assertEquals(actual, expected);
    }
}
