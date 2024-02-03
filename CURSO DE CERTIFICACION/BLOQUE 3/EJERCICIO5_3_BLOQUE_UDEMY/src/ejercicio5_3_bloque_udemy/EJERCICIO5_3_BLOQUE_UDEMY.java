/*
HORAS EXTRA
 */
package ejercicio5_3_bloque_udemy;

import javax.swing.JOptionPane;


public class EJERCICIO5_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int horas;
        float pago1,pago2,pagofinal,pagonormal;
        
        horas=Integer.parseInt(JOptionPane.showInputDialog("ingresa las horas trabajadas: "));
        if (horas>40){
            pago1=40*16f;
            pago2=(horas-40)*20;
            pagofinal=pago1+pago2;
            JOptionPane.showMessageDialog(null,"Este es el valor de su paga de esta semna: $"+pagofinal);
        }
        else{
            pagonormal=horas*16;
            JOptionPane.showMessageDialog(null,"Este es el valor de su paga de esta semana: $"+pagonormal);
        }
       
    }
    
}
