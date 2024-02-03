package ejercicio3_2_bloque_udemy;

import java.util.Scanner;

public class EJERCICIO3_2_BLOQUE_UDEMY {

   
    public static void main(String[] args) {
       
        Scanner entrada=new Scanner(System.in);
        float dinerodeguillermo,dinerodeluis,dinerodejuan,total;
        
        System.out.println("gullermo ingresa tu dinero: ");
        dinerodeguillermo=entrada.nextFloat();
        
        dinerodeluis=dinerodeguillermo/2;
        
        dinerodejuan=(dinerodeluis+dinerodeguillermo)/2;
        
        System.out.println("el dinero que posee guillermoes iguala a: "+dinerodeguillermo);
        
        System.out.println("el dinero que posee luis es de: "+dinerodeluis);
        
        System.out.println("el dinero que posee juan es igual a: "+dinerodejuan);
        
        total=dinerodeguillermo+dinerodejuan+dinerodeluis;
                
        System.out.println("la suma del dinero que poseen los tres es igual a: "+total);
        
        
    }
    
}
