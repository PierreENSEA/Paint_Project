package com.company;

import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;
import java.util.*;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener
{
    private ArrayList<Figure> list; //Liste contenant les infos de ce qu'on a dessiné
    private Color c;
    private String FigureName;

    private int x;
    private int y;

    // Selection par default de la forme/couleur :
    public Drawing()
    {
        super();
        this.setBackground(Color.white);
        this.c = Color.black;
        this.FigureName = "Rectangle";
        this.list = new ArrayList<Figure>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    //Methode essentielle (polymorphisme dynamique) :
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (Figure f : list)
        {
            f.draw(g);
        }
    }

    //Reset du dessin, on efface la liste :
    public void reset()
    {
        this.list.clear();
        paintComponent(this.getGraphics());
    }

    public void setColor(Color col)
    {
        this.c=col;
    }

    public void setFigureName(String name)
    {
        this.FigureName =name;
    }

    public ArrayList<Figure> getList()
    {
        return this.list;
    }

    //Fonction pour analyser notre souris :

    public void mouseDragged(MouseEvent e)
    {
        (list.get(list.size()-1)).setBoundingBox(e.getX()-this.x, e.getY()-this.y);
        paintComponent(this.getGraphics());
    }
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

    public void mousePressed(MouseEvent e)
    {
        this.x=e.getX();
        this.y=e.getY();

        System.out.println("Drawing of a "+c+" "+ FigureName +" @ "+e.getX()+
                " "+e.getY());

        switch (FigureName)
        {
            case "Rectangle" : 	list.add(new Rectangle(this.x,this.y,c));
                break;
            case "Square" : 	list.add(new Square(this.x,this.y,c));
                break;
            case "Circle" : 	list.add(new Circle(this.x,this.y,c));
                break;
            case "Ellipse" : 	list.add(new Ellipse(this.x,this.y,c));
                break;
            default: 			System.out.println("Not Valid");
                break;
        }
    }
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Ending the Figure");
        (list.get(list.size()-1)).setBoundingBox(e.getX()-this.x, e.getY()-this.y);
        paintComponent(this.getGraphics());
    }







}