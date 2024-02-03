package ejercicio_5_bloque_5;

import java.util.Scanner;

public class EJERCICIO_5_BLOQUE_5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a[],b[],c[];
        int j=0;
        a=new int[10];
        b=new int[10];
        c=new int[20];
        
        System.out.println("Ingrese los datos del primer arreglo");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digita un numero entero: ");
            a[i]=entrada.nextInt();
        }
        System.out.println("Ingrese los datos del segundo arreglo");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digita un numero entero: ");
            b[i]=entrada.nextInt();
        }
        for (int i=0;i<10;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.print("\nEl tercer arreglo queda asi: ");
        for(int i=0;i<20;i++){
            System.out.print(c[i]+" - ");
        }
        System.out.println();
    }
}
