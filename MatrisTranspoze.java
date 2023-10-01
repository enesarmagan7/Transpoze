package Week2;

import java.util.Scanner;

public class MatrisTranspoze {

    private int satır;
    private int sütun;

    public MatrisTranspoze() {

    }

    public void transpoze(int matris[][]) {
        this.satır = matris.length;
        this.sütun = matris[0].length;
        int transpoze[][] = new int[sütun][satır];
        for (int i = 0; i < transpoze.length; i++) {
            for (int k = 0; k < transpoze[i].length; k++) {
                transpoze[i][k] = matris[k][i];
            }
        }
        System.out.println("Matris: ");
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze: ");
        for (int[] satir : transpoze) {

            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MatrisTranspoze mt=new MatrisTranspoze();

        int matris[][]={{2,3,4},{4,2,5}};
        mt.transpoze(matris);

    }
}




