
package gamyyy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        kiirTomb("Karakterek felszerelések használatával:     :",kk);
        k2.hasznal("kinderjoy",2);
        kiirTomb("Karakterek felszerelések használatával számmal megadva:     :",kk);
        k2.hasznal("kinderjoy",2);
        kiirTomb("Karakterek felszerelések használatával számmal megadva:     :",kk);
             try(ObjectOutputStream objKi= new ObjectOutputStream(new FileOutputStream("karakterek.bin"))){
            /* bármilyen, és bármennyi object kiírható 
               most 1 db Karakter[] kerül kiírása bináris formában
            */
            //objKi.writeObject(harcos);
            //objKi.writeObject(varazslo);
            objKi.writeObject(kk);
            
            /* ha try resources, akkor nem kell close, 
            mert a try-ból való kilépéskor automatikusan meghívja az 
            AutoCloseable interface által biztosított close metódust
            */
            //objKi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

     private static <T> void kiirTomb(String cim, T[] tomb) {
        System.out.println(cim);
        for (T elem : tomb) {
            System.out.println(elem);
        }
     
     }
}
