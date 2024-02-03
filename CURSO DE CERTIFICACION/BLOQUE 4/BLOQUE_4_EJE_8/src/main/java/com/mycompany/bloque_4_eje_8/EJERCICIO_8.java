/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bloque_4_eje_8;

import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EJERCICIO_8 {

    public static void main(String[] args){
        int num,i;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        i=1;
                while (i<=num){
                    System.out.println(i);
                    i++;
                }
        
    }
}
