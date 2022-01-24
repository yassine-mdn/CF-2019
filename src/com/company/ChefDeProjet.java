package com.company;

import java.util.ArrayList;

public class ChefDeProjet extends Employee{
    private String email;
    private String login;
    private String passWord;

    public ChefDeProjet(int id, String nom, double salaireJournalier, Technologie[] technologies, String email, String login, String passWord) {
        super(id, nom, salaireJournalier, technologies);
        this.email = email;
        this.login = login;
        this.passWord = passWord;
    }
}
