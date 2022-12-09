/**
 * @Estefano23444
 * @author estefano proaño
 */

import java.util.Scanner; //Libreria para scanear
public class Practica {
    public static void main(String[] args)throws Exception {
        //Declaraciion de la variable e inicializadas
        //calcularAreaRec();
        //HacerCuadrado();
        //HacerC();
    }

    private static void HacerC() {
        int nroTerminos=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nro. terminos:");
        nroTerminos = sc.nextInt();
        
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print((i%2==0)?"+ ":"- ");
        } 
        
        System.out.println();
        for (int i = 0; i < nroTerminos; i++) {
            System.out.println((i%2==0)?"+ ":"- ");
        }

        for (int i = 0; i < nroTerminos; i++) {
            System.out.print((i%2==0)?"+ ":"- ");
        } 
        System.out.println("");
        sc.close();
    }

    private static void HacerCuadrado() {
        int nroTerminos=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nro. terminos:");
        nroTerminos = sc.nextInt();
        
        for (int i = 0; i < nroTerminos; i++) {
            if (i == 0 || i == nroTerminos-1) {
                for (int j = 0; j < nroTerminos; j++) {
                    System.out.print((i%2 == 0)? ((j%2 == 0)? "+ " : "- ") : ((j%2 == 0)? "- " : "+ "));
                }
            } else {
                for (int j = 0; j < nroTerminos; j++) {
                    if (j == 0 || j == nroTerminos-1) {
                        System.out.print((i%2 == 0)? ((j%2 == 0)? "+ " : "- ") : ((j%2 == 0)? "- " : "+ "));
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.print("\n");
        sc.close();
        }
    }

    private static void calcularAreaRec() {
        int longitud=0, ancho =0, areaRect=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud:");
        longitud = sc.nextInt();

        System.out.print("Ingrese el ancho:");
        ancho = sc.nextInt();

        areaRect = ancho *longitud;

        System.out.println("El area es: " + areaRect);
        sc.close();
    }
}
