import Enumerators.Team;
import Pieces.*;

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
                if(j==1) statusBoard[i][j] = new Pawn(Team.BLACK, j,i);
                if(j==6) statusBoard[i][j] = new Pawn(Team.WHITE, j,i);
            }
        }
        statusBoard[0][0] = new Rook(Team.BLACK, 0, 0);
        statusBoard[7][0] = new Rook(Team.BLACK, 7, 0);
        statusBoard[1][0] = new Knight(Team.BLACK, 1, 0);
        statusBoard[6][0] = new Knight(Team.BLACK, 6, 0);
        statusBoard[2][0] = new Bishop(Team.BLACK, 2, 0);
        statusBoard[5][0] = new Bishop(Team.BLACK, 5, 0);
        statusBoard[3][0] = new Queen(Team.BLACK, 3, 0);
        statusBoard[4][0] = new King(Team.BLACK, 4, 0);

        statusBoard[0][7] = new Rook(Team.WHITE, 0,7);
        statusBoard[7][7] = new Rook(Team.WHITE, 7, 7);
        statusBoard[1][7] = new Knight(Team.WHITE, 1, 7);
        statusBoard[6][7] = new Knight(Team.WHITE,6, 7);
        statusBoard[2][7] = new Bishop(Team.WHITE,2,7);
        statusBoard[5][7] = new Bishop(Team.WHITE,5,7);
        statusBoard[3][7] = new Queen(Team.WHITE,3,7);
        statusBoard[4][7] = new King(Team.WHITE,4,7);

        for(int i = 0;i<8;i++){
            instanceBoard.add(new ArrayList<>());
            for(int j = 0;j<8;j++) {
                instanceBoard.get(i).add(statusBoard[i][j]);
            }
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Image img1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/chessboard.png"));
        g.drawImage(img1, 0,0,this.getWidth(), this.getHeight(), this);

        Pieces piece;
        int x;
        int y;
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                piece = instanceBoard.get(i).get(j);
                x = coordinateBoard.get(i);
                y = coordinateBoard.get(j);
                    if(piece != null){
                    g.drawImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(piece.getImage())), x, y, this);
                }
            }
        }
    }

    /** used to update moveListener when moving a piece from one place to another.
     * @param piece
     */
    public void remove(Pieces piece){
        int x = piece.getX();
        int y = piece.getY();
        this.instanceBoard.get(x).set(y, null);
    }

    public ArrayList<ArrayList<Pieces>> getInstanceBoard() {
        return instanceBoard;
    }

    public int getDimTile(){
        return this.dimTile;
    }

    public ArrayList<Integer> getCoordinateBoard() {
        return coordinateBoard;
    }
}