package vista;

import java.awt.Color;
import modelo.ConsultasProyectos;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import controlador.GenerarReportePDF;

public class VistaProyectos extends javax.swing.JFrame {

    int xMouse, yMouse;

    public VistaProyectos() {
        initComponents();
        this.setLocationRelativeTo(null);
        ConsultasProyectos.verDatos();

        editarHeaderJtable();
        jtReportesProyectos.setFont(new Font("Serif", Font.BOLD, 20));
        //jtReportesLideres.setDefaultRenderer(Object.class, new MiRender());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jpBarraSuperior = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jpAtras = new javax.swing.JPanel();
        lbAtras = new javax.swing.JLabel();
        jpMinimizar = new javax.swing.JPanel();
        lbMinimizar = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReportesProyectos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGroup(jpExitLayout.createSequentialGroup()
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExitLayout.createSequentialGroup()
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpBarraSuperior.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        jpAtras.setBackground(new java.awt.Color(255, 255, 255));
        jpAtras.setAlignmentX(100.0F);
        jpAtras.setAlignmentY(100.0F);
        jpAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpAtras.setPreferredSize(new java.awt.Dimension(50, 50));

        lbAtras.setBackground(new java.awt.Color(0, 0, 0));
        lbAtras.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        lbAtras.setForeground(new java.awt.Color(0, 0, 0));
        lbAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAtras.setText("<");
        lbAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpAtrasLayout = new javax.swing.GroupLayout(jpAtras);
        jpAtras.setLayout(jpAtrasLayout);
        jpAtrasLayout.setHorizontalGroup(
            jpAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpAtrasLayout.setVerticalGroup(
            jpAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBarraSuperior.add(jpAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpMinimizarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpMinimizarLayout.setVerticalGroup(
            jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpMinimizarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jpBarraSuperior.add(jpMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 50, 50));

        bg.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        lbTitle.setBackground(new java.awt.Color(59, 19, 71));
        lbTitle.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(59, 19, 71));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Informe de Proyectos");
        bg.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, -1));

        jtReportesProyectos.setFont(new java.awt.Font("Roboto", 0, 8)); // NOI18N
        jtReportesProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtReportesProyectos.setRowHeight(25);
        jtReportesProyectos.setSelectionBackground(new java.awt.Color(255, 154, 17));
        jtReportesProyectos.setSelectionForeground(new java.awt.Color(59, 19, 71));
        jtReportesProyectos.setShowVerticalLines(true);
        jtReportesProyectos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtReportesProyectos);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 600, 280));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_GUARDAR_REPORTE 40x40.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_GUARDAR_REPORTE 43x43.png"))); // NOI18N
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        bg.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 45, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lbAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseClicked
        Menu me = new Menu();
        VistaProyectos vi = new VistaProyectos();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbAtrasMouseClicked

    private void lbAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseEntered
        jpAtras.setBackground(new Color(255, 175, 114));
        lbAtras.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbAtrasMouseEntered

    private void lbAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseExited
        jpAtras.setBackground(Color.WHITE);
        lbAtras.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbAtrasMouseExited

    private void jpBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpBarraSuperiorMouseDragged

    private void jpBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jpBarraSuperiorMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        GenerarReportePDF.generarReporteProyectos();
    }//GEN-LAST:event_btnGuardarActionPerformed

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

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setToolTipText("Guardar Reporte");
    }//GEN-LAST:event_btnGuardarMouseEntered
    
    //Método para editar el Header del jtable
    private void editarHeaderJtable(){
        JTableHeader header = jtReportesProyectos.getTableHeader();
        header.setFont(new Font("Roboto", Font.BOLD, 16));
        header.setOpaque(false);
        jtReportesProyectos.getTableHeader().setBackground(new Color(0x1E89CC));
        
        //PROBANDO COLORES
        //jtReportesLideres.getTableHeader().setBackground(new Color(0x3B1347));
        //jtReportesLideres.getTableHeader().setForeground(new Color(0xEAD5FF));
        
        
        //Centrar encabezado del Header
        //((DefaultTableCellRenderer) jtReportesLideres.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }
    

    
    /*public class MiRender extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row,
            int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (row %2 == 0){
                cell.setBackground(Color.RED);
            }else{
                cell.setForeground(Color.WHITE);
            }
           
            return cell;
        }
    }*/

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(VistaProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAtras;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpMinimizar;
    public static javax.swing.JTable jtReportesProyectos;
    private javax.swing.JLabel lbAtras;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
