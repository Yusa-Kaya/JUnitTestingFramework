import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void getStringTest(){
        myString.setString("Hello!");
        String expected = "Hello!";
        String actual = myString.getString();
        assertEquals(expected, actual);
    }

    // Test when all characters except the first are lower case
    @Test
    public void detectCapitalUseTest1() {
       myString.setString("Hello");
       boolean expected = true;
       boolean actual = myString.detectCapitalUse();
       assertEquals(expected, actual);
    }

    // Test when all characters are upper case
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("HELLO");
        boolean expected = true;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    // Test when all characters are lower case
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("hello");
        boolean expected = true;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    // Test when the string is empty
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("");
        boolean expected = false;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    // Test when the string is null
    @Test
    public void detectCapitalUseTest5() {
        boolean expected = false;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    // Test when there is wrong use of upper case.
    @Test
    public void detectCapitalUseTest6() {
        myString.setString("hEllo");
        boolean expected = false;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    // Test when there is wrong use of upper case.
    @Test
    public void detectCapitalUseTest7() {
        myString.setString("HellO");
        boolean expected = false;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }


}
