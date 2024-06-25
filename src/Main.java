import game.*;

/**
 * Main class represents the main class of the game.
 * It creates board, dices, pieces, players, and the game itself.
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        Die dice_1 = new Die();
        Die dice_2 = new Die();
        Die[] dices = {dice_1, dice_2};

        Piece piece_red = new Piece("Red", board.getStartSquare());
        Piece piece_blue = new Piece("Blue", board.getStartSquare());

        Player player_1 = new Player("Player 1", piece_red);
        Player player_2 = new Player("Player 2", piece_blue);
        Player[] players = {player_1, player_2};

        MGame game = new MGame(players, board, dices);
        game.playGame();
    }
}