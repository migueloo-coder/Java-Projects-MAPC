package metodos_de_ordenamiento_seleccion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class METODOS_DE_ORDENAMIENTO_SELECCION {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[],nElementos,min,aux;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos que va a contener el arreglo: "));
        arreglo=new int[nElementos];
        for (int i=0;i<nElementos;i++){         //impresion y llenado del arreglo
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        
        
        for (int i=0;i<nElementos;i++){
            min=i;
            for(int j=i+1;j<nElementos;j++){
                if(arreglo[j]<arreglo[min]){
                    min=j;
                }
            }
            aux=arreglo[i];
            arreglo[i]=arreglo[min];
            arreglo[min]=aux;
        }
        
        
        System.out.print("\nEl orden ascendente es: ");
        for (int i=0;i<nElementos;i++){         
            System.out.print(arreglo[i]+" - ");
        }   
        System.out.println("\nArreglo ordenado de forma decendente ");
        for (int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();

    }
    
}
