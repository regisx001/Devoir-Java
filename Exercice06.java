class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println("Point (" + x + ", " + y + ")");
    }
}

public class Exercice06 {
    public static void main(String[] args) {
        Point[][] matrice = new Point[2][];
        matrice[0] = new Point[2];
        matrice[1] = new Point[3];

        Point p1 = new Point(10, 1);
        Point p2 = new Point(31, 4);
        Point p3 = new Point(15, 5);
        Point p4 = new Point(7, 1);
        Point p5 = new Point(0, 2);

        matrice[0][0] = p1;
        matrice[0][1] = p2;
        matrice[1][0] = p3;
        matrice[1][1] = p4;
        matrice[1][2] = p5;

        System.out.println("Affichage des points dans la matrice :");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] != null) {
                    System.out.print("Matrice[" + i + "][" + j + "] : ");
                    matrice[i][j].afficher();
                }
            }
        }
    }
}
