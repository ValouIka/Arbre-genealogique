package Vue;

import Modele.Arbre;

import javax.swing.*;
import java.awt.*;

public class AjoutPartenaire extends JFrame {
    public static int instanceNb = 0;

    JComboBox listePartenaires = new JComboBox();
    JComboBox listePersonnes = new JComboBox();
    JLabel choixPartenaire = new JLabel("Partenaire à attribuer: ");
    JLabel choixPersonne = new JLabel("Personne à qui attribuer un partenaire: ");
    JPanel menuChoix = new JPanel();
    JButton validation = new JButton("Valider");

    public AjoutPartenaire(Arbre arbre) {
        instanceNb++;
        this.setTitle("Ajouter un partenaire");
        this.getContentPane().setLayout(new BorderLayout());
        menuChoix.setLayout(new GridLayout(2, 2));
        menuChoix.add(choixPersonne);
        menuChoix.add(listePersonnes);
        menuChoix.add(choixPartenaire);
        menuChoix.add(listePartenaires);

        this.getContentPane().add(BorderLayout.CENTER, menuChoix);
        this.getContentPane().add(BorderLayout.SOUTH, validation);

        setSize(800, 600);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();
    }
}