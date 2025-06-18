package com.example.tp_file_attente_db.model;



public class Client {

    private int id;
    private String nom;


    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Client() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
