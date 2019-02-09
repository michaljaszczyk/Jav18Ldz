package pl.sda.java.basic.day5.homework.statki;

import java.util.Random;

/**
 * @author Michal Jaszczyk
 **/
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int boardWidth = 10;
        int boardHeight = 20;
        ShipsGame shipsGame = new ShipsGame(boardWidth, boardHeight);

        shipsGame.playerOneAddShip(new Coordinates(0, 0), new Coordinates(0, 3));
        shipsGame.playerOneAddShip(new Coordinates(9, 15), new Coordinates(9, 19));
        shipsGame.playerOneAddShip(new Coordinates(3, 4), new Coordinates(6, 4));
        shipsGame.playerOneAddShip(new Coordinates(5, 10), new Coordinates(9, 10));

        shipsGame.playerTwoAddShip(new Coordinates(0, 0), new Coordinates(0, 3));
        shipsGame.playerTwoAddShip(new Coordinates(9, 15), new Coordinates(9, 19));
        shipsGame.playerTwoAddShip(new Coordinates(3, 4), new Coordinates(6, 4));
        shipsGame.playerTwoAddShip(new Coordinates(5, 10), new Coordinates(9, 10));

        while (!shipsGame.isGameOver()) {
            Coordinates playerOneShot = randomCoordinates(random, boardWidth, boardHeight);
            boolean hit = shipsGame.playerOneShoot(playerOneShot);
            if (hit) {
                System.out.println("Trafiony! Punkty gracza 1: " + shipsGame.playerOnePoints());
            }

            Coordinates playerTwoShot = randomCoordinates(random, boardWidth, boardHeight);
            hit = shipsGame.playerTwoShoot(playerTwoShot);
            if (hit) {
                System.out.println("Trafiony! Punkty gracza 2: " + shipsGame.playerTwoPoints());
            }
        }
    }

    private static Coordinates randomCoordinates(Random random, int boardWidth, int boardHeight) {
        return new Coordinates(random.nextInt(boardWidth), random.nextInt(boardHeight));
    }
}
