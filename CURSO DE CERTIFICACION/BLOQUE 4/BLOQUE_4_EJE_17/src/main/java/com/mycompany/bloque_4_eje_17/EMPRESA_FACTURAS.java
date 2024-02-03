

package com.mycompany.bloque_4_eje_17;

import javax.swing.JOptionPane;

public class EMPRESA_FACTURAS {

    public static void main (String[] args){
        int codigo, litros,litrosarticulo1=0,conteomayor600=0;
        float preciolitro=0,importefactura,facturaciontotal=0;
        for (int i=1 ; i<=5 ; i++){
            do{
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Articulo Nº "+i+"\nDigite el codigo del articulo: "));
            }while (codigo<1 || codigo>3);
            litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo Nº "+i+"\nDigite la cantidad de litros: "));
            switch(codigo){
                case 1: preciolitro=0.6f;
                        break;
                case 2: preciolitro=3;
                        break;
                case 3: preciolitro=1.25f;
                        break;
            }
            importefactura=(float)litros*preciolitro;
            facturaciontotal+=importefactura;
            
            if (codigo==1){
                litrosarticulo1+=litros;
            }
            if(importefactura>600){
                conteomayor600++;
            }     
        }
        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total: "+facturaciontotal);
        System.out.println("La cantidad de litros vendidos del articulo 1: "+litrosarticulo1);
        System.out.println("Cantidad de facturas mayores de 600 dolares: "+conteomayor600);
    }
}
