package Controleur;

import Vue.AjoutParents;
import Vue.AjoutPartenaire;
import Vue.Insertion;
import Vue.AjoutEnfant;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCreationArbre implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Ajouter une personne")){
            JFrame Fen = new Insertion();
        }
        else if(temp.getText().equals("Ajouter un enfant à une personne")){
            JFrame Fen = new AjoutEnfant();
        }
        else if(temp.getText().equals("Ajouter des parents à une personne")){
            JFrame Fen = new AjoutParents();
        }
        else if(temp.getText().equals("Ajouter un partenaire à une personne")){
            JFrame Fen = new AjoutPartenaire();
        }
    }
}
