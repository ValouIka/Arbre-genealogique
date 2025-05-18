package Controleur;

import Modele.Arbre;
import Modele.Personne;
import Vue.AffichageListe;

import Vue.AfficherFratrie;
import Vue.MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ControlAfficherFratrie implements ActionListener {

    private JComboBox<Personne> box;
    private AfficherFratrie a;
    private Personne p;

    public ControlAfficherFratrie(JComboBox<Personne> box, AfficherFratrie a) {
        this.box = box;
        this.a = a;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }
        if(temp.getText().equals("Valider")){
            p = (Personne)box.getSelectedItem();
            JFrame Fen = new AffichageListe(Arbre.chercherFratrie(p));
            a.dispose();
        }
    }
}
