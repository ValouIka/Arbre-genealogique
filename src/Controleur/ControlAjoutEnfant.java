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

    Personne enfant;
    Personne parent;
    AjoutEnfant VueAjoutEnfant;
    JComboBox<Personne> boxEnfant;
    JComboBox<Personne> boxParent;


    public ControlAjoutEnfant(AjoutEnfant VueAjoutEnfant, JComboBox<Personne> boxEnfant, JComboBox<Personne> boxParent) {
        this.boxEnfant = boxEnfant;
        this.boxParent = boxParent;
        this.VueAjoutEnfant = VueAjoutEnfant;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Valider")) {
            enfant = (Personne)boxEnfant.getSelectedItem();
            parent = (Personne)boxParent.getSelectedItem();
            if(parent instanceof Femme) {
                ((Femme) parent).addEnfant(enfant);
                enfant.setMere((Femme)parent);
            }
            else if(parent instanceof Homme) {
                ((Homme) parent).addEnfant(enfant);
                enfant.setPere((Homme)parent);
            }
            VueAjoutEnfant.dispose();
        }
    }
}
