package Controleur;

import Modele.*;
import Vue.AjoutParents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlAjoutParents implements ActionListener {
    Homme pere;
    Femme mere;
    Personne enfant;
    AjoutParents VueAjoutParents;
    JComboBox<Personne> boxEnfant;
    JComboBox<Femme> boxMere;
    JComboBox<Homme> boxPere;

    public ControlAjoutParents(AjoutParents VueAjoutParents, JComboBox<Personne> boxEnfant, JComboBox<Femme> boxMere, JComboBox<Homme> boxPere) {
        this.boxEnfant = boxEnfant;
        this.boxMere = boxMere;
        this.boxPere = boxPere;
        this.VueAjoutParents = VueAjoutParents;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Valider")) {
            enfant = (Personne)boxEnfant.getSelectedItem();
            mere = (Femme)boxMere.getSelectedItem();
            pere = (Homme)boxPere.getSelectedItem();

            enfant.setMere(mere);
            enfant.setPere(pere);
            if(pere != null) {
                pere.addEnfant(enfant);
            }
            if(mere != null) {
                mere.addEnfant(enfant);
            }
            if(mere != null && pere != null) {
                Union union = new Union(mere, pere);
                mere.addUnion(union);
                pere.addUnion(union);
            }
            VueAjoutParents.dispose();
        }

    }
}
