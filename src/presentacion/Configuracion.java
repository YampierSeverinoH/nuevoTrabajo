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
public class Configuracion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Configuracion
     */
    CONF_Contactos CONFcontastos;
    CONF_Empresa CONFempresa;
    CONF_Politicas CONFmigrar;

    public Configuracion() {
        initComponents();
        this.setLocation(200, 50);
        CONFcontastos = new CONF_Contactos();
        CONFempresa = new CONF_Empresa();
        CONFmigrar = new CONF_Politicas();
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
        jPanel3 = new javax.swing.JPanel();
        btn_CONFempresa = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_CONFmigrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_CONFcontactos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("CONFIGURACIONES");
        setPreferredSize(new java.awt.Dimension(1284, 567));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione opciones:"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa"));
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel3.setLayout(new java.awt.BorderLayout());

        btn_CONFempresa.setBackground(new java.awt.Color(102, 255, 102));
        btn_CONFempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CONFempresaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_CONFempresa, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tienda"));
        jPanel4.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel4.setLayout(new java.awt.BorderLayout());

        btn_CONFmigrar.setBackground(new java.awt.Color(102, 255, 102));
        btn_CONFmigrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CONFmigrarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_CONFmigrar, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Contactanos"));
        jPanel5.setPreferredSize(new java.awt.Dimension(120, 130));
        jPanel5.setLayout(new java.awt.BorderLayout());

        btn_CONFcontactos.setBackground(new java.awt.Color(102, 255, 102));
        btn_CONFcontactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CONFcontactosActionPerformed(evt);
            }
        });
        jPanel5.add(btn_CONFcontactos, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 420, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1284, 567));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CONFempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CONFempresaActionPerformed
        // TODO add your handling code here:
        this.CONFempresa.setVisible(true);
    }//GEN-LAST:event_btn_CONFempresaActionPerformed

    private void btn_CONFmigrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CONFmigrarActionPerformed
        // TODO add your handling code here:
        this.CONFmigrar.setVisible(true);
    }//GEN-LAST:event_btn_CONFmigrarActionPerformed

    private void btn_CONFcontactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CONFcontactosActionPerformed
        // TODO add your handling code here:
        this.CONFcontastos.setVisible(true);
    }//GEN-LAST:event_btn_CONFcontactosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CONFcontactos;
    private javax.swing.JButton btn_CONFempresa;
    private javax.swing.JButton btn_CONFmigrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
