/*
 */
package ejercicio_3_bloque_5;

import java.util.Scanner;

public class EJERCICIO_3_BLOQUE_5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int conteo_pos=0, conteo_nega=0, conteo_ceros=0;
        float suma_pos=0,suma_nega=0,media_pos,media_nega;
        float numeros[]=new float[5];
        
        for (int i=0;i<5;i++){
            System.out.print((i+1)+". Ingrese un numero: ");
            numeros[i]=entrada.nextFloat();
        }
        System.out.println("Los numeros ingresados fueron: ");
        for (float i:numeros){
            System.out.println("Numero ingresado: "+i);
        }
         
        for (int i=0;i<5;i++){
            if (numeros[i]==0){
                conteo_ceros++;
            }
            else if(numeros[i]>0){
                conteo_pos++;
                suma_pos+=numeros[i];
            }
            else {
                conteo_nega++;
                suma_nega+=numeros[i];
            }
        }
        //media de los positivos
        if (conteo_pos==0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }
        else {
            media_pos=suma_pos/conteo_pos;
            System.out.println("La media de los numeros positivos es: "+media_pos);
        }
        //media de los negativos
        if (conteo_nega==0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        }
        else{
             media_nega=suma_nega/conteo_nega;
            System.out.println("La media de los numeros negativos es: "+media_nega);
        }
        System.out.println("La media de los ceros es igual a: "+conteo_ceros);
    }   
}
