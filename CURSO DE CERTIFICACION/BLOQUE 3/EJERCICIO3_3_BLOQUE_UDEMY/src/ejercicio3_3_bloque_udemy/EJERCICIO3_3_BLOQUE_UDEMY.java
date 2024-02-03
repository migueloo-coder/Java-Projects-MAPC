/*
PEDIR SI UNA LETRA ES MAYUSCULA O MINUSCULA
 */
package ejercicio3_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO3_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        char letra;
        letra=JOptionPane.showInputDialog("ingresa una letra").charAt(0);
        
        if (Character.isUpperCase(letra)){
           JOptionPane.showMessageDialog(null,"la letra "+letra+" es mayuscula");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "la letra "+letra+"es minuscula");
        }
        
    }
    
}
