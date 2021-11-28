package com.company;
import java.awt.*;


public class Rectangle extends Figure
{
    //Définitions des Attributs :

    //protected Point p;
    //protected int px, py;
    //protected Color c;

    protected int height;
    protected int width;
    protected int length;

    //Constructeur :

    public Rectangle (int px, int py, Color C)
    {
        super(C, new Point(px,py));
        this.length=0;
        this.width=0;
    }

    public Rectangle (int width, int length)
    {
        super (new Point(width,length));
        this.width=width;
        this.length=length;
    }

    //Méthodes :

    public void setBoundingBox(int heightBB, int widthBB)
    {
        this.width=widthBB;
        this.length=heightBB;
    }

    public void draw(Graphics g)
    {
        int realPx, realPy; // To consider negative case

        if (length<0)
        {
            realPx=Origine.getx()+length;
        }
        else
        {
            realPx=Origine.getx();
        }

        if (width<0)
        {
            realPy=Origine.gety()+width;
        }
        else
        {
            realPy=Origine.gety();
        }

        g.setColor(c);

        g.fillRect(realPx, realPy, Math.abs(length), Math.abs(width));

    }

    //GETTER

    public int getLength() {return this.length;}
    public int getWidth() {return this.width;}

    //SETTER

    public void setLength (int l) {this.length=l;}
    public void setWidth (int w) {this.width=w;}
}
