package pkHerencia;

public class Padre {
    //Propiedades
    private String nombre;
    private String ocupacion;
    private String sexo;
    private int Edad;

    //Constructor
    public Padre(){
        nombre      = "Pepe";
        ocupacion   = "Progrmador";
        sexo        = "M";
        Edad        = 20;
    }

    //Constructor con sobrecarga
    public Padre(String nombre){
        this.nombre      = nombre;
        this.ocupacion   = "Progrmador";
        this.sexo        = "M";
        this.Edad        = 20;
    }

    public Padre(String nombre, String ocupacion, String sexo, int Edad){
        this.nombre      = nombre;
        this.ocupacion   = ocupacion;
        this.sexo        = sexo;
        this.Edad        = Edad;
    }

    //Metodos
    public void presentarse() {
        System.out.println(" ---------------------");
        System.out.println("Yo me llamo:"+ nombre);
        System.out.println("Trabajo como:"+ ocupacion);
        System.out.println("Me identifico como:"+ sexo);
        System.out.println("Tengo "+ Edad + " anos");
    }
}
