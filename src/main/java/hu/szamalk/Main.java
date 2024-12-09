package hu.szamalk;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("9.feladat");
    }
}