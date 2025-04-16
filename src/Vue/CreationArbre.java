package Vue;
import java.awt.*;
import javax.swing.*;


public class CreationArbre extends JFrame {
    JButton addPersonne = new JButton("Ajouter une personne");
    JButton addEnfant = new JButton("Ajouter un enfant à une personne");
    JButton addParents = new JButton("Ajouter des parents à une personne");
    JButton addPartenaire = new JButton("Ajouter un partenaire à une personne");
    JPanel boutons = new JPanel();

    public CreationArbre(){
        this.setTitle("Creation Arbre");
        this.getContentPane().setLayout(new GridLayout(1,1));
        boutons.setLayout(new GridLayout(4,1));
        boutons.add(addPersonne);
        boutons.add(addEnfant);
        boutons.add(addParents);
        boutons.add(addPartenaire);
        this.getContentPane().add(boutons);

        setSize(800,600);
        this.show();
        setVisible(true);
        this.pack();
    }
}
