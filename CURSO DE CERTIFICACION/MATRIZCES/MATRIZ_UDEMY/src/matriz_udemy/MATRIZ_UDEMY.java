package matriz_udemy;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MATRIZ_UDEMY {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int matriz[][],nfilas,ncol;
        nfilas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas que va poseer la matriz"));
        ncol=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas que va poseer la matriz"));
        matriz=new int [nfilas][ncol];
        JOptionPane.showMessageDialog(null, "Ingrese los datos de la matriz");
        for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncol;j++){
                System.out.print("Matriz [ "+i+" ] [ "+j+" ]: ");
                matriz[i][j]=entrada.nextInt();
            }        
        }
        System.out.println("\nLa matriz es: ");
        for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncol;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println();
    }
    
}
