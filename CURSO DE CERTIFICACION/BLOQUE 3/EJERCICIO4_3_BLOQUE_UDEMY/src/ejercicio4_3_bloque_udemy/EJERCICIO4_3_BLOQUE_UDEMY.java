/*
descuento dl 20% a compras superiores a $300
 */
package ejercicio4_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO4_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        float valordecomp, valortotal,descuento;
        
        valordecomp=Float.parseFloat(JOptionPane.showInputDialog("ingrese el valor de su compra:"));
        if (valordecomp>300){
            descuento=valordecomp*0.20f;
            valortotal=valordecomp-descuento;
            JOptionPane.showMessageDialog(null,"El valor de su compra mas el descuento es de: "+valortotal);
     
          }
    
        else {
            JOptionPane.showMessageDialog(null,"el costo de total de su compra es de:"+valordecomp);
        }
            
            
            
    }
    
}
   