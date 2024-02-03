/*
PEDIR 5 NUM AL SUARIO Y MOSTRAR EL INVERSO AL ITRODUCIDO
 */
package ejercicio_2_bloque_5;

import java.util.Scanner;

public class EJERCICIO_2_BLOQUE_5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        float  numeros[] = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        
        for (int i=0;i<5;i++){
            System.out.print((i+1)+" Ingrese un numetro: ");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("Estos son los datos ingresados en el arreglo de forma inversa");
        for (int i=4;i>=0;i--){
            System.out.println(numeros[i]);
            
        }
    }
    
}
