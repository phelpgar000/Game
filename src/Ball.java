import java.awt.*;

public class Ball {

    final int DIAM = 25;
    final int SPEED = 3;
    int x, y;
    double dx = SPEED, dy = SPEED;

    Board board;

    public Ball(Board board) {
        this.board = board;
        x=0;
        y=0;
    }

    public void setPosition(int x, int y){
        this.x = x- DIAM/2;
        this.y = y - DIAM/2;
    }

    public int findX(){
        return x;
    }
    public int findY(){
        return y;
    }
    public int getDIAM(){
        return DIAM;
    }

    public void paint(Graphics g){
        g.fillOval(x, y, DIAM, DIAM);
    }
}
