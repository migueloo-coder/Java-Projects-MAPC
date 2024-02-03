package matriz_eje_1;
//saber si una matriz es simetrica o no 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MATRIZ_EJE_1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int matriz[][],nfilas,ncol;
        boolean simetrica=true;
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
        
        //saber si es simetrica o no 
        if (nfilas==ncol){
           int i,j;
           i=0;
           while (i<nfilas && simetrica==true){
               j=0;
               while (j<i && simetrica==true){
                   if (matriz[i][j]!=matriz[j][i]){
                       simetrica=false;
                     }
                   j++;
                 }
               i++;
            }
           if (simetrica==true){
               JOptionPane.showMessageDialog(null, "la matriz es simetrica");
           }
           else {
               JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
           }    
        }
        else{
            JOptionPane.showMessageDialog(null ,"la matriz no es simetrica");
        }
    }
    
}
