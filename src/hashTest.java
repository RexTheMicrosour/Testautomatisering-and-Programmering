import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class hashTest {

    @Test
    public void TestWrongChar(){
        Converter test = new Converter(1,"",""); // simulate valid (1)
        int expected = 1; //expected valid input
        test.setCount(1); // set valid input
        int actual = test.getCount();
        assertEquals(expected, actual);
    }

    @Test
    public void TestTextInput(){
        Converter test = new Converter(1,"","");
        String expected = "-- -.-- / -. .- -- . / .. ... / .- .-.. . -..- .- -. -.. . .-. ";
        String actual = Converter.convertToMorse("MY NAME IS ALEXANDER");
        assertEquals(expected, actual);
    }

    @Test
    public void TestMorseInput(){
        Converter test = new Converter(1,"","");
        String expected = "MY NAME IS ALEXANDER";
        String actual = Converter.convertToText("-- -.-- / -. .- -- . / .. ... / .- .-.. . -..- .- -. -.. . .-.");
        assertEquals(expected, actual);
    }

}
