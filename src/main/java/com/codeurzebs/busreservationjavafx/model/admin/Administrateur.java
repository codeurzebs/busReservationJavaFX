package com.codeurzebs.busreservationjavafx.model.admin;

public class Administrateur {
    private String nomUtilisateur;
    private String motDePasse;
    public Administrateur(String nomUtilisateur, String motDePasse) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
    }
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }
    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    // Méthode pour vérifier si le nom d'utilisateur et le mot de passe sont valides
    public boolean verifierIdentifiants(String nomUtilisateur, String motDePasse) {
        return this.nomUtilisateur.equals(nomUtilisateur) && this.motDePasse.equals(motDePasse);
    }

    @Override
    public String toString() {
        return "Administrateur [nom d'utilisateur=" + nomUtilisateur + "]";
    }
}







/*
* Constructeurs :

Vous pouvez avoir plusieurs constructeurs pour initialiser un administrateur avec différentes combinaisons d'informations, telles que le nom, l'identifiant, etc.
getNom() et setNom(String nom) :

Méthodes pour obtenir et définir le nom de l'administrateur.
getIdentifiant() et setIdentifiant(String identifiant) :

Méthodes pour obtenir et définir l'identifiant de connexion de l'administrateur.
getMotDePasse() et setMotDePasse(String motDePasse) :

Méthodes pour obtenir et définir le mot de passe de l'administrateur.
creerChauffeur(String nom, String numeroPermis, String contact) :

Méthode pour créer un nouveau chauffeur en fournissant les informations nécessaires.
modifierChauffeur(Chauffeur chauffeur, String nom, String numeroPermis, String contact) :

Méthode pour modifier les informations d'un chauffeur existant.
supprimerChauffeur(Chauffeur chauffeur) :

Méthode pour supprimer un chauffeur du système.
rechercherChauffeurParNom(String nom) :

Méthode pour rechercher un chauffeur par son nom.
rechercherChauffeurParNumeroPermis(String numeroPermis) :

Méthode pour rechercher un chauffeur par son numéro de permis de conduire.
creerBus(String nom, int nombrePlaces) :

Méthode pour créer un nouveau bus en fournissant les informations nécessaires.
modifierBus(Bus bus, String nom, int nombrePlaces) :

Méthode pour modifier les informations d'un bus existant.
supprimerBus(Bus bus) :

Méthode pour supprimer un bus du système.
rechercherBusParNom(String nom) :

Méthode pour rechercher un bus par son nom.
creerTrajet(Bus bus, Date dateDepart, String lieuDepart, String lieuArrivee) :

Méthode pour créer un nouveau trajet en fournissant les informations nécessaires.
modifierTrajet(Trajet trajet, Bus bus, Date dateDepart, String lieuDepart, String lieuArrivee) :

Méthode pour modifier les informations d'un trajet existant.
supprimerTrajet(Trajet trajet) :

Méthode pour supprimer un trajet du système.
rechercherTrajetParBus(Bus bus) :

Méthode pour rechercher les trajets associés à un bus donné.
rechercherTrajetParDate(Date dateDepart) :

Méthode pour rechercher les trajets prévus à une date de départ donnée.
*
* */