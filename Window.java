package com.company;

import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener
{
    private Drawing DrawZone = new Drawing();

    JFrame Screen = new JFrame("Paint");

    public Window()
    {
        Screen.setSize(960,540);
        Screen.setVisible(true);
        Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creation Menu 1x2:

        JMenuBar Menu= new JMenuBar();

        //Premier Menu :
        JMenu File= new JMenu("File");
        //Sous menu :
        JMenuItem Open = new JMenuItem("Open") ;
        File.add(Open);
        Open.addActionListener(this);
        JMenuItem New = new JMenuItem("New") ;

        File.add(New);

        New.addActionListener( this);

        JMenuItem Exit = new JMenuItem("Exit") ;
        Exit.addActionListener(this);

        File.add(Exit);

        Menu.add(File);

        //Deuxieme Menu :
        JMenu About = new JMenu("About");
        JMenuItem Auteur = new JMenuItem("Authors");
        About.add(Auteur);
        Auteur.addActionListener(this);
        Menu.add(About);
        setJMenuBar(Menu);

        //Buttons pour le choix des formes :

        JPanel Formes= new JPanel();
        Formes.setLayout( new GridLayout(2,2));

        JButton rectangle = new JButton("Rectangle");
        Formes.add(rectangle);
        rectangle.addActionListener(this);

        JButton ellipse = new JButton("Ellipse");
        Formes.add(ellipse);
        ellipse.addActionListener(this);

        JButton square = new JButton("Carre");
        Formes.add(square);
        square.addActionListener(this);

        JButton circle = new JButton("Cercle");
        Formes.add(circle);
        circle.addActionListener(this);

        //Buttons pour le choix de la couleur :

        JPanel Palette= new JPanel();
        Palette.setLayout( new GridLayout(2,4));

        JButton black = new JButton("Noir");
        black.setBackground(Color.black);
        Palette.add(black);
        black.addActionListener(this);
        black.setForeground(Color.white);

        JButton red = new JButton("Rouge");
        red.setBackground(Color.red);
        Palette.add(red);
        red.addActionListener(this);

        JButton green = new JButton("Vert");
        green.setBackground(Color.green);
        Palette.add(green);
        green.addActionListener(this);

        JButton blue = new JButton("Bleu");
        blue.setBackground(Color.blue);
        Palette.add(blue);
        blue.addActionListener(this);
        blue.setForeground(Color.white);

        JButton yellow = new JButton("Jaune");
        yellow.setBackground(Color.yellow);
        Palette.add(yellow);
        yellow.addActionListener(this);

        JButton pink = new JButton("Rose");
        pink.setBackground(Color.pink);
        Palette.add(pink);
        pink.addActionListener(this);

        JButton magenta = new JButton("Violet");
        magenta.setBackground(Color.magenta);
        Palette.add(magenta);
        magenta.addActionListener(this);

        JButton orange = new JButton("Orange");
        orange.setBackground(Color.orange);
        Palette.add(orange);
        orange.addActionListener(this);


        //Disposition :

        JPanel Parametres = new JPanel();
        Parametres.setLayout(new GridLayout(1,2));

        Parametres.add(Palette,"West");
        Parametres.add(Formes,"East");

        //Affichage :

        Screen.add(Menu,"North");
        Screen.add(DrawZone, "Center");
        Screen.add(Parametres,"South");

    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "New" :
                DrawZone.reset();
                break;
            case "Open" :
                break;
            case "Save" :
                break;
            case "Exit" :
                System.out.println("Fermeture de la fenêtre");
                Screen.dispose();
                break;
            case "Author":
                System.out.println("info");
                JOptionPane info = new JOptionPane();
                info.showInternalMessageDialog( info, "Author : Souyri Pierre",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Noir":
                DrawZone.setColor(Color.black);
                System.out.println("Noir");
                break;
            case "Vert":
                DrawZone.setColor(Color.green);
                System.out.println("Vert");
                break;
            case "Bleu":
                DrawZone.setColor(Color.blue);
                System.out.println("Bleu");
                break;
            case "Rouge":
                DrawZone.setColor(Color.red);
                System.out.println("Rouge");
                break;
            case "Jaune":
                DrawZone.setColor(Color.yellow);
                System.out.println("Jaune");
                break;
            case "Rose":
                DrawZone.setColor(Color.pink);
                System.out.println("Rose");
                break;
            case "Violet":
                DrawZone.setColor(Color.magenta);
                System.out.println("Violet");
                break;
            case "Orange":
                DrawZone.setColor(Color.orange);
                System.out.println("Orange");
                break;
            case "Ellipse":
                DrawZone.setFigureName("Ellipse");
                System.out.println("Ellipse");
                break;
            case "Cercle":
                DrawZone.setFigureName("Circle");
                System.out.println("Cercle");
                break;
            case "Rectangle":
                DrawZone.setFigureName("Rectangle");
                System.out.println("Rectangle");
                break;
            case "Carre":
                DrawZone.setFigureName("Square");
                System.out.println("Carre");
                break;
            default:
                System.out.println("Command not understood : " + command);
                break;
        }
    }
}