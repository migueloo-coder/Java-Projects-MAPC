package ejercicio11_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO11_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int suma, resta,produc,divi,num1,num2;
        char operacion;
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero"));
        JOptionPane.showMessageDialog(null,"A continuacion te mostraremos unas operaciones con los numeros que ingresaste");
        operacion=JOptionPane.showInputDialog("para suma= S o s - resta= R o r - producto= P o p - dividir= D o d" ).charAt(0);
        switch (operacion){
            case 'S':  
            case 's': suma=num1+num2;
                    JOptionPane.showMessageDialog(null,"el resultado de la suma es: "+suma);
            break;
            case 'R':
            case 'r': resta=num1-num2;
                    JOptionPane.showMessageDialog(null, "el resultado de la resta es: "+resta);
            break;
            case 'P':
            case 'p': produc=num1*num2;
                    JOptionPane.showMessageDialog(null,"el resultado de la multiplicacion es: "+produc);
            break;
            case 'D':
            case 'd': divi=num1/num2;
                    JOptionPane.showMessageDialog(null,"el resultado de su division es de: "+divi);
            break;
            default: JOptionPane.showMessageDialog(null,"operacion no encontrada");
            break;
            
        }
    }
    
}
