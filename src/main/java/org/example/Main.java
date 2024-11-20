package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Appeler la méthode add de la classe Addition
        int result = Addition.add(5, 10);

        // Afficher le résultat
        System.out.println("La somme de 5 et 10 est : " + result);

        int resultat = Produit.multiplier(7, 8);

        // Afficher le résultat
        System.out.println("Le produit de 7 et 8 est : " + resultat);
    }
}