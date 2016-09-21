package mx.edu.utng.factory2;

/**
 * Created by Juárez on 13/09/2016.
 */
public class FiguraFactory {
    private Figura figura;

    public Figura crearFigura(String tipo){
        if(tipo!=null){
            if(tipo.equalsIgnoreCase("audi")){
                figura = new Audi();
            //}else if(tipo.equalsIgnoreCase("volkswagen")){
             //   figura = new Volkswagen();
            }else {
                return null;
            }
        }
        return figura;
    }
}

