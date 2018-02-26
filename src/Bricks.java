import java.awt.*;

public class Bricks {

    private final int ROW = 7;
    private final int COL = 3;
    Block[][] blocks = new Block[ROW][COL];

    Block block;
    Board board;
    Ball ball;

    public Bricks(){
        makeBlocks();
    }

    public void makeBlocks(){
        for(int i = 0; i<ROW; i++){
            for(int k = 0; k<COL; k++){
                blocks[i][k]=new Block(i,k);
            }
        }
    }

    public void paint(Graphics g){
        for(int i = 0; i<ROW; i++){
            for(int k = 0; k<COL; k++){
                blocks[i][k].paint(g);
            }
        }
    }


}
