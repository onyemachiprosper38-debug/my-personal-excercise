
import java.util.Scanner;
public class TaskTwentyTwo{

    public static void main(String[] args) {
   
       Scanner input = new Scanner(System.in);

       System.out.println("Radius: ");
       int radius = input.nextInt();

       
       double area = 4.5 * radius * radius;
       System.out.println("Area  = " + area);
   }
}
