package ejercicio6_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO6_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int num1,num2;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero: "));
        
        if ((num1%2==0) && (num2%2==0)){
            JOptionPane.showMessageDialog(null,"los numeros "+ num1 + " y " + num2 +" son pares");
        }
        else if ((num1%2!=0) && (num2%2!=0)){
            JOptionPane.showMessageDialog(null, "los numeros "+num1 +" y " +num2+ "son impares");
        }
        else{
            JOptionPane.showMessageDialog(null,"un numero es par y el otro impar");
        }
        
        
    }
    
}
