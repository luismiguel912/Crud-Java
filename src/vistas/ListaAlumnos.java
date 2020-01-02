/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import Proyecto.modelo.dt.AlumnosDT;
import Proyecto.modelo.facade.sistemaFacade;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ListaAlumnos extends javax.swing.JInternalFrame {
    AlumnosDT dt = new AlumnosDT();
    sistemaFacade fac = new sistemaFacade();

    /**
     * Creates new form ListaAlumnos
     */
    public ListaAlumnos() {
        initComponents();
        llenado();
    }
    
      public void llenado(){
        String[]columnas={"Clave Alumnos","Matricula","Grupo","Nombre","aPaterno","aMaterno","Direccion","Telefono","Email","FechaNacimiento","Sexo","Actualizar","Eliminar"};
        List lista;
        int fila =-1;
        try {
            Object[][] data= new Object[fac.listaAlumnos().size()][13];
            lista=fac.listaAlumnos();
            //Actualizar
            Iterator it=lista.iterator();
            while(it.hasNext()){
                dt = (AlumnosDT) it.next();
                fila++;
            data[fila][0] = dt.getIdAlumnos();
            data[fila][1] = dt.getMatricula();
            data[fila][2] = dt.getGrupo();
            data[fila][3] = dt.getNombre();
            data[fila][4] = dt.getaPaterno();
            data[fila][5] = dt.getaMaterno();
            data[fila][6] = dt.getDireccion();
            data[fila][7] = dt.getTelefono();
            data[fila][8] = dt.getEmail();
            data[fila][9] = dt.getFechaNacimiento();
            data[fila][10] = dt.getSexo();
            data[fila][11]="Actualizar";
            data[fila][12]="Eliminar";
                
            }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(data,columnas));
        } catch (Exception e) {
            Logger.getLogger(ListaAlumnos.class.getName()).log(Level.SEVERE, null,e);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pantallaLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(96, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        dt.setIdAlumnos(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString()));
        dt.setMatricula(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
        dt.setGrupo(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
        dt.setNombre(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
        dt.setaPaterno(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
        dt.setaMaterno(jTable1.getValueAt(jTable1.getSelectedRow(),5).toString());
        dt.setDireccion(jTable1.getValueAt(jTable1.getSelectedRow(),6).toString());
        dt.setTelefono(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),7).toString()));
        dt.setEmail(jTable1.getValueAt(jTable1.getSelectedRow(),8).toString());
       // dt.setFechaNacimiento(Date.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),9).toString()));
        
        dt.setSexo(jTable1.getValueAt(jTable1.getSelectedRow(),10).toString());
        
        if(jTable1.getSelectedColumn() ==11){
            //Actualizar
            if(JOptionPane.showConfirmDialog(this, "Estas seguro de actualizar los datos","Actualizar",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                try {
                    //Llamar  al metedo en sistema facade para actualizar
                    fac.actualizaAlumnos(dt);
                } catch (SQLException e) {
                    Logger.getLogger(ListaAlumnos.class.getName()).log(Level.SEVERE, null,e);
                }catch (Exception e) {
                    Logger.getLogger(ListaAlumnos.class.getName()).log(Level.SEVERE, null,e);
                }
                
            }    
        }
        
        if(jTable1.getSelectedColumn() == 12){
            //Eliminar
            if(JOptionPane.showConfirmDialog(this, "Estas seguro de Eliminar los datos","Elimnar",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                try {
                    //Llamar  al metedo en sistema facade para actualizar
                    fac.eliminarAlumnos(dt);
                    llenado();
                } catch (SQLException e) {
                    Logger.getLogger(ListaAlumnos.class.getName()).log(Level.SEVERE, null,e);
                }catch (Exception e) {
                    Logger.getLogger(ListaAlumnos.class.getName()).log(Level.SEVERE, null,e);
                }
                
            }
        }
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pantalla;
    // End of variables declaration//GEN-END:variables
}
