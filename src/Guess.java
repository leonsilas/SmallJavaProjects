import java.util.Scanner;

public class Guess {
    public static void newGame() {
      //Setup
      Scanner scnr = new Scanner(System.in);
      Die die = new Die(6); //Implied that Die will take in int for number of sides on the die
      int sum = 0;
      boolean result = false;
      final int tries = 3;
      final int numDice = 2;
  
      // Actual beginning of game
      System.out.println("Please choose a number between " + numDice*1 + " and " + die.getSides()*numDice); // variable output for number of sides on dice and number of dice being used
      int playerGuess = scnr.nextInt();
      for (int i = 0; i < tries; i++){

        for (int j = 0; j < numDice; j++){
          die.roll(); //Roll is the actual method to randomize a value given on the int in the constructor
          sum += die.getValue();
        }

        if (playerGuess == sum){
          System.out.println("You win!");
          result = true;
          break;
        }
        
        sum = 0; //Resets for next round
      }// end of game loop

      if (!result)
        System.out.println("You lose!");

    }// end of newGame

  }// end of Guess