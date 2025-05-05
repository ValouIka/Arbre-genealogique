package Modele;

import java.util.*;

public class Femme extends Personne {
    private Vector<Union> unions = new Vector<Union>();
    private Vector<Personne> enfants = new Vector<Personne>();

    public Femme(String prenom, String nom, String d_naissance, String d_mort) {
        super(prenom, nom, d_naissance, d_mort);
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