/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bloque_4_eje_6;

import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EJERCICIO_7 {
    
    public static void main(String[] args) {
      
        int num,elementos=0,suma=0;
        float media;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        
        while (num>=0){
            suma+=num;//suma iterativa
            elementos++;
            
         num=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
           
        }
        if (elementos==0){
            System.out.println("Erros!! la divicion entre cero no existe");
        }
        else{
            media=(float)suma/elementos;
            System.out.println("La media es: "+media);
            
        }
        
        
    } 

}
