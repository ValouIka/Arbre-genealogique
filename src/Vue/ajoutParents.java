package Vue;

import java.awt.*;
import javax.swing.*;

public class ajoutParents extends JFrame {
    JLabel personne = new JLabel("Personne à qui ajouter des parents: ");
    JLabel choixPere = new JLabel("Père: ");
    JLabel choixMere = new JLabel("Mere: ");
    JComboBox listePersonnes = new JComboBox();
    JComboBox listeHommes = new JComboBox();
    JComboBox listeFemmes = new JComboBox();
    JPanel menuChoix = new JPanel();
    JButton validation = new JButton("Valider");

    public ajoutParents() {
        this.setTitle("Ajout des parents");
        this.getContentPane().setLayout(new GridLayout(2,1));
        menuChoix.setLayout(new GridLayout(3,2));
        menuChoix.add(personne);
        menuChoix.add(listePersonnes);
        menuChoix.add(choixMere);
        menuChoix.add(listeFemmes);
        menuChoix.add(choixPere);
        menuChoix.add(listeHommes);
        this.getContentPane().add(menuChoix);
        this.getContentPane().add(validation);

        this.setSize(800,600);
        this.show();
        this.setVisible(true);
        this.pack();

    }
}
