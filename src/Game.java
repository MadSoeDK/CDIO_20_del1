import java.lang.Math;

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

        //Playing until winner is declared
        while (player1.getScore() < 40 && player2.getScore() < 40) {

            //The sum is...
            sum = rafleCup.getSum();

            if (playerTurn==true) {
                System.out.println("Increasing Player 1 score:");
                while (pointsGiven < sum) {
                    player1.increaseScore();
                    pointsGiven++;
                    //System.out.println("While løkke aktiveret");
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

            //Reset
            pointsGiven = 0;
            if(playerTurn==true) {
                playerTurn = false;
            }
            else
            {
                playerTurn = true;
            }

            if(player1.getScore() > 39) {
                System.out.println("Player 1 has won the game!");
            }
            if(player2.getScore() > 39) {
                System.out.println("Player 2 has won the game!");
            }

        }
    }
}