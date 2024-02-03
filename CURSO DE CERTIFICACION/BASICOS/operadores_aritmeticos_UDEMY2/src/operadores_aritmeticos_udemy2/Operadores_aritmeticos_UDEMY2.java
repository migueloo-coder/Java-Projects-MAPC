
package operadores_aritmeticos_udemy2;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Operadores_aritmeticos_UDEMY2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //operadores simples 
        
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, multi,divi,mod;
        
        System.out.println("ingresa dos numero");
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
       
        suma = numero1+numero2;
        resta=numero1-numero2;
        multi=numero1*numero2;
        divi=numero1/numero2;
        mod=numero1%numero2;
       
        System.out.println("el resultado de la suma es: "+suma);
        System.out.println("el resultado de la resta es: "+resta);
        System.out.println("el resultado de la multiplicacion es igual a: "+multi);
        System.out.println("el resultado de la division es: "+divi);
        System.out.println("el resultado del modulo es: "+mod);
        
        
        
        
        
        
        //operadorescombinados y de asignacion
        
        byte numero=10;
        
        numero+=3;//puede cambiar por los otros operadores pero es la misma estructura
        
        System.out.println("el resultado de la operacion es: "+numero);
        
        
        
        //operadores de incremento y decremento 
        
        byte x=5, y, a=5, b;
        
        y= ++x;    //tener cuidado co el prefijo y el sufijo
                
        System.out.println(y);
        System.out.println(x);
        
        
        b=--a;
        
        System.out.println(b);
        System.out.println(a);
        
        //potencia 
        
        double numero5 =4.89;     // se generarian mas tipos respecto a la clase math solo se tendria que investigar
        double resultado5= Math.sqrt(numero5);
        
        System.out.println("la raiz de su nuemro es igual a: "+resultado5);
        
    }
    
}
