
import java.util.Scanner;

public class Exercice04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'étudiants dans la classe : ");
        int nombreEtudiants = scanner.nextInt();

        double[] notesEtudiant = new double[nombreEtudiants];

        System.out.println("Entrez les notes des étudiants :");
        double somme = 0;
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("Note de l'étudiant " + (i + 1) + " : ");
            notesEtudiant[i] = scanner.nextDouble();
            somme += notesEtudiant[i];
        }

        double moyenne = somme / nombreEtudiants;
        System.out.println("La moyenne de la classe est : " + moyenne);

        int countAuDessus = 0;
        for (int i = 0; i < nombreEtudiants; i++) {
            if (notesEtudiant[i] > moyenne) {
                countAuDessus++;
            }
        }

        System.out.println("Nombre d'étudiants ayant une note supérieure à la moyenne : " + countAuDessus);
    }
}
