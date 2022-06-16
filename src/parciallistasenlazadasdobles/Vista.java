package parciallistasenlazadasdobles;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/** @author Jose Ignacio */

public class Vista extends javax.swing.JFrame {
    
    ListaEnlazadaDoble le;
    Nodo nd;
    
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        le = new ListaEnlazadaDoble();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidentificador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbacceso = new javax.swing.JComboBox<>();
        cbextension = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblSalir = new javax.swing.JLabel();
        btnmayor = new javax.swing.JButton();
        btnordenar = new javax.swing.JButton();
        btncontarchivos = new javax.swing.JButton();
        btnlistadoportipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("ARCHIVOS REGISTRADOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel3);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 570, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Identificador:");

        txtidentificador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtidentificador.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("INGRESAR DATOS");

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregar.setText("REGISTRAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        txtnombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Tamaño:");

        txttam.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txttam.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Acceso:");

        cbacceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.", "Lectura", "Escritura", "Ejecucion" }));

        cbextension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.", ".DOC", ".PDF", ".TXT" }));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Extension:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbextension, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbacceso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttam, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 16, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbextension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 380));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nombre", "Acceso", "Extension", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 530, 210));

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("X");
        lblSalir.setToolTipText("SALIR");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.setFocusable(false);
        lblSalir.setOpaque(true);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });
        jPanel1.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 40));

        btnmayor.setBackground(new java.awt.Color(255, 255, 255));
        btnmayor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnmayor.setText("Archivo Mayor Tamaño");
        btnmayor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmayorActionPerformed(evt);
            }
        });
        jPanel1.add(btnmayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 190, -1));

        btnordenar.setBackground(new java.awt.Color(255, 255, 255));
        btnordenar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnordenar.setText("Ordenar Por Tamaño");
        btnordenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 160, -1));

        btncontarchivos.setBackground(new java.awt.Color(255, 255, 255));
        btncontarchivos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncontarchivos.setText("Numero Archivos por tipo");
        btncontarchivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncontarchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontarchivosActionPerformed(evt);
            }
        });
        jPanel1.add(btncontarchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 190, -1));

        btnlistadoportipo.setBackground(new java.awt.Color(255, 255, 255));
        btnlistadoportipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnlistadoportipo.setText("Listado Por Tipo");
        btnlistadoportipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlistadoportipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistadoportipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnlistadoportipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 129, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiar(){
    txtidentificador.setText("");
    txtnombre.setText("");
    txttam.setText("");
    }
    
    public void agregarATabla() {
        Nodo temp = le.getCabeza();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

        while (temp != null) {

            Object[] fila = new Object[5];
            fila[0] = temp.getIdentificador();
            fila[1] = temp.getNombre();
            fila[2] = temp.getPermisosDeAcesso();
            fila[3] = temp.getExtension();
            fila[4] = temp.getTam();

            model.addRow(fila);

            temp = temp.getSiguiente();
        }

    }
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {

            nd = new Nodo();

            int id = Integer.parseInt(txtidentificador.getText());
            String nombre = txtnombre.getText();
            String permiso = cbacceso.getSelectedItem().toString();
            String extension = cbextension.getSelectedItem().toString();
            float tam = Float.parseFloat(txttam.getText());

            if (le.BuscarJugadores(id) != null) {
                JOptionPane.showMessageDialog(null, "EL IDENTIFICADOR INGRESADO YA EXISTE");
                
            } else {

                if (cbacceso.getSelectedItem().toString().equals("Seleccione.") || cbextension.getSelectedItem().toString().equals("Seleccione.")) {

                    JOptionPane.showMessageDialog(rootPane, "SELECCIONE UN PERMISO DE ACCESO Y UNA EXTENSION ");
                    
                } else {

                    nd.setIdentificador(id);
                    nd.setNombre(nombre);
                    nd.setPermisosDeAcesso(permiso);
                    nd.setExtension(extension);
                    nd.setTam(tam);

                    le.agregarAcabeza(nd);
                    agregarATabla();
                    Limpiar();
                    JOptionPane.showMessageDialog(rootPane, "ARCHIVO GUARDADO");
                }
     
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "INGRESE CORRECTAMENTE TODOS LOS DATOS");

        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(Color.RED);
        lblSalir.setForeground(Color.WHITE);
       
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(Color.WHITE);
        lblSalir.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblSalirMouseExited

    private void btnmayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmayorActionPerformed
        try {
            
            float tam = le.maxtAM();

        JOptionPane.showMessageDialog(null, "El máximo tamaño es: " + tam + "\nNombre : " + le.BuscarArchivotam(tam).getNombre()
        + "\nID : " + le.BuscarArchivotam(tam).getIdentificador());
            
        } catch (NullPointerException e) {
        
        JOptionPane.showMessageDialog(null, "NO HAY ARCHIVOS");
            
        }
    }//GEN-LAST:event_btnmayorActionPerformed

    private void btnordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordenarActionPerformed
      
        if (le.getCabeza() == null) {

            JOptionPane.showMessageDialog(null, "NO HAY ARCHIVOS PARA ORDENAR");

        } else {
            le.OrdenarIntercambio();
            agregarATabla();
            }
        
    }//GEN-LAST:event_btnordenarActionPerformed

    private void btncontarchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontarchivosActionPerformed
        if (le.getCabeza() == null) {
            JOptionPane.showMessageDialog(null, "NO HAY ARCHIVOS PARA CONTAR");

        } else {
            le.ContadorPorTipo();
        }
    }//GEN-LAST:event_btncontarchivosActionPerformed

    private void btnlistadoportipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistadoportipoActionPerformed
         if (le.getCabeza() == null) {

            JOptionPane.showMessageDialog(null, "NO HAY ARCHIVOS");

        } else {
            le.ListadoPorTipo();
        }
    }//GEN-LAST:event_btnlistadoportipoActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btncontarchivos;
    private javax.swing.JButton btnlistadoportipo;
    private javax.swing.JButton btnmayor;
    private javax.swing.JButton btnordenar;
    private javax.swing.JComboBox<String> cbacceso;
    private javax.swing.JComboBox<String> cbextension;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtidentificador;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttam;
    // End of variables declaration//GEN-END:variables
}
