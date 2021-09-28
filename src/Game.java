import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        // Initialize Variables/Attributes.
        int sum = 0;
        int pointsGiven = 0;
        boolean playerTurn = true;

        //Create Cup object
        Cup rafleCup = new Cup();

        //Create Player objects
        Player player1 = new Player();
        Player player2 = new Player();

        //Playing until winner is declared
        while (player1.getScore() < 40 && player2.getScore() < 40) {
            if (playerTurn) {
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

                //Roll Cup Content
                rafleCup.getSum();

                //The sum is...
                sum = rafleCup.getSum();

                //Reset
                pointsGiven = 0;
                if(playerTurn) {
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
}