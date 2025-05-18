package Vue;

import Controleur.ControlAjoutParents;
import Modele.Arbre;
import Modele.Femme;
import Modele.Homme;
import Modele.Personne;

import java.awt.*;
import javax.swing.*;

public class AjoutParents extends JFrame {
    public static int instanceNb = 0;

    JLabel personne = new JLabel("Personne à qui ajouter des parents: ");
    JLabel choixPere = new JLabel("Père: ");
    JLabel choixMere = new JLabel("Mere: ");
    JComboBox<Personne> listePersonnes = new JComboBox<>();
    JComboBox<Homme> listeHommes = new JComboBox<>();
    JComboBox<Femme> listeFemmes = new JComboBox<>();

    JPanel menuChoix = new JPanel();
    JButton validation = new JButton("Valider");

    public AjoutParents(Arbre arbre) {
        instanceNb++;
        if(!arbre.getPersonnes().isEmpty()){
            for(int i = 0; i<arbre.getPersonnes().size(); i++){
                Personne p = arbre.getPersonnes().get(i);
                if(p instanceof Femme) {
                    listeFemmes.addItem((Femme)p);
                }
                else if(p instanceof Homme) {
                    listeHommes.addItem((Homme)p);
                }
                listePersonnes.addItem(p);
            }
        }
        this.setTitle("Ajout des parents");
        this.getContentPane().setLayout(new BorderLayout());
        menuChoix.setLayout(new GridLayout(3,2));
        menuChoix.add(personne);
        menuChoix.add(listePersonnes);
        menuChoix.add(choixMere);
        menuChoix.add(listeFemmes);
        menuChoix.add(choixPere);
        menuChoix.add(listeHommes);

        ControlAjoutParents c = new ControlAjoutParents(this, listePersonnes, listeFemmes, listeHommes);
        validation.addActionListener(c);

        this.getContentPane().add(BorderLayout.CENTER, menuChoix);
        this.getContentPane().add(BorderLayout.SOUTH, validation);

        this.setSize(800,600);
        setLocationRelativeTo(null);
        this.show();
        this.setVisible(true);
        this.pack();

    }
}