package Vue;
import java.awt.*;
import javax.swing.*;

public class Insertion extends JFrame{
    JLabel nom = new JLabel("Nom: ");
    JLabel prenom = new JLabel("Prenom: ");
    JLabel d_naiss = new JLabel("Date de naissance: ");
    JLabel d_mort = new JLabel("Date de décès: ");
    JTextField c_nom = new JTextField();
    JTextField c_prenom = new JTextField();
    JTextField c_naiss = new JTextField();
    JTextField c_mort = new JTextField();
    JButton validation = new JButton("Valider");

    JPanel creationPanel = new JPanel();


    public Insertion(){
        this.setTitle("Insertion");
        this.getContentPane().setLayout(new GridLayout(2,1));
        creationPanel.setLayout(new GridLayout(4,2));
        creationPanel.add(nom);
        creationPanel.add(c_nom);
        creationPanel.add(prenom);
        creationPanel.add(c_prenom);
        creationPanel.add(d_naiss);
        creationPanel.add(c_naiss);
        creationPanel.add(d_mort);
        creationPanel.add(c_mort);

        this.getContentPane().add(creationPanel);
        this.getContentPane().add(validation);

        setSize(1024,1024);
        this.show();
        setVisible(true);
        this.pack();
    }
}
