package com.codeurzebs.busreservationjavafx.model.etudiant;

public class Etudiant {
    private String nomc; //Nom complet de l'etudiant ICT
    private String e_mail; //E-mail ICT de l etudiant
    private String matricule; // Pour le matricule de l 'etudiant ICT

    public Etudiant(){}// Constructeur par defaut de la class Etudiant
    public Etudiant(String n, String e, String m){ //Constructeur Parametré Initialisant les Attribut de la class
        this.nomc=n;
        this.e_mail=e;
        this.matricule=m;
    }

    /**
    **Methode: Ensemble des methodes utilent de la classe Etudiant
    **/

    /**
     *********** Accesseurs et Mutateur des Attributs **************
     **/
    public String getNomc(){
        return this.nomc;
    }
    public void setNomc(String n){
        this.nomc=n;
    }
    public String getE_mail(){
        return this.e_mail;
    }
    public void setE_mail(String e){
        this.e_mail=e;
    }
    public String getMatricule(){
        return this.matricule;
    }
    public void setMatricule(String m){
        this.matricule=m;
    }


}
/*
* Constructeurs :
Vous pouvez avoir plusieurs constructeurs pour initialiser un étudiant avec différentes combinaisons d'informations,
 telles que le nom, l'adresse e-mail, etc.

getNom() et setNom(String nom) :
Méthodes pour obtenir et définir le nom de l'étudiant.
*
getEmail() et setEmail(String email) :
Méthodes pour obtenir et définir l'adresse e-mail de l'étudiant.
*
getNumeroEtudiant() et setNumeroEtudiant(String numeroEtudiant) :
Méthodes pour obtenir et définir le numéro d'étudiant de l'étudiant.
*
creerReservation(Bus bus, Date dateDepart, int numeroSiege) :
Méthode pour créer une nouvelle réservation pour l'étudiant en fournissant les informations nécessaires, telles que le
*  bus, la date de départ et le numéro de siège.
*
annulerReservation(Reservation reservation) :
Méthode pour annuler une réservation existante pour l'étudiant en fournissant l'objet Reservation à annuler.
*
getReservations() :
Méthode pour obtenir la liste de toutes les réservations effectuées par l'étudiant.
*
getReservationsParDate(Date dateDepart) :
Méthode pour obtenir la liste des réservations de l'étudiant pour une date de départ spécifiée.
*
getNombreTotalReservations() :
Méthode pour obtenir le nombre total de réservations effectuées par l'étudiant.
*
getReservationParId(int idReservation) :
Méthode pour récupérer une réservation spécifique de l'étudiant en utilisant son identifiant unique.
*
getReservationsFutures() :
Méthode pour obtenir la liste des réservations futures de l'étudiant (réservations pour des dates de départ à venir).
*
getReservationsPasses() :
Méthode pour obtenir la liste des réservations passées de l'étudiant (réservations pour des dates de départ passées).
* */