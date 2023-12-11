
package gamyyy;

public class Jatek {

   
    public static void main(String[] args) {
        Karakter k1 = new Karakter("Leiahercegnő");
        Karakter k2 = new Karakter("ZoéTünde");
        Targy t1 = new Targy("kulacs", "harcifegyver");
         Targy t2 = new Targy("kinderjoy", "étel");
         Karakter[] kk = {k1, k2};
          Targy[] tt = {t1, t2};
        kiirTomb("Karakterek :",kk);
        kiirTomb("Felszedhető tárgyak", tt);
        k1.felvesz(t1);
        k2.felvesz(t2, 3);
        kiirTomb("Karakterek felszerelésekkel:",kk);
        k2.hasznal("kinderjoy");
        kiirTomb("Karakterek felszerelésekkel:",kk);
    }

     private static <T> void kiirTomb(String cim, T[] tomb) {
        System.out.println(cim);
        for (T elem : tomb) {
            System.out.println(elem);
        }
    }
    
}
