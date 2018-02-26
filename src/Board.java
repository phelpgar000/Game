import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener{

    Ball ball;
    Block block;

    Paddle paddle;
    Timer timer;
    Blocks blocks;

    final int SPACE = 20;

    public Board(Game game){

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        ball = new Ball(this);
        blocks = new Blocks();
        paddle = new Paddle(this, game, ball);

    }

    public void GameStart(){

        ball.setPosition(getWidth()/2, (getHeight()/10)*8);
        paddle.setPosition(getWidth()/2, getHeight()/10*9);
        timer = new Timer(1000/60, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        paddle.move();
        ball.move(paddle, block);

        ball.checkCollisons(paddle, block);
        repaint();
    }

    public int getSPACE(){
        return SPACE;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        ball.paint(g);
        g.drawLine(0, getHeight(), getWidth()/2, getHeight()/2);
        g.drawLine(getWidth(), getHeight(), getWidth()/2, getHeight()/2);
        g.setColor(Color.RED);
        g.drawLine(0, getHeight()/10*9, getWidth()/2, getHeight()/2);
        g.drawLine(getWidth(), getHeight()/10*9, getWidth()/2, getHeight()/2);
        g.setColor(Color.CYAN);
        g.drawLine(0, getHeight()/10*8, getWidth()/2, getHeight()/2);
        g.drawLine(getWidth(), getHeight()/10*8, getWidth()/2, getHeight()/2);
        g.setColor(Color.PINK);
        g.drawLine(0, getHeight()/10*7, getWidth()/2, getHeight()/2);
        g.drawLine(getWidth(), getHeight()/10*7, getWidth()/2, getHeight()/2);
        g.setColor(Color.ORANGE);
        g.drawLine(0, getHeight()/10*6, getWidth()/2, getHeight()/2);
        g.drawLine(getWidth(), getHeight()/10*6, getWidth()/2, getHeight()/2);
        g.setColor(Color.MAGENTA);
        block.paint(g);
        g.setColor(Color.GREEN);
        paddle.paint(g);
        blocks.paint(g);

    }

}
