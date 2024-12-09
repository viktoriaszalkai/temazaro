package hu.szamalk.JatekProgram;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private Babu [][] tabla ;
    private int [] sorrend;
    protected int babuDb;


    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        if(babuDb >= 2 && babuDb <= 15) {
            this.babuDb = babuDb;
        }
        this.tabla = new Babu[4][5];
        this.sorrend = new int[10];
    }

    public boolean van8FelettEro(){
        return true;
    }

    public void kezd(){
        System.out.println("Kezdés");
    }
    public void ment(){
        System.out.println("Mentés");
    }
    public void vege(){
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "babuDb=" + babuDb ;
    }
}
