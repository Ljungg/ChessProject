package Pieces;

import java.awt.*;

public abstract class Pieces {
    public abstract void move();
    public abstract void take();
    public abstract int getValue();
    public abstract int getX();
    public abstract int getY();
    public abstract Enum getColor();
    public abstract Image getImage();
}
