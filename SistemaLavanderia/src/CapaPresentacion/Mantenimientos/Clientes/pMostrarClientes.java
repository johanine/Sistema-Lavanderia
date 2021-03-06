/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion.Mantenimientos.Clientes;

import CapaDatos.cDatos;
import CapaLogica.cCliente;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joha
 */
public class pMostrarClientes extends javax.swing.JPanel {

    /**
     * Creates new form pMostrarCliente
     */
    // Atributos
    public cDatos oConexion;
    cCliente oCliente = new cCliente(oConexion);
    int mensaje = 0;// 0 - error
    
    public pMostrarClientes() {
        initComponents();
        CargarDatosTabla(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBuscarBoleta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBoleta = new javax.swing.JTable();

        jLabel1.setText("MOSTRAR CLIENTE");

        jScrollPane1.setViewportView(tbBoleta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBuscarBoletaLayout = new javax.swing.GroupLayout(pnlBuscarBoleta);
        pnlBuscarBoleta.setLayout(pnlBuscarBoletaLayout);
        pnlBuscarBoletaLayout.setHorizontalGroup(
            pnlBuscarBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBuscarBoletaLayout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBuscarBoletaLayout.setVerticalGroup(
            pnlBuscarBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarBoletaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBuscarBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBuscarBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBuscarBoleta;
    private javax.swing.JTable tbBoleta;
    // End of variables declaration//GEN-END:variables

    private void CargarDatosTabla(ResultSet dato) {
        try{
            Object datos[][];
            String titulos[];
            DefaultTableModel dtmEjemplo;
            titulos= oCliente.getTitulos();
            if(dato!= null){
                datos = oCliente.getDatos(dato);// verificar por pato
            }
            else{
                datos = oCliente.getDatos();
            }
            
            dtmEjemplo = new DefaultTableModel(datos,titulos);
            tbBoleta.setModel(dtmEjemplo);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:"+e);
        }
        
    }
}
