package matriz_eje_3;

import java.util.Scanner;

public class MATRIZ_EJE_3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int matriz[][], aux;
        
        matriz=new int [3][3];
        
        
        System.out.println("Ingrese los datos de la matriz ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz [ "+i+" ] [ "+j+" ]: ");
                matriz[i][j]=entrada.nextInt();
            }        
        }
        System.out.println("\nLa matriz original es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }        
        }
        System.out.println("\nLa matriz transpuesta es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matriz[i][j]+" ");
            }    
            System.out.println("");
        }
        System.out.println();
    }
    
}
