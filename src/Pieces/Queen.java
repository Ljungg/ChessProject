package Pieces;

import Enumerators.Team;

public class Queen extends Pieces {

    private String image;
    private final Team team;
    private final int value;

    public Queen(Team team){
        this.value = 8;
        this.team = team;
        switch (team) {
            case WHITE:
                this.image = "Images/Chess_qlt60.png";
                break;
            case BLACK:
                this.image = "Images/Chess_qdt60.png";
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
        return 0;
    }

    @Override
    public int getY() {
        return 0;
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
