package Vue;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class AjoutEnfant extends JFrame {
    public static int instanceNb = 0;

    JComboBox listeEnfants = new JComboBox();
    JComboBox listePersonnes = new JComboBox();
    JLabel choixEnfant = new JLabel("Enfant à attribuer: ");
    JLabel choixPersonne = new JLabel("Personne à qui attribuer un enfant: ");
    JPanel menuChoix = new JPanel();
    JButton validation = new JButton("Valider");

    public AjoutEnfant(){
        instanceNb++;
        this.setTitle("Ajouter un enfant");
        this.getContentPane().setLayout(new BorderLayout());
        menuChoix.setLayout(new GridLayout(2,2));
        menuChoix.add(choixPersonne);
        menuChoix.add(listePersonnes);
        menuChoix.add(choixEnfant);
        menuChoix.add(listeEnfants);

        this.getContentPane().add(BorderLayout.CENTER, menuChoix);
        this.getContentPane().add(BorderLayout.SOUTH, validation);

        setSize(800,600);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();

    }
}