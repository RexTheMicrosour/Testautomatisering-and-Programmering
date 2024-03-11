import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class hashTest {

    @Test
    public void TestWrongChar(){
        hashMap test = new hashMap(1,"",""); // simulate valid (1) or invalid (0) input

        int expected = 1; //expected valid input

 //       test.setCount(0); // set invalid input
        test.setCount(1); // set valid input

        int actual = test.getCount();
        assertEquals(expected, actual);
    }


    @Test
    public void TestCharQuantity(){
        hashMap test = new hashMap(1,"","");
        int expected = 3; // int for expected words

        int actual = test.countWords("MY NAME IS ALEXANDER");

        assertEquals(expected, actual);
    }

    @Test
    public void TestMorseLength(){
        hashMap test = new hashMap(1,"","");
        int expected = 5;

        int actual = test.countMorse(".- .-.. .- -..- .- -. -.. . .-.");

       assertEquals(expected, actual);
    }


}
