package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Tábla t1 = new Tábla('#');
        System.out.println("4. feladat: Az üres tábla:");
        t1.megjelenit();
        System.out.println("6. feladat: Az feltöltött tábla:");
        t1.elhelyez(8);
        t1.megjelenit();
    }
}