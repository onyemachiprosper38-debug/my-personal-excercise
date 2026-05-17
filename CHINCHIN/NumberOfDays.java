import java.util.Scanner;
public class NumberOfDays  {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the month ");
    String month = input.next();


    System.out.println("Enter the year ");
    int year = input.nextInt();

    if (month.equals("january")) {
    System.out.println("the number of  days in that month is 31 ");
   }

   if (month.equals("february")) {
   System.out.println("the number of  days in that month is 28 ");
   }

   if (month.equals("march")) {
   System.out.println("the number of  days in that month is 31 ");
   }

   if (month.equals("april")) {
   System.out.println("the number of  days in that month is 30 ");
  }

   if (month.equals("may")) {
   System.out.println("the number of  days in that month is 31 ");
 }

  if (month.equals("june")) {
  System.out.println("the number of days in that month is 30 ");
 }

  if (month.equals("july")) {
  System.out.println("the number of  days in that month is 31 ");
}  

  if (month.equals("august")) {
  System.out.println("the number of  days in that month is 31 ");
}

  if (month.equals("september")) {
  System.out.println("the number of  days in that month is 30 ");
}
  if (month.equals("october")) {
  System.out.println("the number of  days in that month is 31 ");
 }

  if (month.equals("november")) {
  System.out.println("the number of days in that month is 30  ");
}
  if (month.equals("december")) {
  System.out.println("the number of days in that month is 31 ");
 }

 
  }
}
 
