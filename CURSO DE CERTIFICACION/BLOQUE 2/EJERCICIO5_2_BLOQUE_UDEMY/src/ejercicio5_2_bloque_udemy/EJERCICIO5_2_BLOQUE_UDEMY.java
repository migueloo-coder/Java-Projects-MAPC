package ejercicio5_2_bloque_udemy;

import java.util.Scanner;

public class EJERCICIO5_2_BLOQUE_UDEMY {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float partici,parcial1,parcial2,parcial3, total;
        
        System.out.println("ingresa tu nota de participacion: ");
        partici=entrada.nextFloat();
        partici=(partici*10)/100;
        System.out.println("ingresa la nota del primer parcial: ");
        parcial1=entrada.nextFloat();
        parcial1=(parcial1*25)/100;
        System.out.println("ingresa la nota del segundo parcial: ");
        parcial2=entrada.nextFloat();
        parcial2=(parcial2*25)/100;
        System.out.println("ingresa la nota del parcial final: ");
        parcial3=entrada.nextFloat();
        parcial3=(parcial3*40)/100;
        total=partici+parcial1+parcial2+parcial3;
        
        System.out.println("la nota final es de: "+total);
      
        

    }
    
}
