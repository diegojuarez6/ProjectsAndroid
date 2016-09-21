package mx.edu.utng.singleton6;

/**
 * Created by Juárez on 19/09/2016.
 */
public class Foto {
    private String nombre;
    private int numFotos;
    private static Foto foto;

    private Foto(){
        this.nombre = "";
        this.numFotos = 0;
    }


    public String getNombre() {

        return nombre;
    }

    public int getNumFotos() {
        return numFotos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumFotos(int numFotos) {
        this.numFotos = numFotos;
    }

    public static Foto getFoto(){
        if (foto==null){
            foto = new Foto();
        }
        return foto;
    }
}
