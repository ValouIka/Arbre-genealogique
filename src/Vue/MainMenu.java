package Vue;

import Controleur.ControlMainMenu;
import Modele.Arbre;

import java.awt.*;
import javax.swing.*;

public class MainMenu extends JFrame {
    JButton insertion = new JButton("Inserer arbre généalogique");
    JButton affichage = new JButton("Afficher arbre généalogique");
    JButton ancetres = new JButton("Afficher les ancetres d'une personne");
    JButton fratrie = new JButton("Afficher la fratrie d'une personne");
    JButton cousins = new JButton("Afficher les cousins/cousines d'une personne");
    JButton parente = new JButton("Afficher le lien de parenté entre deux personnes");
    JPanel boutonsMenu = new JPanel();


    public MainMenu(Arbre arbre){
        this.setTitle("Menu principal");
        this.getContentPane().setLayout(new BorderLayout());
        //Creation boutons
        boutonsMenu.setLayout(new GridLayout(6,1));
        boutonsMenu.add(insertion);
        boutonsMenu.add(affichage);
        boutonsMenu.add(ancetres);
        boutonsMenu.add(fratrie);
        boutonsMenu.add(cousins);
        boutonsMenu.add(parente);
        this.getContentPane().add(BorderLayout.CENTER, boutonsMenu);

        //Controleurs pour chaque bouton
        ControlMainMenu c1 = new ControlMainMenu(arbre);
        insertion.addActionListener(c1);
        affichage.addActionListener(c1);
        ancetres.addActionListener(c1);
        fratrie.addActionListener(c1);
        cousins.addActionListener(c1);
        parente.addActionListener(c1);

        //Affichage de la fenêtre
        setSize(800,600);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();
    }


}
