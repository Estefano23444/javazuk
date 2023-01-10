import pkHerencia.Hijo;
import pkHerencia.Padre;

public class Herencia{
    public static void main(String[] args) {
        Padre p1 = new Padre();
        Padre p2 = new Padre("Jose");
        Padre p3 = new Padre("Jorge", "Contructor", "M", 20);
        
        Hijo h3 = new Hijo("Jorge", "Contructor", "M", 20);
        Hijo h1 = new Hijo("ANA");
        h1.presentarse();
        // p1.presentarse();
        // p2.presentarse();
        // p3.presentarse();
    }
}