package Pieces;

import Enumerators.Team;

public class Rook extends Pieces{

    private String image;
    private final Team team;
    private final int value;
    private int X;
    private int Y;

    public Rook(Team team, int x, int y){
        this.X = x;
        this.Y = y;
        this.value = 5;
        this.team = team;
        switch (team) {
            case WHITE:
                this.image = "Images/Chess_rlt60.png";
                break;
            case BLACK:
                this.image = "Images/Chess_rdt60.png";
                break;
        }
    }

    @Override
    public void move() {

    }

    @Override
    public void take() {

    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public int getX() {
        return this.X;
    }

    @Override
    public int getY() {
        return this.Y;
    }

    @Override
    public Enum getColor() {
        return this.team;
    }

    @Override
    public String getImage() {
        return this.image;
    }
}
