package Vue;
import Controleur.ControlCreationArbre;
import Modele.Arbre;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CreationArbre extends JFrame {
    public static int instanceNb = 0;

    JButton addPersonne = new JButton("Ajouter une personne");
    JButton addEnfant = new JButton("Ajouter un enfant à une personne");
    JButton addParents = new JButton("Ajouter des parents à une personne");
    JButton addPartenaire = new JButton("Ajouter un partenaire à une personne");
    JPanel boutons = new JPanel();

    public CreationArbre(Arbre arbre){
        instanceNb++;
        this.setTitle("Creation Arbre");
        this.getContentPane().setLayout(new GridLayout(1,1));
        boutons.setLayout(new GridLayout(4,1));
        boutons.add(addPersonne);
        boutons.add(addEnfant);
        boutons.add(addParents);
        boutons.add(addPartenaire);
        this.getContentPane().add(boutons);

        ControlCreationArbre c = new ControlCreationArbre(arbre);
        addPersonne.addActionListener(c);
        addEnfant.addActionListener(c);
        addParents.addActionListener(c);
        addPartenaire.addActionListener(c);


        setSize(800,600);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();
    }
}
