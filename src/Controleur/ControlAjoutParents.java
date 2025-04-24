package Controleur;

import Modele.Arbre;
import Modele.Femme;
import Modele.Homme;
import Modele.Personne;
import Vue.AjoutParents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlAjoutParents implements ActionListener {
    Homme pere;
    Femme mere;
    Personne enfant;
    AjoutParents VueAjoutParents;

    public ControlAjoutParents(AjoutParents VueAjoutParents, Homme pere, Femme mere, Personne enfant) {
        this.pere = pere;
        this.mere = mere;
        this.enfant = enfant;
        this.VueAjoutParents = VueAjoutParents;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Valider")) {
            enfant.setMere(mere);
            enfant.setPere(pere);
            if(pere != null) {
                pere.addEnfant(enfant);
            }
            if(mere != null) {
                mere.addEnfant(enfant);
            }
            VueAjoutParents.dispose();
        }

    }
}
