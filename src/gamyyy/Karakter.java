package gamyyy;

import java.util.ArrayList;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles;
    String nev;

    public Karakter(String nev) {
        this.nev = nev;
        this.eletero = (kockadobas() + kockadobas()) + 12;
        this.ugyesseg = kockadobas() + 6;
        this.szerencse = kockadobas() + 6;
        this.felszereles = new ArrayList<Targy>();

        //  this.felszereles = felszereles;
    }

    private int kockadobas() {
        int kocka = (int) (Math.random() * 6 - 1 + 1) + 1;
        return kocka;
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszereles=" + felszereles + ", nev=" + nev + '}';
    }

    public ArrayList<Targy> felvesz(Targy t) {
        felszereles.add(t);
        return felszereles;
    }

    public ArrayList<Targy> felvesz(Targy t, int db) {
        for (int i = 0; i < db; i++) {
            felszereles.add(t);
        }

        return felszereles;
    }

    public void hasznal(String nev) {
        int i = 0, N = felszereles.size();
        while (i < N && !(felszereles.get(i).getNev().equals(nev))) {
            i++;
        }
        if (i < N) {
            felszereles.remove(i);
        } else {
            System.out.println("A keresett tárgy nem használható!!!");
        }
    }

    public void hasznal(String nev, int db) {
        for (int i = 0; i < db; i++) {
            hasznal(nev);
        }
    }
    public void hasznal(String nev, int db, boolean levonjae){
      if(levonjae == true){
          hasznal(nev, db);
      }
      else{
          System.out.println("Nem rendelkezel ennyi tárggyal!!");
      }
    }

}
