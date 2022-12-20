package pkUniversidad;
import java.util.Scanner;
public class Arbolito {
    public void Arbolito() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();

        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }

            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int base = 1; base <= numFilas+(numFilas-1); base++)
            if (base == numFilas-1 || base == numFilas+1) {
                System.out.print("|");
            } else {
                if (base == numFilas) {
                    System.out.print(" ");
                } else {
                    System.out.print("_");
                }
            }
        System.out.println();
    }
}
