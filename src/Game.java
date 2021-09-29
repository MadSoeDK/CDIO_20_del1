import java.lang.Math;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Initialize Variables/Attributes.
        int sum = 1;
        int pointsGiven = 0;
        boolean playerTurn = true;

        //Create Cup object
        Cup rafleCup = new Cup();

        //Create Player objects
        Player player1 = new Player();
        Player player2 = new Player();

        //Create Keyboard Input Scanner
        System.out.println("Player 1 Starts: Press Enter to Roll Dice");
        Scanner input = new Scanner(System.in);
        input.nextLine();

        //Playing until winner is declared
        while (player1.getScore() < 40 && player2.getScore() < 40) {

            //The sum is...
            sum = rafleCup.getSum();

            if (playerTurn==true) {
                System.out.println("Increasing Player 1 score:");
                while (pointsGiven < sum) {
                    player1.increaseScore();
                    pointsGiven++;
                }
                System.out.println("Player score: " + player1.getScore());
            }
            else
            {
                //Player 2's turn
                System.out.println("Increasing Player 2's score:");
                while(pointsGiven < sum) {
                    player2.increaseScore();
                    pointsGiven++;
                }
                System.out.println("Player score: " + player2.getScore());
            }

            // Check for Winner
            if(player1.getScore() > 39) {
                System.out.println("Player 1 has won the game!");
                break;
            }
            if(player2.getScore() > 39) {
                System.out.println("Player 2 has won the game!");
                break;
            }

            //Reset
            pointsGiven = 0;

            // Switch Player turns, only if no pair was rolled
            if(rafleCup.getPair()==1){
                // If a pair was rolled
                System.out.println("YOU ROLLED A PAIR! PRESS ENTER TO GO AGAIN!");
                input.nextLine();
            }
            else
            {
                // If no pair was rolled, Switch
                if(playerTurn==true) {
                    playerTurn = false;
                }
                else
                {
                    playerTurn = true;
                }
                System.out.println("Turn Completed, Press Enter for next players turn");
                input.nextLine();
            }
        }
    }
}