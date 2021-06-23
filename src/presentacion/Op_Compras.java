/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import Datos.ProductosDAO;
import Datos.sp_CompraSocioDAO;
import Datos.sp_CompraTrabDAO;
import Interfaces.Producto;
import Interfaces.detalleCompra;
import Interfaces.sp_cBuscarSocio;
import Interfaces.sp_cBuscarTrabajador;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static presentacion.SelecionarProductos.idEnviar;

/**
 *
 * @author yampier
 */
public class Op_Compras extends javax.swing.JFrame {

    DefaultTableModel DetCompra;
    String cabecera[] = {"IDPRODUCTO", "DESCUENTO", "PRECIO", "CANTIDAD", "SUBTOTAL"};
    int idSocio = -1;
    int idTrab = -1;
    public int idRecivido=-1;
    SelecionarProductos sp;
    public ArrayList<detalleCompra> listaDetCompra;
    ActionListener escuchador = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(idEnviar!=-1 && sp.idEnviar!=0){
                idRecivido=sp.idEnviar;
                ProductosDAO obj=new ProductosDAO();
                Producto p;
                try {
                    p=obj.ProductoSeleccion(idRecivido);
                    if(p!=null && sp.txt_cantidad.getText().length()!=0){
                        int cantidad=Integer.valueOf(sp.txt_cantidad.getText());
                        InsertarListaDetCompra(p,cantidad);
                        sp.idEnviar=-1;
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Error al Seleccionar producto");
                return;
                    }
                    //producto
                } catch (Exception ex) {
                    Logger.getLogger(Op_Compras.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("El id es :"+idRecivido);
            }
           

        }
    };

    public Op_Compras() throws Exception {
        sp = new SelecionarProductos();
        idRecivido = sp.idEnviar;
        System.out.println("opconprea" + idRecivido);
        initComponents();
        setLocationRelativeTo(null);
        DetCompra = new DefaultTableModel(null, cabecera);
        this.tabla_Productos.setModel(DetCompra);
        listaDetCompra=new ArrayList();

    }

