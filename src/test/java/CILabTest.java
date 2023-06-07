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
    public void detectCapitalUseTest1() {
       myString.setString("Hello");
       boolean expected = true;
       boolean actual = myString.detectCapitalUse();
       assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("HELLO");
        boolean expected = true;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("hello");
        boolean expected = true;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("");
        boolean expected = false;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalUseTest5() {
        assertThrows(IllegalArgumentException.class, () -> {
            myString.detectCapitalUse();});
    }


}
