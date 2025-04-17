package Controleur;

import Modele.Arbre;
import Modele.Personne;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ControlInsertion implements ActionListener {
    Arbre arbre;
    JRadioButton sexe;
    JTextField nom;
    JTextField prenom;
    JTextField dateDeNaissance;
    JTextField dateDeDeces;

    public ControlInsertion(Arbre arbre, JRadioButton sexe, JTextField nom, JTextField prenom, JTextField dateDeNaissance, JTextField dateDeDeces) {
        this.arbre = arbre;
        this.sexe = sexe;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.dateDeDeces = dateDeDeces;
    }

    public void actionPerformed(ActionEvent e) {

    }
}
