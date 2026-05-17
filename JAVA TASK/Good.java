import java.util.Scanner;

public class Good {
  
    public static void main(String[] args){


         Scanner inputCollector = new Scanner(System.in);
        
         System.out.println("What is ya name?");
   
         String userInput = inputCollector.nextLine();


         System.out.println("How old are you?");

         int Age = inputCollector.nextInt();

         System.out.printf("Hello %s, you are %d years old", userInput, Age);








  }









}
