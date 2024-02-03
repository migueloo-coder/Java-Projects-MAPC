package ejercicio_6_bloque_5;

import java.util.Scanner;

public class EJERCICIO_6_BLOQUE_5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a[],b[],c[];
        int i,j;
        a=new int[12];
        b=new int[12];
        c=new int[24];
        System.out.println("Ingrese los datos del primer arreglo");
        for(i=0;i<12;i++){
            System.out.print((i)+". Digita un numero entero: ");
            a[i]=entrada.nextInt();
        }
        System.out.println("Ingrese los datos del segundo arreglo");
        for(i=0;i<12;i++){
            System.out.print((i+1)+". Digita un numero entero: ");
            b[i]=entrada.nextInt();
        }    
        i=0;
        j=0;
        while (i<12){
            for (int k=0;k<3;k++){
                c[j]=a[i+k];
                j++;
            }
            for (int k =0;k<3;k++){
                c[j]=b[i+k];
                j++;
            }
            i+=3;
        }
        System.out.println("El arreglo resultante es: ");
        for (i=0;i<24;i++){
            System.out.println(c[i]+" - ");
        }
        System.out.println();
    }
}
