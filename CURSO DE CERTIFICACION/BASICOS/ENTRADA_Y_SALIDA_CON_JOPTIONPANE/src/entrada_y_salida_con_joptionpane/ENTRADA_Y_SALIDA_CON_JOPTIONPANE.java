
package entrada_y_salida_con_joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class ENTRADA_Y_SALIDA_CON_JOPTIONPANE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String cadena;
      char letra;
      double decimal;
      int entero;
      
      cadena = JOptionPane.showInputDialog("digita una cadena");
      letra = JOptionPane.showInputDialog("digita una letra ").charAt(0);
      decimal=Double.parseDouble(JOptionPane.showInputDialog("ingresa un numero decimal"));
      entero =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
      
      
      JOptionPane.showMessageDialog(null,"su cadena es: "+cadena);
      JOptionPane.showMessageDialog(null,"su letra es: "+letra);
      JOptionPane.showMessageDialog(null,"su numero decimal es: "+decimal);
      JOptionPane.showMessageDialog(null,"su numero entero es: "+entero);
      
        
        
        
        
        
    }
    
}
