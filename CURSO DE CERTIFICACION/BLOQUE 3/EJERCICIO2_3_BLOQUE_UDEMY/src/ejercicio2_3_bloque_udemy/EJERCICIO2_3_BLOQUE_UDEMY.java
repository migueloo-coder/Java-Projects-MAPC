/*

*/
package ejercicio2_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO2_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int num1, num2;
        String operacion;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero: "));
        if (num1!=num2){
        operacion=(num2<=num1) ? "el numero " +num1+ " es mayor que "+num2  : "el numero "+num1+" es menor que "+num2;
        JOptionPane.showMessageDialog(null,operacion);
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero "+num1+" y el numero "+num2+" son iguales");
            
        }
   
}
}
