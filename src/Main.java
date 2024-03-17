import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner

        while (true) {
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

            if (input.equals("1")) {

                System.out.print("What do you want to write? ");
                String userText = scan.nextLine();
                System.out.println("Conversion of " + userText + " : " );
                System.out.println(Converter.convertToMorse(userText));

            } else if (input.equals("2")) {
                System.out.print("What do you want to write? ");
                String userMorse = scan.nextLine();
                System.out.println("Conversion of " + userMorse + " : " );
                System.out.println(Converter.convertToText(userMorse));

            } else if (input.equals("3")) {
                Converter.print();
            } else if (input.equals("4")) {
                break;
            } else {
                System.out.println("Not valid choice");
              }
        }
    }

}
