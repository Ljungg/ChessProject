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
    private ArrayList<Pieces> instanceBoard;
    private int dimY = 512;
    private int dimX = dimY;
    private int dimTile = dimY/8;
    private Pieces[][] statusBoard = new Pieces[8][8];
    public Board() throws IOException {
        super();
        this.setPreferredSize(new Dimension(dimX,dimY));
        this.setBackground(Color.WHITE);
        initiate();
    }
    public void initiate(){

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