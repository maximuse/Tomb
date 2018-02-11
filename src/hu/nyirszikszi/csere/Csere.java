// Készíts programot, amely egy 20 elemű tömböt feltölt "a" karakterekkel, majd a tömb minden 2. elemét kicseréli "b"
// karakterre, majd kiírja egymásmellé az elemeket szóközzel elválasztva!

package hu.nyirszikszi.csere;

public class Csere {
    private char karakterek[];

    public Csere(int hossz, char mivel, char mit, char mire) {
        this.karakterek = new char[hossz];

        feltolt(karakterek, mivel);
        kiir(karakterek);
        lecserel(karakterek, mit, mire);
        kiir(karakterek);
    }

    private char[] feltolt(char[] tomb, char mivel) {
        for (int i = 0; i < karakterek.length; i++) {
            karakterek[i] = mivel;
        }

        return tomb;
    }

    private char[] kiir(char[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println();

        return tomb;
    }

    private char[] lecserel(char[] tomb, char mit, char mire) {
        for (int i = 0; i < tomb.length; i++) {
            if (i % 2 != 0) {
                //tomb[i] = tomb[i].replace(mit, mire);
                tomb[i] = mire;
            }
        }

        return tomb;
    }
}