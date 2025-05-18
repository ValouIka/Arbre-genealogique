package Modele;

import java.util.*;

public class Personne {
    public String nom;
    public String prenom;
    private String d_naissance;
    private String d_mort;
    private Femme mere;
    private Homme pere;
    

    public Personne(String prenom, String nom, String d_naissance, String d_mort) {
        this.prenom = prenom;
        this.nom = nom;
        this.d_naissance = d_naissance;
        this.d_mort = d_mort;
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






}