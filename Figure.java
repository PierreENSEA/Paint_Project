package com.company;
import java.awt.*;
import java.io.*;

public abstract class Figure
{
    // Définition des Attributs de la classe Figure :

    private int heightBB;
    private int widthBB;

    protected Point Origine;
    protected Color c;

    //Constructeur :

    public Figure(Color c, Point p)
    {
        this.Origine=p;
        this.c=c;
    }

    //Défini l'origine de la figure au point p:
    public Figure(Point p)
    {
        this.Origine=p;
    }



    // Méthodes :

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void draw (Graphics g);

}
