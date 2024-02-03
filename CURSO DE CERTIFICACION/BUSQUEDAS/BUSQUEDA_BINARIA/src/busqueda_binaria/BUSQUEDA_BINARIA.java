package busqueda_binaria;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BUSQUEDA_BINARIA {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[],nElementos, dato, aux,min,inf,sup,mitad,it;
        boolean band=false;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos que va a contener el arreglo: "));
        arreglo=new int[nElementos];
        for (int i=0;i<nElementos;i++){         //impresion y llenado del arreglo
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        //METODO DE ORDENAMIENTO (POR SELECCION)
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
        //BUSQUEDA BINARIA
        dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar en el arreglo: "));
        
        inf=0;
        sup=nElementos;
        it=0;
        mitad=(inf+sup)/2;
        while(inf<=sup && it<5){
            if (arreglo[mitad]==dato){
                band=true;
                break;
            }
            if (arreglo[mitad]>dato){
                sup=mitad;
                mitad=(inf+sup)/2;     
            }
            if(arreglo[mitad]<dato){
                inf=mitad;
                mitad=(inf+sup)/2;
            }
            it++;
        }
        if(band==true){
            JOptionPane.showMessageDialog(null, "El numero ingresado se encuentra en el arreglo registrado"+mitad);
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ingresado no se encuentra en el arreglo registrado");    
        }
        System.out.println();
    }
    
}
