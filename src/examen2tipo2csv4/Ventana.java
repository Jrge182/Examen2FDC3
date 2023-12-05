package examen2tipo2csv4;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Ventana extends javax.swing.JFrame {

    ArrayList<Alumnos> alumnos = new ArrayList<>();
    DefaultTableModel modelo;
    
    private int filaSeleccionada;

    public Ventana() {
        initComponents();
        modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtArchivo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        txtMat1 = new javax.swing.JTextField();
        txtMat2 = new javax.swing.JTextField();
        txtMat3 = new javax.swing.JTextField();
        txtMat4 = new javax.swing.JTextField();
        txtMat5 = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMat6 = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Grupo", "Nombre", "Mat 1", "Mat 2", "Mat 3", "Mat 4", "Mat 5", "Mat 6", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Abrir archivo CSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtArchivo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtArchivo.setText("Abre un archivo...");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Informacion", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setText("Grupo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Mat 1:");

        jLabel4.setText("Mat 2:");

        jLabel5.setText("Mat 3:");

        jLabel6.setText("Mat 4:");

        jLabel7.setText("Mat 5:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });

        txtMat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMat1ActionPerformed(evt);
            }
        });

        txtMat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMat2ActionPerformed(evt);
            }
        });

        txtMat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMat3ActionPerformed(evt);
            }
        });

        txtMat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMat4ActionPerformed(evt);
            }
        });

        txtMat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMat5ActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setText("Mat 6:");

        txtMat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMat6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtMat6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGrupo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMat1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMat2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMat3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMat5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar)
                            .addComponent(btnGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtMat4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtMat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnEliminar.setText("Eliminar Dato");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar Dato");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Grupo", "Nombre", "Mat 1", "Mat 2", "Mat 3", "Mat 4", "Mat 5", "Mat 6", "Promedio" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton5.setText("Up");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Down");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 33, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArchivo)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnAgregar)
                            .addComponent(jButton2))
                        .addGap(34, 34, 34)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser jfc = new JFileChooser();
        
        jfc.setCurrentDirectory(new File("user.documents"));
        int r = jfc.showOpenDialog(this);
        System.out.println("Resultado: " + r);
        
        if (r == 0){
            //System.out.println("Archivo seleccionado!");
            
            File miFile = jfc.getSelectedFile();
            String path = miFile.getAbsolutePath();
            System.out.println("Ruta: " + 
                    miFile.getAbsolutePath());
            
            txtArchivo.setText("< " + miFile.getName() + " >");
//            System.out.println("Tipo: " +
//                    jfc.getTypeDescription(miFile));
            String ext1 = jfc.getTypeDescription(miFile);
            
            if(ext1.equals("Archivo de valores separados por comas de Microsoft Excel")){
//                System.out.println("Archivo correcto! XD");
                openFile(path);
                mostrarDatosTabla();
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Archivo incorrecto! :(");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoActionPerformed

    private void txtMat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat1ActionPerformed

    private void txtMat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat2ActionPerformed

    private void txtMat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat3ActionPerformed

    private void txtMat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMat4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat4ActionPerformed

    private void txtMat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMat5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat5ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        modelo.setValueAt(txtGrupo.getText().trim(), filaSeleccionada, 1);
        modelo.setValueAt(txtNombre.getText().trim(), filaSeleccionada, 2);
        modelo.setValueAt(txtMat1.getText().trim(), filaSeleccionada, 3);
        modelo.setValueAt(txtMat2.getText().trim(), filaSeleccionada, 4);
        modelo.setValueAt(txtMat3.getText().trim(), filaSeleccionada, 5);
        modelo.setValueAt(txtMat4.getText().trim(), filaSeleccionada, 6);
        modelo.setValueAt(txtMat5.getText().trim(), filaSeleccionada, 7);
        modelo.setValueAt(txtMat6.getText().trim(), filaSeleccionada, 8);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        filaSeleccionada = jTable1.getSelectedRow();
        txtGrupo.setText(modelo.getValueAt(jTable1.getSelectedRow(), 1).toString());
        txtNombre.setText(modelo.getValueAt(jTable1.getSelectedRow(), 2).toString());
        txtMat1.setText(modelo.getValueAt(jTable1.getSelectedRow(), 3).toString());
        txtMat2.setText(modelo.getValueAt(jTable1.getSelectedRow(), 4).toString());
        txtMat3.setText(modelo.getValueAt(jTable1.getSelectedRow(), 5).toString());
        txtMat4.setText(modelo.getValueAt(jTable1.getSelectedRow(), 6).toString());
        txtMat5.setText(modelo.getValueAt(jTable1.getSelectedRow(), 7).toString());
        txtMat6.setText(modelo.getValueAt(jTable1.getSelectedRow(), 8).toString());
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1){
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Estas seguro que deseas eliminar el dato?",
                    "Advertencia",
                    JOptionPane.YES_NO_OPTION
                    );
            
            if(respuesta == 0){
                
                int[] selectedRows = jTable1.getSelectedRows();
                
                
                for (int i = selectedRows.length - 1; i >= 0; i--) {
                    modelo.removeRow(selectedRows[i]);
                }
            }       
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        SubVentanaAgregar sva1 = new SubVentanaAgregar(this, true);
        sva1.alumnos = alumnos;

        sva1.setVisible(true);
        
        //mostrarPersona();
        
        sva1.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent we) {
                System.out.println("Cerraste la subventana");
                mostrarDatosTabla();
            }
        });
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtMat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMat6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:     
        if (!alumnos.isEmpty()){

            String opCombo = (String) jComboBox1.getSelectedItem();

            switch(opCombo) {
               case "ID":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getID)
                    );
                break;
                
               case "Grupo":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getGrupo)
                    );
                break;
                
               case "Nombre":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getNombre)
                    );
                break;
                
               case "Mat 1":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat1)
                    );
                break;
                
               case "Mat 2":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat2)
                    );
                break;
               case "Mat 3":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat3)
                    );
                break;
                
               case "Mat 4":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat4)
                    );
                break;
                
               case "Mat 5":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat5)
                    );
                break;
                
               case "Mat 6":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat6)
                    );
                break;
                
               case "Promedio":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getProm)
                    );
                break;

                //Copiar el case de arriba para cada cosito

            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                if (!alumnos.isEmpty()){

            String opCombo = (String) jComboBox1.getSelectedItem();

            switch(opCombo) {
               case "ID":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getID).reversed()
                    );
                break;
                
               case "Grupo":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getGrupo).reversed()
                    );
                break;
                
               case "Nombre":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getNombre).reversed()
                    );
                break;
                
               case "Mat 1":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat1).reversed()
                    );
                break;
                
               case "Mat 2":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat2).reversed()
                    );
                break;
               case "Mat 3":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat3).reversed()
                    );
                break;
                
               case "Mat 4":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat4).reversed()
                    );
                break;
                
               case "Mat 5":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat5).reversed()
                    );
                break;
                
               case "Mat 6":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getMat6).reversed()
                    );
                break;
                
               case "Promedio":
                    alumnos.sort(
                    Comparator.comparing(Alumnos::getProm).reversed()
                    );
                break;

                //Copiar el case de arriba para cada cosito

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //No quiso guardar el archivo
        
        
//        FileWriter fw = new FileWriter(nombreArchivo);
//
//        // Creamos un objeto BufferedWriter
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        // Iteramos por las filas del JTable
//        for (int i = 0; i < jTable1.getRowCount(); i++) {
//            // Escribimos los datos de cada fila en el archivo CSV
//            bw.write(jTable1.getValueAt(i, 0) + 
//                    "," + jTable1.getValueAt(i, 1) + 
//                    "," + jTable1.getValueAt(i, 2) + 
//                    "," + jTable1.getValueAt(i, 3) +
//                    "," + jTable1.getValueAt(i, 4) +
//                    "," + jTable1.getValueAt(i, 5) +
//                    "," + jTable1.getValueAt(i, 6) +
//                    "," + jTable1.getValueAt(i, 7) +
//                    "," + jTable1.getValueAt(i, 8) +
//                    "\n");
//        }
//
//        // Cerramos el archivo
//        bw.close();
    }//GEN-LAST:event_jButton2ActionPerformed


    
    
    
    
        private void mostrarDatosTabla() {
        modelo.setRowCount(0);
        
        for (Alumnos a: alumnos) {
            String datos[] = {
                Integer.toString(a.getID()),
                a.getGrupo(),
                a.getNombre(),
                Integer.toString(a.getMat1()),
                Integer.toString(a.getMat2()),
                Integer.toString(a.getMat3()),
                Integer.toString(a.getMat4()),
                Integer.toString(a.getMat5()),
                Integer.toString(a.getMat6()),
                Double.toString(a.getProm())
            };
            modelo.addRow(datos);
        }
    }
        
