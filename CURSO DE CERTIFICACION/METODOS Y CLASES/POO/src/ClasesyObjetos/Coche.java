
package ClasesyObjetos;
//clase la cual puede contener muchos objetos
public class Coche {
    //atributos 
    String color;
    String marca;
    int km;
    //metodo
    public static void main (String[] args){
        //objeto de prueba
        Coche coche1=new Coche();
        
        coche1.color="blanco";
        coche1.marca="audi";
        coche1.km=0;
        
        System.out.println("El color del coche 1 es: "+coche1.color);
        System.out.println("La marca del coche 1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche 1 es: "+coche1.km);
        
        Coche coche2=new Coche();
        
        coche2.color="rojo";
        coche2.marca="ferrari";
        coche2.km=100;
        
        System.out.println("\nEl color del coche 2 es: "+coche2.color);
        System.out.println("La marca del coche 2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche 2 es: "+coche2.km);
        
        
    }

}
