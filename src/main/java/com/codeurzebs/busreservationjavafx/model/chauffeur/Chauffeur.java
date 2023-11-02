package com.codeurzebs.busreservationjavafx.model.chauffeur;
public class Chauffeur {
    private String nom;
    private String permis;
    private int tel;
    private Boolean dispo;
    public Chauffeur(){}
    public Chauffeur(String n, String num, int t){
        this.nom=n;
        this.permis=num;
        this.tel=t;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String n){
        this.nom=n;
    }
    public String getNumPermis(){
        return this.permis;
    }
    public void setNumPermis(String num){
        this.permis=num;
    }
    public int getTel(){
        return this.tel;
    }
    public void setTel(int t){
        this.tel=t;
    }
    public Boolean getDispo() {
        return dispo;
    }
    public void setDispo(Boolean dispo) {
        this.dispo = dispo;
    }
}


















/*
* Constructeurs :

Vous pouvez avoir plusieurs constructeurs pour initialiser un chauffeur avec différentes combinaisons d'informations, telles que le nom, le numéro de permis de conduire, etc.

* getNom() et setNom(String nom) :
Méthodes pour obtenir et définir le nom du chauffeur.
*
getNumeroPermis() et setNumeroPermis(String numeroPermis) :
Méthodes pour obtenir et définir le numéro de permis de conduire du chauffeur.

* getContact() et setContact(String contact) :
Méthodes pour obtenir et définir les informations de contact du chauffeur, telles qu'un numéro de téléphone.

* getBusConduit() et setBusConduit(Bus bus) :
Méthodes pour obtenir et définir le bus que le chauffeur conduit.

* demarrerTrajet() :
Cette méthode permet de signaler que le chauffeur a démarré le trajet.

* terminerTrajet() :
Cette méthode permet de signaler que le chauffeur a terminé le trajet.

* verifierDisponibiliteChauffeur(Date dateDepart) :
Méthode qui vérifie si le chauffeur est disponible pour conduire un bus à la date de départ spécifiée.

* getProchainTrajet() :
Méthode qui renvoie le prochain trajet que le chauffeur doit effectuer.

* getListeTrajetsPresents() :
Méthode pour obtenir la liste des trajets actuellement en cours, auxquels le chauffeur participe.

* getListeTrajetsFuturs() :
Méthode pour obtenir la liste des trajets futurs prévus pour le chauffeur.

*getListeTrajetsPasses() :
Méthode pour obtenir la liste des trajets passés que le chauffeur a effectués.

* rechercherChauffeurParNom(String nom) :
Méthode statique pour rechercher un chauffeur par son nom.
*
*rechercherChauffeurParNumeroPermis(String numeroPermis) :
Méthode statique pour rechercher un chauffeur par son numéro de permis de conduire.
* */