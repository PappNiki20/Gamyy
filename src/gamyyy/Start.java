
package gamyyy;

public class Start extends Helyszin{

    @Override
    public String leiras() {
        return "Ea start! haladj tovább!";
    }

    @Override
    public Helyszin egyikirany() {
        return new Kezdes();
    }

    @Override
    public String egyfelirattal() {
return "egyik irány";    }
    
}
