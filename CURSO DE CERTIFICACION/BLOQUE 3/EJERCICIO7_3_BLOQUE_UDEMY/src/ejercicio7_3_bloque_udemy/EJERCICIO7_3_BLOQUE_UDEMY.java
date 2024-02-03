package ejercicio7_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO7_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int num1,num2,num3;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero entero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero entero"));
        num3=Integer.parseInt(JOptionPane.showInputDialog("ingresa el tercer numero entero"));   
        if ((num1>num2) && (num1>num3)){
            JOptionPane.showMessageDialog(null,"el orden de mayor a menor es:  "+num1+" - "+num2+" - "+num3+" - ");
        }
        else if ((num1>num3) && (num3>num2)){
            JOptionPane.showMessageDialog(null,"el orden de mayor a menor es:  "+num1+" - "+num3+" - "+num2+" - ");
        }
         else if ((num2>num1) && (num2>num3)){
            JOptionPane.showMessageDialog(null,"el orden de mayor a menor es:  "+num2+" - "+num1+" - "+num3+" - ");
        }
         else if ((num2>num3) && (num3>num1)){
            JOptionPane.showMessageDialog(null,"el orden de mayor a menor es:  "+num2+" - "+num3+" - "+num1+" - ");
        }
         else if ((num3>num1) && (num3>num2)){
            JOptionPane.showMessageDialog(null,"el orden de mayor a menor es:  "+num3+" - "+num1+" - "+num2+" - ");
        }
         else if ((num3>num2) && (num2>num1)){
            JOptionPane.showMessageDialog(null,"el orden de mayor a menor es:  "+num3+" - "+num2+" - "+num1+" - ");
        }
         



    }
    
}
