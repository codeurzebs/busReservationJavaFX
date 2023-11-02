package com.codeurzebs.busreservationjavafx.model.bus;
import com.codeurzebs.busreservationjavafx.model.chauffeur.Chauffeur;
public class Bus {
    private String numero;
    private int capacite;
    private String modele;
    private Chauffeur chauffeur;
    private boolean dispo;
    public Bus(){}
    public Bus(String numero, int capacite, String modele, Chauffeur chauffeur) {
        this.numero = numero;
        this.capacite = capacite;
        this.modele = modele;
        this.chauffeur = chauffeur;
        this.dispo = true;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero){numero=numero;}
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public Chauffeur getChauffeur() {
        return chauffeur;
    }
    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }
    public boolean estDisponible() {
        return dispo;
    }
    public void rendreIndispo(){this.dispo=false;}
    @Override
    public String toString() {
        return "Le Bus [numéro=" + numero + ", capacité=" + capacite + ", modèle=" + modele + ", chauffeur=" + chauffeur.getNom() + ", disponible=" + dispo + "]";
    }
}

