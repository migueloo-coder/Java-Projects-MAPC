//CONDICIONALES if y else 

/* operadores

== iguladad 
!= diferencia
<  menor
>  mayor
<= menor o igual
>= mayor o igual 

*/
package condicionales_3_bloque_udemy;

import javax.swing.JOptionPane;


public class CONDICIONALES_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        
        int dato=5,numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        
        if (numero == dato){//igual a 
            JOptionPane.showMessageDialog(null, "el numero es igual a 5");
        }
        else {
            JOptionPane.showMessageDialog(null,"el numero es diferente de 5");
        }
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        
                
         if (numero != dato){ //diferente 
            JOptionPane.showMessageDialog(null, "el numero es diferente a 5");
        }
        else {
            JOptionPane.showMessageDialog(null,"el numero es 5");
        }
       
       
    }
    
}
