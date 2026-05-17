
import java.util.Scanner;
public class TaskTwentyFour{

    public static void main(String[] args) {
   
       Scanner input = new Scanner(System.in);

       System.out.println("Enter first number: ");
       int num1 = input.nextInt();

       System.out.println("Second number: ");
       int num2 = input.nextInt();

       int swap = num1;

        num1 = num2 ;

        num2 = swap;

        System.out.println(num1+ " "+num2);
       
   }
}
