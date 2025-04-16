package Vue;
import java.awt.*;
import javax.swing.*;


public class ajoutEnfant extends JFrame {
    JComboBox listeEnfants = new JComboBox();
    JComboBox listePersonnes = new JComboBox();
    JLabel choixEnfant = new JLabel("Enfant à attribuer: ");
    JLabel choixPersonne = new JLabel("Personne à qui attribuer un enfant: ");
    JPanel menuChoix = new JPanel();
    JButton validation = new JButton("Valider");

    public ajoutEnfant(){
        this.setTitle("Ajouter un enfant");
        this.getContentPane().setLayout((new GridLayout(2,1)));
        menuChoix.setLayout(new GridLayout(2,2));
        menuChoix.add(choixPersonne);
        menuChoix.add(listePersonnes);
        menuChoix.add(choixEnfant);
        menuChoix.add(listeEnfants);

        this.getContentPane().add(menuChoix);
        this.getContentPane().add(validation);

        setSize(800,600);
        this.show();
        setVisible(true);
        this.pack();

    }
}
