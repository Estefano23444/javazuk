/**
 * @Estefano23444
 * @Fecha: 06/DEC/2022
 */
import java.util.Scanner;
public class Juego {
    static char[] O={'O','L','C','U'};
    static char[] E={'~','~','~','~'};
    /**
     * @param Args
     * @throws Exception
     */
    public static void main(String[] Args) throws Exception {
        while(estadoGanador()==false){
            mostrarLados();
            movimientos();
            if(estadoPerdedor()==true){
                System.out.print("Has perdido!");
                System.exit(0);
            }
        }
        System.out.print("\n Has ganado! :D");
    }
/**
 * @throws Exception
 */
    public static void mostrarLados() throws Exception {
        System.out.print("\n O={ ");
        for(int i=0; i<=3; i++){
            System.out.print(O[i]+" ");
        }
        System.out.print("}\t");
        System.out.print("E={ ");
        for(int i=0; i<=3; i++){
            System.out.print(E[i]+" ");
        }
        System.out.print("} \n");
    }
/**
 * @throws Exception
 */
//MOVIMIENTOS DEL LOBO
    public static void lOE() throws Exception {
        if(O[0]=='O'&&O[1]=='L'){
            E[0]='O';
            E[1]='L';
            O[0]='n';
            O[1]='n';
        }
        else 
            System.out.print("No es posible este movimiento \n");
    }
/**
 * @throws Exception
 */
    public static void lEO() throws Exception {
        if(E[0]=='O'&&E[1]=='L'){
            O[0]='O';
            O[1]='L';
            E[0]='n';
            E[1]='n';
        }
        else 
            System.out.print("No es posible este movimiento! \n");
    }
//MOVIMEINTOS DE CAPERUCITA
    /**
 * @throws Exception
 */
    public static void cOE() throws Exception {
        if(O[0]=='O'&&O[2]=='C'){
            E[0]='O';
            E[2]='C';
            O[0]='n';
            O[2]='n';
        }
        else 
            System.out.print("No es posible este movimiento \n");
    }  
/**
 * @throws Exception
 */
    public static void cEO() throws Exception {
        if(E[0]=='O'&&E[2]=='C'){
            O[0]='O';
            O[2]='C';
            E[0]='n';
            E[2]='n';
        }
        else 
            System.out.print("No es posible este movimiento \n");
    }
// MOVIMIENTO DE LAS UVAS
    /**
 * @throws Exception
 */
    public static void uOE() throws Exception {
        if(O[0]=='O'&&O[3]=='U'){
            E[0]='O';
            E[3]='U';
            O[0]='n';
            O[3]='n';
        }
        else 
            System.out.print("No es posible este movimiento \n");
    }
/**
 * @throws Exception
 */
    public static void uEO() throws Exception {
        if(E[0]=='O'&&E[3]=='U'){
            O[0]='O';
            O[3]='U';
            E[0]='n';
            E[3]='n';
        }
        else 
            System.out.print("No es posible este movimiento \n");
    }
//MOVIMIENTO DEL OBSERVADOR
    /**
 * @throws Exception
 */
    public static void oOE() throws Exception {
        if(O[0]=='O'){
            E[0]='O';
            O[0]='n';
        }
        else 
            System.out.print("No es posible este movimiento \n");
    }
/**
 * @throws Exception
 */
    public static void oEO() throws Exception {
        if(E[0]=='O'){
            O[0]='O';
            E[0]='n';
        }
        else 
            System.out.print("No es posible este movimiento \n");
    }
// MOVIMIENTOS
    /**
 * @throws Exception
 */
    public static void movimientos() throws Exception {
        System.out.print("\n1. Lobo Este   2. Caperuza Este    \n3. Uvas Este   4. Observador Este \n5. Lobo Oeste  6. Caperuza Oeste   \n7. Uvas Oeste  8. Observador Oeste \n");
        int input;
        Scanner in = new Scanner(System.in);
            input=in.nextInt();
            switch (input){
                case 1: lOE(); break;
                case 2: cOE(); break;
                case 3: uOE(); break;
                case 4: oOE(); break;
                case 5: lEO(); break;
                case 6: cEO(); break;
                case 7: uEO(); break;
                case 8: oEO(); break;
            }
    }
// DEFINICION DE ESTADOS
/**
 * @return
 * @throws Exception
 */
    public static boolean estadoGanador() throws Exception {
        if((E[1]=='L'&&E[2]=='C'&&E[3]=='U'))
            return true;
        return false;
    }
/**
 * @return
 * @throws Exception
 */
    public static boolean estadoPerdedor() throws Exception {
        if((E[0]!='O'&&E[1]=='L'&&E[2]=='C')||(O[0]!='O'&&O[1]=='L'&&O[2]=='C')||(E[0]!='O'&&E[2]=='C'&&E[3]=='U')||
        (O[0]!='O'&&O[2]=='C'&&O[3]=='U'))
            return true;
        return false;
    }
}