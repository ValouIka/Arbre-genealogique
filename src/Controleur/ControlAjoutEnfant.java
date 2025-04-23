package Controleur;

import Modele.Arbre;
import Modele.Femme;
import Modele.Homme;
import Modele.Personne;
import Vue.AjoutEnfant;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlAjoutEnfant implements ActionListener {
    Arbre arbre;
    Personne enfant;
    Personne parent;
    AjoutEnfant VueAjoutEnfant;


    public ControlAjoutEnfant(AjoutEnfant VueAjoutEnfant, Arbre arbre, Personne enfant, Personne parent) {
        this.arbre = arbre;
        this.enfant = enfant;
        this.parent = parent;
        this.VueAjoutEnfant = VueAjoutEnfant;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Valider")) {
            if(parent instanceof Femme) {
                ((Femme) parent).addEnfant(enfant);
            }
            else if(parent instanceof Homme) {
                ((Homme) parent).addEnfant(enfant);
            }
            VueAjoutEnfant.dispose();
        }
    }
}
