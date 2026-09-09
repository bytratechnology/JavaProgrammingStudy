import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct!");
                System.out.println("Attempts: " + attempts);
            }
        }

        scanner.close();
    }
}