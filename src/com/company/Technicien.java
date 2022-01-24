package com.company;

public class Technicien extends Employee{
    private int numDeSecuriteSociale;

    public Technicien(int id, String nom, double salaireJournalier, Technologie[] technologies, int numDeSecuriteSociale) {
        super(id, nom, salaireJournalier, technologies);
        this.numDeSecuriteSociale = numDeSecuriteSociale;
    }
}
