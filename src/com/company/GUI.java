package com.company;//ismail said
//NB:pour tester ecrire dans le textfield : fileWrite2.txt car c'est le seul disponible :
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GUI {

    JFrame f; // the main frame
    //Buttons :
    JButton b_lire;
    //Panels
    JPanel pnorth;
    JPanel psouth;
    //Labels
    JLabel Label_Ficher;
    //TextFiels
    JTextField Nom_Fichier;
    //
    JTextArea contenu;

    GUI() {
        f = new JFrame("Application Lecture Fichier");//construction of the frame
        pnorth = new JPanel();
        psouth = new JPanel();
        //North Zone
        f.setLayout(new BorderLayout());
        pnorth.setLayout(new GridLayout(1, 2));
        // constructing labels
        Label_Ficher = new JLabel("Nom Fichier");
        Label_Ficher.setFont(new Font(Font.SANS_SERIF,
                Font.BOLD, 20));

        //constructing TextFields
        Nom_Fichier = new JTextField();
        //constructing JTextArea
        contenu = new JTextArea("Le contenu de votre Fichier      :");
        contenu.setForeground(new Color(128, 150, 200));
        contenu.setBackground(new Color(150, 128, 160));
        contenu.setFont(new Font(Font.SANS_SERIF,
                Font.BOLD, 30));
        //constrcting Buttons
        b_lire = new JButton("Lire");
        // adding Labels and !text fields in the grid
        //first and only row
        pnorth.add(Label_Ficher);
        pnorth.add(Nom_Fichier);

        f.add(pnorth, BorderLayout.NORTH); //adding pnorth panel  in the north of the frame


        //adding the JtextArea to the center of the frame
        f.add(contenu, BorderLayout.CENTER);
        // South Area
        psouth.add(b_lire);
        f.add(psouth, BorderLayout.SOUTH);
        MonEcouteur me = new MonEcouteur(this);
        //adding ActionListener for Buttons and the frame
        f.addWindowListener(me);
        b_lire.addActionListener(me);
        f.setSize(500, 500);
        //f.pack();//The pack method sizes the frame so that all its contents are at or above their preferred sizes
        f.setVisible(true); // to make visible the frame
    }

    public static void main(String[] args) throws IOException {
        GUI mf = new GUI();
    }

}