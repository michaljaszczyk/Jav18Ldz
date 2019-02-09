package pl.sda.java.basic.day5.homework.statki;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Jaszczyk
 **/
public class Board {

    private static final int SHIP = 1;
    private static final int EMPTY_FIELD = 0;

    private int height;
    private int width;
    private int[][] board;
    private int numberOfShips = 0;

    public Board(int height, int width) {
        this.board = new int[width][height];
        this.height = height;
        this.width = width;
    }

    public boolean addShip(Coordinates start, Coordinates end) {
        if (isStraightLine(start, end) && isOnTheBoard(start, end)) {
            List<Coordinates> shipsToAdd = new ArrayList<>();
            for (int x = start.getX(); x <= end.getX(); x++) {
                for (int y = start.getY(); y <= end.getY(); y++) {
                    if(board[x][y] != EMPTY_FIELD) {
                        return false;
                    }
                    shipsToAdd.add(new Coordinates(x, y));
                }
            }
            for (Coordinates ship : shipsToAdd) {
                board[ship.getX()][ship.getY()] = SHIP;
                numberOfShips++;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean isOnTheBoard(Coordinates start, Coordinates end) {
        return start.isInRangeFromZeroTo(width, height) && end.isInRangeFromZeroTo(width, height);
    }

    private boolean isStraightLine(Coordinates start, Coordinates end) {
        return start.getX() == end.getX() || start.getY() == end.getY();
    }

    public boolean shoot(Coordinates shot) {
        if (board[shot.getX()][shot.getY()] == SHIP) {
            board[shot.getX()][shot.getY()] = EMPTY_FIELD;
            numberOfShips--;
            return true;
        } else {
            return false;
        }
    }

    public boolean isGameOver() {
        return numberOfShips == 0;
    }
}
