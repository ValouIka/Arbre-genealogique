package Modele;

import java.util.Observable;
import java.util.Vector;

public class Arbre extends Observable {
    public String nom;
    public Personne proprietaire;
    private Vector<Personne> Personnes;


    public Arbre(String nom){
        this.nom = nom;
        Personnes = new Vector<>();
    }

    public Vector<Personne> getPersonnes() {
        return Personnes;
    }

    public void ajoutePersonne(Personne p){
        Personnes.add(p);
        this.setChanged();
        this.notifyObservers(Personnes);
    }

    public void setProprietaire(Personne p){
        proprietaire = p;
        this.setChanged();
        this.notifyObservers(proprietaire);
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
