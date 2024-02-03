package ejercicio12_3_bloque_udemy;

import javax.swing.JOptionPane;

public class EJERCICIO12_3_BLOQUE_UDEMY {

    public static void main(String[] args) {
        int nota;
        nota=Integer.parseInt(JOptionPane.showInputDialog("ingrese la calificacion"));
        
        switch (nota){
            case 0:
            case 1:
            case 2:JOptionPane.showMessageDialog(null,"su nota es insuficiente");
            break;
            case 3:
            case 4:JOptionPane.showMessageDialog(null,"su nota es suficiente");
            break;
            case 5:
            case 6:JOptionPane.showMessageDialog(null,"su nota es buena");
            break;
            case 7:
            case 8:JOptionPane.showMessageDialog(null,"su nota es notable");
            break;
            case 9:
            case 10:JOptionPane.showMessageDialog(null,"su nota es sobresaliente");
            break;
            
        }
     }
    
}
