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
public class Consultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultas
     */
    CS_Clientes CSclientes;
    CS_Empleados CSempleados;
    CS_Pedidos CSperdido;
    CS_Productos CSproductos;
    CS_Ventas CSVentas;
    CS_sucursales CSsucursales;

    public Consultas() {
        initComponents();
        this.CSperdido = new CS_Pedidos();
        this.CSVentas = new CS_Ventas();
        this.CSproductos = new CS_Productos();
        this.CSsucursales = new CS_sucursales();
        this.CSclientes = new CS_Clientes();
        this.CSempleados = new CS_Empleados();
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
        jPanel7 = new javax.swing.JPanel();
        btn_CsVentas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_CsPedidos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_CsProductos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_CsSucursal = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_CsEmpleados = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btn_CsClientes = new javax.swing.JButton();
        JL_FondoConsultas = new javax.swing.JLabel();

        setTitle("CONSULTAS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione Opción:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jPanel7.setBackground(null);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel7.setLayout(new java.awt.BorderLayout());

        btn_CsVentas.setBackground(new java.awt.Color(102, 255, 102));
        btn_CsVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/CS_ventas.png"))); // NOI18N
        btn_CsVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CsVentasActionPerformed(evt);
            }
        });
        jPanel7.add(btn_CsVentas, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel5.setBackground(null);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(120, 130));

        btn_CsPedidos.setBackground(new java.awt.Color(102, 255, 102));
        btn_CsPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/CS_pedidos.png"))); // NOI18N
        btn_CsPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CsPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btn_CsPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(btn_CsPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);

        jPanel4.setBackground(null);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(120, 130));

        btn_CsProductos.setBackground(new java.awt.Color(102, 255, 102));
        btn_CsProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/CS_productos.png"))); // NOI18N
        btn_CsProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CsProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btn_CsProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btn_CsProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jPanel6.setBackground(null);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sucursal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(120, 130));

        btn_CsSucursal.setBackground(new java.awt.Color(102, 255, 102));
        btn_CsSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/CS_Sucursales.png"))); // NOI18N
        btn_CsSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CsSucursalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btn_CsSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btn_CsSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);

        jPanel8.setBackground(null);
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(120, 130));

        btn_CsEmpleados.setBackground(new java.awt.Color(102, 255, 102));
        btn_CsEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/CS_Empleados.png"))); // NOI18N
        btn_CsEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CsEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btn_CsEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_CsEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8);

        jPanel9.setBackground(null);
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel9.setPreferredSize(new java.awt.Dimension(120, 130));

        btn_CsClientes.setBackground(new java.awt.Color(102, 255, 102));
        btn_CsClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/CS_Clientes.png"))); // NOI18N
        btn_CsClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CsClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btn_CsClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_CsClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel9);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 500, 330));

        JL_FondoConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/fondo.png"))); // NOI18N
        JL_FondoConsultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(JL_FondoConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1284, 567));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CsVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CsVentasActionPerformed
        // TODO add your handling code here:

        CSVentas.setVisible(true);
    }//GEN-LAST:event_btn_CsVentasActionPerformed

    private void btn_CsPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CsPedidosActionPerformed
        // TODO add your handling code here:

        CSperdido.setVisible(true);
    }//GEN-LAST:event_btn_CsPedidosActionPerformed

    private void btn_CsProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CsProductosActionPerformed
        // TODO add your handling code here:

        CSproductos.setVisible(true);
    }//GEN-LAST:event_btn_CsProductosActionPerformed

    private void btn_CsSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CsSucursalActionPerformed
        // TODO add your handling code here:

        CSsucursales.setVisible(true);
    }//GEN-LAST:event_btn_CsSucursalActionPerformed

    private void btn_CsEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CsEmpleadosActionPerformed
        // TODO add your handling code here:

        CSempleados.setVisible(true);
    }//GEN-LAST:event_btn_CsEmpleadosActionPerformed

    private void btn_CsClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CsClientesActionPerformed
        // TODO add your handling code here:

        CSclientes.setVisible(true);
    }//GEN-LAST:event_btn_CsClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_FondoConsultas;
    private javax.swing.JButton btn_CsClientes;
    private javax.swing.JButton btn_CsEmpleados;
    private javax.swing.JButton btn_CsPedidos;
    private javax.swing.JButton btn_CsProductos;
    private javax.swing.JButton btn_CsSucursal;
    private javax.swing.JButton btn_CsVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
