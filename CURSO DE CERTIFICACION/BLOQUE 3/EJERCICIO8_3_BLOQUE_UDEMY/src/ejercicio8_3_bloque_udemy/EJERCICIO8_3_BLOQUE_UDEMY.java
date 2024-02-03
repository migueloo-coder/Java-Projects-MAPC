//saber cuantas cifras tiene un numero 
package ejercicio8_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO8_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numeros"));
        if (num<10){
            JOptionPane.showMessageDialog(null,"el numero "+num+" tienen una cifras");
        }
        else if (num<100){
            JOptionPane.showMessageDialog(null,"el numero "+num+" tienen dos cifras");
        }
        else if (num<1000){
            JOptionPane.showMessageDialog(null,"el numero "+num+" tienen tres cifras");
        }
        else if (num<10000){
            JOptionPane.showMessageDialog(null,"el numero "+num+" tienen cuatro cifras");
        }
        else if (num<100000){
            JOptionPane.showMessageDialog(null,"el numero "+num+" tienen cinco cifras");
        }
    }
    
}
