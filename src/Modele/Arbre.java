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
    */



    public Vector<Personne> chercherFratrie(Personne p){
        Vector<Personne> fratrie = new Vector<>();
        Vector<Personne> enfantsMere = p.getMere().getEnfants();
        Vector<Personne> enfantsPere = p.getPere().getEnfants();

        for(int i=0; i<enfantsMere.size(); i++){
            if(!enfantsMere.contains(p)){
                fratrie.add(enfantsMere.get(i));
            }
        }
        for(int i=0; i<enfantsPere.size(); i++){
            if(!enfantsPere.contains(p) && !fratrie.contains(enfantsPere.get(i))){
                fratrie.add(enfantsPere.get(i));
            }
        }
        return fratrie;
    }


    public Vector<Personne> chercherCousin(Personne p){
        Vector<Personne> cousins = new Vector<>();
        Vector<Personne> fratrieMere = chercherFratrie(p.getMere());
        Vector<Personne> fratriePere = chercherFratrie(p.getPere());

        for(int i=0; i<fratrieMere.size(); i++){
            if(fratrieMere.get(i) instanceof Femme){
                cousins.addAll(((Femme) fratrieMere.get(i)).getEnfants());
            }
            else{
                cousins.addAll(((Homme) fratrieMere.get(i)).getEnfants());
            }
        }
        for(int i=0; i<fratriePere.size(); i++){
            if(fratriePere.get(i) instanceof Femme){
                cousins.addAll(((Femme) fratriePere.get(i)).getEnfants());
            }
            else{
                cousins.addAll(((Homme) fratriePere.get(i)).getEnfants());
            }
        }
        return cousins;
    }

    public Vector<Personne> chercherAncetres(Personne p, Vector<Personne> ancetres){
        if(ancetres == null){
            ancetres = new Vector<>();
        }
        if(p.getMere() != null){
            chercherAncetres(p.getMere(), ancetres);
        }
        ancetres.add(p);
        if(p.getPere() != null){
            chercherAncetres(p.getPere(), ancetres);
        }
        return ancetres;
    }


    /*
    public String lienParente(Personne a, Personne b){

    }

     */




}
