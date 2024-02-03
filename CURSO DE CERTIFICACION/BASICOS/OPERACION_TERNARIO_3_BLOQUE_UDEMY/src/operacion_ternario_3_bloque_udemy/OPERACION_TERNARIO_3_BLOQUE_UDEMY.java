/* OPERADOR TERNARIO 

     sintaxis 

     variable= (condicion)  ? valor1 : valor2
 */
package operacion_ternario_3_bloque_udemy;

import javax.swing.JOptionPane;

public class OPERACION_TERNARIO_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        
        int valor;
        String mensaje;
        
        valor= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero: "));
        
        mensaje= (valor%2==0) ? "es par": "es impar";
        
        JOptionPane.showMessageDialog(null, mensaje);
        
        
    }
    
}
