import java.awt.*;

public class Block {
    private int x, y;
    private final int WIDTH = 75, HEIGHT = 35;
    private final int SPACE = 10;

    Board board;
    Game game;
    Ball ball;

    public Block(int x, int y){
        setPosition(x,y);

    }

    public void setPosition(int x, int y){
        this.x = SPACE + x*(WIDTH/2+SPACE);
        this.y = SPACE + y*(HEIGHT/2+SPACE);
    }

    public Rectangle getBounds(){
        return new Rectangle(x , y, WIDTH, HEIGHT);
    }

    public void paint(Graphics g){
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
}
