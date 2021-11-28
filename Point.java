package com.company;
import java.io.*;

public class Point
{

   //  Définition des Attributs de la classe Point :

    private int x;
    private int y;

    // Création de deux Constructeur :

    public Point()
    {
        x=0;
        y=0;
    }

    //Création d'un point coordonnées a, b:
    public Point(int a, int b)
    {
        this.x=a;
        this.y=b;
    }

    //Méthode GETTER :

    public int getx(){return x;}
    public int gety(){return y;}

    //Méthode SETTER :

    public void setx(int a){this.x=a;}
    public void sety(int b){this.y=b;}


}
