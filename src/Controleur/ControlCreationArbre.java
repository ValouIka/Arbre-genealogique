package Controleur;

import Modele.Arbre;
import Vue.AjoutParents;
import Vue.AjoutPartenaire;
import Vue.Insertion;
import Vue.AjoutEnfant;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCreationArbre implements ActionListener {
    Arbre arbre;

    public ControlCreationArbre(Arbre arbre) {
        this.arbre = arbre;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Ajouter une personne")){
            JFrame Fen = new Insertion(arbre);
        }
        else if(temp.getText().equals("Ajouter un enfant à une personne")){
            JFrame Fen = new AjoutEnfant(arbre);
        }
        else if(temp.getText().equals("Ajouter des parents à une personne")){
            JFrame Fen = new AjoutParents(arbre);
        }
        else if(temp.getText().equals("Ajouter un partenaire à une personne")){
            JFrame Fen = new AjoutPartenaire(arbre);
        }
    }
}
