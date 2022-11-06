import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        while (true) {

            // roll 1
            int die1 = rand.nextInt(1, 7);
            int die2 = rand.nextInt(1, 7);
            final int firstSum = die1 + die2;
            System.out.printf("%d + %d = %d %n", die1, die2, firstSum);

            // processes first roll


            if (firstSum == 7 || firstSum == 11) {
                System.out.println("You won with a natural!");
                return;
            }
            if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
                System.out.println("You crapped out.");
                return;
            }

            // this loops if you didn't loose the first roll

            System.out.println("Trying for point...");

            int newSum = 0;
            while (newSum != firstSum && newSum != 7) {
                die1 = rand.nextInt(1, 7);
                die2 = rand.nextInt(1, 7);
                newSum = die1 + die2;
                System.out.printf("%d + %d = %d %n", die1, die2, newSum);
            }

            if (newSum == firstSum) {
                System.out.println("You made the point and won!");
            } else {
                System.out.println("You got a seven and lost.");
            }

            System.out.print("Do you want to play again? Enter y or n: ");
            String playAgain = in.nextLine();
            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }

        }

    }
}