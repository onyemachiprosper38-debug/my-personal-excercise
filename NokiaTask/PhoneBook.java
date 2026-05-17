import java.util.Scanner;

public class PhoneBook {

     public static void main(String[] args) {

          Scanner input = new Scanner (System.in); 
    

          String menu = """

               ===NOKIA 3310===

                  1.  Phone book
                  2.  Messages
                  3.  Chat
                  4.  Call register          
                  5.  Tones
                  6.  Settings
                  7.  Call divert
                  8.  Games
                  9.  Calculator
                  10. Reminders
                  11. Clock
                  12. Profiles
                  13. SIM services
                     """ ; 
     
    System.out.println(menu + "\nEnter a number from: 1 - 13 :");

      int choice = input.nextInt();

        switch (choice){
            case 1 ->{ System.out.println("""

    ======== Phone Book ===========
               1: Search
               2:Service Nos.
               3:Add name
               4. Erase
               5. Edit
               6. Assign tone
               7. Send b’card
               8. Options
               9. Speed dials
              10. Voice tags               
                   """);
                  
        int options = input.nextInt();

               switch(options){
                case 1 -> System.out.println("Search");
                case 2 -> System.out.println("Service Nos");
                case 3 -> System.out.println("Add name");
                case 4 -> System.out.println("Erase");
                case 5 -> System.out.println("Edit");
                case 6 -> System.out.println("Assign tone");
                case 7 -> System.out.println("Send b'card'");
                case 8 -> {System.out.println("Options");
                     System.out.println("1 -> Type of view");
                     System.out.println("2 -> Memory status");
                     System.out.println("Enter option choice"); 
                     int optionChoice = input.nextInt();
       
                    switch(optionChoice){
                        case 1 -> System.out.println("Type of view: ");
                        case 2 -> System.out.println("Memory status; "); 
                    }
                }
                    
                case 9 -> System.out.println("Speed dials");
                case 10 -> System.out.println("Voice tags");
           }  
       }

      
             case 2 ->{
                  String Messages = """ 
      
         ======== Messages =======
                   1.Write messages
                   2. Inbox
                   3. Outbox
                   4. Picture messages
                   5. Templates
                   6. Smileys
                   7. Message settings
                   8. Info service
                   9. Voice mailbox number
                   10.Service command editor
                        """;
                 System.out.println(Messages);
                 System.out.println("Enter messages choice: ");
                 int messageChioce = input.nextInt();

              switch (messageChioce) {
                      case 1 -> System.out.println("Write messages: ");
                      case 2 -> System.out.println("Inbox: ");
                      case 3 -> System.out.println("Outbox: ");
                      case 4 -> System.out.println("Picture messages: ");
                      case 5 -> System.out.println("Templates: ");
                      case 6 -> System.out.println("Smileys: ");
                      case 7 ->{System.out.println("Message settings");
                      String messageSettings = """
                        1. Set
                        2. Common 
                          """;
                        
               
                      System.out.println(messageSettings);
                      System.out.println("Enter option 1 or 2");
                      int msgset = input.nextInt();
                     
                         switch(msgset){
                             case 1 -> {System.out.println("""
                   
                           ======= Set ======
                         1. Message center number
                         2. Messages sent as
                         3. Message validity
                           """); 
                         System.out.print("Enter a number to select an option: ");
                          int s = input.nextInt();
                          switch (s){ 
                          case 1 -> System.out.println("Message center number: ");
                          case 2 -> System.out.println("Messages sent as: ");
                          case 3 -> System.out.println("Message validity: ");
                        }
                       }
                       


                           case 2 -> {System.out.println(""" 
        
                           ====== Common ======
                         1. Delivery reports
                         2. Reply reports
                         3. Character support
                             """);
                          System.out.println("Enter a number to select an option: ");
                           int c = input.nextInt();
                           switch (c){
                           case 1 -> System.out.println("Delivery reports: ");
                           case 2 -> System.out.println("Reply reports: ");
                           case 3 -> System.out.println("Character support: ");

                           }
                          } 
                         }
                        }

                          case 8 -> System.out.println("Info service: ");
                          case 9 -> System.out.println("Voice mailbox number: ");
                          case 10 -> System.out.println("Service command editor");

                          }

                         }

                     case 3 -> {
                        String Chat = """
                          
                           ====FACEBOOK====
                           1. Facebook """;

                      System.out.println(Chat + "\nSelect 1 to enter: ");
                           int select = input.nextInt();  
                          switch (select){
                          case 1-> System.out.println("no internet connection: ");

                       }
                 
                     }
                    
                 case 4 -> {
                     String callRegister = """

                    =======Call Register=====
                           1. Missed calls
                           2. Received calls 
                           3. Dialled numbers
                           4. Erase recent call lists
                           5. Show call duration                  
                           6. Show call costs
                           7. Call cost settings
                           8. Prepaid credit
                                    """;
                       System.out.println(callRegister + "\nEnter option 1-8");

                       int chose = input.nextInt();
                       switch (chose){
                       case 1 ->{ System.out.println("Missed calls: ");}
                       case 2 ->{ System.out.println("Received calls: ");}
                       case 3 -> {System.out.println("Dialled numbers: ");}
                       case 4 ->{ System.out.println("Erase recent call lists: ");}
                       case 5 ->{ System.out.println("Show call duration: ");
                            System.out.println("1. Last call duration: ");
                            System.out.println("2. All calls’ duration: ");
                            System.out.println("3. Received calls: ");
                            System.out.println("4. Dialled calls: ");
                            System.out.println("5. Clear timers: ");
                           
                        }
 

 
                        case 6 -> {System.out.println("Last call duration: ");
                                   System.out.println("All calls’ duration: ");
                                   System.out.println("Received calls: ");
                                    System.out.println("Dialled calls: ");
                                     System.out.println("Clear timers: ");
                        }
                   
                        case 7 ->{ System.out.println("Show call costs: ");
                        System.out.println("1. Last call cost: ");
                        System.out.println("2. All calls’ cost: ");
                        System.out.println("3. Clear counters: ");
                           
                       }
                      case 8 ->{System.out.println("Prepaid credit: ");
                       }
                     
                    }
                }
                      case 5->{
                      String Tones = """ 
                      
                      ====Tones====
                      1. Ringing tone
                      2. Ringing volume
                      3. Incoming call alert
                      4. Composer
                      5. Message alert tone
                      6. Keypad tones
                      7. Warning and game tones
                      8. Vibrating alert
                      9. Screen saver

                                """;
               System.out.println(Tones + "\nEnter any option to select: ");
                     int toneChoice = input.nextInt();
                     switch (toneChoice){
                       
                     case 1 -> {System.out.println("Ringing tone: ");}
                     case 2 -> {System.out.println("Ringing volume: ");}
                     case 3 -> {System.out.println("Incoming call alert: ");}
                     case 4 -> {System.out.println("Composer: ");}
                     case 5 -> {System.out.println("Message alert tone: ");}
                     case 6 -> {System.out.println(" Keypad tones: ");}
                     case 7 -> {System.out.println("Warning and game tones: ");}
                     case 8 -> {System.out.println("Vibrating alert: ");}
                     case 9 -> {System.out.println("Screen saver: ");}
                    }
                  }
                     case 6 -> {
                     String settings = """

                     =====Settings=====
                      1. Call settings
                      2. Phone settings
                      3. Security settings
                      4. Restore factory settings
                              """;
                System.out.println(settings + "\n Enter an option to select: ");
                       int settingsChoice = input.nextInt();
                       switch (settingsChoice){
                       case 1 ->{System.out.println("Call settings: ");
                            System.out.println("1. Automatic redial: ");
                            System.out.println("2. Speed dialling: ");
                            System.out.println("3. Call waiting options: ");
                            System.out.println("4. Own number sending: ");
                            System.out.println("5. Phone line in use: ");
                           }
                        }
                        
}


   

 
                    
}

             
}
}
 
    


                   






