

package ejercicio13_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO13_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        
        final int saldo_inicial=1000 ; 
        int opcion, clave ;
        double ingresar, saldoactual,sacar;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A SU CAJERO AUTOMATICO\n"
        + "porfavor escoguer una ocion\n"
        + "1. ingresar dinero ala cuenta\n"
        + "2. sacar dinero de la cuenta\n"
        + "3. salir "));
        clave = Integer.parseInt(JOptionPane.showInputDialog("ingrese la clave de su cuenta"));
        if (clave==1234){
        switch(opcion){
            case 1: ingresar=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de ingreso del dinero"));
                 saldoactual=saldo_inicial+ingresar;
                 JOptionPane.showMessageDialog(null,"el saldo actual en su cuenta es: "+saldoactual);
            break;
            case 2: sacar=Integer.parseInt(JOptionPane.showInputDialog("ingras el valor para retirar el dinero "));
                 saldoactual=saldo_inicial-sacar;
                 JOptionPane.showMessageDialog(null,"el saldo actual en su cuenta es de: "+saldoactual);
            break;
            case 3:JOptionPane.showMessageDialog(null,"GRACIAS POR USAR ESTE CAJERO AUTOMATICO");
            break;
            default: JOptionPane.showMessageDialog(null,"opcion no disponible");
            break;
            
           
        }
        }
        else {
            JOptionPane.showMessageDialog(null,"clave incorrecta\n"
            + "GRACIAS POR USAR ESTE CAJERO AUTOMATICO");
        }
    }
    
}
