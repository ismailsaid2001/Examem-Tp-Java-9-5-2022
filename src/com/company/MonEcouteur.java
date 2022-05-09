package com.company;//ismail said
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MonEcouteur implements ActionListener, WindowListener {
    GUI ihm;

    MonEcouteur(GUI G) {
        ihm = G;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ihm.b_lire) {
            String Nom_Fichier = ihm.Nom_Fichier.getText();
            ihm.contenu.setText("Le contenu de votre fichier : \n");
            try {
                File file = new File(Nom_Fichier);
                file.createNewFile();
                FileReader fr = new FileReader(file); // create a  FileReader
                BufferedReader bfr = new BufferedReader(fr);
                String line;
                while ((line = bfr.readLine()) != null) {
                    ihm.contenu.append(line + "\n");
                }
                fr.close();
            } catch (IOException e3) {
                System.out.println("erreur de type IOException");
            }
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int confirmed = JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir quitter?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
System.out.println("impossible de fermer ");

        }

    }


    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
