/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Agenda;

import Mysql.ManejoUsuarios;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Brv8c
 */
public class agregarTarea extends javax.swing.JFrame {
    private MuestraAgenda muestraAgenda;
    private agenda agenda;
    public agregarTarea(MuestraAgenda muestraAgenda) {
        super("Agenda App");
        initComponents();
        this.muestraAgenda = muestraAgenda;
        agenda = new agenda("", Calendar.getInstance(), "");
    }
    ManejoUsuarios guardar = new ManejoUsuarios();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        AgregarButtton = new javax.swing.JButton();
        NombreEvento = new javax.swing.JTextField();
        tipoEventoComboBox = new javax.swing.JComboBox<>();
        prioridadComboBox = new javax.swing.JComboBox<>();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        CancelarButtton = new javax.swing.JButton();
        Dia = new javax.swing.JLabel();
        tituloAgregar = new javax.swing.JLabel();
        TipoEvento = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionTarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarButtton.setText("GUARDAR");
        AgregarButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButttonActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarButtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        NombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEventoActionPerformed(evt);
            }
        });
        jPanel2.add(NombreEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, 30));

        tipoEventoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarea", "Examen", "Trabajo", "Tramite", "Otro" }));
        tipoEventoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoEventoComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(tipoEventoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 230, 30));

        prioridadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "urgente", "media", "baja" }));
        prioridadComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(prioridadComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 110, 50));
        jPanel2.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 150, 30));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 204, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 500, 40));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 204, 255));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 40));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 255));
        jSeparator3.setForeground(new java.awt.Color(102, 204, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 500, 40));

        CancelarButtton.setText("CANCELAR");
        CancelarButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButttonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelarButtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, -1));

        Dia.setBackground(new java.awt.Color(102, 204, 255));
        Dia.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        Dia.setForeground(new java.awt.Color(102, 204, 255));
        Dia.setText("SELECCIONAR DIA");
        jPanel2.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        tituloAgregar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        tituloAgregar.setForeground(new java.awt.Color(102, 204, 255));
        tituloAgregar.setText("AGREGAR ACTIVIDAD");
        tituloAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(225, 225, 225), new java.awt.Color(225, 225, 225)));
        jPanel2.add(tituloAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 30));

        TipoEvento.setBackground(new java.awt.Color(102, 204, 255));
        TipoEvento.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        TipoEvento.setForeground(new java.awt.Color(102, 204, 255));
        TipoEvento.setText("TIPO DE EVENTO");
        jPanel2.add(TipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        nombre.setBackground(new java.awt.Color(102, 204, 255));
        nombre.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 204, 255));
        nombre.setText("       NOMBRE");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        DescripcionTarea.setColumns(20);
        DescripcionTarea.setRows(5);
        jScrollPane1.setViewportView(DescripcionTarea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 400, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
private void agregarTarea() {
        String Nombre =  NombreEvento.getText();
        String tipoEvento = (String) tipoEventoComboBox.getSelectedItem();
        String prioridad = (String) prioridadComboBox.getSelectedItem();
        Date selectedDate = dateChooser.getDate();

        Calendar fecha = Calendar.getInstance();
        fecha.setTime(selectedDate);

        agenda nuevaTarea = new agenda(tipoEvento, fecha, prioridad);

        switch (prioridad.toLowerCase()) {
            case "urgente":
                agenda.agregarUrgente(nuevaTarea);
                break;
            case "media":
                agenda.agregarMedia(nuevaTarea);
                break;
            case "baja":
                agenda.agregarBaja(nuevaTarea);
                break;
            default:
                break;
        }

        tipoEventoComboBox.setSelectedIndex(0);
        dateChooser.setDate(null);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    }

    private void AgregarButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButttonActionPerformed
        String nombre = NombreEvento.getText();
        String descripcion = DescripcionTarea.getText();
        Date fecha = dateChooser.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String fechaFormateada = sdf.format(fecha.getTime());
        
        guardar.guardarActividad(nombre, descripcion, fecha, nombre);
        String NombreAct = guardar.buscarActividad(NombreEvento.getText(),DescripcionTarea.getText(),NombreEvento.getText(),fechaFormateada);
        
        String formato = (fechaFormateada + "\n" + nombre);
        muestraAgenda.tareas.append(formato);
        /*MuestraAgenda menu = new MuestraAgenda();
        menu.tareas.setText(formato);
        
        menu.setVisible(true);*/
        this.dispose();
        
    }//GEN-LAST:event_AgregarButttonActionPerformed

    private void NombreEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEventoActionPerformed

    private void tipoEventoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoEventoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoEventoComboBoxActionPerformed

    private void CancelarButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarButttonActionPerformed

    private void prioridadComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButtton;
    private javax.swing.JButton CancelarButtton;
    private javax.swing.JTextArea DescripcionTarea;
    private javax.swing.JLabel Dia;
    private javax.swing.JTextField NombreEvento;
    private javax.swing.JLabel TipoEvento;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel nombre;
    private javax.swing.JComboBox<String> prioridadComboBox;
    private javax.swing.JComboBox<String> tipoEventoComboBox;
    private javax.swing.JLabel tituloAgregar;
    // End of variables declaration//GEN-END:variables

}
