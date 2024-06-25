package game;

/**
 * Die class represents a die in the game.
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Die {
    private int faceValue;

    public Die() {
        faceValue = 0;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        this.faceValue = (int) (Math.random() * 6) + 1;
    }
}
