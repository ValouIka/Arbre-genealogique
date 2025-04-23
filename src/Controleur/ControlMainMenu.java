package Controleur;

import Modele.Arbre;
import Vue.CreationArbre;
import Vue.Insertion;

import java.awt.event.*;
import javax.swing.*;

public class ControlMainMenu implements ActionListener {
    Arbre arbre;

    public ControlMainMenu(Arbre arbre){
        this.arbre = arbre;
    }

    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Inserer arbre généalogique")){
            JFrame Fen = new CreationArbre(arbre);
        }
    }
}