    void buscarSocio(String nombre) throws Exception {
        sp_CompraSocioDAO objDAO = new sp_CompraSocioDAO();
        sp_cBuscarSocio sp;
        try {
            sp = objDAO.listadoSocio(nombre);
            if (sp != null) {
                this.txt_Razon.setText(sp.getRazonSocial());
                this.txt_ruc.setText(sp.getRuc());
                this.txt_representante.setText(sp.getNombre());
                this.txt_documentoS.setText(sp.getDni());
                this.txt_direccion.setText(sp.getDireccion());
                idSocio = sp.getIdSocio();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Socio no encontrado");
                return;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    void buscarTrab(String nombre) throws Exception {
        sp_CompraTrabDAO objDAO = new sp_CompraTrabDAO();
        sp_cBuscarTrabajador sp;
        try {
            sp = objDAO.listadoTrabajador(nombre);
            if (sp != null) {
                this.txt_nombreT.setText(sp.getNombre());
                this.txt_apellidoT.setText(sp.getApellido());
                this.txt_documentoT.setText(sp.getDni());
                idSocio = sp.getIdtrabajador();
            } else {
                JOptionPane.showMessageDialog(rootPane, "trabajador no encontrado");
                return;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void ListarDetCompra() {
        //ArrayList<detalleCompra> tbdetcompra=listaDetCompra;
        if (!listaDetCompra.isEmpty()) {
            try {
                for (detalleCompra obj : listaDetCompra) {
                    String fila[] = {String.valueOf(obj.getIdProducto()),
                        String.valueOf(obj.getDescuento()),
                        String.valueOf(obj.getPrecio()),
                        String.valueOf(obj.getCantidad()),
                        String.valueOf(obj.getSubtotal())};
                    DetCompra.addRow(fila);
                }
            } catch (Exception ex) {
                throw ex;
            }
        }
    }

    public void InsertarListaDetCompra(Producto p, int cantidad) {
        if (p.getNombre().length() != 0 && cantidad != 0) {
            detalleCompra dt = new detalleCompra(p.getDescuento(), p.getPrecio(), cantidad, (p.getPrecio() * cantidad), p.getIdProducto());
            listaDetCompra.add(dt);
            limpiarTabla(tabla_Productos);
            ListarDetCompra();
        }

    }
private void limpiarTabla(JTable tab) {
        DefaultTableModel tb = (DefaultTableModel) tab.getModel();
        int a = tab.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);

        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Razon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ruc = new javax.swing.JTextField();
        txt_representante = new javax.swing.JTextField();
        txt_documentoS = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nombreT = new javax.swing.JTextField();
        txt_apellidoT = new javax.swing.JTextField();
        txt_documentoT = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        txt_buscar = new javax.swing.JTextField();
        btn_bucarT = new javax.swing.JButton();
        btn_buscarS = new javax.swing.JButton();
        btn_AgregarProd = new javax.swing.JButton();
        btn_procesarc = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Productos = new javax.swing.JTable();
        jpanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_subTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_descuento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_igv = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta"));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setToolTipText("");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Socio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Razon s:");

        txt_Razon.setEditable(false);

        jLabel2.setText("RUC:");

        jLabel3.setText("Representante");

        jLabel4.setText("Documento R:");

        jLabel5.setText("Direccion:");

        txt_ruc.setEditable(false);

        txt_representante.setEditable(false);

        txt_documentoS.setEditable(false);

        txt_direccion.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_ruc)
                    .addComponent(txt_representante)
                    .addComponent(txt_documentoS)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(txt_Razon))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Razon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_representante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_documentoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trabajador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel6.setText("Nombre:");

        jLabel7.setText("Apellidos");

        jLabel8.setText("Documento:");

        txt_nombreT.setEditable(false);

        txt_apellidoT.setEditable(false);

        txt_documentoT.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txt_nombreT)
            .addComponent(txt_apellidoT)
            .addComponent(txt_documentoT)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apellidoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_documentoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txt_buscar.setPreferredSize(new java.awt.Dimension(120, 28));
        jPanel10.add(txt_buscar);

        btn_bucarT.setText("Buscar Trabajador");
        btn_bucarT.setToolTipText("");
        btn_bucarT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_bucarT.setPreferredSize(new java.awt.Dimension(150, 30));
        btn_bucarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bucarTActionPerformed(evt);
            }
        });
        jPanel10.add(btn_bucarT);

        btn_buscarS.setText("buscar Socio");
        btn_buscarS.setPreferredSize(new java.awt.Dimension(150, 30));
        btn_buscarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarSActionPerformed(evt);
            }
        });
        jPanel10.add(btn_buscarS);

        btn_AgregarProd.setText("Agregar Productos");
        btn_AgregarProd.setPreferredSize(new java.awt.Dimension(150, 30));
        btn_AgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarProdActionPerformed(evt);
            }
        });
        jPanel10.add(btn_AgregarProd);

        btn_procesarc.setText("Procesar Compra");
        btn_procesarc.setPreferredSize(new java.awt.Dimension(150, 30));
        btn_procesarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarcActionPerformed(evt);
            }
        });
        jPanel10.add(btn_procesarc);

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cancelar");
        jButton6.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de productos"));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btn_editar.setBackground(new java.awt.Color(255, 255, 153));
        btn_editar.setText("Editar");
        btn_editar.setPreferredSize(new java.awt.Dimension(90, 40));
        jPanel3.add(btn_editar);

        btn_Eliminar.setBackground(new java.awt.Color(255, 51, 51));
        btn_Eliminar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setPreferredSize(new java.awt.Dimension(90, 40));
        jPanel3.add(btn_Eliminar);

        tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_Productos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpanel.setBackground(new java.awt.Color(102, 102, 102));
        jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Compra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel9.setText("SUB");

        txt_subTotal.setEditable(false);
        txt_subTotal.setBackground(new java.awt.Color(0, 0, 0));
        txt_subTotal.setForeground(new java.awt.Color(255, 255, 0));
        txt_subTotal.setText(" ");

        jLabel10.setText("DESCUENTO");

        txt_descuento.setEditable(false);
        txt_descuento.setBackground(new java.awt.Color(0, 0, 0));
        txt_descuento.setForeground(new java.awt.Color(255, 255, 0));

        jLabel11.setText("IGV %");

        txt_igv.setEditable(false);
        txt_igv.setBackground(new java.awt.Color(0, 0, 0));
        txt_igv.setForeground(new java.awt.Color(255, 255, 0));

        jLabel12.setText("TOTAL A CANCELAR");

        txt_total.setEditable(false);
        txt_total.setBackground(new java.awt.Color(0, 0, 0));
        txt_total.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addComponent(txt_subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txt_igv, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_igv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bucarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bucarTActionPerformed
        // TODO add your handling code here:
        try {

            if (this.txt_buscar.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Documento de Trabajador no encontrado");
                this.txt_buscar.setText("");
                return;
            }

            buscarTrab(this.txt_buscar.getText());
        } catch (Exception ex) {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(Op_Compras.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_btn_bucarTActionPerformed

    private void btn_buscarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarSActionPerformed
        // TODO add your handling code here:
        try {

            if (this.txt_buscar.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Documento de SOCIO no encontrado");
                this.txt_buscar.setText("");
                return;
            }

            buscarSocio(this.txt_buscar.getText());
        } catch (Exception ex) {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(Op_Compras.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_btn_buscarSActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_AgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarProdActionPerformed
        // TODO add your handling code here:

        try {
            sp = new SelecionarProductos();
            sp.btn_agregar.addActionListener(escuchador);
        } catch (Exception ex) {
            Logger.getLogger(Op_Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        sp.setVisible(true);

    }//GEN-LAST:event_btn_AgregarProdActionPerformed

    private void btn_procesarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarcActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_procesarcActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Op_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Op_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Op_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Op_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Op_Compras().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Op_Compras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarProd;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_bucarT;
    private javax.swing.JButton btn_buscarS;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_procesarc;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanel;
    private javax.swing.JTable tabla_Productos;
    private javax.swing.JTextField txt_Razon;
    private javax.swing.JTextField txt_apellidoT;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_documentoS;
    private javax.swing.JTextField txt_documentoT;
    private javax.swing.JTextField txt_igv;
    private javax.swing.JTextField txt_nombreT;
    private javax.swing.JTextField txt_representante;
    private javax.swing.JTextField txt_ruc;
    private javax.swing.JTextField txt_subTotal;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
