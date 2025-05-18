package Modele;

import Vue.*;

import javax.swing.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args)  {
        Arbre arbre = new Arbre("default");

        arbre.ajoutePersonne(new Homme("Valentin", "Dauge", "11/05/2000",null));
        arbre.ajoutePersonne(new Femme("Stephanie", "Canal", "18/10/78",null));
        arbre.ajoutePersonne(new Homme("Boris", "Dauge", "23/11/75",null));
        arbre.ajoutePersonne(new Homme("Thierry", "Canal", null,null));
        arbre.ajoutePersonne(new Femme("Sylvie", "Gourlay", null,null));
        arbre.ajoutePersonne(new Homme("Jacques", "Dauge", null,null));
        arbre.ajoutePersonne(new Femme("Marie-José", "Cambresy", null,null));
        arbre.ajoutePersonne(new Homme("Baptiste", "Dauge", "11/05/2002",null));
        arbre.ajoutePersonne(new Femme("Laetitia", "Canal", null,null));
        arbre.ajoutePersonne(new Femme("Anna", "Galasso", null,null));



        JFrame Fen = new MainMenu(arbre);















    }
}
