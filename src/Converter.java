
import java.util.HashMap;
import java.util.Scanner;

public class Converter {

    private static int userCount;  // New int for error checking
    private static String userWords; // new String for counting words

    private static String userMorse;


    public Converter(int myCount, String myWords, String myMorse) {
        userCount = myCount;
        userWords = myWords;
        userMorse = myMorse;
    }
    //Constructor

    public int getCount() {
        return userCount;
    }

    public void setCount(int actualCount) {
        if (actualCount == 1) {
            userCount = 1;
        } else {
            userCount = 0;
        }
    }

    public static HashMap<Integer, String> morseHashMap() {
        morseHMap.put(0, ".-");
        morseHMap.put(1, "-...");
        morseHMap.put(2, "-.-.");
        morseHMap.put(3, "-..");
        morseHMap.put(4, ".");
        morseHMap.put(5, "..-.");
        morseHMap.put(6, "--.");
        morseHMap.put(7, "....");
        morseHMap.put(8, "..");
        morseHMap.put(9, ".---");
        morseHMap.put(10, "-.-");
        morseHMap.put(11, ".-..");
        morseHMap.put(12, "--");
        morseHMap.put(13, "-.");
        morseHMap.put(14, "---");
        morseHMap.put(15, ".--.");
        morseHMap.put(16, "--.-");
        morseHMap.put(17, ".-.");
        morseHMap.put(18, "...");
        morseHMap.put(19, "-");
        morseHMap.put(20, "..-");
        morseHMap.put(21, "...-");
        morseHMap.put(22, ".--");
        morseHMap.put(23, "-..-");
        morseHMap.put(24, "-.--");
        morseHMap.put(25, "--..");
        morseHMap.put(26, "/");
        morseHMap.put(27, ".----");
        morseHMap.put(28, "..---");
        morseHMap.put(29, "...--");
        morseHMap.put(30, "....-");
        morseHMap.put(31, ".....");
        morseHMap.put(32, "-....");
        morseHMap.put(33, "--...");
        morseHMap.put(34, "---..");
        morseHMap.put(35, "----.");
        morseHMap.put(36, "-----");
        morseHMap.put(37, ".-.-.-");
        morseHMap.put(38, "--..--");
        morseHMap.put(39, "..--..");

        return morseHMap;
    }

    // Hashmap with morse
    public static HashMap<Integer, String> charHashMap() {
        charHMap.put(0, "A");
        charHMap.put(1, "B");
        charHMap.put(2, "C");
        charHMap.put(3, "D");
        charHMap.put(4, "E");
        charHMap.put(5, "F");
        charHMap.put(6, "G");
        charHMap.put(7, "H");
        charHMap.put(8, "I");
        charHMap.put(9, "J");
        charHMap.put(10, "K");
        charHMap.put(11, "L");
        charHMap.put(12, "M");
        charHMap.put(13, "N");
        charHMap.put(14, "O");
        charHMap.put(15, "P");
        charHMap.put(16, "Q");
        charHMap.put(17, "R");
        charHMap.put(18, "S");
        charHMap.put(19, "T");
        charHMap.put(20, "U");
        charHMap.put(21, "V");
        charHMap.put(22, "W");
        charHMap.put(23, "X");
        charHMap.put(24, "Y");
        charHMap.put(25, "Z");
        charHMap.put(26, " ");
        charHMap.put(27, "1");
        charHMap.put(28, "2");
        charHMap.put(29, "3");
        charHMap.put(30, "4");
        charHMap.put(31, "5");
        charHMap.put(32, "6");
        charHMap.put(33, "7");
        charHMap.put(34, "8");
        charHMap.put(35, "9");
        charHMap.put(36, "0");
        charHMap.put(37, ".");
        charHMap.put(38, ",");
        charHMap.put(39, "?");

        return charHMap;
    }

    // Hashmap with text
    static HashMap<Integer, String> morseHMap = new HashMap<Integer, String>();  // Create a HashMap object called morseHMap

    static HashMap<Integer, String> charHMap = new HashMap<Integer, String>();  // Create a HashMap object called charHMap

    public static String convertToMorse(String inputText) {

        int counter = 0; //Counter for checking use of wrong letters

        String morseText = "";

        morseHMap = morseHashMap();
        charHMap = charHashMap();
        Converter h = new Converter(counter, inputText, morseText);



        String[] arrOfTxt = inputText.split(""); //splitting into letters and creating array


        for (int i = 0; i < arrOfTxt.length; i++) {


            for (Integer j : charHMap.keySet()) {

                if (arrOfTxt[i].equals(charHMap.get(j))) {

                    for (Integer k : morseHMap.keySet()) {

                        if (j.equals(k)) {
                            counter++; // increases every time the loop goes and it hits
                           morseText = morseText + morseHMap.get(k) + " "; //Building morse translation
                        }
                        // compare text to morse
                    }
                    // calls on hashmap with  morse
                }
                // checks if what u typed exist in the hashmap
            }

        }



        if (counter != arrOfTxt.length){
            morseText = "Wrong sign used, translation cannot be made";

        }

        return morseText;
    }

    public static String convertToText(String inputMorse) {
        int counter2 = 0; //Counter for checking use of wrong letters

        String convertedText = "";

        morseHMap = morseHashMap();
        charHMap = charHashMap();
        Converter h = new Converter(counter2, convertedText, inputMorse);

        String[] arrOfMorse = inputMorse.split("\\s+"); //splitting into signs and creating array

        for (int i = 0; i < arrOfMorse.length; i++) {

            for (Integer j : morseHMap.keySet()) {

                if (arrOfMorse[i].equals(morseHMap.get(j))) {

                    for (Integer k : charHMap.keySet()) {

                        if (j.equals(k)) {
                            counter2++;
                            convertedText = convertedText + charHMap.get(k); //Building morse translation

                        }
                        // compare morse to text
                    }
                    // Calls on hashmap with characters
                }
                // checks if what u typed exist in the hashmap
            }


        }
        if (counter2 != arrOfMorse.length){
            convertedText = "Wrong sign used, translation cannot be made";
        }
        //loop for searching though the array
        return convertedText;
    }
    //if loop for translating morse to text

    public static void print() {

            for (Integer j : charHMap.keySet()) {

                System.out.println(charHMap.get(j) + " = " + morseHMap.get(j));  // Print out the hashmaps
            }
            // Loop for the print

    }


}



