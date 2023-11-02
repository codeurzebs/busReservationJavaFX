package com.codeurzebs.busreservationjavafx.model.reservation;

public class ReservationIctBus {



}







/*
* Constructeurs :

Vous pouvez avoir plusieurs constructeurs pour initialiser une réservation avec différentes combinaisons d'informations,
*  telles que le bus réservé, l'étudiant réservant, la date de départ et le numéro de siège.
getBus() et setBus(Bus bus) :

Méthodes pour obtenir et définir le bus réservé.
getEtudiant() et setEtudiant(Etudiant etudiant) :

Méthodes pour obtenir et définir l'étudiant qui effectue la réservation.
getDateDepart() et setDateDepart(Date dateDepart) :

Méthodes pour obtenir et définir la date de départ de la réservation.
getNumeroSiege() et setNumeroSiege(int numeroSiege) :

Méthodes pour obtenir et définir le numéro de siège réservé.
getStatut() et setStatut(String statut) :

Méthodes pour obtenir et définir le statut de la réservation (confirmée, annulée, en attente, etc.).
confirmerReservation() :

Méthode pour confirmer la réservation, en définissant son statut comme "confirmé".
annulerReservation() :

Méthode pour annuler la réservation, en définissant son statut comme "annulé".
estAnnulee() :

Méthode qui vérifie si la réservation est annulée.
estConfirme() :

Méthode qui vérifie si la réservation est confirmée.
estEnAttente() :

Méthode qui vérifie si la réservation est en attente de confirmation.
verifierDisponibiliteSiege(Bus bus, Date dateDepart, int numeroSiege) :

Méthode statique pour vérifier si un siège spécifié dans un bus et à une date de départ donnée est déjà réservé.
getDetailsReservation() :

Méthode pour obtenir les détails complets de la réservation sous forme de texte formaté.
* */