package busqueda_secuencial;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BUSQUEDA_SECUENCIAL {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[],nElementos,dato;
        boolean band=false;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos que va a contener el arreglo: "));
        arreglo=new int[nElementos];
        for (int i=0;i<nElementos;i++){         //impresion y llenado del arreglo
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos que va a contener el arreglo: "));
        int i=0;
        while(i<5 && band==false){
            if (arreglo[i]==dato){
                band=true;
            }
            i++;
        }
        if(band==true){
            JOptionPane.showMessageDialog(null, "El numero ingresado no se encuentra en el arreglo registrado");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ingresado se encuentra en el arreglo registrado en la posicion: "+(i-1));    
        }
            
    }
    
}
