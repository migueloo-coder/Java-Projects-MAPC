/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_3_bloque_udemy;

import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class EJERCICIO10_3_BLOQUE_UDEMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int dia, mes, año;
        
        dia =Integer.parseInt(JOptionPane.showInputDialog("ingresa el dia "));
        mes =Integer.parseInt(JOptionPane.showInputDialog("ingresa el dia "));
        año =Integer.parseInt(JOptionPane.showInputDialog("ingresa el dia "));
        
        if((mes==4) &&  (dia<=30)){
            
            if ((mes==2) && (dia>=1) && (dia<=28)){
                JOptionPane.showMessageDialog(null,"la fecha es correcta ");
              if (año==0){
                  JOptionPane.showMessageDialog(null ,"la fecha es incorrecta ");
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
