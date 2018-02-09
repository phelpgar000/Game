import javax.swing.*;
import java.awt.*;

public class Board extends JPanel{

    Ball ball;
    Block block;
    Paddle paddle;

    public Board(Game game){

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.CYAN);
        ball = new Ball(this);
        block = new Block(this, game, ball);
        paddle = new Paddle(this, game, ball);

    }

    public void GameStart(){

        ball.setPosition(getWidth()/2, (getHeight()/4)*3);
        block.setPosition(getWidth()/2, getHeight()/2);
        paddle.setPosition(getWidth()/2, getHeight()/6*5);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        ball.paint(g);
        g.setColor(Color.MAGENTA);
        block.paint(g);
        g.setColor(Color.GREEN);
        paddle.paint(g);
    }

}
