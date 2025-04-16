package Modele;

import Vue.Insertion;
import Vue.MainMenu;

import javax.swing.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws Exception {
        Femme p1 = new Femme("Stephanie", "Canal");
        Homme p2 = new Homme("Boris", "Dauge");
        Homme p3 = new Homme("Baptiste","Dauge");
        Homme p4 = new Homme("Valentin", "Dauge");

        Union u1 = new Union(p1,p2);
        u1.setDebut(1, Calendar.JANUARY, 1996);
        u1.setFin(1, Calendar.JANUARY, 2008);

        p1.addEnfant(p4);
        p1.addEnfant(p3);
        p2.addEnfant(p4);
        p3.addEnfant(p3);

        p3.setPere(p2);
        p4.setPere(p2);
        p3.setMere(p1);
        p4.setMere(p1);

        p1.addUnion(u1);
        p2.addUnion(u1);

        JFrame Fen1 = new MainMenu();
        JFrame Fen2 = new Insertion();

        System.out.println("Enfants de "+p1.prenom+" :");
        for(int i = 0; i < p1.getEnfant().size(); i++){
            System.out.println(p1.getEnfant().get(i).prenom);
        }





    }
}
