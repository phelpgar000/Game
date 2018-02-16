import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener{

    Ball ball;
    Block block;
    Paddle paddle;
    Timer timer;

    final int SPACE = 20;

    public Board(Game game){

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        ball = new Ball(this);
        block = new Block(this, game, ball);
        paddle = new Paddle(this, game, ball);

    }

    public void GameStart(){

        ball.setPosition(getWidth()/2, (getHeight()/4)*3);
        block.setPosition(SPACE, SPACE);
        paddle.setPosition(getWidth()/2, getHeight()/6*5);
        timer = new Timer(1000/60, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        paddle.move();
        ball.move(paddle);
        repaint();

        ball.checkCollisons(paddle);
    }

    public int getSPACE(){
        return SPACE;
    }

    @Override
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
