package com.codeurzebs.busreservationjavafx.model.bus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Panne {
    private String id;
    private String nom;
    private Date date;
    private String description;
    private boolean resolue;
    public Panne(){}
    public Panne(String id,String nom, Date date, String description) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.description = description;
        this.resolue = false;
    }
    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public boolean isResolue() {
        return resolue;
    }
    public void resoudrePanne() {
        resolue = false;
    }
    @Override
    public String toString() {
        return "PanneBus{" + "id='" + '\'' + id + " nom de la panne : " + nom + '\'' + ", date=" + date + ", description='" + description + '\'' + ", resolue=" + resolue + '}';
    }
}
