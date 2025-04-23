package Vue;
import Controleur.ControlInsertion;
import Modele.Arbre;

import java.awt.*;
import javax.swing.*;

public class Insertion extends JFrame{
    public static int instanceNb = 0;

    JLabel sexe = new JLabel("Sexe: ");
    JLabel nom = new JLabel("Nom: ");
    JLabel prenom = new JLabel("Prenom: ");
    JLabel d_naiss = new JLabel("Date de naissance: ");
    JLabel d_mort = new JLabel("Date de décès: ");
    JTextField c_nom = new JTextField();
    JTextField c_prenom = new JTextField();
    JTextField c_naiss = new JTextField();
    JTextField c_mort = new JTextField();
    JButton validation = new JButton("Valider");


    JRadioButton male = new JRadioButton("M");
    JRadioButton female = new JRadioButton("F");



    JPanel creationPanel = new JPanel();
    JPanel sexePanel = new JPanel();



    public Insertion(Arbre arbre){
        instanceNb++;
        this.setTitle("Insertion");
        this.getContentPane().setLayout(new BorderLayout());
        creationPanel.setLayout(new GridLayout(5,2));

        ButtonGroup grp = new ButtonGroup();
        grp.add(female); female.setSelected(true);
        grp.add(male);
        male.setActionCommand("M");
        female.setActionCommand("F");

        sexePanel.setLayout(new GridLayout(1,2));
        sexePanel.add(female);
        sexePanel.add(male);

        creationPanel.add(sexe);
        creationPanel.add(sexePanel);
        creationPanel.add(nom);
        creationPanel.add(c_nom);
        creationPanel.add(prenom);
        creationPanel.add(c_prenom);
        creationPanel.add(d_naiss);
        creationPanel.add(c_naiss);
        creationPanel.add(d_mort);
        creationPanel.add(c_mort);

        ControlInsertion c = new ControlInsertion(this,arbre,grp.getSelection().getActionCommand(),c_nom,c_prenom,c_naiss,c_mort);
        validation.addActionListener(c);

        this.getContentPane().add(BorderLayout.CENTER,creationPanel);
        this.getContentPane().add(BorderLayout.SOUTH, validation);

        setSize(1024,1024);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();
    }
}
