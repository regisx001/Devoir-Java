
public class Exercice02 {

    public static void main(String[] args) {
        int somme = 0;
        System.out.println("Calculons la somme de 1 vers 10 avec boucle for  :");

        for (int i = 0; i <= 10; i++) {
            somme += i;
        }

        System.out.println("Somme  : " + somme);
        System.out.println("-------------------------------------------------------");
        System.out.println("Calculons la somme de 1 vers 10 avec boucle do while  :");
        somme = 0;
        int i = 0;
        do {
            somme += i;
            i++;
        } while (i <= 10);

        System.out.println("Somme  : " + somme);
        System.out.println("-------------------------------------------------------");
        System.out.println("Calculons la somme de 1 vers 10 avec boucle  while  :");
        somme = 0;
        i = 0;

        while (i <= 10) {
            somme += i;
            i++;
        }
        System.out.println("Somme  : " + somme);

    }
}
