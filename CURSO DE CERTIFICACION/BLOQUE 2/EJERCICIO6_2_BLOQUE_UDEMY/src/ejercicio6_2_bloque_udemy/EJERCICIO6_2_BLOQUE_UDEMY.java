package ejercicio6_2_bloque_udemy;

import java.util.Scanner;

public class EJERCICIO6_2_BLOQUE_UDEMY {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double a,b, res;
        
        System.out.println("ingresa el valor de a: ");
        a= entrada.nextDouble();
        System.out.println("ingresa el valor de b; ");
        b=entrada.nextDouble();
        
        res = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        
        System.out.println("el resultado de la operacion es igual a: "+res);
                
        
        
        
        
      }
    
}
