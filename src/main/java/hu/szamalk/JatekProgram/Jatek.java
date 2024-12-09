package hu.szamalk.JatekProgram;

public abstract class Jatek {
    private static int jatekDb = 0;

    public Jatek() {
        jatekDb++;
    }

    public static int getJatekDb() {
        return jatekDb;
    }
    public abstract void kezd();
    public abstract void ment();
    public abstract void vege();

    @Override
    public String toString() {
        return "Jatek{}";
    }
}
