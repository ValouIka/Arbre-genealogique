package Modele;

import java.util.Vector;

public class Arbre {
    String nom;
    Vector<Personne> Personnes;
    Personne proprietaire;

    public Arbre(String nom){
        this.nom = nom;
    }

    public void ajoutePersonne(Personne p){
        Personnes.add(p);
    }

    public void setProprietaire(Personne p){
        proprietaire = p;
    }

    /*
    public Personne getPersonneByName(){

    }

    public Personne chercherCousin(){

    }

    public Personne chercherFratrie(){

    }

    public String lienParente(){

    }

    public
    */

}
