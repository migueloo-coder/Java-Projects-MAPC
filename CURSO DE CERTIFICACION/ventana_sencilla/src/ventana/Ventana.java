
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class Ventana extends JFrame{
    public JPanel panel;
    
    public Ventana(){//constructor
        this.setSize(500,500);//tamaño de la vnetana
        this.setTitle("cuca");//se da el titulo
        //this.setLocation(400, 400); 
        //this.setBounds(100, 200,500 ,500 );//engloba a size o tamaño y a la localizacion en pantalla       
        this.setLocationRelativeTo(null);//establecemos el centro de la pantalla cualquiera    
        //this.setResizable(false);//establecemos si la pantalla cambia de tamaño
        this.setMinimumSize(new Dimension(300,300));//se establece el tamaño minimo de la ventana para modificar
        this.setMaximumSize(new Dimension(800,800));
        this.getContentPane().setBackground(Color.LIGHT_GRAY); //se le asigna un color a la ventana
        
        iniciar_componentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciar_componentes(){
        
        paneles();
        //etiquetas();
        //botones();
        //radioBotones();
        //botonesActivacion();
        //cajastexto();
        //areatexto();
        //casillasverificacion();
        //listasdesplegables();
        //campodecontraseña();
        //colocartablas();
        colocarlistas();
    }
    
    
    
   
    
    
    private void paneles(){
        panel=new JPanel(); //creacion sobre el panel
        
        //panel.setBackground(Color.LIGHT_GRAY);//se le asigna un color al panel
        panel.setLayout(null);// se desacttiva el diseño por defecto
        this.getContentPane().add(panel);//agregamos el panel a la ventana
    }
    private void etiquetas(){
         JLabel etiqueta=new JLabel();//creacion de la etiqueta
        //JLabel etiqueta=new JLabel("hola bebe",SwingConstants.CENTER);//creacion de la etiqueta
        etiqueta.setText("COLOMBIA");
        etiqueta.setBounds(85, 10, 300, 80);//tamaño y posicion de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.red);//le da el color a las letras 
        etiqueta.setBackground(Color.black);//le da el color de fondo de la ETIQUETA
        etiqueta.setOpaque(false);
        etiqueta.setFont(new Font("cooper black",Font.PLAIN,40));//se establece la fuente del texto, tipo y tamaño
        
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
        ImageIcon imagen =new ImageIcon("descarga.jpeg");
        
        JLabel etiqueta2=new JLabel();
        etiqueta2.setBounds(85, 80, 311,162 );//ETIQUETA DE IMAGEN
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    private void botones(){
        //boton 1
        JButton boton1=new JButton();
        boton1.setText("CLICK");//se da texto al boton
        boton1.setBounds(100, 100, 110, 40);
        boton1.setEnabled(true);//habilitar o desabilitar el boton o encendido del boton
        boton1.setForeground(Color.red);//color de la fuente del boton
        boton1.setFont(new Font("copper black",3,20));//fuente del texto dentro del boton
        panel.add(boton1);
        
        // boton 2
        JButton boton2=new JButton();
        boton2.setBounds(100, 200, 110, 40);
        boton2.setOpaque(true);
        ImageIcon clicaqui=new ImageIcon("botoneje.png");
        boton2.setIcon(new ImageIcon(clicaqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.BLUE);
        
        panel.add(boton2);
        
        //boton3
        
        JButton boton3=new JButton();
        boton3.setBounds(100, 300, 120, 50);
        boton3.setEnabled(true);//habilitar o desabilitar el boton o encendido del boton
        boton3.setBorder(BorderFactory.createLineBorder(Color.green, 4, false));
        panel.add(boton3);
    }
    private void radioBotones(){
        JRadioButton radioboton1=new JRadioButton();
        radioboton1.setBounds(50, 100, 200, 50);
        radioboton1.setEnabled(true);
        radioboton1.setText("Programacion");
        radioboton1.setFont(new Font("arial",3,20));
        panel.add(radioboton1);
        
        JRadioButton radioboton2=new JRadioButton();
        radioboton2.setBounds(50, 150, 200, 50);
        radioboton2.setEnabled(true);
        radioboton2.setText("Estructuras");
        radioboton2.setFont(new Font("arial",3,20));
        panel.add(radioboton2);
        
        JRadioButton radioboton3=new JRadioButton();
        radioboton3.setBounds(50, 200, 200, 50);
        radioboton3.setEnabled(true);
        radioboton3.setText("Calculo");
        radioboton3.setFont(new Font("arial",3,20));
        panel.add(radioboton3);
        
        JRadioButton radioboton4=new JRadioButton();
        radioboton4.setBounds(50, 250, 200, 50);
        radioboton4.setEnabled(true);
        radioboton4.setText("Mecanica");
        radioboton4.setFont(new Font("arial",3,20));
        panel.add(radioboton4);
        
        ButtonGroup gruporadiobotones=new ButtonGroup();
        gruporadiobotones.add(radioboton1);
        gruporadiobotones.add(radioboton2);
        gruporadiobotones.add(radioboton3);
        gruporadiobotones.add(radioboton4);
    }
    private void botonesActivacion(){
        JToggleButton botonactiv1=new JToggleButton("opcion1",false);
        botonactiv1.setBounds(50, 100, 200, 50);
        botonactiv1.setFont(new Font("arial",3,20));
        panel.add(botonactiv1);
        JToggleButton botonactiv2=new JToggleButton("opcion2",false);
        botonactiv2.setBounds(50, 150, 200, 50);
        botonactiv2.setFont(new Font("arial",3,20));
        panel.add(botonactiv2);
        JToggleButton botonactiv3=new JToggleButton("opcion 3",false);
        botonactiv3.setBounds(50, 200, 200, 50);
        botonactiv3.setFont(new Font("arial",3,20));
        panel.add(botonactiv3);
        JToggleButton botonactiv4=new JToggleButton("opcion4",false);
        botonactiv4.setBounds(50, 250, 200, 50);
        botonactiv4.setFont(new Font("arial",3,20));
        panel.add(botonactiv4);
        
        ButtonGroup botonesactivagrupa=new ButtonGroup();
        botonesactivagrupa.add(botonactiv1);
        botonesactivagrupa.add(botonactiv2);
        botonesactivagrupa.add(botonactiv3);
        botonesactivagrupa.add(botonactiv4);
    }
    private void cajastexto(){
        JTextField cajatxt=new JTextField();
        cajatxt.setBounds(50, 50, 100, 30);
        cajatxt.setText("hola... jajaj");
        System.out.println("Texto en la caja: "+cajatxt.getText());
        panel.add(cajatxt);
        
    }
    private void areatexto(){
        JTextArea areatexto=new JTextArea();
        areatexto.setBounds(20, 20, 300, 200);
        areatexto.setText("ingrese el texto aqui:");
        areatexto.append("\nEscribe jaja: ");//añade mas texto al area
        areatexto.setEnabled(true);//permite que se edite o no el area de texto
        
        System.out.println("el texto es:  "+areatexto.getText());
        
        
        panel.add(areatexto);
        
        //Barras de desplazamiento
        
        JScrollPane barrasdesplazamiento=new JScrollPane(areatexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barrasdesplazamiento.setBounds(20, 20, 300, 200);
        //barrasdesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barrasdesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barrasdesplazamiento);
    }
    private void casillasverificacion(){
        JCheckBox casillaveri1=new JCheckBox("leche ");
        casillaveri1.setBounds(20, 20, 150, 40);
        panel.add(casillaveri1);
        JCheckBox casillaveri2=new JCheckBox("pan ");
        casillaveri2.setBounds(20, 50, 150, 40);
        panel.add(casillaveri2);
        JCheckBox casillaveri3=new JCheckBox("huevos ");
        casillaveri3.setBounds(20, 80, 150, 40);
        panel.add(casillaveri3);
        JCheckBox casillaveri4=new JCheckBox("galletas ");
        casillaveri4.setBounds(20, 110, 150, 40);
        panel.add(casillaveri4);
        
    }
    private void listasdesplegables(){
        
       /* String [] paises={"SELECIONE UNA OPCION","Peru","Colombia","Francia","Estados unidos"};
        JComboBox listas=new JComboBox(paises);
        listas.setBounds(20, 20, 200, 30);
        
        listas.addItem("argentina");//añadir objetos a la lista depsues de ejecutar
        //listas.setSelectedItem("Francia");//seleccionar para mostrar al inicio
        panel.add(listas);
        
        */
       
        Objetos persona1=new Objetos("miguel", 1007, 20);
        Objetos persona2=new Objetos("jhon", 1023, 20);
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        JComboBox listas2=new JComboBox(modelo);
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        listas2.setBounds(20, 20, 200, 30);
        
        panel.add(listas2);
        
    }
    private void campodecontraseña(){
       JPasswordField campoContraseña=new JPasswordField();
       campoContraseña.setBounds(20, 20, 150, 30);
       //campoContraseña.setText("me duele la cuca");
       panel.add(campoContraseña);
       
       String contraseña="";
       for (int i = 0; i < campoContraseña.getPassword().length; i++) {
           contraseña+=campoContraseña.getPassword()[i];
       }
       System.out.println("la contraseña es: "+contraseña);
   }
    private void colocartablas(){
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("NACIONALIDAD");
        
        String[] persona1={"Miguel","20","colombiano"};
        String[] persona2={"Jhon","18","colombiano"};
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        JTable tabla=new JTable(modelo);
        
        tabla.setBounds(20, 20, 300, 200);
        
        panel.add(tabla);
        
        JScrollPane scroll=new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
        
    }
    private void colocarlistas(){
        DefaultListModel modelo =new DefaultListModel() ;
        
        modelo.addElement(new Objetos("Miguel pinzon",1007652271,20));
        
        JList lista=new JList(modelo);
        
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista);
        
        JScrollPane scroll=new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
        
        System.err.println("");
        
    }
    
}
