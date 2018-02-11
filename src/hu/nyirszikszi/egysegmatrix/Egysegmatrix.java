// Írj programot, amely egy 5x5-ös egységmátrixot hoz létre. Az egységmátrixban a főátlóbeli elemek 1-et, míg az ezen
// kívüli elemek 0-t tartalmazzanak.

package hu.nyirszikszi.egysegmatrix;

public class Egysegmatrix {
    private int egysegmatrix[][];

    public Egysegmatrix() {
        egysegmatrix = new int[5][5];

        for (int i = 0; i < egysegmatrix.length; i++) {
            for (int j = 0; j < egysegmatrix.length; j++) {
                /*if (i == j) {
                    egysegmatrix[i][j] = 1;
                }
                else {
                    egysegmatrix[i][j] = 0;
                }*/

                egysegmatrix[i][j] = (i == j) ? 1 : 0;
                System.out.print(egysegmatrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}