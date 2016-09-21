package mx.edu.utng.singleton5;

/**
 * Created by Diego on 19/09/2016.
 */
public class Silla {
    private String material;
    private int numSillas;
    private static Silla silla;

    private Silla(){
        this.material = "";
        this.numSillas = 0;
    }


    public String getMaterial() {
        return material;
    }

    public int getNumSillas() {
        return numSillas;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumSillas(int numSillas) {
        this.numSillas = numSillas;
    }

    public static Silla getSilla(){
        if (silla==null){
            silla = new Silla();
        }
        return silla;
    }
}
