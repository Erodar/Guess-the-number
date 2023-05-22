import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int wincounter = 0;
    public static void main(String[] args) {
        playgame();
    }

    public static void playgame() {

        Random rand = new Random();
        int RightNumber = rand.nextInt(1001);
        int NumberGuess = 0;

        for (int i =1; i < 10; i++) {

            Scanner NumGuess = new Scanner(System.in);
            System.out.println("This is attempt " + i);
            System.out.println("Guess the number: ");

            if (NumGuess.hasNextInt()) {
                NumberGuess = NumGuess.nextInt();
            } else if (!NumGuess.hasNextInt()) {
                System.out.println("Please enter a valid number");
                break;
            }

            if (NumberGuess == RightNumber) {
                System.out.println("You guessed the number!");
                wincounter++;
                break;
            } else if (NumberGuess < RightNumber) {
                System.out.println("Guess higher!");
            } else {
                System.out.println("Guess lower!");
            }
        }

        System.out.println("The correct number was " + RightNumber);
        Scanner PlayAgain = new Scanner(System.in);
        System.out.println("Would you like to play again? y/n");
        String YesSir = String.valueOf('y');
        String NoSir = String.valueOf('n');
        String PlayAgainChoice = PlayAgain.nextLine();

        if (PlayAgainChoice.equals(YesSir)) {
           playgame();
        }

        else if (PlayAgainChoice.equals(NoSir)) {
            System.out.printf("You won %s times! \n", wincounter);
            System.out.println("Thank-a you for-a playing my-a game!");
        }

        else {
             System.out.println("Please choose a valid option");
        }
    }
}