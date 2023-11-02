package com.codeurzebs.busreservationjavafx.model.reservation;

import com.ngcodex.bus.Bus;
import com.ngcodex.etudiant.Etudiant;
import java.util.Date;

public class Reservation {
    private int id;
    private Bus bus;
    private Etudiant etudiant;
    private Date dateDepart;
    private int numeroSiege;
    private boolean estConfirme;
    public Reservation(int id, Bus bus, Etudiant etudiant, Date dateDepart, int numeroSiege) {
        this.id = id;
        this.bus = bus;
        this.etudiant = etudiant;
        this.dateDepart = dateDepart;
        this.numeroSiege = numeroSiege;
        this.estConfirme = false; // Par défaut, la réservation n'est pas confirmée lorsqu'elle est créée.
    }
    public int getId() {
        return id;
    }
    public Bus getBus() {
        return bus;
    }
    public void setBus(Bus bus) {
        this.bus = bus;
    }
    public Etudiant getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    public Date getDateDepart() {
        return dateDepart;
    }
    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }
    public int getNumeroSiege() {
        return numeroSiege;
    }
    public void setNumeroSiege(int numeroSiege) {
        this.numeroSiege = numeroSiege;
    }
    public boolean estConfirme() {
        return estConfirme;
    }
    public void confirmer() {
        this.estConfirme = true;
    }
    public void annuler() {
        this.estConfirme = true;
    }
    @Override
    public String toString() {
        return "Réservation [id=" + id + ", bus=" + bus.getNumero() + ", étudiant=" + etudiant.getNomc() +
                ", date et heure de validation=" + dateDepart + ", numéro de siège=" + numeroSiege + ", Payement confirmée=" + estConfirme + "]";
    }
}
















//creerReservation(Etudiant etudiant, Bus bus, Date dateDepart, int numeroSiege) :
//Cette méthode permet de créer une nouvelle réservation pour un étudiant donné, pour un bus spécifié, à une date de départ donnée, et pour un numéro de siège donné.
//
// annulerReservation(Reservation reservation) :
//Cette méthode permet d'annuler une réservation existante en prenant en paramètre l'objet Reservation à annuler.
//
// getReservationsEtudiant(Etudiant etudiant) :
//Cette méthode retourne une liste de toutes les réservations effectuées par un étudiant donné.
//
// getReservationsBus(Bus bus, Date dateDepart) :
//Cette méthode retourne une liste de toutes les réservations pour un bus donné et une date de départ donnée.
//getReservationsDate(Date dateDepart) :
//
//Cette méthode retourne une liste de toutes les réservations pour une date de départ donnée.
//getReservationsToutes() :
//
//Cette méthode retourne une liste de toutes les réservations enregistrées.
//getReservationParId(int idReservation) :
//
//Cette méthode permet de récupérer une réservation spécifique en utilisant son identifiant unique.
//verifierDisponibiliteSiege(Bus bus, Date dateDepart, int numeroSiege) :
//
//Cette méthode vérifie la disponibilité d'un siège pour un bus et une date de départ donnés.
//getNombreReservationsTotal() :
//
//Cette méthode retourne le nombre total de réservations enregistrées dans le système.
//getNombreReservationsEtudiant(Etudiant etudiant) :
//
//Cette méthode retourne le nombre de réservations effectuées par un étudiant spécifié.