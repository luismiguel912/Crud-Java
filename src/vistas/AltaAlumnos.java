/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import Proyecto.modelo.dt.AlumnosDT;
import Proyecto.modelo.facade.sistemaFacade;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class AltaAlumnos extends javax.swing.JInternalFrame {
    sistemaFacade fac =new sistemaFacade();
    AlumnosDT dt = new AlumnosDT();

    /**
     * Creates new form AltaAlumnos
     */
    public AltaAlumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtaPaterno = new javax.swing.JTextField();
        txtaMaterno = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cbxDia = new javax.swing.JComboBox();
        cbxSexo = new javax.swing.JComboBox();
        cbxMes = new javax.swing.JComboBox();
        cbxAño = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Alta Alumnos");

        jLabel2.setText("matricula");

        jLabel3.setText("grupo");

        jLabel4.setText("nombre");

        jLabel5.setText("aPaterno");

        jLabel6.setText("aMaterno");

        jLabel7.setText("direccion");

        jLabel8.setText("telefono");

        jLabel9.setText("email");

        jLabel10.setText("fechaNacimiento");

        jLabel11.setText("sexo");

        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyTyped(evt);
            }
        });

        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });
        txtGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrupoKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtaPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaPaternoKeyTyped(evt);
            }
        });

        txtaMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaMaternoKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel(fac.numeros(1,31)));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre" }));

        cbxAño.setModel(new javax.swing.DefaultComboBoxModel(fac.numeros (1980,2015)));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(pantallaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jLabel11))
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pantallaLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(txtGrupo)
                                .addComponent(txtNombre)
                                .addComponent(txtaPaterno)
                                .addComponent(txtaMaterno)
                                .addComponent(txtDireccion)
                                .addComponent(txtTelefono)
                                .addComponent(txtEmail)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pantallaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(53, 53, 53))
                    .addGroup(pantallaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtaPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(22, 22, 22)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtaMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //codigo para validar o dar mensaje de campos vacios (ButtonGuardar-events-ActionPerformed) 

            if(txtMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta campos por llenar!!!","error",JOptionPane. ERROR_MESSAGE);
          }
            else if(txtGrupo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta campos por llenar!!!","error",JOptionPane. ERROR_MESSAGE);
          }
            else if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta campos por llenar!!!","error",JOptionPane. ERROR_MESSAGE);
          }
            else if(txtaPaterno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta campos por llenar!!!","error",JOptionPane. ERROR_MESSAGE);
          }
            else if(txtaMaterno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta campos por llenar!!!","error",JOptionPane. ERROR_MESSAGE);
          }
             else if(txtDireccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta campos por llenar!!!","error",JOptionPane. ERROR_MESSAGE);
          }
             else if(txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta campos por llenar!!!","error",JOptionPane. ERROR_MESSAGE);
          }
             else if(txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta campos por llenar!!!","error",JOptionPane. ERROR_MESSAGE);
          }
             else{
        try {
            if(dt != null){

                dt.setMatricula(txtMatricula.getText());
                txtMatricula.setText("");
                dt.setGrupo(txtGrupo.getText());
                txtGrupo.setText("");
                dt.setNombre(txtNombre.getText());
                txtNombre.setText("");
                dt.setaPaterno(txtaPaterno.getText());
                txtaPaterno.setText("");
                dt.setaMaterno(txtaMaterno.getText());
                txtaMaterno.setText("");
                dt.setDireccion(txtDireccion.getText());
                txtDireccion.setText("");
                dt.setTelefono(Integer.parseInt(txtTelefono.getText()));
                txtTelefono.setText("");
                dt.setEmail(txtEmail.getText());
                txtEmail.setText("");

                String dia = cbxDia.getSelectedItem().toString();
                String mes = cbxMes.getSelectedItem().toString();
                String año = cbxAño.getSelectedItem().toString();
                //Formato
                SimpleDateFormat df = new SimpleDateFormat("dd-MMMMM-yyyy");

                String fecha = dia+"-"+mes+"-"+ año;
                long Fecha = df.parse(fecha).getTime();
                Date fech = new Date (Fecha);
                dt.setFechaNacimiento(fech);
                
                
                dt.setSexo(String.valueOf(cbxSexo.getSelectedItem().toString().charAt(0)));
                fac.nuevoAlumnos(dt);
                
            }else{

            }
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (Exception e) {
            Logger.getLogger(AltaAlumnos.class.getName()).log(Level.SEVERE,null, e);
        }
             }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyTyped
        // TODO add your handling code here:
        //codigo para validar los campos de letras(events-Key-KeyType)

 char c = evt.getKeyChar();
        
        if((c<'a'  || c>'z') && (c<'A'  )| c>'Z' )evt.consume();
    }//GEN-LAST:event_txtMatriculaKeyTyped

    private void txtGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrupoKeyTyped
        // TODO add your handling code here:
        //codigo para validar los campos de letras(events-Key-KeyType)

 char c = evt.getKeyChar();
        
        if((c<'a'  || c>'z') && (c<'A'  )| c>'Z' )evt.consume();
    }//GEN-LAST:event_txtGrupoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        //codigo para validar los campos de letras(events-Key-KeyType)

 char c = evt.getKeyChar();
        
        if((c<'a'  || c>'z') && (c<'A'  )| c>'Z' )evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtaPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaPaternoKeyTyped
        // TODO add your handling code here:
        //codigo para validar los campos de letras(events-Key-KeyType)

 char c = evt.getKeyChar();
        
        if((c<'a'  || c>'z') && (c<'A'  )| c>'Z' )evt.consume();
    }//GEN-LAST:event_txtaPaternoKeyTyped

    private void txtaMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaMaternoKeyTyped
        // TODO add your handling code here:
        //codigo para validar los campos de letras(events-Key-KeyType)

 char c = evt.getKeyChar();
        
        if((c<'a'  || c>'z') && (c<'A'  )| c>'Z' )evt.consume();
    }//GEN-LAST:event_txtaMaternoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        //codigo para validar los campos de letras(events-Key-KeyType)

 char c = evt.getKeyChar();
        
        if((c<'a'  || c>'z') && (c<'A'  )| c>'Z' )evt.consume();
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        //codigo para validar los campos de numeros(events-Key-KeyType)

    char c = evt.getKeyChar();
        
        if(c<'0'  || c>'9') evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxAño;
    private javax.swing.JComboBox cbxDia;
    private javax.swing.JComboBox cbxMes;
    private javax.swing.JComboBox cbxSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pantalla;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtaMaterno;
    private javax.swing.JTextField txtaPaterno;
    // End of variables declaration//GEN-END:variables
}