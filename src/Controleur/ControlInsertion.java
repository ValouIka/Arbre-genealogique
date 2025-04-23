package Controleur;

import Modele.Arbre;
import Modele.Femme;
import Modele.Homme;
import Modele.Personne;
import Vue.Insertion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ControlInsertion implements ActionListener {
    Arbre arbre;
    String sexe;
    ButtonGroup grp;
    JTextField nom;
    JTextField prenom;
    JTextField dateDeNaissance;
    JTextField dateDeDeces;
    Insertion VueInsertion;

    public ControlInsertion(Insertion VueInsertion, Arbre arbre, ButtonGroup grp, JTextField nom, JTextField prenom, JTextField dateDeNaissance, JTextField dateDeDeces) {
        this.arbre = arbre;
        this.nom = nom;
        this.grp = grp;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.dateDeDeces = dateDeDeces;
        this.VueInsertion = VueInsertion;
    }

    public void actionPerformed(ActionEvent e) {
        JButton valider = null;
        if(e.getSource() instanceof JButton) {
            valider = (JButton)e.getSource();
        }

        if(valider.getText().equals("Valider")) {
            sexe = grp.getSelection().getActionCommand();
            if(sexe.equals("F")){
                arbre.ajoutePersonne(new Femme(prenom.getText(), nom.getText()));
            }
            else if(sexe.equals("M")){
                arbre.ajoutePersonne(new Homme(prenom.getText(), nom.getText()));
            }
            VueInsertion.dispose();

        }
    }
}
