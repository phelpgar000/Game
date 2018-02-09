import java.awt.*;

public class Paddle {
        private int x, y;
        private final int PWIDTH = 200, PHEIGHT = 20;
        Board board;
        Game game;
        Ball ball;

        public Paddle(Board board, Game game, Ball ball){
            x = 0;
            y = 0;
            this.board = board;
            this.game = game;
            this.ball = ball;
        }

        public void setPosition(int x, int y){
            this.x = x - PWIDTH/2;
            this.y = y - PHEIGHT/2;
        }

        public void paint(Graphics g){
            g.fillRect(x, y, PWIDTH, PHEIGHT);
        }
}
