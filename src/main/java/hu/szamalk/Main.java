package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Tábla t1 = new Tábla('*');
        t1.megjelenit();
        System.out.println("-----------");
        t1.elhelyez(6);
        t1.megjelenit();
    }
}