package hu.nyirszikszi;

import hu.nyirszikszi.csere.Csere;
import hu.nyirszikszi.matrix.Matrix;
import hu.nyirszikszi.egysegmatrix.Egysegmatrix;

public class Main {

    public static void main(String[] args) {
        Csere cs = new Csere(20, 'a', 'a', 'b');
        System.out.println();
        Matrix m = new Matrix();
        System.out.println();
        Egysegmatrix em = new Egysegmatrix();
    }
}