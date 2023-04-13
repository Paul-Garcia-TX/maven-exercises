import org.junit.Test;
import static org.junit.Assert.*;



public class StringTests {

    @Test
    public void testIfStringSaysAzeban(){
        String stringIExpect = "Azeban";
        String stringIgot = "Banana";
        String correctString ="Azeban";
            assertEquals(stringIExpect, correctString );
    }
    @Test
    public void testIfChangeIsCorrect(){
        double price = 20.0;
        double discount = 5.0;

        assertEquals(15, price - discount, 0);
    }
    @Test
    public void testObjectsDifforSame(){
        Object dog = new Object();
        Object sheep = new Object();

        Object cloneSheep = sheep;

        assertNotSame(dog, sheep);

        assertSame(cloneSheep, sheep);

    }
    @Test
    public void testifArrayElementEqual(){
        char[] jUnitArray = {'J', 'u', 'n','i','t'};

        char [] jUnitArray2 = {'J', 'u', 'n','i','t'};

        assertArrayEquals(jUnitArray, jUnitArray2);

    }
    @Test
    public void testMath(){
        assertTrue("Testing true if 5 + 5 is 10", (5 + 5) == 10);
        assertFalse("Is 100 less than 99?",100 < 99);
    }
    @Test
    public void testIfUserObjectIsNotNull(){
        Object realUser = new Object();

        Object nullUser = null;

        assertNull(nullUser);
        assertNotNull(realUser);
    }
}
