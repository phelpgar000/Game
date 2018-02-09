import java.awt.*;

public class Block {
    private int x, y;
    private final int WIDTH = 75, HEIGHT = 35;

    Board board;
    Game game;
    Ball ball;

    public Block(Board board, Game game, Ball ball){
        x = 0;
        y = 0;
        this.board = board;
        this.game = game;
        this.ball = ball;
    }

    public void setPosition(int x, int y){
        this.x = x - WIDTH/2;
        this.y = y - HEIGHT/2;
    }

    public void paint(Graphics g){
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
}
