import java.util.Scanner;

public class NameOfRow {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

      
        System.out.print("Enter number of rows: ");
        int number = inputCollector.nextInt();

        
        for (int i = 1; i <= number; i++) {

           
            for (int j = 1; j <= number - i; j++) {
               System.out.print(" ");
            }

        
            for (int k = 1; k <= i; k++) {
                System.out.print("kashamadupe");
            }

          
            System.out.println();
        }

       
    }
}

