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

        //Create Keyboard Input Scanner & Start Game
        Scanner input = new Scanner(System.in);
        System.out.println("How to Win: Roll a pair while you have 40 or more points!");
        System.out.println("Player 1 Starts: Press Enter to Roll Dice");
        input.nextLine();

        //Loop forever until a player has 40+ points and rolled a pair. (Is done by break statements)
        while (1<2) {

            //The sum is...
            sum = rafleCup.getSum();

            if (playerTurn==true) {
                while (pointsGiven < sum) {
                    player1.increaseScore();
                    pointsGiven++;
                }
                // If you rolled double 1's, remove all points
                if (sum==2){
                    System.out.println("HAHA, You rolled a pair of 1's");
                    System.out.println("Player score: 0");
                    player1.setScoreZero();
                }
                else
                {
                    System.out.println("Increasing Player 1 score:");
                    System.out.println("Player score: " + player1.getScore());
                }
            }
            else
            {
                //Player 2's turn
                while(pointsGiven < sum) {
                    player2.increaseScore();
                    pointsGiven++;
                }
                // If you rolled double 1's, remove all points
                if (sum==2){
                    System.out.println("HAHA, You rolled a pair of 1's");
                    System.out.println("Player score: 0");
                    player2.setScoreZero();
                }
                else
                {
                    System.out.println("Increasing Player 2's score:");
                    System.out.println("Player score: " + player2.getScore());
                }
            }

            // Check for Winner
            if(player1.getScore() > 39 && rafleCup.getPair()==1 && playerTurn==true) {
                System.out.println("Player 1 HAS ROLLED A PAIR AND WON THE GAME!");
                break;
            }
            if(player2.getScore() > 39 && rafleCup.getPair()==1 && playerTurn==false) {
                System.out.println("Player 2 HAS ROLLED A PAIR AND WON THE GAME!");
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