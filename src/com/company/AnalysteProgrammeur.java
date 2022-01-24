package com.company;

import java.util.ArrayList;

public class AnalysteProgrammeur extends Employee{
    private String email;

    public AnalysteProgrammeur(int id, String nom, double salaireJournalier, Technologie[] technologies, String email) {
        super(id, nom, salaireJournalier, technologies);
        this.email = email;
    }

    public AnalysteProgrammeur(String email) {
        this.email = email;
    }
}
