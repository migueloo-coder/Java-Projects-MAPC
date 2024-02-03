
package ventana;

import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


public class MauseListener extends JFrame{
    private JPanel panel;
    private JButton boton;
    //private JLabel saludo;
    private JTextArea areatexto;
    //private JTextField cajadetexto;
    
     public MauseListener(){//constructor
        this.setSize(500,500);//tamaño de la vnetana
        this.setTitle("Mause Listener");//se da el titulo
        this.setLocationRelativeTo(null);//establecemos el centro de la pantalla cualquiera        
        //this.setMinimumSize(new Dimension(400,400));//se establece el tamaño minimo de la ventana para modificar
        this.getContentPane().setBackground(Color.LIGHT_GRAY); //se le asigna un color a la ventana
        this.setResizable(false);
        iniciar_componentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciar_componentes(){
        
        paneles();
        //etiquetas();
        areatexto();
        botones();
        
        
        //radioBotones();
        //botonesActivacion();
        //cajastexto();
        
        //casillasverificacion();
        //listasdesplegables();
        //campodecontraseña();
        //colocartablas();
        //colocarlistas();
    }
    
    
    private void paneles(){
        panel=new JPanel(); //creacion sobre el panel
        
        //panel.setBackground(Color.LIGHT_GRAY);//se le asigna un color al panel
        panel.setLayout(null);// se desacttiva el diseño por defecto
        this.getContentPane().add(panel);//agregamos el panel a la ventana
    }
    
    private void areatexto(){
        JTextArea areatexto=new JTextArea();
        areatexto.setBounds(20, 20, 200, 300);
        //areatexto.setText("ingrese el texto aqui:");
        //areatexto.append("\nEscribe jaja: ");//añade mas texto al area
        areatexto.setEnabled(true);//permite que se edite o no el area de texto
        
        //System.out.println("el texto es:  "+areatexto.getText());
        
        
        panel.add(areatexto);
        
        //Barras de desplazamiento
        
        JScrollPane barrasdesplazamiento=new JScrollPane(areatexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barrasdesplazamiento.setBounds(20, 20, 200, 300);
        //barrasdesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barrasdesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barrasdesplazamiento);
    }
    
    private void botones(){
    JButton boton=new JButton();
        boton.setBounds(150, 350, 150, 40);
        boton.setOpaque(true);
        ImageIcon clicaqui=new ImageIcon("botoneje.png");
        boton.setIcon(new ImageIcon(clicaqui.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton);
        
        eventooyentederaton();
    }
    
    private void eventooyentederaton(){
        //agregando oyente de raton
        
        MouseListener oyente=new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                areatexto.append("Mause Clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                areatexto.append("mause preset\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };
        
      boton.addMouseListener(oyente); 
        
        
    }
    
}
