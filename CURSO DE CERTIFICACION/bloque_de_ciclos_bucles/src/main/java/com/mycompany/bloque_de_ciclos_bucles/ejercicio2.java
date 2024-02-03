
package com.mycompany.bloque_de_ciclos_bucles;

import javax.swing.JOptionPane;


public class ejercicio2 {

    public static void main (String[] arg){
        
        int numero, cuadrado;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (numero>=0 ){
            
            cuadrado=(int)Math.pow(numero,2);
            
            JOptionPane.showMessageDialog(null,"el numero "+numero+" elevado al cuarado es: "+cuadrado);
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
        }
        
    }  
}
