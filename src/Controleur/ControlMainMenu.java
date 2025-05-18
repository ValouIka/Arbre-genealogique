package Controleur;

import Modele.Arbre;
import Vue.*;

import java.awt.event.*;
import javax.swing.*;

public class ControlMainMenu implements ActionListener {
    Arbre arbre;

    public ControlMainMenu(Arbre arbre){
        this.arbre = arbre;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Inserer arbre généalogique")){
            JFrame Fen = new CreationArbre(arbre);
        }
        if(temp.getText().equals("Afficher les ancetres d'une personne")){
            JFrame Fen = new AfficherAncetres(arbre);
        }
        if(temp.getText().equals("Afficher la fratrie d'une personne")){
            JFrame Fen = new AfficherFratrie(arbre);
        }
        if(temp.getText().equals("Afficher les cousins/cousines d'une personne")){
            JFrame Fen = new AfficherCousins(arbre);
        }
    }
}
