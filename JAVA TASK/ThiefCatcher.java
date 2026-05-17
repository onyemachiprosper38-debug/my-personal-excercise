//write a program that simulate the catching of a thief

import java.util.Scanner;

public class ThiefCatcher {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        while (true) {
            System.out.print("Catch the thief: ");
            String userInput = myscanner.nextLine();

            if (userInput.equals("thief")) {
                System.out.println("🚔️  👮‍♀️️  hold am e de go kiri kiri...");
                break;
            } 
               else {
                System.out.println(userInput + " No be thief, keep searching...");
            }
        }

    }
}
