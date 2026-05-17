import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first integer");
    int num1 = input.nextInt();

    System.out.println("Enter second integer");
    int num2 = input.nextInt();

    int product = num1 * num2;
 
    System.out.println("The product is " + product);

   }
}
