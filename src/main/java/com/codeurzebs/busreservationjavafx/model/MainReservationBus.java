package com.codeurzebs.busreservationjavafx.model;

import com.ngcodex.bus.Bus;
import com.ngcodex.bus.Panne;
import com.ngcodex.bus.Reparation;
import com.ngcodex.chauffeur.Chauffeur;
import com.ngcodex.etudiant.Etudiant;
import com.ngcodex.reservation.Reservation;

import java.util.*;

public class MainReservationBus {

    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        Map<String, List<String>> manifestes = new HashMap<>();
        List<Reservation> reservations = new ArrayList<>();
        List<Panne> pannes = new ArrayList<>();
        List<Reparation> reparations = new ArrayList<>();
        List<Chauffeur> chauffeurs = new ArrayList<>();
        List<Etudiant> etudiants= new ArrayList<>();
        List<Bus> buss = new ArrayList<>();
        Chauffeur chauffeur = new Chauffeur();
        Bus bus = new Bus();
        Etudiant etudiant = new Etudiant();

        int choix;
        do {
            System.out.println("-----------GESTION DES RESERVATIONS DE BUS D'ICT-UNIVERSITY--------------\n");
            System.out.println("\t 1. Créer une réservation ICT Bus");
            System.out.println("\t 2. Afficher les réservations");
            System.out.println("\t 3. Rediger un Manifeste");
            System.out.println("\t 4. Afficher les manifestes");
            System.out.println("\t 5. Créer un chauffeur");
            System.out.println("\t 6. Afficher la liste des chauffeurs ICT U \n");
            System.out.println("\t *********Module de Repation Bus**********");
            System.out.println("\t 7. Ajouter un bus");
            System.out.println("\t 8. Afficher la liste des bus");
            System.out.println("\t 9. Signaler une panne");
            System.out.println("\t 10. Afficher les pannes");
            System.out.println("\t 11. Terminer une réparation");
            System.out.println("\t 12. Afficher les réparations \n");
            System.out.println("0. Quitter \n");
            System.out.print("||||||| Faite un Choix : ");
            choix = lire.nextInt();
            lire.nextLine(); // Lire le saut de ligne

            switch (choix) {
                case 1:
                    System.out.print("Entrer le nom de l'étudiant : ");
                    String nomEtudiant = lire.nextLine();
                    System.out.println("Entrer son Matricule : ");
                    String mat = lire.nextLine();
                    etudiant.setMatricule(mat);
                    etudiant.setNomc(nomEtudiant);
                    etudiants.add(etudiant);
                    Bus bus1 =new Bus("ICTBUS1", 85, "Etage", chauffeur);
                    Bus bus2 =new Bus("ICTBUS2", 35, "Simple", chauffeur);
                    Bus bus3 =new Bus("ICTBUS3", 20, "Boite", chauffeur);
                    buss.add(bus1);
                    buss.add(bus2);
                    buss.add(bus3);
                    System.out.print("Numero du Bus ou Ligne de bus (ICTBUS1, ICTBUS2, ICTBUS3) : ");
                    String ligneBus = lire.nextLine();
                    bus.setNumero(ligneBus);
                    System.out.println("Entrer le Numero ACCT de la facture de payement a la bank de l Etudiant "+nomEtudiant+" : ");
                    String numfact= lire.nextLine();
                    System.out.println("Entrer Votre Mot de passe d'administration pour valider la reservation de cette etudiant : ");
                    String password=lire.nextLine();
                    while(!password.equals("adminictbus")){
                        System.out.println("Mot de pass incorrect. Reessayer le mot de passe : ");
                        password=lire.nextLine();
                    }
                    Reservation reservation = new Reservation(542023254, bus, etudiant, new Date(), (reservations.size() + 1));
                    reservations.add(reservation);
                    System.out.println("Bravo! la Réservation a été créée avec Success : " + reservation.toString());
                    break;
                case 2:
                    System.out.println("Liste des réservations :");
                    for (Reservation res : reservations) {
                        System.out.println(res);
                    }
                    break;
                case 3:
                    System.out.print("Entrer un Numéro du bus (ICTBUS1, ICTBUS2, ICTBUS3) : ");
                    String numeroBus = lire.nextLine();
                    System.out.println("Entrer Votre Mot de passe d'administration avant Rediger le manifeste de route : ");
                    password=lire.nextLine();
                    while(!password.equals("adminictbus")){
                        System.out.println("Mot de pass incorrect. Reessayer le mot de passe : ");
                        password=lire.nextLine();
                    }
                    System.out.print("Entrer les Noms des Etudiants ayant Souscrits a la reservation (séparés par des virgules) : ");
                    String nomsEtudiants = lire.nextLine();
                    List<String> etudiantsm = Arrays.asList(nomsEtudiants.split(","));
                    manifestes.put(numeroBus, etudiantsm);
                    System.out.println("Bravo! le Manifeste a été Rediger avec succes pour le bus " + numeroBus);
                    break;
                case 4:
                    System.out.print("Entrer le Numéro du bus (ICTBUS1, ICTBUS2, ICTBUS3) : ");
                    String busRecherche = lire.nextLine();
                    System.out.println("Entrer Votre Mot de passe d'administration avant d'afficher les manifestes : ");
                    password=lire.nextLine();
                    while(!password.equals("adminictbus")){
                        System.out.println("Mot de pass incorrect. Reessayer le mot de passe : ");
                        password=lire.nextLine();
                    }
                    List<String> manifeste = manifestes.get(busRecherche);
                    if (manifeste != null) {
                        System.out.println("Manifeste pour le bus " + busRecherche + " :");
                        for (String passager : manifeste) {
                            System.out.println(passager);
                        }
                    } else {
                        System.out.println("Aucun manifeste trouvé pour le bus " + busRecherche);
                    }
                    break;
                case 5:
                    System.out.print("Entrer le Nom du chauffeur : ");
                    String nomChauffeur = lire.nextLine();
                    System.out.print("Entrer son Numéro de permis : ");
                    String numeroPermis = lire.nextLine();
                    System.out.print("Entrer son Numéro de telephone : ");
                    int tel = lire.nextInt();
                    chauffeur = new Chauffeur(nomChauffeur, numeroPermis, tel);
                    chauffeurs.add(chauffeur);
                    System.out.println("Chauffeur créé : " + chauffeur);
                    break;

                case 6:
                    System.out.println("La Liste des chauffeurs :");
                    for (Chauffeur ch : chauffeurs) {
                        System.out.println(ch);
                    }
                    break;
                case 7:
                    System.out.print("Entrer le Numéro du bus (ICTBUS1, ICTBUS2, ICTBUS3, ...) : ");
                    numeroBus = lire.nextLine();
                    System.out.print("Capacité du bus : ");
                    int capacite = lire.nextInt();
                    System.out.println("Entrer le model de Bus (ETAGE, Simple, Boite) : ");
                    String model=lire.nextLine();
                    System.out.println("Entrer le nom du chauffeur : ");
                    String nomchau=lire.nextLine();
                    bus = new Bus(numeroBus, capacite, model, chauffeur);
                    buss.add(bus);
                    System.out.println("Bus ajouté : " + bus.toString());
                    break;
                case 8:
                    System.out.println("Liste des bus :");
                    for (Bus b : buss) {
                        System.out.println(b);
                    }
                    break;
                case 9:
                    System.out.print("Entrer le Numéro du bus : ");
                    numeroBus = lire.nextLine();
                    System.out.print("Description de la panne : ");
                    String descriptionPanne = lire.nextLine();
                    Panne panne = new Panne("P-SDGE448F","Panne Bus ICT", new Date(), descriptionPanne);
                    pannes.add(panne);
                    for (Bus b : buss) {
                        if(b.estDisponible()){
                            b.rendreIndispo();
                        }
                    }
                    System.out.println("Panne signalée : " + panne);
                    break;
                case 10:
                    System.out.println("Liste des pannes :");
                    for (Panne pan : pannes) {
                        System.out.println(pan);
                    }
                    break;
                case 11:
                    System.out.print("ID de la réparation à terminer : ");
                    String idReparation = lire.nextLine();
                    for (Reparation rep : reparations) {
                        if (rep.getId().equals(idReparation)) {
                            rep.isResolue();
                            System.out.println("Réparation " + idReparation + " terminée.");
                            break;
                        }
                    }
                    break;
                case 12:
                    System.out.println("Liste des réparations :");
                    for (Reparation rep : reparations) {
                        System.out.println(rep);
                    }
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Votre Choix est invalide. Veuillez choisir à nouveau.....");
                    break;
            }

        } while (choix != 0);

        lire.close();
    }
}
