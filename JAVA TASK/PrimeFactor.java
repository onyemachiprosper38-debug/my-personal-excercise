import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);
    System.out.println("Enter number: ");
    int number = inputCollector.nextInt();

     int counter = 2;
     int factor = 0;

while (number != 1){

if(number % counter == 0){
   number = number / counter;
 factor = factor + counter;

}
else{
counter++;
}
System.out.println(factor);

      
       }
   }
  }

 
