package game;

/**
 * MGame class represents a game in the game.
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class MGame {
    private static final int MAX_ROUNDS = 20;
    private int roundCnt;
    private Player[] players;
    private Board board;
    private Die[] dice;

    public MGame(Player[] players, Board board, Die[] dice) {
        this.roundCnt = 1;
        this.players = players;
        this.board = board;
        this.dice = dice;
    }

    public void playGame() {
        while (roundCnt <= MAX_ROUNDS) {
            playRound();
        }
    }

    private void playRound() {
        System.out.println("== Round " + roundCnt + " ==");
        for (Player player : players) {
            player.takeTurn(dice, board);
        }
        System.out.println("==============\n");
        roundCnt++;
    }

}
