package matriz_eje_2;
//suma de dos matrices _ se pueden agrgar mas 
import java.util.Scanner;

public class MATRIZ_EJE_2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int matriz1[][],matriz2[][],suma[][],nfilas,ncol;
        
        matriz1=new int [3][3];
        matriz2=new int[3][3];
        suma=new int [3][3];
        System.out.println("Ingrese los datos de la matriz 1");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz [ "+i+" ] [ "+j+" ]: ");
                matriz1[i][j]=entrada.nextInt();
            }        
        }
        System.out.println("Ingrese los datos de la matriz 2");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz [ "+i+" ] [ "+j+" ]: ");
                matriz2[i][j]=entrada.nextInt();
            }        
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                suma[i][j]=matriz1[i][j]+matriz2[i][j];
            }        
        }
        System.out.println("\nLa matriz restante es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(suma[i][j]);
            }
            System.out.println("");
        }
        System.out.println();
    }
}
