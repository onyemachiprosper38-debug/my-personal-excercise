import java.util.Scanner;

public class NumberInput {

    public static void main(String[] args){

        Scanner myscanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number: ");
            int number = myscanner.nextInt();

            if (number == 7){
                System.out.println(number + " is equal to 7, you finally got it");
                break; 
            } else if (number < 7){
                System.out.println(number + " is below 7, try again");
            } else {
                System.out.println(number + " is above 7, try again");
            }
        }
    }
}

