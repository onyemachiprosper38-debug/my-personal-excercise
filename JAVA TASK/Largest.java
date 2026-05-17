import java.util.Scanner;

public class Largest {
  
    public static void main(String[] args){


         Scanner input = new Scanner(System.in);
        
         System.out.println("Enter first integer");
   
         int numberone = input.nextInt();


         System.out.println("Enter second interger");

         int numbertwo = input.nextInt();

         if (numberone > numbertwo) {

         System.out.println("The largest number is " + numberone);

       } else {

        System.out.println("the largest number is " + numbertwo);


  }
         
 }

}
