import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int RightNumber = rand.nextInt(1001);
        int TurnCount = 1;
        int NumberGuess = 0;

        boolean GuessingNow = true;
        while (GuessingNow) {

            while (TurnCount < 11) {
                Scanner NumGuess = new Scanner(System.in);
                System.out.println("This is attempt " + TurnCount);
                System.out.println("Guess the number: ");


            if (NumGuess.hasNextInt()) {
                    NumberGuess = NumGuess.nextInt();
                }
            else if (!NumGuess.hasNextInt()) {
                System.out.println("Please enter a valid number");
                break;
            }
            if (NumberGuess == RightNumber) {
                    System.out.println("You guessed the number!");
                    TurnCount = 10;
            }
            else if (NumberGuess < RightNumber) {
                    System.out.println("Guess higher!");
            }
            else {
                    System.out.println("Guess lower!");
            }

            TurnCount += 1;

            if (TurnCount == 11) {

                    System.out.println("The correct number was " + RightNumber);
                    Scanner PlayAgain = new Scanner(System.in);
                    System.out.println("Would you like to play again? y/n");
                    String YesSir = String.valueOf('y');
                    String NoSir = String.valueOf('n');
                    String PlayAgainChoice = PlayAgain.nextLine();
                    if (PlayAgainChoice.equals(YesSir)) {
                        RightNumber = rand.nextInt(1001);
                        TurnCount = 1;
                    }

                    else if (PlayAgainChoice.equals(NoSir)) {

                        GuessingNow = false;
                        System.out.println("Thank-a you for-a playing my-a game!");

                    }

                }
            }
        }
    }
}