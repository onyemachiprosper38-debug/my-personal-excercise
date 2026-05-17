import java.util.Scanner;
public class CheckoutSystem {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

  

        String addMore = "yes";

           double subTotal = 0;
        System.out.print("What is the customer's name? ");
        String customerName = myscanner.nextLine();

         
        while (addMore.equalsIgnoreCase("yes")) {

            System.out.print("What did the user buy? ");
            String productName = myscanner.nextLine();

           
            System.out.print("How many pieces? ");
            int quantity = myscanner.nextInt();

            
            System.out.print("How much per unit? ");
            double price = myscanner.nextDouble();

            
           double total = quantity * price;

           
             subTotal = subTotal + total;

            
            System.out.println("Item Total: " + total);

            myscanner.nextLine();

            System.out.print("Add more items? ");
            addMore = myscanner.nextLine();
        }

        
        System.out.print("What is your name? ");
        String cashierName = myscanner.nextLine();

       
        System.out.print("How much discount will he get? ");
        double discount = myscanner.nextDouble();

        double vat = subTotal * 0.075;

        
        double billTotal = subTotal + vat - discount;

        
        System.out.println();
        System.out.println("=================================");
        System.out.println("        SEMICOLON STORES         ");
        System.out.println("=================================");

        System.out.println("Customer Name: " + customerName);
        System.out.println("Cashier Name: " + cashierName);

        System.out.println("---------------------------------");
        System.out.println("Sub Total: " + subTotal);
        System.out.println("Discount: " + discount);
        System.out.println("VAT (7.5%): " + vat);
        System.out.println("Bill Total: " + billTotal);
        System.out.println("---------------------------------");

        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("COMPANY Manager MR. CHIBUZOR");
       
    }
}
