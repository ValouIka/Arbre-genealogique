package Controleur;

import Modele.Femme;
import Modele.Homme;
import Modele.Personne;
import Vue.AjoutPartenaire;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlAjoutPartenaire implements ActionListener {
    AjoutPartenaire VueAjoutPartenaire;
    Personne p1;
    Personne p2;

    public ControlAjoutPartenaire(AjoutPartenaire VueAjoutPartenaire, Personne p1, Personne p2) {
        this.VueAjoutPartenaire = VueAjoutPartenaire;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Valider")){
            if(p1 instanceof Femme) {

            }
        }
    }
}
