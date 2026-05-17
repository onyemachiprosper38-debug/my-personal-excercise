import java.util.Scanner;
public class CurrentHour  {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter current hour (0-23): ");
    int currentHour = input.nextInt();

    if (currentHour <= 11) {
    System.out.println("Good Morning!!! ");
 }

  else if (currentHour <= 17) {
   System.out.println("Good Afternoon!!! ");
}

 else if (currentHour <= 21){
  System.out.println("Good Eveninng!!! ");
}
   
 else if (currentHour <= 24 ){
  System.out.println("Good Night!!! ");

 }
    
  }
}
 
