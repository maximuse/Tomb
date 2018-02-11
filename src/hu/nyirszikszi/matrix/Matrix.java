// Készíts programot, amely feltölt 0-tól 9-ig véletlen számokkal egy 6x6-os tömböt, majd megjeleníti a tömb tartalmát!

package hu.nyirszikszi.matrix;

import java.util.Random;

public class Matrix {
    private int matrix[][];

    public Matrix() {
        this.matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = new Random().nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}