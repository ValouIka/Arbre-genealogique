package Modele;

import java.util.*;

public class    Union {
    private Calendar d_debut;
    private Calendar d_fin;
    private Femme fpartenaire;
    private Homme hpartenaire;


    public Union(Femme fpartenaire, Homme hpartenaire) {
        this.fpartenaire = fpartenaire;
        this.hpartenaire = hpartenaire;
    }

    public void setDebut(int jour, int mois, int annee){
        d_debut = Calendar.getInstance();
        d_debut.set(jour, mois, annee);
    }

    public void setFin(int jour, int mois, int annee){
        d_fin = Calendar.getInstance();
        d_fin.set(jour, mois, annee);
    }
    
    public Femme getFemme(){
        return fpartenaire;
    }

    public Homme getHomme(){
        return hpartenaire;
    }

}