
package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Operaciones {
    int num1;
    int num2;
    int suma;
    int resta;
    int multi;
    int divi;
    
    public void leernumeros(){
    num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
    num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));        
    }
    
    public void sumar(){
        suma=num1+num2;
        
    }
    
    public void restar(){
        resta=num1-num2;
    }
    
    public void multipliar(){
        multi=num1*num2;
    }
    
    public void dividir(){
        divi=num1/num2;
    }
    public void mostrarresul(){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multi);
        System.out.println("El resultado de la division es: "+divi);
    }
}
