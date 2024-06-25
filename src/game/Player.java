package game;

/**
 * Player class represents a player in the game.
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Player {
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public void takeTurn(Die[] dice, Board board) {
        int fvTot = 0;
        for (Die die : dice) {
            die.roll();
            fvTot += die.getFaceValue();
        }

        System.out.println(name + " rolled " + fvTot);

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);

        System.out.println(name + " moved from " + oldLoc.toString() + " to " + newLoc.toString());

        piece.setLocation(newLoc);
    }
}
