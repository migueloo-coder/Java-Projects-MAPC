
package MetododeRetorno;

public class Operacion {
    //no es necesario tener variables globales para su declaracion
    //el retorno de valores es con el tipo de dato en lugar de void 
public int sumar(int num1,int num2){
        int suma=num1+num2;
        return suma;
    }
    
    public int restar(int num1,int num2){
        int resta=num1-num2;
        return resta;
    }
    
    public int multipliar(int num1,int num2){
       int multi=num1*num2;
       return multi;
    }
    
    public int dividir(int num1,int num2){
       int divi=num1/num2;
       return divi;
    }
}
