import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner

        int counter = 0; //Counter for checking use of wrong letters
        String text = "";
        String morseText = "";

        hashMap h = new hashMap(counter,text, morseText );
        HashMap<Integer, String> morseHMap = new HashMap<Integer, String>();  // Create a HashMap object called morseHMap
        morseHMap = h.morseHashMap();
        HashMap<Integer, String> charHMap = new HashMap<Integer, String>();  // Create a HashMap object called charHMap
        charHMap = h.charHashMap();

        while (true){
            System.out.println("");
            System.out.println("Hello welcome!");
            System.out.println("Do u want to write in text, press [1}");
            System.out.println("Do u want to write in morse, press [2]");
            System.out.println("Do u want to see the translation, press [3]");
            System.out.println("Do u want to end, press [4]");
            System.out.println(" ");
            System.out.print("Choose what you u want to do : ");
            String input = scan.nextLine();
            //Main menu

            if (input.equals("1")){
                System.out.print("What do you want to write? ");
                String input_text = scan.nextLine();
                text = input_text;

                String[] arrOfTxt = text.split(""); //splitting into letters and creating array
                hashMap.countWords(text);

                for (int i = 0; i < arrOfTxt.length; i++) {
                    counter = 0; //gives the counter a start value of 0

                    for (Integer j : charHMap.keySet()) {

                        if (arrOfTxt[i].equals(charHMap.get(j))) {

                            for (Integer k : morseHMap.keySet()) {
                                counter++; // increases every time the loop goes and it hits
                                if (j.equals(k)) {
                                    System.out.print(morseHMap.get(k) + " "); //prints out the translation
                                }
                                // compare text to morse
                            }
                            // calls on hashmap with  morse
                        }
                        // checks if what u typed exist in the hashmap
                    }
                    if (counter == 0){
                        System.out.print("Wrong");
                    }
                    // Error handling
                }
                //loop for searching through the array


            }
            //if loop for translating text to morse

            else if (input.equals("2"))
            {
                System.out.print("What do you want to write? ");
                String input_text = scan.nextLine();
                text = input_text;


                String[] arrOfTxt = text.split("\\s+"); //splitting into signs and creating array


                for (int i = 0 ; i<arrOfTxt.length ; i++) {
                    counter = 0;
                    for (Integer j : morseHMap.keySet()) {

                        if (arrOfTxt[i].equals(morseHMap.get(j))) {

                            for (Integer k : charHMap.keySet()) {
                                counter++;
                                if (j.equals(k)) {
                                    System.out.print(charHMap.get(k)); //prints out the translation
                                }
                                // compare morse to text
                            }
                            // Calls on hashmap with characters
                        }
                        // checks if what u typed exist in the hashmap
                    }
                    if (counter == 0){
                        System.out.print("Wrong");
                    }
                    // Error handling
                }
                //loop for searching though the array
            }
            //if loop for translating morse to text

           else if (input.equals("3")) {
                for (Integer j : charHMap.keySet()) {

                    System.out.println(charHMap.get(j) + " = " + morseHMap.get(j));  // Print out the hashmaps
                }
                // Loop for the print
            }
            // choice 3 in menu

            else if (input.equals("4")){
                break;
            }
            // stops the program
            else {
                System.out.print("Error, thats not one of the options!");

            }
            // Error handling
        }

    }

}
