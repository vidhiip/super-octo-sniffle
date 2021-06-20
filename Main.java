import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("\n\nDo you know how to count coins? Your change specifically? ");
    System.out.println("Well no worries, we're here to teach you today!");

    System.out.println("\nThere are 4 main coins you could potentially get: ");
    System.out.println("    -  Penny (1 cent)");
    System.out.println("    -  Nickle (5 cents)");
    System.out.println("    -  Dime (10 cents)");
    System.out.println("    -  Quarter (25 cents)");

    System.out.print("\nA dollar is made of 100 cents, so if you had 100 pennies, would you have a dollar? ");
    String haveDollar = sc.next();
    if (haveDollar.toUpperCase().substring(0, 1).equals("Y"))
      System.out.println("Indeed! 100 pennies is 100 cents!");
    else
      System.out.println("You were close! 100 cents actually does equal to a whole dollar. This is because a dollar is equal to 100 cents and since a single penny is worth a single cent, we would need 100 of those single-cented-pennies to make a dollar. You'll get the next one!");
  
    System.out.print("\nCould I make a dollar with 3 quarters? ");
    haveDollar = sc.next();
    if (haveDollar.toUpperCase().substring(0, 1).equals("N"))
      System.out.println("Indeed! 25 + 25 + 25 or 25 * 3 ≠ 100 cents! Good job at catching that!");
    else
      System.out.println("Not quite! Since I have 3 quarters and quarters are worth only 25 cents, I would need to either multiple 25 by 3 (because I have 3 quarters worth 25 cents) or add 25 three times (because I have 3 individual quarters, eah worth 25 cents). Both ways work so pick whichever works better for you! After you multipled or added you should have gotten 75 cents. From this, you can tell that 75 cents is LESS than 100 cents which would make it not possible for me to have a dollar! Let's keep practicing together!");
    
    System.out.print("\nLast question, if George Washington had 2 nickles, 3 dimes, 1 quarter, and 7 pennies, would that make a dollar? ");
    haveDollar = sc.next();
    if (haveDollar.toUpperCase().substring(0, 1).equals("N")) {
      System.out.println("Wow, you've got this complex one in the bag! Good job! By suming together the individual types and then adding them all together for the sum, we get 72 cents. Just 28 cents less than 100.");
    } else {
      System.out.println("Did you miscalculate? Well no worries! We can go over it! Lets first start with the addition method: if you add the nickles (5 cents) two times, you would get 10 cents. If you add the dimes (10 cents) three times, you get 30 cents. If you add the lone quarter (25 cents) just once, you get 25 cents (remember it's a single quarter!). Now, lets add of those individual sums, so it the numbers would be: 10, 30, 25, and 7! Adding these togethers, you get 72 cents and that, dear friend, does not equal 100 cents, therefore Mr. Washington seems to have less than a dollar on him!");
    }



    System.out.print("\n\nNow that we are done with the complusionary basics, would you like to try a practice problems with a real-life scenario? ");
    String morePractice = sc.next();
    if (morePractice.toUpperCase().substring(0, 1).equals("Y")) {
      System.out.println("\nLets begin...\n");
      System.out.println("John buys food worth $15 and 27 cents (including tax). When John asks for his change back after handing $17, the cashier was stunned. They have trouble with counting cash, it is now your task to help the cashier and hand John his desired change back. \nJohn recieves:\n   [a]  $2.83\n   [b]  $1.121 \n   [c]  $2.73 \n   [d]  $3.05\n   [e]  no change");
      String changeBack = sc.nextLine();
      changeBack = sc.nextLine();
      
      boolean f = true;
      while (f) {
        if (changeBack.toLowerCase().equals("c") ||changeBack.toLowerCase().equals("[c]") || changeBack.toLowerCase().equals("[c]  $2.73")) {
          System.out.println("Good job!");
          f = false;
        } else {
          System.out.print("Try again:  ");
          changeBack = sc.nextLine();
        }
      }
    } else {
      System.out.println("Well, I hope you learned a little about change with us! Have a glorious and change-ful lifetime :)");
    }


  } // end main
} // end class