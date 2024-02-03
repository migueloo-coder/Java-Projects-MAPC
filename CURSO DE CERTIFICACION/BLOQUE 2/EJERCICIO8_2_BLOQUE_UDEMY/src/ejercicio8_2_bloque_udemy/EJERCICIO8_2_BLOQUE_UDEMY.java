//cuadratica
package ejercicio8_2_bloque_udemy;

import java.util.Scanner;

public class EJERCICIO8_2_BLOQUE_UDEMY {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double a,b,c,res1,res2;
        
        System.out.println("ingresa el valor de a: ");
        a=entrada.nextDouble();
        System.out.println("ingresa el valor de b: ");
        b=entrada.nextDouble();
        System.out.println("ingresa el valor de c: ");
        c=entrada.nextDouble();
        
        res1=(-(b)+ Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);  
        res2=(-(b)- Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        
        System.out.println("El primer resultado es decir X1 es de: "+res1);
        System.out.println("El segundo resultado es decir X2 es de: "+res2);
        
        
        
    }
    
}
