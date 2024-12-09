package hu.szamalk;

import java.util.Arrays;

public class Tábla {
    private Character ÜresCella;
    private Character [][] T;
    private int uresOszlopokSzama, uresSorokSzama;

    public Tábla(Character üresCella) {
        this.ÜresCella = üresCella;
        T = new Character[8][8];
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = ÜresCella;
            }
        }
    }
    public void elhelyez(){

    }
    public void fajlbair(){

    }
    public void megjelenit(){
        for( int i = 0; i < T.length; i++ )
        {
            for( int j = 0; j <T[i].length; j++ )
            {
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }
    }



}
