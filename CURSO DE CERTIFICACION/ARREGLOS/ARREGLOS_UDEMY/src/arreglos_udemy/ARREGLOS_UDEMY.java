package arreglos_udemy;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ARREGLOS_UDEMY {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nElemtos;
        
        nElemtos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de datos que van a ser almacenados en el arreglo"));
        
        char[] letras =new char[nElemtos];
        
        JOptionPane.showMessageDialog(null, "Digita los elemtos del arrglo");
        
        for (int i=0; i<nElemtos; i++){
            System.out.print((i+1)+". Digita un caracter: ");
            letras[i]= entrada.next().charAt(0);
        }
        System.out.println("Los elementos del arreglo son: ");
        for (int i=0;i<nElemtos;i++){
            System.out.print(letras[i]+" - ");
        }
        
    }
    
}
