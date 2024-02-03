/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bloque_4_eje_2;

import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EJERCICIO2 {
 
    public static void main(String[] arg){
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while (num!=0){
            
            if (num>=0){
                JOptionPane.showMessageDialog(null,"El numero es positivo");
            }
                if (num<0){
                        
                        JOptionPane.showMessageDialog(null,"El numero es negativo");   
                 }
          num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));   
            
        }
         
    } 
}
