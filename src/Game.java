import javax.swing.*;

public class Game extends JFrame{

    private Board board;
    private Blocks blocks;

    public Game(){

        setResizable(false);
        setVisible(true);
        setFocusable(true);
        setTitle("Break ya bricker");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board = new Board(this);
        add(board);
        pack();
        setLocationRelativeTo(null);
        //blocks.makeBlocks();
        board.GameStart();

    }

    public static void main(String[] args){
        new Game();
    }

}
