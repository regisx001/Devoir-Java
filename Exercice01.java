
import java.util.Scanner;

public class Exercice01 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.printf("Entrer Le  Prix Hors Tax : ");
        double prixHt = scaner.nextDouble();

        double prixTTC = prixHt + (prixHt * 18.6 / 100);
        System.out.println("Le prix TTC: " + prixTTC);

        double prixFinal;
        if (prixTTC < 1000) {
            prixFinal = prixTTC;
        } else if (prixTTC < 2000) {
            prixFinal = prixTTC - (prixTTC * 1 / 100);
        } else if (prixTTC < 5000) {
            prixFinal = prixTTC - (prixTTC * 3 / 100);
        } else {
            prixFinal = prixTTC - (prixTTC * 5 / 100);
        }

        System.out.println("Le prix Apres la remise : " + prixFinal);

    }
}
