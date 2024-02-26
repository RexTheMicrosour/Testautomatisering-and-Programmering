import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner

        hashMap h = new hashMap();
        HashMap<Integer, String> morseHMap = new HashMap<Integer, String>();  // Create a HashMap object called morseHMap
        morseHMap = h.morseHashMap();
        HashMap<Integer, String> charHMap = new HashMap<Integer, String>();  // Create a HashMap object called charHMap
        charHMap = h.charHashMap();


        while (true){
            System.out.println("");
            System.out.println("Hello welcome!");
            System.out.print("Do u want to write in text [1} or in morse [2] or if you want to end [3] : ");
            String input = scan.nextLine();

            if (input.equals("1")){
                System.out.print("What do you want to write? ");
                String input_text = scan.nextLine();
                String text = input_text;


                String[] arrOfTxt = text.split("");

                for (int i = 0 ; i<arrOfTxt.length ; i++) {

                    for (Integer j : charHMap.keySet()) {

                        if (arrOfTxt[i].equals(charHMap.get(j))) {


                            for (Integer k : morseHMap.keySet()) {
                                if (j.equals(k)) {
                                    System.out.print(morseHMap.get(k) + " ");
                                }
                            }
                        }
                    }
                }

            }
            else if (input.equals("2"))
            {
                System.out.print("What do you want to write? ");
                String input_text = scan.nextLine();
                String text = input_text;


                String[] arrOfTxt = text.split("\\s+");


                for (int i = 0 ; i<arrOfTxt.length ; i++) {

                    for (Integer j : morseHMap.keySet()) {

                        if (arrOfTxt[i].equals(morseHMap.get(j))) {


                            for (Integer k : charHMap.keySet()) {
                                if (j.equals(k)) {

                                    System.out.print(charHMap.get(k));


                                }
                            }
                        }
                    }
                }
            }
            else if (input.equals("3")){
                break;
            }
        }






    }
}
