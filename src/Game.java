import javax.swing.*;

public class Game extends JFrame{

    private Board board;

    public Game(){

        setResizable(false);
        setVisible(true);
        setFocusable(true);
        setTitle("Brick");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board = new Board(this);
        add(board);
        pack();
        setLocationRelativeTo(null);
        board.GameStart();

    }

    public static void main(String[] args){
        new Game();
    }

}
