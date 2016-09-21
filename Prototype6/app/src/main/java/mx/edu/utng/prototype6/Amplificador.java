package mx.edu.utng.prototype6;

/**
 * Created by Juárez on 19/09/2016.
 */
public class Amplificador implements Clonable{
    private String marca;
    private String color;

    public Amplificador(){
        this.marca = "";
        this.color = "";
    }

    public Amplificador(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    @Override
    public Clonable clonar() {
        Amplificador clon = new Amplificador(marca, color);
        return clon;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
