import Enumerators.BoardEnum;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Chessboard extends JFrame{
    private JPanel board;
    public Chessboard(JPanel board){
        this.board = board;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(1000,1000));
        this.setLayout(new FlowLayout());
        this.add(board);
        this.pack();
    }
    public static void main(String[] args) throws IOException{
        Board board = new Board();
        Chessboard myFrame = new Chessboard(board);
    }
}