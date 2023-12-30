import java.util.*;

public class GuessNumberGame {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playAgain = 1;

        while (playAgain == 1) {
            playGame(scanner);

            System.out.println("Do you want to play again? YES=1 & NO=0 ");
            playAgain = scanner.nextInt();

            if (playAgain == 1) {
                System.out.println("START OVER");
            } else {
                System.out.println("GAME ENDED");
            }
        }
    }

    private static void playGame(Scanner scanner) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        int chances = 10;

        System.out.println("Guess the numbers from 0 to 100");
        System.out.println("You will be having a total of 10 chances, and your score is based on the remaining chances.");

        while (chances > 0) {
            System.out.println("Enter your number:");
            int userGuess = scanner.nextInt();

            if (randomNumber == userGuess) {
                System.out.println("Equal to the generated number!");
                break;
            } else if (randomNumber < userGuess) {
                System.out.println("Greater than the generated number");
            } else {
                System.out.println("Lesser than the generated number");
            }

            chances--;
        }

        System.out.println("Your score = " + chances);
        System.out.println("Random Number: " + randomNumber);
    }
}
