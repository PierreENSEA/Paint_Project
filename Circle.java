package com.company;
import java.awt.*;

public class Circle extends Ellipse
{

    //Constructeur : On utilise le constructeur qu'on a fabriqué pour la classe Ellipse

    public Circle (int Radius)
    {
        super (Radius, Radius);
    }

    public Circle (int px, int py, Color c)
    {
        super (px,py,c);
    }

    //Méthodes :

    public void setBoundingBox (int heightBB, int widthBB)
    {
        this.semiAxysX=heightBB/2;
        this.semiAxysY=heightBB/2;
    }

    public void setSemiAxysX(int Radius)
    {
        super.setSemiAxysX (Radius);
        super.setSemiAxysY (Radius);
    }

    public void setSemiAxysY(int Radius)
    {
        super.setSemiAxysX (Radius);
        super.setSemiAxysY (Radius);
    }
}
