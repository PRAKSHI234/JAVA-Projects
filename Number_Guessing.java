                                 //NUMBER GUESSING GAME
import java.util.Scanner;
public class Number_Guessing{
    public static void main(String[] args) {
        final int MAX_NUMBER = 100;
        final int MAX_ATTEMPTS = 5;
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Number Guessing Game!");
          while (true) {
            int randomNumber = (int) (Math.random() * MAX_NUMBER) + 1;
            int attempts = 0;
            System.out.println("A random number has been generated between 1 and 100.");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");     
           while (attempts < MAX_ATTEMPTS) {
                System.out.print("Guess a number: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == randomNumber) {
                    System.out.println(" You've guessed the correct number.");
                    int points = MAX_ATTEMPTS - attempts + 1; // More points for fewer attempts
                    score += points;
                    System.out.println("You earned " + points + " points for this round.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Lower than the random no");
                } else {
                    System.out.println("Higher than the random 	no");
                }}
            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Used all your attempts.The correct number was " + randomNumber);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            } 
          }
        System.out.println("Your final score: " + score);   
    }}