package examen2tipo2csv4;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SubVentanaAgregar extends javax.swing.JDialog {

//    Personas persona[];
    ArrayList<Alumnos> alumnos;
//    int index;
    
    public SubVentanaAgregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMat1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMat2 = new javax.swing.JTextField();
        txtMat3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMat4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMat5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProm = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMat6 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Agregar alumnos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Grupo:");

        txtGrupo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGrupoFocusGained(evt);
            }
        });
        txtGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGrupoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mat 1:");

        txtMat1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMat1FocusGained(evt);
            }
        });
        txtMat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMat1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mat 2:");

        txtMat2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMat2FocusGained(evt);
            }
        });
        txtMat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMat2MouseClicked(evt);
            }
        });

        txtMat3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMat3FocusGained(evt);
            }
        });
        txtMat3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMat3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mat 3:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mat 4:");

        txtMat4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMat4FocusGained(evt);
            }
        });
        txtMat4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMat4MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mat 5:");

        txtMat5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMat5FocusGained(evt);
            }
        });
        txtMat5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMat5MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID:");

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
        });
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Promedio:");

        txtProm.setEditable(false);
        txtProm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPromFocusGained(evt);
            }
        });
        txtProm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPromMouseClicked(evt);
            }
        });
        txtProm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPromActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mat 6:");

        txtMat6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMat6FocusGained(evt);
            }
        });
        txtMat6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMat6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(txtGrupo)
                    .addComponent(txtNombre)
                    .addComponent(txtMat1)
                    .addComponent(txtMat2)
                    .addComponent(txtMat3)
                    .addComponent(txtMat4)
                    .addComponent(txtMat5)
                    .addComponent(txtProm)
                    .addComponent(txtMat6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtProm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular promedio");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGuardar)
                    .addComponent(btnCalcular))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private int xMouse, yMouse;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        this.setLocation(
                this.getLocation().x + evt.getX() - xMouse, 
                this.getLocation().y + evt.getY() - yMouse
                );
    }//GEN-LAST:event_formMouseDragged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        String mensaje = "";
        boolean statusMensaje = false;
        
        try {
            Integer.parseInt(txtID.getText());
        } catch(Exception e) {
            //mensaje = mensaje + "Numero no valido!! :(\n";
            statusMensaje = true;
            txtID.setBorder(new LineBorder(Color.GREEN, 2));
            //JOptionPane.showMessageDialog(null, "Numero no valido!! :(");
        }
        
        if (txtGrupo.getText().equals("")) {
            //mensaje = "Dato vacio!! Checkale\n";
            txtGrupo.setBorder(new LineBorder(Color.GREEN, 2));
            statusMensaje = true;
            //JOptionPane.showMessageDialog(null, "Dato vacio!! Checkale");
        }
        
        if (txtNombre.getText().equals("")) {
            txtNombre.setBorder(new LineBorder(Color.GREEN, 2));
            statusMensaje = true;
        }
        
        try {
            Integer.parseInt(txtMat1.getText());
        } catch(Exception e) {
            //mensaje = mensaje + "Numero no valido!! :(\n";
            statusMensaje = true;
            txtMat1.setBorder(new LineBorder(Color.GREEN, 2));
            //JOptionPane.showMessageDialog(null, "Numero no valido!! :(");
        }
        int materia1 = Integer.parseInt(txtMat1.getText());
        
        try {
            Integer.parseInt(txtMat2.getText());
        } catch(Exception e) {
            //mensaje = mensaje + "Numero no valido!! :(\n";
            statusMensaje = true;
            txtMat2.setBorder(new LineBorder(Color.GREEN, 2));
            //JOptionPane.showMessageDialog(null, "Numero no valido!! :(");
        }
        int materia2 = Integer.parseInt(txtMat2.getText());
     
        try {
            Integer.parseInt(txtMat3.getText());
        } catch(Exception e) {
            //mensaje = mensaje + "Numero no valido!! :(\n";
            statusMensaje = true;
            txtMat3.setBorder(new LineBorder(Color.GREEN, 2));
            //JOptionPane.showMessageDialog(null, "Numero no valido!! :(");
        }
        int materia3 = Integer.parseInt(txtMat3.getText());
   
        try {
            Integer.parseInt(txtMat4.getText());
        } catch(Exception e) {
            //mensaje = mensaje + "Numero no valido!! :(\n";
            statusMensaje = true;
            txtMat4.setBorder(new LineBorder(Color.GREEN, 2));
            //JOptionPane.showMessageDialog(null, "Numero no valido!! :(");
        }
        int materia4 = Integer.parseInt(txtMat4.getText());
        
        try {
            Integer.parseInt(txtMat5.getText());
        } catch(Exception e) {
            //mensaje = mensaje + "Numero no valido!! :(\n";
            statusMensaje = true;
            txtMat5.setBorder(new LineBorder(Color.GREEN, 2));
            //JOptionPane.showMessageDialog(null, "Numero no valido!! :(");
        }
        int materia5 = Integer.parseInt(txtMat5.getText());
        
        try {
            Integer.parseInt(txtMat6.getText());
        } catch(Exception e) {
            //mensaje = mensaje + "Numero no valido!! :(\n";
            statusMensaje = true;
            txtMat5.setBorder(new LineBorder(Color.GREEN, 2));
            //JOptionPane.showMessageDialog(null, "Numero no valido!! :(");
        }
        int materia6 = Integer.parseInt(txtMat6.getText());
        
        
            Double.parseDouble(txtProm.getText());
            int promSum = (materia1 + materia2 + materia3 + materia4 + materia5 + materia6) / 6;
            
            String promFinal = String.valueOf(promSum);
            
            txtProm.setText(promFinal);
            
        
        
        
        if (!statusMensaje) {
            //JOptionPane.showMessageDialog(null, mensaje);
//            persona[0].setNombre(cuadroNombre.getText());
//            persona[0].setApellido(cuadroApellido.getText());
//            persona[0].setEdad(Integer.parseInt(cuadroEdad.getText()));
            
//                persona[index] = new Personas(
//                        cuadroNombre.getText(),
//                        cuadroApellido.getText(),
//                        Integer.parseInt(cuadroEdad.getText())
//                );

            alumnos.add(new Alumnos(
                    Integer.parseInt(txtID.getText()),
                    txtGrupo.getText(),
                    txtNombre.getText(),
                    Integer.parseInt(txtMat1.getText()),
                    Integer.parseInt(txtMat2.getText()),
                    Integer.parseInt(txtMat3.getText()),
                    Integer.parseInt(txtMat4.getText()),
                    Integer.parseInt(txtMat5.getText()),
                    Integer.parseInt(txtMat6.getText()),
                    Double.parseDouble(txtProm.getText())
                    
            )); 
            dispose();
        }
        
