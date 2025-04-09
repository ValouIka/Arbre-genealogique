package Modele;

import java.util.*;

public class Femme extends Personne {
    private Vector<Union> unions = new Vector<Union>();
    private Vector<Personne> enfants = new Vector<Personne>();

    public Femme(String prenom, String nom) {
        super(prenom, nom);
    }

    public void addUnion(Union u){
        unions.add(u);
    }

    public void addEnfant(Personne p){
        enfants.add(p);
    }

}