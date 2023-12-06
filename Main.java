import java.util.Scanner;
import java.util.Random;

class Main 
  {
  public static void main(String[] args)
    {
      Scanner  Scanner = new Scanner(System.in);
      Random random = new Random();

      int  guessedNumber= random.nextInt(269)+1;
      int attempts = 0;

       System.out.println("This is number guessing game.");
       System.out.println("Have fun by guessing a number,I'll inform if you guessed it right or wrong.");

      while(true)
        {
           System.out.println("Come on!! Guess a number between 1 and 270:");
          int guess = Scanner.nextInt();
          attempts++;

          if(guess == guessedNumber)
          {
             System.out.println("Yohooo!! You guessed it right.");
             System.out.println("It took you " + attempts + " attempts.");
             break;
          }
          else if(guess < guessedNumber)
          {
             System.out.println("Hmm!!! It was too low");
             System.out.println("Try again");          
          }
          else 
          {
             System.out.println("Hmm!!! It was too high");
             System.out.println("Try again");

          }
        }
    } 
  }
