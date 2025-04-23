package Modele;

import java.util.*;

public class Personne {
    public String nom;
    public String prenom;
    private Calendar d_naissance;
    private Calendar d_mort;
    private Femme mere;
    private Homme pere;
    

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String toString(){
        return prenom + " " + nom;
    }


    public void setMere(Femme mere){
        this.mere = mere;
    }

    public void setPere(Homme pere){
        this.pere = pere;
    }

    public Femme getMere(){
        return mere;
    }

    public Homme getPere(){
        return pere;
    }

    public void setDateNaissance(int jour, int mois, int annee){
        d_naissance.set(annee, mois, jour);
    }

    public void setDateMort(int jour, int mois, int annee){
        d_mort.set(annee, mois, jour);
    }




}