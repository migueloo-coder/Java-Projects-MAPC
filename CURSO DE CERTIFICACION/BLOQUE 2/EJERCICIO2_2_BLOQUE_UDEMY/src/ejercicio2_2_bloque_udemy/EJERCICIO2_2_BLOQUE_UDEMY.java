//CALCULAR EL SALARIO DE UN TRABAJADOR POR HORAS DE TRABAJO
package ejercicio2_2_bloque_udemy;

import java.util.Scanner;


public class EJERCICIO2_2_BLOQUE_UDEMY {

    
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        float salario;
        int costodehora, horatrabajada;
        
        System.out.println("Por favor ingresa el costo de la hora de trabajo: ");
        costodehora=entrada.nextInt();
        
        System.out.println("ingresa las horas que trabajaste esta semana: ");
        horatrabajada=entrada.nextInt();
        
        salario=costodehora*horatrabajada;
        
        System.out.println("su salario para esta semana es de: "+salario);
        
    }
    
}
