package com.codeurzebs.busreservationjavafx.model.bus;

import java.util.Date;

public class Reparation extends Panne {
    private String descriptionResolution;
    public Reparation(){
        super();
    }
    public Reparation(String id,String nom, Date date, String description, String descriptionResolution) {
        super(id, nom, date, description);
        this.descriptionResolution = descriptionResolution;
    }
    public String getDescriptionR() {
        return descriptionResolution;
    }
    @Override
    public String toString() {
        return "ReparationDuBus{" + "id='" + getId() + '\'' + ", date=" + getDate() + ", description panne='" + getDescription() + " Description de la resolution : " + getDescriptionR() + '\'' + ", terminee=" + isResolue() + '}';
    }
    public static void main(String[] args) {
        Reparation reparation = new Reparation("ICTU20230458", "BUSZEHF",  new Date(), "Réparation du moteur","achat d'une nouvelle piece moteur");
        System.out.println(reparation);

        reparation.isResolue();
        System.out.println("La réparation a été terminée : " + reparation.isResolue());
    }
}

