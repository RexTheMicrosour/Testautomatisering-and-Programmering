import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class hashTest {

    @Test
    public void TestChar(){
        hashMap test = new hashMap(0);
        int expected = 30;

        test.setChar(30);

        int actual = test.getChar();

        assertEquals(expected, actual);
    }

    @Test
    public void TestMorse(){
        hashMap test = new hashMap(0);
        boolean expected = false;

        boolean actual = test.checkMorse(String.valueOf(expected));

        assertEquals(expected, actual);
    }





}
