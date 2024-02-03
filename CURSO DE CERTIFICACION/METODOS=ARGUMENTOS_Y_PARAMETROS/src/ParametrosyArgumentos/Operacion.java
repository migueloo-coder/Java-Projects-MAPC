
package ParametrosyArgumentos;

public class Operacion {
    
    int suma;
    int resta;
    int multi;
    int divi;
    
    
    
    public void sumar(int num1,int num2){
        suma=num1+num2;
        
    }
    
    public void restar(int num1,int num2){
        resta=num1-num2;
    }
    
    public void multipliar(int num1,int num2){
        multi=num1*num2;
    }
    
    public void dividir(int num1,int num2){
        divi=num1/num2;
    }
    public void mostrarresul(){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multi);
        System.out.println("El resultado de la division es: "+divi);
    }

}