//    private void mostrarAlumnos() {
//        
//        String resultado = "";&
//        for (Alumnos a: alumnos) {
//                resultado = resultado + a.getNombre() + ", " +
//                        a.getApellido() + ", " +
//                        a.getEdad() + " - ";
//            }
//    }
    
        
    private void openFile(String path){
        alumnos = new ArrayList<>();
        try {
            String linea = "";
            BufferedReader br = new BufferedReader(
                new FileReader(path)
            );
            
            while((linea = br.readLine()) != null) {
                String[] dato = linea.split(",");
                alumnos.add(new Alumnos(
                        Integer.parseInt(dato[0]),
                        dato[1],
                        dato[2],
                        Integer.parseInt(dato[3]),
                        Integer.parseInt(dato[4]),
                        Integer.parseInt(dato[5]),
                        Integer.parseInt(dato[6]),
                        Integer.parseInt(dato[7]),
                        Integer.parseInt(dato[8]),
                        Double.parseDouble(dato[9])              
                        
                ));
//                System.out.println(dato[0] + "- " + dato[1] + 
//                        "- " + dato[2] + "- " + dato[3]);
            }
        } catch(IOException ioe) {}
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtArchivo;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtMat1;
    private javax.swing.JTextField txtMat2;
    private javax.swing.JTextField txtMat3;
    private javax.swing.JTextField txtMat4;
    private javax.swing.JTextField txtMat5;
    private javax.swing.JTextField txtMat6;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
