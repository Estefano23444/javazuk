import java.util.Scanner;
public class capeLobo {
    static char[] O={'O','L','C','U'};
    static char[] E={'n','n','n','n'};

    public static boolean winCheck() throws Exception {
        if((E[1]=='L'&&E[2]=='C'&&E[3]=='U'))
            return true;
        return false;
    }

    public static boolean loseCheck() throws Exception {
        if((E[0]!='O'&&E[1]=='L'&&E[2]=='C')||(O[0]!='O'&&O[1]=='L'&&O[2]=='C')||(E[0]!='O'&&E[2]=='C'&&E[3]=='U')||
        (O[0]!='O'&&O[2]=='C'&&O[3]=='U'))
            return true;
        return false;
    }

    public static void loboOE() throws Exception {
        if(O[0]=='O'&&O[1]=='L'){
            E[0]='O';
            E[1]='L';
            O[0]='n';
            O[1]='n';
        }
        else 
            System.out.print("Este movimiento no es posible! \n");
    }

    public static void loboEO() throws Exception {
        if(E[0]=='O'&&E[1]=='L'){
            O[0]='O';
            O[1]='L';
            E[0]='n';
            E[1]='n';
        }
        else 
            System.out.print("Este movimiento no es posible! \n");
    }

    public static void capeOE() throws Exception {
        if(O[0]=='O'&&O[2]=='C'){
            E[0]='O';
            E[2]='C';
            O[0]='n';
            O[2]='n';
        }
        else 
            System.out.print("Este movimiento no es posible! \n");
    }  

    public static void capeEO() throws Exception {
        if(E[0]=='O'&&E[2]=='C'){
            O[0]='O';
            O[2]='C';
            E[0]='n';
            E[2]='n';
        }
        else 
            System.out.print("Este movimiento no es posible! \n");
    }

    public static void uvaOE() throws Exception {
        if(O[0]=='O'&&O[3]=='U'){
            E[0]='O';
            E[3]='U';
            O[0]='n';
            O[3]='n';
        }
        else 
            System.out.print("Este movimiento no es posible! \n");
    }

    public static void uvaEO() throws Exception {
        if(E[0]=='O'&&E[3]=='U'){
            O[0]='O';
            O[3]='U';
            E[0]='n';
            E[3]='n';
        }
        else 
            System.out.print("Este movimiento no es posible! \n");
    }

    public static void obsOE() throws Exception {
        if(O[0]=='O'){
            E[0]='O';
            O[0]='n';
        }
        else 
            System.out.print("Este movimiento no es posible! \n");
    }

    public static void obsEO() throws Exception {
        if(E[0]=='O'){
            O[0]='O';
            E[0]='n';
        }
        else 
            System.out.print("Este movimiento no es posible! \n");
    }

    public static void move() throws Exception {
        System.out.print("1. Mover Lobo al Este \n");
        System.out.print("2. Mover Caperuza al Este\n");
        System.out.print("3. Mover Uvas al Este \n");
        System.out.print("4. Mover Observador al Este \n");
        System.out.print("5. Mover Lobo al Oeste \n");
        System.out.print("6. Mover Caperuza al Oeste \n");
        System.out.print("7. Mover Uvas al Oeste \n");
        System.out.print("8. Mover Observador al Oeste \n");
        int input;
        Scanner in = new Scanner(System.in);
            input=in.nextInt();
            switch (input){
                case 1: loboOE(); break;
                case 2: capeOE(); break;
                case 3: uvaOE(); break;
                case 4: obsOE(); break;
                case 5: loboEO(); break;
                case 6: capeEO(); break;
                case 7: uvaEO(); break;
                case 8: obsEO(); break;
            }
    }

    public static void mostrar() throws Exception {
        System.out.print("O={");
        for(int i=0; i<=3; i++){
            System.out.print(O[i]+" ");
        }
        System.out.print("} \n");
        System.out.print("E={");
        for(int i=0; i<=3; i++){
            System.out.print(E[i]+" ");
        }
        System.out.print("} \n");
    }

    public static void main(String[] Args) throws Exception {
        while(winCheck()==false){
            mostrar();
            move();
            if(loseCheck()==true){
                System.out.print("Has perdido!");
                System.exit(0);
            }
        }
        System.out.print("\n Has ganado! :D");
    }


    
}