//        persona.setNombre(cuadroNombre.getText());
//        persona.setApellido(cuadroApellido.getText());
//        persona.setEdad(Integer.parseInt(cuadroEdad.getText()));
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtMat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMat1MouseClicked
        // TODO add your handling code here:
        changeColor(txtMat1);
    }//GEN-LAST:event_txtMat1MouseClicked

    private void txtGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGrupoMouseClicked
        // TODO add your handling code here:
        changeColor(txtGrupo);
    }//GEN-LAST:event_txtGrupoMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
        changeColor(txtNombre);
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtMat1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMat1FocusGained
        // TODO add your handling code here:
        changeColor(txtMat1);
    }//GEN-LAST:event_txtMat1FocusGained

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        changeColor(txtNombre);
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtGrupoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGrupoFocusGained
        // TODO add your handling code here:
        changeColor(txtGrupo);
    }//GEN-LAST:event_txtGrupoFocusGained

    private void txtMat2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMat2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat2FocusGained

    private void txtMat2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMat2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat2MouseClicked

    private void txtMat3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMat3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat3FocusGained

    private void txtMat3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMat3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat3MouseClicked

    private void txtMat4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMat4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat4FocusGained

    private void txtMat4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMat4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat4MouseClicked

    private void txtMat5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMat5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat5FocusGained

    private void txtMat5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMat5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat5MouseClicked

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDFocusGained

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtPromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPromFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPromFocusGained

    private void txtPromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPromMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPromMouseClicked

    private void txtPromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPromActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
                
        String mensaje = "";
        boolean statusMensaje = false;
        
        int materia1 = Integer.parseInt(txtMat1.getText());
        
        int materia2 = Integer.parseInt(txtMat2.getText());
     
        int materia3 = Integer.parseInt(txtMat3.getText());
        
        int materia4 = Integer.parseInt(txtMat4.getText());
        
        int materia5 = Integer.parseInt(txtMat5.getText());
        
        int materia6 = Integer.parseInt(txtMat6.getText());
        
        
        int promSum = (materia1 + materia2 + materia3 + materia4 + materia5 + materia6) / 6;
            
        String promFinal = String.valueOf(promSum);
            
        txtProm.setText(promFinal);
            
        
//        persona.setNombre(cuadroNombre.getText());
//        persona.setApellido(cuadroApellido.getText());
//        persona.setEdad(Integer.parseInt(cuadroEdad.getText()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtMat6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMat6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat6FocusGained

    private void txtMat6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMat6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMat6MouseClicked

    private void changeColor(JTextField cuadro) {
        Color myColor = new Color(140,140,140);
        cuadro.setBorder(new LineBorder(myColor, 1));
    }
    
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
            java.util.logging.Logger.getLogger(SubVentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubVentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubVentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubVentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SubVentanaAgregar dialog = new SubVentanaAgregar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMat1;
    private javax.swing.JTextField txtMat2;
    private javax.swing.JTextField txtMat3;
    private javax.swing.JTextField txtMat4;
    private javax.swing.JTextField txtMat5;
    private javax.swing.JTextField txtMat6;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProm;
    // End of variables declaration//GEN-END:variables
}
