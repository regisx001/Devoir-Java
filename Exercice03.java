
import java.util.Scanner;

public class Exercice03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nomClients = new String[10];
        double[] soldeClients = new double[10];
        int compteCree = 0;
        while (true) {
            System.err.println("---------------------------------------------");
            System.out.println("1. Créer un compte bancaire");
            System.out.println("2. Faire un versement");
            System.out.println("3. Faire un débit");
            System.out.println("4. Afficher l'état d'un compte");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    if (compteCree < 10) {
                        System.out.printf("Entrez le nom du client : ");
                        nomClients[compteCree] = scanner.nextLine();
                        nomClients[compteCree] = scanner.nextLine();
                        System.out.println("Entrez le solde initial (en DH) : ");
                        soldeClients[compteCree] = scanner.nextDouble();
                        compteCree++;
                        System.out.println("Compte créé avec succès !");
                    } else {
                        System.out.println("Nombre Maximale des compte !!!.");
                    }
                    break;
                case 2:
                    System.out.printf("Entrez le numéro du compte  : ");
                    int compteVerser = scanner.nextInt();
                    if (compteVerser >= 0 && compteVerser <= compteCree) {
                        System.out.printf("Entrez le montant à verser : ");
                        double montant = scanner.nextDouble();
                        soldeClients[compteVerser] += montant;
                        System.out.println("Versement effectué avec succès !");
                    }
                    break;
                case 3:
                    System.out.printf("Entrez le numéro du compte  : ");
                    int compteDebiter = scanner.nextInt();
                    if (compteDebiter >= 0 && compteDebiter <= compteCree) {
                        System.out.printf("Entrez le montant à debiter : ");
                        double montant = scanner.nextDouble();
                        soldeClients[compteDebiter] -= montant;
                        System.out.println("Debit effectué avec succès !");
                    }
                    break;
                case 4:
                    System.out.printf("Entrez le numéro du compte  : ");
                    int etatCompte = scanner.nextInt();
                    if (etatCompte >= 0 && etatCompte <= compteCree) {
                        System.out.println("Nom Utilisateur " + nomClients[etatCompte]);
                        System.out.println("Solde Utilisateur " + soldeClients[etatCompte]);
                    }
                    break;
                case 5:
                    break;

            }

        }

    }
}
