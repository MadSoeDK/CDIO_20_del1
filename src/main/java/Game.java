//import desktop_resources.GUI;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.lang.Math;

import java.util.Scanner;
import java.awt.*;

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

        GUI gui = new GUI();
        //GUI - Tilføjer to spillere (Player 1 og Player 2)

        GUI_Player player1gui = new GUI_Player("Player1",+0);
        GUI_Player player2gui = new GUI_Player("Player2",+0);

//        gui.addPlayer("Player1", 0);
//        gui.addPlayer("Player2", 0);
        gui.addPlayer(player1gui);
        gui.addPlayer(player2gui);

        //Create Keyboard Input Scanner & Start Game
        Scanner input = new Scanner(System.in);
        gui.showMessage("How to Win: Roll a pair while you have 40 or more points!");
        gui.showMessage("Player 1 Starts: Press button 'Roll' to Roll Dice after 'OK'");
        gui.getUserButtonPressed("What are you waiting for? Roll to begin!","Roll");

        //Loop forever until a player has 40+ points and rolled a pair. (Is done by break statements)
        while (1<2) {
            //The sum is...
            sum = rafleCup.getSum();
            gui.setDice(rafleCup.getFacevalue1(),rafleCup.getFacevalue2());

            if (playerTurn==true) {
                while (pointsGiven < sum) {
                    player1.increaseScore();
                    pointsGiven++;
                }
                // If you rolled double 1's, remove all points
                if (sum==2){
                    gui.showMessage("HAHA, You rolled a pair of 1's");
                    gui.showMessage("Player score: 0");
                    player1.setScoreZero();
                }
                else
                {
                    gui.showMessage("Increasing Player 1 score:");
                    gui.showMessage("Player score: " + player1.getScore());
                    //gui.setBalance("Player1", player1.getScore());
                    player1gui.setBalance(player1.getScore());
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
                    gui.showMessage("HAHA, You rolled a pair of 1's");
                    gui.showMessage("Player score: 0");
                    player2.setScoreZero();
                }
                else
                {
                    gui.showMessage("Increasing Player 2's score:");
                    gui.showMessage("Player score: " + player2.getScore());

                    //gui.setBalance("Player2", player2.getScore());
                    player2gui.setBalance(player2.getScore());
                }
            }

            // Check for Winner
            if(player1.getScore() > 39 && rafleCup.getPair()==1 && playerTurn==true) {
                gui.showMessage("Player 1 HAS ROLLED A PAIR AND WON THE GAME!");
                break;
            }
            if(player2.getScore() > 39 && rafleCup.getPair()==1 && playerTurn==false) {
                gui.showMessage("Player 2 HAS ROLLED A PAIR AND WON THE GAME!");
                break;
            }

            //Reset
            pointsGiven = 0;

            // Switch Player turns, only if no pair was rolled
            if(rafleCup.getPair()==1){
                // If a pair was rolled
                gui.showMessage("YOU ROLLED A PAIR! PRESS ENTER TO GO AGAIN!");
                gui.getUserButtonPressed("Roll","Roll");
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
                gui.showMessage("Turn Completed, Press Enter for next players turn");
                gui.getUserButtonPressed("Roll","Roll");

            }
        }
    }
}