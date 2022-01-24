package com.company;

public class Technologie {
    private int id;
    private String nomTechnologie;

    public Technologie(int id, String nomTechnologie) {
        this.id = id;
        this.nomTechnologie = nomTechnologie;
    }

    @Override
    public String toString() {
        return "Technologie{" +
                "id=" + id +
                ", nomTechnologie='" + nomTechnologie + '\'' +
                '}';
    }
}
