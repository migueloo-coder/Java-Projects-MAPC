
package ejercicio9_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO9_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int dia, mes, año;
        
        dia =Integer.parseInt(JOptionPane.showInputDialog("ingresa el dia "));
        mes =Integer.parseInt(JOptionPane.showInputDialog("ingresa el dia "));
        año =Integer.parseInt(JOptionPane.showInputDialog("ingresa el dia "));
        
        if((dia>1) && (dia<=30)){
            if ((mes>=1) && (mes<=12)){
              if (año!=0){
                  
              }
              else{
                  JOptionPane.showMessageDialog(null,"fecha incorrecta, año es incorrecto");
              } 
              
            }
            else {
                JOptionPane.showMessageDialog(null,"fecha incorrecta, mes es incorrecto ");
            }
            
        }
        else {
            JOptionPane.showMessageDialog(null,"fecha incorrecta, dia es incorrecto");
        }
        
    
    
    
    
    }
    
}
