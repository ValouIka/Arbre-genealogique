package Vue;

import Modele.Personne;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class AffichageListe extends JFrame {

    public AffichageListe(Vector<Personne> personnes) {
        this.setTitle("Liste");
        this.getContentPane().setLayout(new BorderLayout());

        DefaultListModel<Personne> model = new DefaultListModel<>();
        model.addAll(personnes);

        JList<Personne> list = new JList<>(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(800, 600));

        this.getContentPane().add(BorderLayout.CENTER, list);


        setSize(800,600);
        setLocationRelativeTo(null);
        this.show();
        setVisible(true);
        this.pack();
    }
}
