/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_jorgezuniga;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
                
        DefaultComboBoxModel modelo
                = (DefaultComboBoxModel) tipodecampista.getModel();
        modelo.addElement("Campista");
        modelo.addElement("El machetero");
        
        tipodecampista.setModel(modelo);
        
                
        DefaultComboBoxModel modelo1
                = (DefaultComboBoxModel) tipoArma.getModel();
        modelo1.addElement( new Armas("Hacha", 80));
        modelo1.addElement( new Armas("Pistola", 86));
        modelo1.addElement( new Armas("Bate", 75));
        modelo1.addElement( new Armas("Pala", 78));
        modelo1.addElement( new Armas("Sierra Helectrica", 100));
        modelo1.addElement( new Armas("Putasos", 60));
        tipoArma.setModel(modelo1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupobotones = new javax.swing.ButtonGroup();
        pestanas = new javax.swing.JTabbedPane();
        crear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipodecampista = new javax.swing.JComboBox<>();
        Edad = new javax.swing.JFormattedTextField();
        rb_f = new javax.swing.JRadioButton();
        rb_m = new javax.swing.JRadioButton();
        Nombre = new javax.swing.JTextField();
        tipoArma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NombreModi = new javax.swing.JTextField();
        EdadModi = new javax.swing.JFormattedTextField();
        rb_fModi = new javax.swing.JRadioButton();
        rb_mModi = new javax.swing.JRadioButton();
        tipodecampistaModi = new javax.swing.JComboBox<>();
        tipoArmaModi = new javax.swing.JComboBox<>();
        Modificar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        eliminar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        enlistar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pestanas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pestanasStateChanged(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Edad");

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Nombre ");

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Sexo");

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Arma");

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Tipo");

        tipodecampista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodecampistaActionPerformed(evt);
            }
        });

        try {
            Edad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rb_f.setText("F");
        rb_f.setToolTipText("");
        rb_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_fActionPerformed(evt);
            }
        });

        rb_m.setSelected(true);
        rb_m.setText("M");
        rb_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_mActionPerformed(evt);
            }
        });

        tipoArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoArmaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Ebrima", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Nuevo Campista?");

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crearLayout = new javax.swing.GroupLayout(crear);
        crear.setLayout(crearLayout);
        crearLayout.setHorizontalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crearLayout.createSequentialGroup()
                        .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crearLayout.createSequentialGroup()
                                .addComponent(tipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crearLayout.createSequentialGroup()
                                .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipodecampista, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(crearLayout.createSequentialGroup()
                                        .addComponent(rb_f)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_m)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(246, 246, 246))
            .addGroup(crearLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        crearLayout.setVerticalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_m)
                    .addComponent(rb_f))
                .addGap(51, 51, 51)
                .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipodecampista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        pestanas.addTab("Crear Persona", crear);

        editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("Nombre ");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 204)));
        editar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 50));

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setForeground(new java.awt.Color(51, 204, 0));
        jLabel8.setText("Edad");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 204)));
        editar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 50));

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setForeground(new java.awt.Color(51, 204, 0));
        jLabel9.setText("Sexo");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 204)));
        editar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 50));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setForeground(new java.awt.Color(51, 204, 0));
        jLabel10.setText("Tipo");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 204)));
        editar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 50));

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setForeground(new java.awt.Color(51, 204, 0));
        jLabel11.setText("Arma");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 204)));
        editar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 50));
        editar.add(NombreModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, 30));

        try {
            EdadModi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        editar.add(EdadModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 30));

        rb_fModi.setText("F");
        rb_fModi.setToolTipText("");
        rb_fModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_fModiActionPerformed(evt);
            }
        });
        editar.add(rb_fModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        rb_mModi.setSelected(true);
        rb_mModi.setText("M");
        rb_mModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_mModiActionPerformed(evt);
            }
        });
        editar.add(rb_mModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        tipodecampistaModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodecampistaModiActionPerformed(evt);
            }
        });
        editar.add(tipodecampistaModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 160, -1));

        tipoArmaModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoArmaModiActionPerformed(evt);
            }
        });
        editar.add(tipoArmaModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 160, -1));

        Modificar.setForeground(new java.awt.Color(0, 204, 0));
        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        editar.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 170, 80));

        jLabel12.setBackground(new java.awt.Color(255, 0, 0));
        jLabel12.setFont(new java.awt.Font("Ebrima", 3, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 0));
        jLabel12.setText("Editar");
        editar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 130, -1));

        pestanas.addTab("Editar Persona", editar);

        eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Ebrima", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 0));
        jLabel13.setText("Eliminar");
        eliminar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 160, -1));

        pestanas.addTab("Eliminar", eliminar);

        enlistar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setFont(new java.awt.Font("Ebrima", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 0));
        jLabel14.setText("Enlistar");
        enlistar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 140, -1));

        pestanas.addTab("Enlistar", enlistar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestanas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestanas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoArmaActionPerformed

    }//GEN-LAST:event_tipoArmaActionPerformed

    private void rb_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_mActionPerformed

    private void rb_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_fActionPerformed

    private void tipodecampistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodecampistaActionPerformed

    }//GEN-LAST:event_tipodecampistaActionPerformed

    private void pestanasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pestanasStateChanged
        //cambio de pestana
        if (pestanas.getSelectedIndex() == 1) {            
            flag = 1;
        }
        if (pestanas.getSelectedIndex() == 2) {
            flag = 2;
        }
    }//GEN-LAST:event_pestanasStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // guardar
        int edad,danoarma = 0;
        String nombre,sexo,tipocampista,nombrearma;
        try{
            nombre = Nombre.getText();
            edad = Integer.parseInt(Edad.getText());
            if (rb_m.isSelected()) {
                sexo = "Masculino";
            } else {
                sexo = "Femenino";
            }
//            idioma = cb_idioma.getSelectedItem().toString();
            
            nombrearma = tipoArma.getSelectedItem().toString();
            if (tipoArma.getSelectedItem() == "Hacha") {
                danoarma = 80;
            }
            if (tipoArma.getSelectedItem() == "Pistola") {
                danoarma = 86;
            }
            if (tipoArma.getSelectedItem() == "Bate") {
                danoarma = 75;
            }
            if (tipoArma.getSelectedItem() == "Pala") {
                danoarma = 78;
            }
            if (tipoArma.getSelectedItem() == "Sierra Helectrica") {
                danoarma = 100;
            }
            if (tipoArma.getSelectedItem() == "Putasos") {
                danoarma = 60;
            }
            tipocampista = tipodecampista.getSelectedItem().toString();
            if ("Campista".equals(tipocampista)) {
                Campistas.add(new Personas(nombre, "Campista", sexo, edad, personas));
            }
            if ("El machetero".equals(tipocampista)) {
                ElMachetero.add(new Personas(nombre, "El machetero", sexo, edad, personas));
            }
//            modelo.addElement("Campista");
//        modelo.addElement("El machetero");
            arma.add(new Armas(nombrearma, danoarma));
            personas.add(new Personas(nombre, tipocampista, sexo, edad, personas));
            arma.remove(0);
            Nombre.setText("");
            Edad.setText("");
            rb_f.setSelected(false);
            rb_f.setSelected(true);
            tipodecampista.setSelectedItem(null);
            tipoArma.setSelectedItem(null);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error!!");
        }
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void rb_fModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_fModiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_fModiActionPerformed

    private void rb_mModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_mModiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_mModiActionPerformed

    private void tipodecampistaModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodecampistaModiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipodecampistaModiActionPerformed

    private void tipoArmaModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoArmaModiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoArmaModiActionPerformed

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarMouseClicked
    public void guardar() {
        int edad;
        String nombre, sexo,tipocampista,tipoarma;
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Edad;
    private javax.swing.JFormattedTextField EdadModi;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreModi;
    private javax.swing.JPanel crear;
    private javax.swing.JPanel editar;
    private javax.swing.JPanel eliminar;
    private javax.swing.JPanel enlistar;
    private javax.swing.ButtonGroup grupobotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane pestanas;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_fModi;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JRadioButton rb_mModi;
    private javax.swing.JComboBox<String> tipoArma;
    private javax.swing.JComboBox<String> tipoArmaModi;
    private javax.swing.JComboBox<String> tipodecampista;
    private javax.swing.JComboBox<String> tipodecampistaModi;
    // End of variables declaration//GEN-END:variables
    ArrayList personas = new ArrayList();
    ArrayList ElMachetero = new ArrayList();
    ArrayList Campistas = new ArrayList();
    ArrayList <Armas>arma = new ArrayList();
    int flag = 0;
}
