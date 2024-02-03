
package ParametrosyArgumentos;

import javax.swing.JOptionPane;

public class Main {
    
            
    public static void main (String[] args){
        
        Operacion op =new Operacion();
        
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multipliar(n1, n2);
        op.dividir(n1, n2);
        op.mostrarresul();
        
    }

}
