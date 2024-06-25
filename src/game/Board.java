package game;

/**
 * Board class represents a board in the game.
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Board {
    private final int MAX_SQUARES = 40;
    private Square[] squares;

    public Board() {
        this.squares = new Square[MAX_SQUARES];
        for (int i = 1; i <= MAX_SQUARES; i++) {
            squares[i-1] = new Square("Square " + i);
        }
    }

    public Square getStartSquare() {
        return squares[0];
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        int oldIndex = -1;
        for (int i = 0; i < MAX_SQUARES; i++) {
            if (squares[i] == oldLoc) {
                oldIndex = i;
                break;
            }
        }
        int newIndex = (oldIndex + fvTot) % MAX_SQUARES;
        return squares[newIndex];
    }
}
