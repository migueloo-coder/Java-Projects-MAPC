
package Paquete_1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class CRUD extends javax.swing.JFrame {
public static final String URL="jdbc:mysql://sql10.freesqldatabase.com:3306/sql10411418"+"?useTimezone=true&serverTimezone=UTC";
public static final String usuario="sql10411418";
public static final String contraseña="2PyEfPtC4k";
public static Connection conn;    
   
PreparedStatement ps;
ResultSet rs;

     public Connection getConnection(){
        conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(URL,usuario,contraseña);
            //JOptionPane.showMessageDialog(null,"conexion exitosa");
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        return conn;
    }
     
    public void limpiarcajas(){
        cajabuscar.setText(null);
        cajaid.setText(null);
        cajaclave.setText(null);
        cajanombre.setText(null);
        cajadireccion.setText(null);
        cajacelular.setText(null);
        cajacorreo.setText(null);
        cajafecha.setText(null);
        combogenero.setSelectedIndex(0);
    }
            
            
    
    public CRUD() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cajabuscar = new javax.swing.JTextField();
        botonbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaclave = new javax.swing.JTextField();
        cajanombre = new javax.swing.JTextField();
        cajadireccion = new javax.swing.JTextField();
        cajacorreo = new javax.swing.JTextField();
        cajafecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        combogenero = new javax.swing.JComboBox<>();
        botoninsertar = new javax.swing.JButton();
        botonmodificar = new javax.swing.JButton();
        botoneliminar = new javax.swing.JButton();
        botonlimpiar = new javax.swing.JButton();
        cajacelular = new javax.swing.JTextField();
        cajaid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        jTextField3.setText("jTextField3");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cajabuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajabuscarActionPerformed(evt);
            }
        });

        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Clave");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Celular");

        jLabel5.setText("Correo electronico");

        jLabel6.setText("Fecha Nacimiento");

        cajanombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajanombreActionPerformed(evt);
            }
        });

        jLabel7.setText("Genero");

        combogenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));
        combogenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogeneroActionPerformed(evt);
            }
        });

        botoninsertar.setText("Insertar");
        botoninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninsertarActionPerformed(evt);
            }
        });

        botonmodificar.setText("Modificar");
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });

        botoneliminar.setText("Eliminar");
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });

        botonlimpiar.setText("Limpiar");
        botonlimpiar.setPreferredSize(new java.awt.Dimension(69, 23));
        botonlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlimpiarActionPerformed(evt);
            }
        });

        cajacelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajacelularActionPerformed(evt);
            }
        });

        jLabel8.setText("JUGADOR Nº");

        jLabel10.setText("CLAVE JUGADOR");

        jLabel11.setText("Edad");

        jLabel12.setText("Categoria");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Categorizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajaid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cajanombre)
                                    .addComponent(cajacelular, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                    .addComponent(cajaclave, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajadireccion)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(cajacorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(botoninsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(botoneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(botonlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cajaclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cajanombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajadireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajacelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajacorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajafecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botoninsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botoneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoninsertarActionPerformed
        
        Connection conexion=null;
        try{
            conexion=getConnection();
            ps=conexion.prepareStatement("insert into persona(clave,nombre,direccion,telefono,correoelectronico,fechanacimiento,genero)values(?,?,?,?,?,?,?)");
            ps.setString(1,cajaclave.getText() );
            ps.setString(2, cajanombre.getText());
            ps.setString(3,cajadireccion.getText());
            ps.setString(4,cajacelular.getText());
            ps.setString(5, cajacorreo.getText());
            ps.setDate(6, Date.valueOf(cajafecha.getText()));
            ps.setString(7, combogenero.getSelectedItem().toString());
            
            
            
            int resultado=ps.executeUpdate();//se ejecuta la insercion en la base de datos
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro Insertado con exito");
                limpiarcajas();
                        }else{
                              JOptionPane.showMessageDialog(null, "Error al insertar el resgistro");
                              limpiarcajas();
            }
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
        
    }//GEN-LAST:event_botoninsertarActionPerformed

    private void botonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlimpiarActionPerformed
       limpiarcajas();
    }//GEN-LAST:event_botonlimpiarActionPerformed

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
       
        Connection conexion=null;
        try{
            conexion=getConnection();
            ps=conexion.prepareStatement("delete from persona where idpersona=?");
            
            ps.setInt(1, Integer.parseInt(cajaid.getText()));
            
            int resultado=ps.executeUpdate();//se ejecuta la eliminacion
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado con exito");
                limpiarcajas();
                        }else{
                              JOptionPane.showMessageDialog(null, "Error al Eliminar el resgistro");
                              limpiarcajas();
            }
            conexion.close();
        }catch(Exception ex){
            System.err.println("Erros, "+ex);
        }
        
        
        
        
    }//GEN-LAST:event_botoneliminarActionPerformed

    private void cajacelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajacelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajacelularActionPerformed

    private void combogeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combogeneroActionPerformed

    private void cajabuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajabuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajabuscarActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        Connection conexion=null;
        try{
            conexion=getConnection();
            ps=conexion.prepareStatement("select * from persona where clave=?");
            ps.setString(1, cajabuscar.getText());
            rs=ps.executeQuery();
            if (rs.next()){
                cajaid.setText(String.valueOf(rs.getInt("idpersona")));
                cajaclave.setText(rs.getString("clave"));
                cajanombre.setText(rs.getString("nombre"));
                cajadireccion.setText(rs.getString("direccion"));
                cajacelular.setText(rs.getString("telefono"));
                cajacorreo.setText(rs.getString("correoelectronico"));
                cajafecha.setText(String.valueOf(rs.getDate("fechanacimiento")));
                combogenero.setSelectedItem(rs.getString("genero"));
            }else{
                JOptionPane.showMessageDialog(null, "No existe esa persona con la clave: | "+cajaclave.getText()+" |");
            }
            
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error, "+ex);   
        }
                
        
        
        
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
        
        Connection conexion=null;
        try{
            conexion=getConnection();
            ps=conexion.prepareStatement("update persona set clave=?,nombre=?,direccion=?,telefono=?,correoelectronico=?,fechanacimiento=?,genero=? where idpersona=?");
            ps.setString(1,cajaclave.getText() );
            ps.setString(2, cajanombre.getText());
            ps.setString(3,cajadireccion.getText());
            ps.setString(4,cajacelular.getText());
            ps.setString(5, cajacorreo.getText());
            ps.setDate(6, Date.valueOf(cajafecha.getText()));
            ps.setString(7, combogenero.getSelectedItem().toString());
            ps.setInt(8, Integer.parseInt(cajaid.getText()));
            int resultado=ps.executeUpdate();//se ejecuta la insercion en la base de datos
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro Modificado con exito");
                limpiarcajas();
                        }else{
                              JOptionPane.showMessageDialog(null, "Error al Modificar el resgistro");
                              limpiarcajas();
            }
            conexion.close();
        }catch(Exception ex){
            System.err.println("Erros, "+ex);
        }
        
        
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void cajanombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajanombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajanombreActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JButton botoninsertar;
    private javax.swing.JButton botonlimpiar;
    private javax.swing.JButton botonmodificar;
    private javax.swing.JTextField cajabuscar;
    private javax.swing.JTextField cajacelular;
    private javax.swing.JTextField cajaclave;
    private javax.swing.JTextField cajacorreo;
    private javax.swing.JTextField cajadireccion;
    private javax.swing.JTextField cajafecha;
    private javax.swing.JTextField cajaid;
    private javax.swing.JTextField cajanombre;
    private javax.swing.JComboBox<String> combogenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
