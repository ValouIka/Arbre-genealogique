package Controleur;

import Modele.Femme;
import Modele.Homme;
import Modele.Personne;
import Modele.Union;
import Vue.AjoutPartenaire;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlAjoutPartenaire implements ActionListener {
    AjoutPartenaire VueAjoutPartenaire;
    Femme Fp;
    Homme Hp;

    public ControlAjoutPartenaire(AjoutPartenaire VueAjoutPartenaire, Femme Fp, Homme Hp) {
        this.VueAjoutPartenaire = VueAjoutPartenaire;
        this.Fp = Fp;
        this.Hp = Hp;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Valider")){
            Union union = new Union(Fp, Hp);
            Fp.addUnion(union);
            Hp.addUnion(union);
            VueAjoutPartenaire.dispose();
        }

    }
}
