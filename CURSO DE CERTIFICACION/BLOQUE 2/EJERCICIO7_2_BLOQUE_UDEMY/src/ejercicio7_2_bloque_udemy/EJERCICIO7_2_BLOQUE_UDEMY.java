
package ejercicio7_2_bloque_udemy;

import java.util.Scanner;


public class EJERCICIO7_2_BLOQUE_UDEMY {

   
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int nhoras,semanas,dias,horas ;
       
        
        System.out.println("ingresa el numero de horas: ");
        nhoras=entrada.nextInt();
        
        semanas=nhoras/168;
        dias=nhoras%168 / 24;
        horas=nhoras%24;
        
        System.out.println("semanas: "+semanas);
        System.out.println("dias: "+dias);
        System.out.println("horas: "+horas);
       
    }
    
}
