package Vue;

import Controleur.ControlAfficherAncetres;
import Controleur.ControlAfficherFratrie;
import Modele.Arbre;
import Modele.Personne;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class AfficherFratrie extends JFrame {


    JLabel listeLabel = new JLabel("Liste des adelphes de ");
    JComboBox<Personne> listePersonnes = new JComboBox<>();
    JButton valider = new JButton("Valider");
    JPanel choix = new JPanel();
    Vector<Personne> listeAncetres;


    public AfficherFratrie(Arbre arbre) {
        this.setTitle("Afficher Fratrie");
        this.getContentPane().setLayout(new BorderLayout());
        //Choix de la personne
        choix.setLayout(new GridLayout(1,3));
        choix.add(listeLabel);
        choix.add(listePersonnes);
        choix.add(valider);

        if(!arbre.getPersonnes().isEmpty()){
            for(int i = 0; i<arbre.getPersonnes().size(); i++){
                listePersonnes.addItem(arbre.getPersonnes().elementAt(i));
            }
        }

        listeAncetres = Arbre.chercherAncetres(listePersonnes.getItemAt(0));
        this.getContentPane().add(BorderLayout.CENTER, choix);

        ControlAfficherFratrie c = new ControlAfficherFratrie(listePersonnes, this);
        valider.addActionListener(c);


        setSize(800,600);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();

    }


}
