package hu.szamalk;

import hu.szamalk.JatekProgram.LogikaiJatek;

public class Program {
    public static void main(String[] args) {

        //f1
        Tábla t1 = new Tábla('#');
        System.out.println("4. feladat: Az üres tábla:");
        t1.megjelenit();
        System.out.println("6. feladat: Az feltöltött tábla:");
        t1.elhelyez(8);
        t1.megjelenit();
        System.out.println("Az első sor üres?");
        System.out.println(t1.uresSor(0));
        System.out.println("Az utolsó sor üres?");
        System.out.println(t1.uresSor(7));

        System.out.println("Az első oszlop üres?");
        System.out.println(t1.uresOszlop(0));
        System.out.println("Az utolsó oszlop üres?");
        System.out.println(t1.uresOszlop(7));

        System.out.println("9.feladat:Üres oszlopok és sorok száma:\nOszlopok:"+t1.uresOszlopokSzama()+"\nSorok: "+t1.uresSorokSzama());

        //t1.fajlbair();

        //f2
        LogikaiJatek j1 = new LogikaiJatek();
        j1.kezd();
        j1.ment();
        j1.vege();
        System.out.println(j1.toString());
        LogikaiJatek j2 = new LogikaiJatek(10);

    }
}