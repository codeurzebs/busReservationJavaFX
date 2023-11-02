package com.codeurzebs.busreservationjavafx.model.manifeste;

import com.codeurzebs.busreservationjavafx.model.bus.Bus;
import com.codeurzebs.busreservationjavafx.model.etudiant.Etudiant;
import com.codeurzebs.busreservationjavafx.model.reservation.Reservation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manifeste {
    private Bus bus;
    private Date dateDepart;
    private List<Reservation> reservations;
    public Manifeste(Bus bus, Date dateDepart) {
        this.bus = bus;
        this.dateDepart = dateDepart;
        this.reservations = new ArrayList<>();
    }
    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    public void supprimerReservation(Reservation reservation) {
        reservations.remove(reservation);
    }
    public List<Reservation> getReservations() {
        return reservations;
    }
    public int getNombreReservations() {
        return reservations.size();
    }
    public boolean contientReservation(Reservation reservation) {
        return reservations.contains(reservation);
    }
    public boolean passagerReserve(String nomEtudiant, int numeroSiege) {
        for (Reservation reservation : reservations) {
            if (reservation.getEtudiant().equals(nomEtudiant) && reservation.getNumeroSiege()==numeroSiege) {
                return true;
            }
        }
        return false;
    }
    public List<Reservation> getReservationsPourPassager(String nomEtudiant) {
        List<Reservation> reservationsPourPassager = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getEtudiant().equals(nomEtudiant)) {
                reservationsPourPassager.add(reservation);
            }
        }
        return reservationsPourPassager;
    }
    public List<Reservation> getReservationsPourSiege(int numeroSiege) {
        List<Reservation> reservationsPourSiege = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getNumeroSiege()==numeroSiege) {
                reservationsPourSiege.add(reservation);
            }
        }
        return reservationsPourSiege;
    }
}


















/*
* ajouterReservation(Etudiant etudiant, Bus bus, Date dateDepart, int numeroSiege) :
Cette méthode permet d'ajouter une nouvelle réservation au manifeste pour un étudiant donné, un bus spécifié, une date de départ donnée et un numéro de siège donné.

* supprimerReservation(Etudiant etudiant, Bus bus, Date dateDepart, int numeroSiege) :
Cette méthode permet de supprimer une réservation du manifeste pour un étudiant donné, un bus spécifié, une date de départ donnée et un numéro de siège donné.

* getReservationsParBus(Bus bus, Date dateDepart) :
Cette méthode retourne une liste de toutes les réservations enregistrées dans le manifeste pour un bus spécifié et une date de départ donnée.

* getReservationsParEtudiant(Etudiant etudiant) :
Cette méthode retourne une liste de toutes les réservations enregistrées dans le manifeste pour un étudiant donné.

* getNombreReservationsParBus(Bus bus, Date dateDepart) :
Cette méthode retourne le nombre total de réservations pour un bus spécifié et une date de départ donnée.

* getNombreTotalReservations() :
Cette méthode retourne le nombre total de réservations enregistrées dans le manifeste.

* getPlacesDisponibles(Bus bus, Date dateDepart) :
Cette méthode retourne le nombre de places disponibles pour un bus spécifié et une date de départ donnée.

* isSiegeReserve(Bus bus, Date dateDepart, int numeroSiege) :
Cette méthode vérifie si un siège spécifié dans un bus et à une date de départ donnée est déjà réservé.

* getListeReservations() :
Cette méthode retourne une liste de toutes les réservations enregistrées dans le manifeste.

* viderManifeste() :
Cette méthode permet de vider complètement le manifeste, supprimant toutes les réservations enregistrées
* */