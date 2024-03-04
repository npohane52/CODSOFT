import java.util.Scanner;
import java.util.Random;

public class JavaNumberGame
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int min_Range = 1;
        int max_Range = 100;
        int score = 0;
        int Attempts_No = 4;

        System.out.println("Welcome to the Number Guessing Game!!");
        System.out.println(
                "You can choose a number between " + min_Range + " and " + max_Range + ". Let's see your luck.");

        boolean play_Again = true;

        while (play_Again) 
        {
            int NumberToGuess = rd.nextInt(max_Range - min_Range + 1) + min_Range;
            int current_Attempt = 1;
            boolean guessed_Correctly = false;

            while (current_Attempt <= Attempts_No) 
            {
                System.out.print("Attempt " + current_Attempt + "/" + Attempts_No + ": Enter your Number : ");
                int userGuess = sc.nextInt();

                if (userGuess == NumberToGuess) 
                {
                    System.out.println("Bravo, You guessed the correct number.");
                    guessed_Correctly = true;
                    score += Attempts_No - current_Attempt + 1;
                    break;

                }

                else if (userGuess < NumberToGuess) 
                {
                    System.out.println("Too low. Try again.");
                }

                else 
                {
                    System.out.println("Too high. Try again.");
                }

                current_Attempt++;
            }

            if (!guessed_Correctly) 
            {
                System.out.println("Sorry, you've run out of Attempts_No. The number was: " + NumberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.next();
            if (!playAgainResponse.equalsIgnoreCase("yes")) 
            {
                play_Again = false;
            }
        }

        System.out.println("GAME OVER!. Your total score is: " + score);
        sc.close();
    }
}