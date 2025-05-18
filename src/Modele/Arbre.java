package Modele;

import java.util.Observable;
import java.util.Vector;

public class Arbre {
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
    }

    public void setProprietaire(Personne p){
        proprietaire = p;

    }

    /*
    public Personne getPersonneByName(){

    }
    */



    static public Vector<Personne> chercherFratrie(Personne p){
        if(p == null){
            System.out.println("Erreur : chercherFratrie : p == null");
            return null;
        }

        Vector<Personne> fratrie = new Vector<>();

        if(p.getMere() != null){
            Vector<Personne> enfantsMere = p.getMere().getEnfants();
            for(int i=0; i<enfantsMere.size(); i++){
                if(enfantsMere.get(i) != p){
                    fratrie.add(enfantsMere.get(i));
                }
            }
        }
        else{
            System.out.println("Pas de mere pour "+ p);
        }

        if(p.getPere() != null){
            Vector<Personne> enfantsPere = p.getPere().getEnfants();
            for(int i=0; i<enfantsPere.size(); i++){
                if(enfantsPere.get(i) != p && !fratrie.contains(enfantsPere.get(i))){
                    fratrie.add(enfantsPere.get(i));
                }
            }
        }
        else{
            System.out.println("Pas de pere pour "+ p);
        }
        return fratrie;
    }


    static public Vector<Personne> chercherCousins(Personne p){
        if(p == null){
            return null;
        }
        Vector<Personne> cousins = new Vector<>();
        Vector<Personne> fratrieMere;
        Vector<Personne> fratriePere;


        if(p.getMere() != null){
            fratrieMere = chercherFratrie(p.getMere());
            for(int i=0; i<fratrieMere.size(); i++){
                if(fratrieMere.get(i) instanceof Femme){
                    cousins.addAll(((Femme) fratrieMere.get(i)).getEnfants());
                }
                else{
                    cousins.addAll(((Homme) fratrieMere.get(i)).getEnfants());
                }
            }
        }

        if(p.getPere() != null){
            fratriePere = chercherFratrie(p.getPere());
            for(int i=0; i<fratriePere.size(); i++){
                if(fratriePere.get(i) instanceof Femme){
                    cousins.addAll(((Femme) fratriePere.get(i)).getEnfants());
                }
                else{
                    cousins.addAll(((Homme) fratriePere.get(i)).getEnfants());
                }
            }
        }

        return cousins;
    }



    static public Vector<Personne> chercherAncetres(Personne p) {
        Vector<Personne> ancetres = new Vector<>();
        Vector<Personne> visited = new Vector<>(); //Personnes déjà parcourues
        chercherAncetresRecursif(p, ancetres, visited);
        return ancetres;
    }

    private static void chercherAncetresRecursif(
            Personne current,
            Vector<Personne> ancetres,
            Vector<Personne> visited
    ) {
        //Vérification initiale
        if (current == null || visited.contains(current)) {
            return;
        }
        visited.add(current);

        //Ancetres côté mere
        if (current.getMere() != null) {
            ancetres.add(current.getMere());
            chercherAncetresRecursif(current.getMere(), ancetres, visited);
        }

        //Ancetres côté pere
        if (current.getPere() != null) {
            ancetres.add(current.getPere());
            chercherAncetresRecursif(current.getPere(), ancetres, visited);
        }
    }



    /*
    public String lienParente(Personne a, Personne b){

    }

     */




}
