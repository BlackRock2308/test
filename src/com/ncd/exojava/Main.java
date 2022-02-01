package com.ncd.exojava;

import com.ncd.exojava.model.Rectangle;
import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {

        Rectangle monRectangle = new Rectangle(10,7);

       double resultat = monRectangle.TrouverHypothenuse(monRectangle);

       System.out.println("L'hypothénuse est :" + resultat);


       double monCosinus = monRectangle.TrouverCosinus(monRectangle);

        System.out.println("L'Le cosinus de l'angle qui a comme coté opposé base" + monRectangle.getBase() +"et comme coté adjacent" + monRectangle.getHauteur() + "est" + ":" + monCosinus);

        double monSinus = monRectangle.TrouverSinus(monRectangle);

        System.out.println("L'Le sinus de l'angle qui a comme coté opposé base" + monRectangle.getBase() +"et comme coté adjacent" + monRectangle.getHauteur() + "est" + ":" + monSinus);
    }




}
