package hu.szamalk;

public class Tábla {
    private Character ÜresCella;
    private Character [][] T;
    private int uresOszlopokSzama, uresSorokSzama;

    public Tábla(Character üresCella, Character[][] t) {
        this.ÜresCella = üresCella;
        T = new Character[8][8];
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = ÜresCella;
            }
        }
    }

}
