package entrada_y_salida_de_datos;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class ENTRADA_Y_SALIDA_DE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //entrada de tipo entero
        Scanner entrada= new Scanner(System.in);
        int numero;
        
        System.out.println("ingresa un numero: ");
        numero=entrada.nextInt();
        
        System.out.println("su nuemro es: "+numero);
       
        
        // entrada de tipo decimal 
        //funciona con el float y con el double
        
        Scanner entrada2 =new Scanner(System.in);
        float numero2;
        
        System.out.println("ingresa un numero decimal: ");
        numero2=entrada2.nextFloat();
        
        System.out.println("su numero decimal es; "+numero2);
        
        
        
        //entrada en cadenas de texto
        
        Scanner entrada3=new Scanner(System.in);
        String cadena;
        
        System.out.println("INGRESE UN TEXTO");
        cadena= entrada3.nextLine();// line para que escriba todo el texto
        
        System.out.println("su texto es "+cadena);
        
        //entrada de letra

        Scanner entrada4=new Scanner(System.in);
        char letra;
        
        System.out.println("ingrese una letra");
        letra=entrada4.next().charAt(0);
        
        System.out.println("su letra es "+letra);
      
                
        
        
      
        
    
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
