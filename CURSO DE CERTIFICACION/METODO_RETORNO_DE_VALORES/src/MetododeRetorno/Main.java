
package MetododeRetorno;

import javax.swing.JOptionPane;

public class Main {
    
     public static void main (String[] args){
        
        Operacion op =new Operacion();
        
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
         System.out.println("la suma es: " + op.sumar(n1, n2));
         System.out.println("la resta es: "+op.restar(n1, n2));
         System.out.println("la multiplicacion es: "+op.multipliar(n1, n2));
         System.out.println("la division es: "+op.dividir(n1, n2));
        
        
    }

}
