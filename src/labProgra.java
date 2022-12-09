/**
 *  @author Estefano Proaño
 */

import java.util.Scanner; //Libreria para scanear

public class labProgra {
    public static void main(String[] args) {
    //hacerEscalera();
    //Sumar();
    hacerCuadrado();
    }
    private static void hacerCuadrado() {
        int tamano=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamano:");
        tamano = sc.nextInt();
    
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || j==0 || i == tamano-1 || j==tamano-1 ) {
                    System.out.print(((j+i)%2==0)?"+":"-");
                }else{
                    System.out.print(" ");
                }
            System.out.print(" ");
            }
        System.out.println("");
        }
        sc.close();
        }
    private static void hacerEscalera() {
        int niveles=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese niveles de la escalera:");
        niveles = sc.nextInt();
    
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < i; j++) 
                System.out.print(" ");
            System.out.println("__");
        System.out.println("");
        }
        sc.close();
        }
    private static void Sumar() {
        int a = 1, b = 2, c = 0;
        float f = 1;

        c = suma (a, b);
        f = suma (a, f);
        f = suma (f, f);
        f = suma (f, a);
    }
    private static int suma(int a, int f){
        return a + f;
    }
    private static float suma(int a, float f){
        return a + f;
    }
    private static float suma(float a, float f){
        return a + f;
    }
    private static float suma(float f, int a){
        return a + f;
    }
}
