package battleship;

public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[1];
        ships[0] = new Ship("F1", "F5");
        Board board = new Board(5);
        board.printBoard();

    }
}
