package pkHerencia;

public class Hijo extends Padre {
    //Constructor
    public Hijo(String nombreHijo){
        super(nombreHijo);
    }
    public Hijo(String nombre, String ocupacion, String sexo, int Edad ){
        super(nombre, ocupacion, sexo, Edad);
    }
}
