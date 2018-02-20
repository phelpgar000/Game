import java.awt.*;

public class Ball {

    final int DIAM = 25;
    final int SPEED = 10;
    int x, y;
    double dx = SPEED, dy = -SPEED;

    double MAXANGLE = 5*Math.PI/12;

    Board board;

    public Ball(Board board) {
        this.board = board;
        x=0;
        y=0;
    }

    public void move(Paddle other){

        if(y+DIAM > board.getHeight()|| y < 0)
            dy*=-1;
        if(x + DIAM > board.getWidth()){
            dx*=-1;
        }
        if(x < 0){
            dx*=-1;
        }

        x += dx;
        y += dy;
    }

    public void checkCollisons(Paddle other){

       if(getBounds().intersects(other.getBounds())){
        double paddleX = other.getBounds().getX();
        double paddleC = other.getBounds().getWidth()/2;
        double ballPos = x;

        double relativeIntersect = (paddleX + paddleC) - ballPos;
        double normalIntersect = relativeIntersect/paddleC;
        double bounceAngle = MAXANGLE * normalIntersect;

        if(x+(DIAM/2) < paddleX)
            ballPos = x + DIAM;
        else if(x + DIAM/2 > paddleX + other.getBounds().getWidth())
            ballPos = x;
        else
            ballPos = x + DIAM/2;

        if(y < board.getHeight()/2){
            dx = (int)(SPEED*Math.cos(bounceAngle));
        }
        if(y > board.getHeight()/2){
            dy = (int)(SPEED*-Math.cos(bounceAngle));
        }
        dx = (int)(SPEED*-Math.sin(bounceAngle));
        }
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, DIAM, DIAM);
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
