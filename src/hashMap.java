

import java.util.HashMap;

public class hashMap {

    private static int userCount;  // New int for error checking
    private static  String userWords; // new String for counting words

    private  static  String userMorse;

    public hashMap(int myCount,String myWords, String myMorse) {
        userCount = myCount;
        userWords = myWords;
        userMorse = myMorse;
    }
    //Constructor

    public int getCount() {
        return userCount;
    }
    //Counter for errors
 //   public int getCount(int ) {
 //       return userCount;
 //   }
    public void setCount(int actualCount) {
        if (actualCount == 1){
            userCount = 1;
        }
        else {
            userCount = 0;
        }
    }
    public static int countWords(String userText){
        userText = userText.trim(); // remove whitespaces

        String[] words = userText.split("\\s+"); // Splitting the string into words

        int wordCount = words.length; // Counting the number of words

        return wordCount;
    }
    public int countMorse(String morsetext){
        morsetext = morsetext.trim();// remove whitespaces

        String[] signs = morsetext.split("\\s+"); // Splitting the string into signs

        int morseCount = signs.length; // Counting the number of signs
        return morseCount;
    }
    public HashMap<Integer, String> morseHashMap() {

        HashMap<Integer, String> morseHMap = new HashMap<Integer, String>();// Create a HashMap object called morseHMap

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
    public HashMap<Integer, String> charHashMap() {

        HashMap<Integer, String> charHMap = new HashMap<Integer, String>();

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













}