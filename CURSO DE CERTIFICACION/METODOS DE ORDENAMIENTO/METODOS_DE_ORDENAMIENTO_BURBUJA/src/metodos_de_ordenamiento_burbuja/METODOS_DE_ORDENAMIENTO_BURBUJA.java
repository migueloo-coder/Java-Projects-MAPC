
package metodos_de_ordenamiento_burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class METODOS_DE_ORDENAMIENTO_BURBUJA {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[],nElementos,aux;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos que va a contener el arreglo: "));
        arreglo=new int[nElementos];
        for (int i=0;i<nElementos;i++){         //impresion y llenado del arreglo
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        for (int i=0;(i<nElementos-1);i++){
            for(int j=0;(j<nElementos-1);j++){
                if (arreglo[j]>arreglo[j+1]){     //ordenamiento
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        System.out.println("\nArreglo ordenado de forma creciente ");
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("\nArreglo ordenado de forma decreciente ");
        for (int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" - ");
        }
    }
    
}
