## PACKAGE GUI DE RESERVATION DE BUS ICT
## Caracteristiques et Explications de mes classes du Package GUI

* MainGUI:<br>
Point d'entrée de l'application GUI.
Initialise la fenêtre principale et démarre l'application.

* ReservationBusEtudiantApp :<br>
Gère l'interface graphique principale de l'application.
Contient la barre de menu et les éléments pour la navigation.

* LoginFrame <br>
Fenêtre de connexion pour les étudiants et les administrateurs.
Permet aux utilisateurs de se connecter en tant qu'étudiant ou administrateur.

* EtudiantMainFrame :<br>
Fenêtre principale pour les étudiants.
Affiche les options pour effectuer une nouvelle réservation, afficher les réservations existantes, etc.

* AdminMainFrame :<br>
Fenêtre principale pour les administrateurs.
Affiche les options de gestion des bus, chauffeurs et trajets.

* NouvelleReservationFrame :<br>
Fenêtre pour effectuer une nouvelle réservation.
Permet à l'étudiant de sélectionner le bus, la date de départ et le numéro de siège.

* MesReservationsFrame :<br>
Fenêtre affichant les réservations existantes de l'étudiant connecté.
Permet à l'étudiant de voir ses réservations et d'en annuler si nécessaire.

* GestionBusFrame :<br>
Fenêtre pour la gestion des bus.
Permet aux administrateurs d'ajouter, modifier et supprimer des bus.

GestionChauffeurFrame :<br>
Fenêtre pour la gestion des chauffeurs.
Permet aux administrateurs d'ajouter, modifier et supprimer des chauffeurs.

GestionTrajetFrame :<br>
Fenêtre pour la gestion des trajets.
Permet aux administrateurs d'ajouter, modifier et supprimer des trajets.

DetailsReservationFrame :
Fenêtre affichant les détails complets d'une réservation spécifique lorsque l'utilisateur clique sur une réservation.

MessageDialog :<br>
Classe utilitaire pour afficher des boîtes de dialogue de message.

DateUtils :<br>
Classe utilitaire contenant des méthodes pour manipuler les dates.