package com.login;

import Mysql.ManejoUsuarios;
import java.awt.Color;
import javax.swing.JOptionPane;

public class registro extends javax.swing.JFrame {

    int xMouse, yMouse;

    public registro() {
        initComponents();
    }

    ManejoUsuarios metodos = new ManejoUsuarios();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        userTxt1 = new javax.swing.JTextField();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        userLabel1 = new javax.swing.JLabel();
        loginBtn1 = new javax.swing.JPanel();
        loginBtnTxt1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(51, 102, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(51, 102, 255));

        exitTxt.setBackground(new java.awt.Color(51, 102, 255));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("REGISTRATE");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setText("CORREO ELECTRONICO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        userTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 190, 20));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 170, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 170, 20));

        userTxt1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userTxt1.setBorder(null);
        userTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxt1MousePressed(evt);
            }
        });
        userTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxt1ActionPerformed(evt);
            }
        });
        bg.add(userTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 180, 30));

        loginBtn.setBackground(new java.awt.Color(0, 134, 190));

        loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("REGISTRARSE");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 130, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 170, 20));

        userLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel1.setText("NOMBRE");
        bg.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        loginBtn1.setBackground(new java.awt.Color(0, 134, 190));

        loginBtnTxt1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt1.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt1.setText("CANCELAR");
        loginBtnTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBtnTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtn1Layout = new javax.swing.GroupLayout(loginBtn1);
        loginBtn1.setLayout(loginBtn1Layout);
        loginBtn1Layout.setHorizontalGroup(
            loginBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtn1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginBtn1Layout.setVerticalGroup(
            loginBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtn1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        bg.add(loginBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 130, 40));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 490, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 494, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(51, 102, 255));
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese correo electronico")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese correo electronico");
            userTxt.setForeground(Color.gray);
        }
        if (userTxt1.getText().isEmpty()) {
            userTxt1.setText("Ingrese su nombre completo");
            userTxt1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        String nombre = userTxt1.getText();
        String correo = userTxt.getText();
        String contrasena = passTxt.getText();
        if (!nombre.equals("") && !correo.equals("") && !contrasena.equals("")) {
            System.out.println("nombre" + nombre);
            System.out.println("correo" + correo);
            System.out.println("contraseña" + contrasena);

            metodos.guardar(userTxt1.getText(), userTxt.getText(), passTxt.getText());
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario registrado correctamente :\nUsuario: " + userTxt.getText() + "\nContrasena: " + String.valueOf(passTxt.getPassword()), "REGISTRAR", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Login usuario = new Login();
            usuario.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR!\nTodos los campos son obligatorios");
            userTxt1.setText("");
            userTxt.setText("");
            passTxt.setText("");
        }
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void userTxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxt1MousePressed
        if (userTxt1.getText().equals("Ingrese su nombre completo")) {
            userTxt1.setText("");
            userTxt1.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxt1MousePressed

    private void userTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxt1ActionPerformed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void loginBtnTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt1MouseClicked
        Login usuario = new Login();
        usuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginBtnTxt1MouseClicked

    private void loginBtnTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt1MouseEntered
        loginBtn1.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_loginBtnTxt1MouseEntered

    private void loginBtnTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt1MouseExited
        loginBtn1.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_loginBtnTxt1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JPanel loginBtn1;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel loginBtnTxt1;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JTextField userTxt;
    private javax.swing.JTextField userTxt1;
    // End of variables declaration//GEN-END:variables
}
