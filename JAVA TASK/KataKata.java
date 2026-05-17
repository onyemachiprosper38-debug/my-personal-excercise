import java.util.Scanner;

public class KataKata { 

    public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);

    int[] chose = new int[10];

    int count = 0;

for  (count = 1; count < chose.length; count++){

    System.out.println("Enter a number: ");
    int number = inputCollector.nextInt();

    chose[count]=number;  
 }
  
for (int counter = 0; counter < 10; counter++){

    System.out.print(chose[counter] + " ");

 }





     }

   }
  
