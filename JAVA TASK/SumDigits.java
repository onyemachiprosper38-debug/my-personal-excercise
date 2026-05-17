import java.util.Scanner;

public class SumDigits {
  
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter any number of your choice: ");
        int number = inputCollector.nextInt();
    
        int sum = 0;
        
        while (number > 10){
        int digit = number % 10;

        sum += digit;
   
        number /= 10;
  }
System.out.println("the total sum number is: " + sum);
 }
}                      
