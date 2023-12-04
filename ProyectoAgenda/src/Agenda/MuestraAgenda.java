package Agenda;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MuestraAgenda extends javax.swing.JFrame {

    public MuestraAgenda() {
        initComponents();
    }
    public void agregarTarea(String tarea) {
        tareas.append(tarea + "\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        textobienvenida = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cambiarVentana = new javax.swing.JLabel();
        añadir = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tareas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textobienvenida.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textobienvenida.setText("Bienvenido(a)");
        fondo.add(textobienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 30));

        nombreUsuario.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        nombreUsuario.setText(" ");
        fondo.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 240, 30));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("  TAREAS");
        titulo.setToolTipText("");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cambiarVentana.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cambiarVentana.setForeground(new java.awt.Color(255, 255, 255));
        cambiarVentana.setText(" =");
        cambiarVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cambiarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarVentanaMouseClicked(evt);
            }
        });

        añadir.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        añadir.setForeground(new java.awt.Color(255, 255, 255));
        añadir.setText("+");
        añadir.setToolTipText("");
        añadir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cambiarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(147, 147, 147)
                .addComponent(añadir)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cambiarVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));
        fondo.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 550, 30));

        tareas.setColumns(20);
        tareas.setRows(5);
        jScrollPane2.setViewportView(tareas);

        fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 420, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarVentanaMouseClicked
        //codigo para cambiar de ordenamiento
    }//GEN-LAST:event_cambiarVentanaMouseClicked

    private void añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirMouseClicked
        /*AgendaGUI nuevaAgenda = new AgendaGUI();
        nuevaAgenda.setVisible(true);*/
        agregarTarea tarea = new agregarTarea(this);
        tarea.setVisible(true);
    }//GEN-LAST:event_añadirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuestraAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel añadir;
    private javax.swing.JLabel cambiarVentana;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel nombreUsuario;
    private javax.swing.JSeparator separador;
    public javax.swing.JTextArea tareas;
    private javax.swing.JLabel textobienvenida;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
