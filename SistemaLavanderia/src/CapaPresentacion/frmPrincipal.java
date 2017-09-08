/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaPresentacion.Mantenimientos.Clientes.pAgregarCliente;
import CapaPresentacion.*;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Cesia
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jdpPantallaInicio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSesion = new javax.swing.JMenu();
        mitemCerrarSesion = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();
        jMenuMantenimiento = new javax.swing.JMenu();
        miUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        miProductos = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmReportes = new javax.swing.JMenu();
        jmiRepClientes = new javax.swing.JMenuItem();
        jmiRepUsuario = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPantallaInicio.setBackground(new java.awt.Color(0, 18, 50));

        javax.swing.GroupLayout jdpPantallaInicioLayout = new javax.swing.GroupLayout(jdpPantallaInicio);
        jdpPantallaInicio.setLayout(jdpPantallaInicioLayout);
        jdpPantallaInicioLayout.setHorizontalGroup(
            jdpPantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );
        jdpPantallaInicioLayout.setVerticalGroup(
            jdpPantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jMenuSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exec.png"))); // NOI18N
        jMenuSesion.setText("Sesion");
        jMenuSesion.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        mitemCerrarSesion.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mitemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarSesion.png"))); // NOI18N
        mitemCerrarSesion.setText("Cerrar Sesion");
        mitemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuSesion.add(mitemCerrarSesion);

        miSalir.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        miSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenuSesion.add(miSalir);

        jMenuBar1.add(jMenuSesion);

        jMenuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agt_Utilities.png"))); // NOI18N
        jMenuMantenimiento.setText("Mantenimiento");
        jMenuMantenimiento.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        miUsuarios.setText("Usuarios");
        miUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuariosActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(miUsuarios);

        jMenu2.setText("jMenu2");
        jMenu2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N

        jMenuItem9.setText("jMenuItem9");
        jMenu2.add(jMenuItem9);

        jMenuMantenimiento.add(jMenu2);

        jMenuItem5.setText("Compra");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItem5);

        jMenuItem8.setText("Factura");
        jMenuMantenimiento.add(jMenuItem8);

        jMenuItem7.setText("Boleta");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItem7);

        jMenuItem6.setText("Prenda");
        jMenuMantenimiento.add(jMenuItem6);

        miProductos.setText("Productos");
        jMenuMantenimiento.add(miProductos);

        jMenuItem10.setText("jMenuItem10");
        jMenuMantenimiento.add(jMenuItem10);

        jMenuBar1.add(jMenuMantenimiento);

        jMenu1.setText("Servicios");
        jMenu1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        jMenuItem2.setText("Registrar Servicio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jmReportes.setText("Reportes");
        jmReportes.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        jmiRepClientes.setText("Clientes");
        jmReportes.add(jmiRepClientes);

        jmiRepUsuario.setText("Usuario");
        jmReportes.add(jmiRepUsuario);

        jMenuBar1.add(jmReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPantallaInicio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPantallaInicio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemCerrarSesionActionPerformed
        // TODO add your handling code here:
       FrmLogin login= new FrmLogin();
        login.setVisible(true);
        login.pack();
        this.setVisible(false);
    }//GEN-LAST:event_mitemCerrarSesionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_miSalirActionPerformed

    private void miUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuariosActionPerformed
        // TODO add your handling code here:
        pAgregarCliente nuevo = new pAgregarCliente();
        jdpPantallaInicio.add(nuevo);
        nuevo.setVisible(true);

    }//GEN-LAST:event_miUsuariosActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuMantenimiento;
    private javax.swing.JMenu jMenuSesion;
    private javax.swing.JDesktopPane jdpPantallaInicio;
    private javax.swing.JMenu jmReportes;
    private javax.swing.JMenuItem jmiRepClientes;
    private javax.swing.JMenuItem jmiRepUsuario;
    private javax.swing.JMenuItem miProductos;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JMenuItem miUsuarios;
    private javax.swing.JMenuItem mitemCerrarSesion;
    // End of variables declaration//GEN-END:variables
}
