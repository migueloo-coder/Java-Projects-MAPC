/* sentencias multipes 
   switch (dato){
            case 1: JOptionPane.showMessageDialog(null,"es le num 1");
                    break;     
            case 2: JOptionPane.showMessageDialog(null,"el numero es 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null,"el numero es 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null,"el numero es 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null,"el numero es 5");
                    break;
            default: JOptionPane.showMessageDialog(null,"se pasa de los numeros de registro");
                    break;

       }

*/
package condicional_switch_3_bloque_udemy;

import javax.swing.JOptionPane;

public class CONDICIONAL_SWITCH_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        
        int dato ;
        
        dato=Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 1 a 5"));
        
        switch (dato){
            case 1: JOptionPane.showMessageDialog(null,"el numero es 1");
                    break;     
            case 2: JOptionPane.showMessageDialog(null,"el numero es 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null,"el numero es 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null,"el numero es 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null,"el numero es 5");
                    break;
            default: JOptionPane.showMessageDialog(null,"elnumero no esta en el rango de 1 a 5");
                    break;
                    
            
        } 
        

        
        
    }
    
}
