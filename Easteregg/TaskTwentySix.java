
import java.util.Scanner;
public class TaskTwentySix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();
    
        System.out.println("I am " + name + " and i am " + age + " years old. ");
   }
}
