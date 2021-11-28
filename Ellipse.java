package com.company;
import java.awt.*;

public class Ellipse extends Figure
{
    //Définitions des Attributs :

    protected int semiAxysX;
    protected int semiAxysY;


    //Constructeur :

    public Ellipse(int x, int y, Color c)
    {
        super(c, new Point(x,y));
        this.semiAxysX=0;
        this.semiAxysY=0;
    }

    public Ellipse(int px, int py)
    {
        super ( new Point(px,py));
        this.semiAxysX=px;
        this.semiAxysY=py;
    }

    //Méthodes :

    public void setBoundingBox (int heightBB, int widthBB)
    {
        this.semiAxysY=widthBB/2;
        this.semiAxysX=heightBB/2;
    }

    public void setSemiAxysX (int x)
    {
        this.semiAxysX=x;
    }

    public void setSemiAxysY (int y)
    {
        this.semiAxysY=y;
    }

    public void draw (Graphics g)
    {
        int realPx, realPy;

        if (semiAxysX<0)
        {
            realPx=Origine.getx()+semiAxysX*2;
        }
        else
        {
            realPx=Origine.getx();
        }

        if (semiAxysY<0)
        {
            realPy=Origine.gety()+semiAxysY*2;
        }
        else
        {
            realPy=Origine.gety();
        }

        g.setColor(c);

        g.fillOval(realPx, realPy, Math.abs(semiAxysX*2), Math.abs(semiAxysY*2));

    }


}
