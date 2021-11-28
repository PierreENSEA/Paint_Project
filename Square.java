package com.company;
import java.awt.*;

public class Square extends Rectangle
{
    public Square(int side)
    {
        super (side, side);
    }

    public Square (int px, int py, Color c)
    {
        super (px,py,c);
    }

    //Methode :

    public void setLength(int length)
    {
        super.setLength(length);
        super.setWidth(length);
    }
    public void setWidth(int length)
    {
        super.setLength(length);
        super.setWidth(length);
    }

    public void setBoundingBox (int heightBB, int widthBB)
    {
        this.width=heightBB;
        this.length=heightBB;
    }

}
