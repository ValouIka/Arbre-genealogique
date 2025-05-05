package Modele;

import java.util.*;

public class Union {
    private String d_debut;
    private String d_fin;
    private Femme fpartenaire;
    private Homme hpartenaire;


    public Union(Femme fpartenaire, Homme hpartenaire) {
        this.fpartenaire = fpartenaire;
        this.hpartenaire = hpartenaire;
    }

    public void setDebut(String date){
        d_debut = date;
    }

    public void setFin(String date){
        d_fin = date;
    }
    
    public Femme getFemme(){
        return fpartenaire;
    }

    public Homme getHomme(){
        return hpartenaire;
    }

}