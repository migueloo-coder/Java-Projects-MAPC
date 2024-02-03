//saber si un numero es multiplo de 10


package ejercicio1_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO1_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int numero, operacion1,operacion2;
       
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero entero"));
                
        if (numero%10==0) {
            JOptionPane.showMessageDialog(null,"el numero "+ numero +" es multiplo de 10");
        
        }
        else {
            JOptionPane.showMessageDialog(null,"el numero "+ numero +" no es multiplo de 10");
            
        }
        
        
        
    }
    
}
