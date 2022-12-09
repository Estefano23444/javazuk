import java.util.LinkedList;
import java.util.List;

public class GeneradorDePalabras {
    private static void generador(String origen, String tempo, List<String> salida) {
        String tmp = new String(tempo), org = "";
        if (origen.length() == 0) {
            salida.add(tmp);
            return;
        }
        for (int i = 0; i < origen.length(); i++) {
            tmp = tempo.concat(origen.substring(i, i + 1));
            org = origen.substring(0, i);
            if (i < (origen.length() + 1))
            org = org.concat(origen.substring(i + 1,
            origen.length()));
            generador(org, tmp, salida);
        }
    }
    public static void main(String[] args) {
        List<String> salida = new LinkedList<>();
        generador("abcd", new String(), salida);
        for (int i = 0; i < salida.size(); i++)
        System.out.println((String) salida.get(i));
        System.out.println(salida.size() + " palabras");
    }
}