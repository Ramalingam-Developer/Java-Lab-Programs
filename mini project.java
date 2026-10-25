```java
import java.util.Random;
import java.util.Scanner;

public class HandCricket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerScore = 0;
        int computerScore = 0;

        System.out.println("===== HAND CRICKET GAME =====");

        System.out.println("\nToss!");
        System.out.println("1. Odd");
        System.out.println("2. Even");
        System.out.print("Choose toss (1 or 2): ");
        int choice = sc.nextInt();

        int playerToss = rand.nextInt(6) + 1;
        int computerToss = rand.nextInt(6) + 1;

        System.out.println("Your number: " + playerToss);
        System.out.println("Computer number: " + computerToss);

        int total = playerToss + computerToss;
        boolean playerWinsToss =
                (total % 2 == 1 && choice == 1) ||
                (total % 2 == 0 && choice == 2);

        if (playerWinsToss) {
            System.out.println("You won the toss!");
        } else {
            System.out.println("Computer won the toss!");
        }

        System.out.println("\nYou are batting first!");

        // Player batting
        while (true) {
            System.out.print("Enter your number (1-6): ");
            int player = sc.nextInt();

            if (player < 1 || player > 6) {
                System.out.println("Enter a number between 1 and 6!");
                continue;
            }

            int computer = rand.nextInt(6) + 1;
            System.out.println("Computer bowled: " + computer);

            if (player == computer) {
                System.out.println("OUT!");
                break;
            }

            playerScore += player;
            System.out.println("Your score: " + playerScore);
        }

        System.out.println("\nComputer batting now!");
        System.out.println("Target: " + (playerScore + 1));

        // Computer batting
        while (true) {
            int computer = rand.nextInt(6) + 1;

            System.out.print("Enter your bowling number (1-6): ");
            int player = sc.nextInt();

            if (player < 1 || player > 6) {
                System.out.println("Enter a number between 1 and 6!");
                continue;
            }

            System.out.println("Computer played: " + computer);

            if (player == computer) {
                System.out.println("Computer is OUT!");
                break;
            }

            computerScore += computer;
            System.out.println("Computer score: " + computerScore);

            if (computerScore > playerScore) {
                break;
            }
        }

        System.out.println("\n===== MATCH RESULT =====");
        System.out.println("Your score: " + playerScore);
        System.out.println("Computer score: " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("YOU WIN!");
        } else if (playerScore < computerScore) {
            System.out.println("YOU LOSE!");
        } else {
            System.out.println("MATCH TIED!");
        }

        sc.close();
    }
}
```
