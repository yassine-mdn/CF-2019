package com.company;

import java.util.Scanner;

public class Produit {
    public int idProd;
    private String designationProd;
    public double prixProd;
    public int qteProduit;


    public Produit(int idProd, String designationProd, double prixProd, int qteProduit) {
        this.idProd = idProd;
        this.designationProd = designationProd;
        this.prixProd = prixProd;
        this.qteProduit = qteProduit;
    }

    public Produit() {
    }

    public static Produit addProduit(){
        Scanner sc = new Scanner(System.in);
        int idProd = sc.nextInt();
        String designationProd = sc.nextLine();
        double prixProd = sc.nextDouble();
        int qteProduit = sc.nextInt();
        return new Produit(idProd,designationProd,prixProd,qteProduit);
    }

    public String getDesignationProd() {
        return designationProd;
    }

    public void setDesignationProd(String designationProd) {
        this.designationProd = designationProd;
    }
}
