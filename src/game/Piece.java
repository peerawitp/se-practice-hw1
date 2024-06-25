package game;

/**
 * Piece class represents a piece in the game.
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Piece {
    private String color;
    private Square location;
    public Piece(String color, Square location) {
        this.color = color;
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
