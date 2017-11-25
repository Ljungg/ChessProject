package Pieces;


import Enumerators.Team;

import static Enumerators.Team.WHITE;

public class Bishop extends Pieces {
    private String image;
    private Team team;
    private int value;

    public Bishop(Team team){
        this.team = team;
        switch (team) {
            case WHITE:
                this.image = "Images/Chess_blt60.png";
                break;
            case BLACK:
                this.image = "Images/Chess_bdt60.png";
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
        return 0;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public Enum getColor() {
        return null;
    }

    @Override
    public String getImage() {
        return null;
    }
}
