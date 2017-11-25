import Pieces.Pieces;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;  //hallihall
//The entire board can be encoded into a 64*12=768 byte long vector

public class Board extends JPanel{
    private Graphics g;
    private JLabel picLabel;
    private BufferedImage image;
    private ArrayList<ArrayList<Pieces>> instanceBoard;
    private ArrayList<Integer> coordinateBoard;
    private int dimY = 512;
    private int dimX = dimY;
    private int dimTile = dimY/8;
    private Pieces[][] statusBoard = new Pieces[8][8];

    public Board() throws IOException {
        super();
        coordinateBoard = new ArrayList<>();
        for(int j = 0;j<8;j++) {
            coordinateBoard.add(dimTile * j);
        }
        System.out.println(coordinateBoard);
        this.setPreferredSize(new Dimension(dimX,dimY));
        this.setBackground(Color.WHITE);
        initiate();
    }

    public void initiate(){
        instanceBoard = new ArrayList<>();
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                statusBoard[i][j] = null;
            }
        }
        for(int i = 0;i<8;i++){
            instanceBoard.add(new ArrayList<Pieces>());
            for(int j = 0;j<8;j++) {
                instanceBoard.get(i).add(statusBoard[i][j]);
            }
        }

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //Graphics2D g2 = (Graphics2D) g;
        Image img1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/chessboard.png"));
        Image img2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/Chess_qdt60.png"));
        Image img3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/Chess_kdt60.png"));
        g.drawImage(img1, 0,0,this.getWidth(), this.getHeight(), this);
        g.drawImage(img2, 0,0, this);
        g.drawImage(img3, dimTile,dimTile, this);
    }
}