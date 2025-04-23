package Vue;
import Controleur.ControlAjoutEnfant;
import Modele.Arbre;
import Modele.Personne;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class AjoutEnfant extends JFrame {
    public static int instanceNb = 0;

    JComboBox<Personne> listeEnfants = new JComboBox();
    JComboBox<Personne> listePersonnes = new JComboBox();
    JLabel choixEnfant = new JLabel("Enfant à attribuer: ");
    JLabel choixPersonne = new JLabel("Personne à qui attribuer un enfant: ");
    JPanel menuChoix = new JPanel();
    JButton validation = new JButton("Valider");

    public AjoutEnfant(Arbre arbre){
        instanceNb++;
        if(!arbre.getPersonnes().isEmpty()){
            for(int i = 0; i<arbre.getPersonnes().size(); i++){
                listeEnfants.addItem(arbre.getPersonnes().elementAt(i));
                listePersonnes.addItem(arbre.getPersonnes().elementAt(i));
            }
        }
        this.setTitle("Ajouter un enfant");
        this.getContentPane().setLayout(new BorderLayout());
        menuChoix.setLayout(new GridLayout(2,2));
        menuChoix.add(choixPersonne);
        menuChoix.add(listePersonnes);
        menuChoix.add(choixEnfant);
        menuChoix.add(listeEnfants);

        ControlAjoutEnfant c = new ControlAjoutEnfant(this, (Personne)listeEnfants.getSelectedItem(), (Personne)listePersonnes.getSelectedItem());
        validation.addActionListener(c);

        this.getContentPane().add(BorderLayout.CENTER, menuChoix);
        this.getContentPane().add(BorderLayout.SOUTH, validation);

        setSize(800,600);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();

    }
}