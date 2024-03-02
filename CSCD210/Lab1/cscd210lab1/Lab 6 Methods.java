package cscd210lab6;

import java.util.Scanner;
import cscd210methods.CSCD210Lab6Methods;

public class CSCD210Lab6{
   
   public static void main(final String [] args) {
      int theNum, choice;
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Welcome!\n Please enter a number from the menu:");
      theNum = CSCD210Lab6Methods.readPosNum(kb);
      
      do
      {
        System.out.println("1. Enter a new number");
        System.out.println("2. Print the number of even/odd/zeros");
        System.out.println("3. Tells you if the number is light or heavy");
        System.out.println("4. Displays the value of E");
        System.out.println("5. Displays the number in reverse order");
        System.out.println("6. Quit");
        System.out.print("Enter your choice (1-6): ");
        choice = kb.nextInt();







         choice = CSCD210Lab6Methods.menu(kb);
         
         switch(choice)
         {
            case 1:  theNum = CSCD210Lab6Methods.readPosNum(kb);
                     break;
                    
            case 2:  CSCD210Lab6Methods.oddEvenZero(theNum);
                     break;  
            
            case 3:  CSCD210Lab6Methods.lightOrHeavy(theNum, kb);
                     break;
                     
            case 4:  CSCD210Lab6Methods.printE(theNum);
                     break;
                     
            case 5:  CSCD210Lab6Methods.printReverse(theNum);
                     break;
                     
            default: System.out.println("Good Bye");         
         
         }// end switch
            
      }while(choice != 6);
  
   }// end main

}// end class