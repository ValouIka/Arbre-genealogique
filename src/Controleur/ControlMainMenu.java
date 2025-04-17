package Controleur;

import Vue.CreationArbre;
import Vue.Insertion;

import java.awt.event.*;
import javax.swing.*;

public class ControlMainMenu implements ActionListener {


    public void actionPerformed(ActionEvent e) {
        JButton temp = null;
        if(e.getSource() instanceof JButton) {
            temp = (JButton)e.getSource();
        }

        if(temp.getText().equals("Inserer arbre généalogique")){
            JFrame Fen2 = new CreationArbre();
        }
    }
}
