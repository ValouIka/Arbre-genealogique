package Modele;

import java.util.*;

public class Homme extends Personne {
    private Vector<Union> unions = new Vector<Union>();
    private Vector<Personne> enfants = new Vector<Personne>();

    public Homme(String prenom, String nom) {
        super(prenom, nom);
    }

    public void addUnion(Union u){
        unions.add(u);
    }

    public void addEnfant(Personne p){
        enfants.add(p);
    }

    public Vector<Personne> getEnfants(){
        return enfants;
    }

    public Vector<Union> getUnion(){
        return unions;
    }

}