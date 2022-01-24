package com.company;




public class Employee {
    private int id;
    private String nom;
    private double salaireJournalier;
    private Technologie[] technologies = new Technologie[6];
    private static int totalNumberOfEmployees = 0;

    public Employee(int id, String nom, double salaireJournalier, Technologie[] technologies) {
        this.id = ++totalNumberOfEmployees;
        this.nom = nom;
        this.salaireJournalier = salaireJournalier;
        this.technologies = technologies;
    }

    public Employee() {
        this.id = ++totalNumberOfEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaireJournalier() {
        return salaireJournalier;
    }

    public void setSalaireJournalier(double salaireJournalier) {
        this.salaireJournalier = salaireJournalier;
    }

    public Technologie[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Technologie[] technologies) {
        this.technologies = technologies;
    }

    public static int getTotalNumberOfEmployees() {
        return totalNumberOfEmployees;
    }

    public static void setTotalNumberOfEmployees(int totalNumberOfEmployees) {
        Employee.totalNumberOfEmployees = totalNumberOfEmployees;
    }
}
