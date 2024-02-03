package metodos_de_ordenamiento_insercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class METODOS_DE_ORDENAMIENTO_INSERCION {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos que va a contener el arreglo: "));
        arreglo=new int[nElementos];
        for (int i=0;i<nElementos;i++){         //impresion y llenado del arreglo
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        for (int i=0;i<nElementos;i++){
            pos=i;
            aux=arreglo[i];
            while((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
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
