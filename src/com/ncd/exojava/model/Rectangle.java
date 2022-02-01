package com.ncd.exojava.model;

public class Rectangle {
    private double base;
    private double hauteur;

    public Rectangle(double base, double hauteur){
        this.base = base;
        this.hauteur = hauteur;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double TrouverHypothenuse(Rectangle rectangle){
        return Math.sqrt((base * base) + (hauteur * hauteur));
    }

    public double TrouverSinus(Rectangle rectangle){
        double hypoth = TrouverHypothenuse(rectangle);
        return (base / hypoth);
    }

    public double TrouverCosinus(Rectangle rectangle){
        double hypoth = TrouverHypothenuse(rectangle);
        return (hauteur / hypoth);
    }

    public double TrouverTangente(Rectangle rectangle){
        double hypoth = TrouverHypothenuse(rectangle);
        return (base / hauteur);
    }


}


