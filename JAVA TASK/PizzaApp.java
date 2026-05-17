import java.util.Scanner;

public class PizzaApp {

    public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);

     String menu = """

      Pizza type  Number of Slices  Price per box

      Sapa size        4              2500

      Small Money      6              2900
      
      Big boys         8              4000

      Odogwu           12             5200

                       """;

    System.out.println(menu + "\nSelect choice");
String choice = scanner.nextLine();

System.out.println("Enter number of people eating the pizza ");
int numberOfPeople = scanner.nextInt();
 
int price  = 0;
int slices = 0;
switch (choice){
        case "Sapa size":
          price = 2500;
          slices = 4;

        case "Small money":
          price = 2900;
          slices = 6;


        case "Big money":
          price = 4000;
          slices = 8;

    case "Odogwu":
          price = 5200;
          slices = 12;
}
 
   int numberOfBoxes = numberOfPeople / slices;
    int remainingPizza =  numberOfBoxes * slices - numberOfPeople;
    int priceOfBoxes = price * numberOfBoxes;
   int totalSlices = numberOfBoxes * slices;
 
System.out.println(choice + " size contains " + slices + " slices per box " + numberOfBoxes + " boxes should be sufficient for " +  numberOfPeople + "   persons as it would contain " + totalSlices + " slices in all" +  " after serving " + totalSlices + " slices, you should have 3 slides left " );













   }
 }
