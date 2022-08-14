package vista;

import java.awt.Color;
public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Menu() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnProyectos = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnLideres = new javax.swing.JButton();
        lbCompras = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpBarraSuperior = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jpMinimizar = new javax.swing.JPanel();
        lbMinimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BANNER.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 540));

        jLabel2.setBackground(new java.awt.Color(59, 19, 71));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(59, 19, 71));
        jLabel2.setText("Informes Ministerio de Vivienda");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 540, 10));

        btnProyectos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_95.png"))); // NOI18N
        btnProyectos.setAlignmentY(0.0F);
        btnProyectos.setBorder(null);
        btnProyectos.setBorderPainted(false);
        btnProyectos.setContentAreaFilled(false);
        btnProyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProyectos.setDefaultCapable(false);
        btnProyectos.setDisabledIcon(null);
        btnProyectos.setFocusPainted(false);
        btnProyectos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProyectos.setIconTextGap(0);
        btnProyectos.setName(""); // NOI18N
        btnProyectos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_90.png"))); // NOI18N
        btnProyectos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_100.png"))); // NOI18N
        btnProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectosActionPerformed(evt);
            }
        });
        jPanel1.add(btnProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 110, 110));

        btnCompras.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_95.png"))); // NOI18N
        btnCompras.setAlignmentY(0.0F);
        btnCompras.setBorder(null);
        btnCompras.setBorderPainted(false);
        btnCompras.setContentAreaFilled(false);
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.setDefaultCapable(false);
        btnCompras.setDisabledIcon(null);
        btnCompras.setFocusPainted(false);
        btnCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompras.setIconTextGap(0);
        btnCompras.setName(""); // NOI18N
        btnCompras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_90.png"))); // NOI18N
        btnCompras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_100.png"))); // NOI18N
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 110, 110));

        btnLideres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnLideres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_95.png"))); // NOI18N
        btnLideres.setAlignmentY(0.0F);
        btnLideres.setBorder(null);
        btnLideres.setBorderPainted(false);
        btnLideres.setContentAreaFilled(false);
        btnLideres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLideres.setDefaultCapable(false);
        btnLideres.setDisabledIcon(null);
        btnLideres.setFocusPainted(false);
        btnLideres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLideres.setIconTextGap(0);
        btnLideres.setName(""); // NOI18N
        btnLideres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_90.png"))); // NOI18N
        btnLideres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_100.png"))); // NOI18N
        btnLideres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLideresActionPerformed(evt);
            }
        });
        jPanel1.add(btnLideres, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 110, 110));

        lbCompras.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lbCompras.setForeground(new java.awt.Color(59, 19, 71));
        lbCompras.setText("Compras");
        jPanel1.add(lbCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(59, 19, 71));
        jLabel4.setText("Lideres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(59, 19, 71));
        jLabel5.setText("Proyectos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        jpBarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        jpBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarraSuperiorMouseDragged(evt);
            }
        });
        jpBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarraSuperiorMousePressed(evt);
            }
        });
        jpBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpExit.setBackground(new java.awt.Color(255, 255, 255));
        jpExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpExit.setPreferredSize(new java.awt.Dimension(50, 50));
        jpExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpExitMouseEntered(evt);
            }
        });

        lbExit.setBackground(new java.awt.Color(0, 0, 0));
        lbExit.setFont(new java.awt.Font("Roboto Light", 1, 28)); // NOI18N
        lbExit.setForeground(new java.awt.Color(0, 0, 0));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setText("X");
        lbExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpExitLayout = new javax.swing.GroupLayout(jpExit);
        jpExit.setLayout(jpExitLayout);
        jpExitLayout.setHorizontalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBarraSuperior.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

        jpMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jpMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMinimizar.setPreferredSize(new java.awt.Dimension(50, 50));
        jpMinimizar.setVerifyInputWhenFocusTarget(false);

        lbMinimizar.setBackground(new java.awt.Color(0, 0, 0));
        lbMinimizar.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        lbMinimizar.setForeground(new java.awt.Color(0, 0, 0));
        lbMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimizar.setText("—");
        lbMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpMinimizarLayout = new javax.swing.GroupLayout(jpMinimizar);
        jpMinimizar.setLayout(jpMinimizarLayout);
        jpMinimizarLayout.setHorizontalGroup(
            jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMinimizarLayout.createSequentialGroup()
                .addComponent(lbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpMinimizarLayout.setVerticalGroup(
            jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBarraSuperior.add(jpMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 50, 50));

        jPanel1.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
        jpExit.setBackground(new Color(251, 51, 51));
        lbExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbExitMouseEntered

    private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
        jpExit.setBackground(Color.WHITE);
        lbExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbExitMouseExited

    private void jpExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpExitMouseClicked

    }//GEN-LAST:event_jpExitMouseClicked

    private void jpExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpExitMouseEntered

    }//GEN-LAST:event_jpExitMouseEntered

    private void jpBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpBarraSuperiorMouseDragged

    private void jpBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jpBarraSuperiorMousePressed

    private void btnLideresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLideresActionPerformed
        VistaLideres vLider = new VistaLideres();
        vLider.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLideresActionPerformed

    private void btnProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectosActionPerformed
        VistaProyectos pro = new VistaProyectos();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProyectosActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        VistaCompras compras = new VistaCompras();
        compras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnComprasActionPerformed

    // --- Eventos y estilos para minimizar
    private void lbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lbMinimizarMouseClicked

    private void lbMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseEntered
        jpMinimizar.setBackground(new Color( 30, 136, 229 ));
        lbMinimizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbMinimizarMouseEntered

    private void lbMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseExited
        jpMinimizar.setBackground(Color.WHITE);
        lbMinimizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbMinimizarMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnLideres;
    private javax.swing.JButton btnProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpMinimizar;
    private javax.swing.JLabel lbCompras;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbMinimizar;
    // End of variables declaration//GEN-END:variables
}
