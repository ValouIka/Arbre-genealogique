package Vue;

import Controleur.ControlAjoutPartenaire;
import Modele.Arbre;
import Modele.Femme;
import Modele.Homme;
import Modele.Personne;

import javax.swing.*;
import java.awt.*;

public class AjoutPartenaire extends JFrame {
    public static int instanceNb = 0;

    JComboBox<Femme> listeFPartenaire = new JComboBox<>();
    JComboBox<Homme> listeHPartenaire = new JComboBox<>();
    JLabel choixFPartenaire = new JLabel("Femme de l'union: ");
    JLabel choixHPartenaire = new JLabel("Homme de l'union: ");
    JPanel menuChoix = new JPanel();
    JButton validation = new JButton("Valider");

    public AjoutPartenaire(Arbre arbre) {
        instanceNb++;
        if(!arbre.getPersonnes().isEmpty()){
            for(int i = 0; i<arbre.getPersonnes().size(); i++){
                Personne p = arbre.getPersonnes().get(i);
                if(p instanceof Femme) {
                    listeFPartenaire.addItem((Femme)p);
                }
                else if(p instanceof Homme) {
                    listeHPartenaire.addItem((Homme)p);
                }
            }
        }
        this.setTitle("Ajouter un partenaire");
        this.getContentPane().setLayout(new BorderLayout());
        menuChoix.setLayout(new GridLayout(2, 2));
        menuChoix.add(choixFPartenaire);
        menuChoix.add(listeFPartenaire);
        menuChoix.add(choixHPartenaire);
        menuChoix.add(listeHPartenaire);

        ControlAjoutPartenaire c = new ControlAjoutPartenaire(this, (Femme)listeFPartenaire.getSelectedItem(), (Homme)listeHPartenaire.getSelectedItem());
        validation.addActionListener(c);

        this.getContentPane().add(BorderLayout.CENTER, menuChoix);
        this.getContentPane().add(BorderLayout.SOUTH, validation);

        setSize(800, 600);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();
    }
}