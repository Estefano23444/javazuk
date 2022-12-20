package pkUniversidad;

import java.util.Scanner;

public class Estudiante{
    public void Horario() {
        String[][] d = new String [6][7];
        d[0][0]="      ";
        d[1][0]="Lunes ";
        d[2][0]="Martes";
        d[3][0]="Mierco";
        d[4][0]="Jueves";
        d[5][0]="Vierne";
        d[0][1]="7-9   ";
        d[0][2]="9-11  ";
        d[0][3]="11-13 ";
        d[0][4]="14-16 ";
        d[0][5]="16-18 ";
        d[0][6]="18-20 ";
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int j = 7, k = 9; 
        for (int i = 0; i < d.length; i++) {
            for (int l = 0; l < d[i].length; l++) {
                if(j == 20 && k == 22){
                    j = 7;
                    k = 9;
                    n++;
                }
                System.out.println();
                switch (n) {
                    case 0: System.err.println("Lunes"); break;
                    case 1: System.err.println("Martes"); break;
                    case 2: System.err.println("Miercoles"); break;
                    case 3: System.err.println("Jueves"); break;
                    case 4: System.err.println("Viernes"); break;
                }
                System.out.println("Ingrese la actividad a realizar de "+ j + ":00 a" + k + ":00 ");
                d[i][l] = sc.nextLine();
                j = j + 2;
                k = k + 2;
                if (j == 13 && k == 15) {
                    j = 14;
                    k = 16;
                }
            }
        }
    }
}