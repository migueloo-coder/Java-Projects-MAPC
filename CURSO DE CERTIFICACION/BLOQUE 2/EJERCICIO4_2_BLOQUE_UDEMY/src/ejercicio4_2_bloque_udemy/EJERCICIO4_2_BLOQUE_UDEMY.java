package ejercicio4_2_bloque_udemy;

import java.util.Scanner;


public class EJERCICIO4_2_BLOQUE_UDEMY {

    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float total,comision,valorvend,aumentoporcosto;
        int autosvend;
        final int salariomensual=1000;
        
        System.out.println("ingrese la cantidad de automoviles vendidos por el vendedor: ");
        autosvend=entrada.nextInt();
        
        comision=autosvend*150;
        
        
        System.out.println("cual fue el valor de venta de cada auto: ");
        valorvend=entrada.nextFloat();
        
        aumentoporcosto = 0.05f*valorvend*autosvend;
        
        total=salariomensual+comision+aumentoporcosto;
                
        
        System.out.println("El salario de este mes del empleado seleccionado es de:"+total);
        
        
        
        
        
        
        
        
        
        
    }
    
}
