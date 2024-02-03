
package proyecto1udemy;

/**
 *
 * @author miguel
 */
public class Proyecto1UDEMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("HOLA MUNDO");
        System.out.println("como estas"); //salida de la info o imprimir pantalla
        
         byte mordida; //Se utiliza para datos muy pequeños  max 127
    mordida=123;
        System.out.println("mordida="+mordida);
        
        short corto; //caracteres de 5 digitos max 32000
    corto=32000;
        System.out.println("corto="+corto);
        
        int entero;
    entero=213000000;
        System.out.println("entero="+entero);
        
         long largo;//PUEDE SER MUY UTILIZADO 9 DIGITOS 
    largo=2130000000;
        System.out.println("largo="+largo);
        
        float flotante;//numeros mas grandes 
    flotante=213000000;
        System.out.println("flotante="+flotante);
        
         double valinfinito;
    valinfinito=21300000000000.55;  //acepta decimales (ojo pueden ser peligrosos)
        System.out.println("valor infinitos="+valinfinito);
        
        
         char caracter; //solo se puede para un caracter en especifico SOLO UNO
    caracter='c';
        System.out.println("caracter="+caracter);
        
        boolean boleanos; // se usa para verdadero y falso mas que todo en las sentencias 
        boleanos=true;
        System.out.println("boleanos="+boleanos);
        
        
        
        
        
        //DECLARACIONES
        
        
        
        
        //variables de tipo primitivo ejemplos
        
        int numero=10;
        System.out.println("este es su nuemri"+numero);
        
        //variables no primitivas
        
        Integer numero2=null;
        System.out.println("este es una variable no primitiva"+numero2);
        
        // pueden salir mas datos de estas variables 
        
        
        
        //uso de las constantes
        
        final int numerodeprueba=20;
        System.out.println(numerodeprueba); //son constantes las cuales no se pueden modificar en todo el codigo
        
        
    }
    
}
