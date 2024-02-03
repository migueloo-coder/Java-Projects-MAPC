
package c.calculadoraconexcepciones;

import java.util.Scanner;


public class Operaciones {
    
    public void suma(int []valor){
        Scanner leer =new Scanner (System.in);
        String conf;
        int valorTemp = 0;
        
        
        
            for (int i=0;i<valor.length;i++){
                
                System.out.println("Digite el numero "+(i+1));
                valor[i]=leer.nextInt();
                
                valorTemp=valor[i]+valorTemp;
                
            }
            
            
        System.out.println("---------------------------------------");
        System.out.println("El resultado de su suma es: "+valorTemp);
        System.out.println("---------------------------------------");
        
        
        
    }

    public void resta(int[]valor){
        Scanner leer =new Scanner (System.in);
       
        int valorTemp=0;
        int valorTotalResta = 0;
        
        
        
            for (int i=0;i<valor.length;i++){
                
                System.out.println("Digite el numero "+(i+1));
                valor[i]=leer.nextInt();
                
                
                if(valor[i]<valorTemp){
                    valorTemp=valor[i]-valorTemp;
                }else if(valor[i]>valorTemp){
                    valorTemp=valorTemp-valor[i];
                }
                    
               
                
                
                
                
            }
            
            
        System.out.println("---------------------------------------");
        System.out.println("El resultado de su resta es: "+valorTemp);
        System.out.println("---------------------------------------");
    }
    public void multiplicacion(int[]valor){
        Scanner leer =new Scanner (System.in);
        String conf;
        int valorTemp=1;
        
        
        
            for (int i=0;i<valor.length;i++){
                
                System.out.println("Digite el numero "+(i+1));
                valor[i]=leer.nextInt();
                
                valorTemp=valor[i]*valorTemp;
                
            }
            
            
        System.out.println("---------------------------------------");
        System.out.println("El resultado de su multiplicacion es: "+valorTemp);
        System.out.println("---------------------------------------");
    }
    public void division(int[]valor){
        Scanner leer =new Scanner (System.in);
        String conf;
        int valorTemp=1;
        
        
        
            for (int i=0;i<valor.length;i++){
                
                System.out.println("Digite el numero "+(i+1));
                valor[i]=leer.nextInt();
                
                valorTemp=valor[i]/valorTemp;
                
            }
            
            
        System.out.println("---------------------------------------");
        System.out.println("El resultado de su division es: "+valorTemp);
        System.out.println("---------------------------------------");
    }
}  

