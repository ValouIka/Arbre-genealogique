package Vue;

import javax.swing.*;
import java.awt.*;

public class ajoutPartenaire extends JFrame {
    JComboBox listePartenaires = new JComboBox();
    JComboBox listePersonnes = new JComboBox();
    JLabel choixPartenaire = new JLabel("Partenaire à attribuer: ");
    JLabel choixPersonne = new JLabel("Personne à qui attribuer un partenaire: ");
    JPanel menuChoix = new JPanel();
    JButton validation = new JButton("Valider");

    public ajoutPartenaire() {
        this.setTitle("Ajouter un partenaire");
        this.getContentPane().setLayout((new GridLayout(2, 1)));
        menuChoix.setLayout(new GridLayout(2, 2));
        menuChoix.add(choixPersonne);
        menuChoix.add(listePersonnes);
        menuChoix.add(choixPartenaire);
        menuChoix.add(listePartenaires);

        this.getContentPane().add(menuChoix);
        this.getContentPane().add(validation);

        setSize(800, 600);
        this.show();
        setVisible(true);
        this.pack();
    }
}
