package c.calculadoraconexcepciones;

import java.util.Scanner;



public class Principal {

    
    public static void main(String[] args) {
        Operaciones ob1=new Operaciones();
        Calculadora ob2=new Calculadora();
        Scanner leer=new Scanner(System.in);
        int numV;
        
        System.out.println("\tDigite el numero de valores a agregar en la calculadora: ");
        numV=leer.nextInt();
        
        int []valor=new int[numV];
        
        int op;
       
        do{
                System.out.println("\t------------MENU  CALCULADORA-----------");
                System.out.println("\t0=Salir del sistema.");
                System.out.println("\t1=Realizar suma.");
                System.out.println("\t2=Realizar resta.");
                System.out.println("\t3=Realizar multiplicacion.");
                System.out.println("\t4=Realizar division.");
                System.out.println("Seleccione la opcion que desea: ");
                System.out.print("->");
                op=leer.nextInt();
                
            switch(op){
                case 0->{
                    System.out.println("--------Gracias por usar el programa.----------");
                    
                }
                case 1->{
                    
                  ob1.suma(valor);
                }
                case 2->{
                  ob1.resta(valor);
                }
                case 3->{
                    ob1.multiplicacion(valor);
                }
                case 4->{
                    ob1.division(valor);
                }
                
            }
            
        }while(op!=0);
      
    }
    
}
