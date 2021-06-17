/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author yampier
 */
public class Procesos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Procesos
     */
    PRO_Almacen PROalmancen;
    PRO_Areas PROareas;
    PRO_Clientes PROclientes;
    PRO_Persona PROpersona;
    PRO_Productos PROproductos;
    PRO_Socio PROsocio;
    PRO_Trabajador PROtrabajador;
    PRO_Usuarios PROusuarios;

    public Procesos() throws Exception {
        initComponents();
        this.setLocation(200, 50);
        PROalmancen = new PRO_Almacen();
        PROareas = new PRO_Areas();
        PROclientes = new PRO_Clientes();
        PROpersona = new PRO_Persona();
        PROproductos = new PRO_Productos();
        PROsocio = new PRO_Socio();
        PROtrabajador = new PRO_Trabajador();
        PROusuarios = new PRO_Usuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_RgClientes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_RgSocio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_RgProductos = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btn_RgTrabajador = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_RgUsuarios = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_RgAlmacen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("REGISTRAR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione Opción:"));
        jPanel1.setToolTipText("");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));
        jPanel4.setToolTipText("");
        jPanel4.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel4.setLayout(new java.awt.BorderLayout());

        btn_RgClientes.setBackground(new java.awt.Color(102, 255, 102));
        btn_RgClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RgClientesActionPerformed(evt);
            }
        });
        jPanel4.add(btn_RgClientes, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Prestatario/Socio"));
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel3.setLayout(new java.awt.BorderLayout());

        btn_RgSocio.setBackground(new java.awt.Color(102, 255, 102));
        btn_RgSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RgSocioActionPerformed(evt);
            }
        });
        jPanel3.add(btn_RgSocio, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btn_RgProductos.setBackground(new java.awt.Color(102, 255, 102));
        btn_RgProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RgProductosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_RgProductos, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabajador"));
        jPanel9.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel9.setLayout(new java.awt.BorderLayout());

        btn_RgTrabajador.setBackground(new java.awt.Color(102, 255, 102));
        btn_RgTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RgTrabajadorActionPerformed(evt);
            }
        });
        jPanel9.add(btn_RgTrabajador, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));
        jPanel6.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel6.setLayout(new java.awt.BorderLayout());

        btn_RgUsuarios.setBackground(new java.awt.Color(102, 255, 102));
        btn_RgUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RgUsuariosActionPerformed(evt);
            }
        });
        jPanel6.add(btn_RgUsuarios, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Almacen"));
        jPanel7.setToolTipText("");
        jPanel7.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel7.setLayout(new java.awt.BorderLayout());

        btn_RgAlmacen.setBackground(new java.awt.Color(102, 255, 102));
        btn_RgAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RgAlmacenActionPerformed(evt);
            }
        });
        jPanel7.add(btn_RgAlmacen, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 470, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1284, 567));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RgClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RgClientesActionPerformed
        // TODO add your handling code here:
         this.PROclientes.setVisible(true);
    }//GEN-LAST:event_btn_RgClientesActionPerformed

    private void btn_RgSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RgSocioActionPerformed
        // TODO add your handling code here:
        this.PROsocio.setVisible(true);
    }//GEN-LAST:event_btn_RgSocioActionPerformed

    private void btn_RgProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RgProductosActionPerformed
        // TODO add your handling code here:
        this.PROproductos.setVisible(true);
    }//GEN-LAST:event_btn_RgProductosActionPerformed

    private void btn_RgTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RgTrabajadorActionPerformed
        // TODO add your handling code here:
        this.PROtrabajador.setVisible(true);
    }//GEN-LAST:event_btn_RgTrabajadorActionPerformed

    private void btn_RgAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RgAlmacenActionPerformed
        // TODO add your handling code here:
        this.PROalmancen.setVisible(true);
    }//GEN-LAST:event_btn_RgAlmacenActionPerformed

    private void btn_RgUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RgUsuariosActionPerformed
        // TODO add your handling code here:
        this.PROusuarios.setVisible(true);
    }//GEN-LAST:event_btn_RgUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RgAlmacen;
    private javax.swing.JButton btn_RgClientes;
    private javax.swing.JButton btn_RgProductos;
    private javax.swing.JButton btn_RgSocio;
    private javax.swing.JButton btn_RgTrabajador;
    private javax.swing.JButton btn_RgUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
