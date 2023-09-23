/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Anto
 */
public class Ejercicio8 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio8
     */
    public Ejercicio8() {
        initComponents();
        TFOtros.setVisible(false);
        LOtros.setVisible(false);
        LCantidadHijos.setVisible(false);
        SpiHijos.setVisible(false);
        LCualObra.setVisible (false);
        TFObraSocial.setVisible (false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexo = new javax.swing.ButtonGroup();
        Estudia = new javax.swing.ButtonGroup();
        Hijos = new javax.swing.ButtonGroup();
        ObraSocial = new javax.swing.ButtonGroup();
        Trabaja = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFNomyApe = new javax.swing.JTextField();
        LPasatiempos = new javax.swing.JLabel();
        CBEstudiar = new javax.swing.JCheckBox();
        CBTv = new javax.swing.JCheckBox();
        CBVideojuegos = new javax.swing.JCheckBox();
        CBCaminar = new javax.swing.JCheckBox();
        CBMusica = new javax.swing.JCheckBox();
        CBLeer = new javax.swing.JCheckBox();
        CBDormir = new javax.swing.JCheckBox();
        CBOtros = new javax.swing.JCheckBox();
        TFOtros = new javax.swing.JTextField();
        LSexo = new javax.swing.JLabel();
        RBSexoSi = new javax.swing.JRadioButton();
        RBSexoNo = new javax.swing.JRadioButton();
        LCiudad = new javax.swing.JLabel();
        CBoxCiudad = new javax.swing.JComboBox<>();
        LTrabaja = new javax.swing.JLabel();
        RBTrabajoSi = new javax.swing.JRadioButton();
        RBTrabajoNo = new javax.swing.JRadioButton();
        LEstudia = new javax.swing.JLabel();
        RBEstudiaSi = new javax.swing.JRadioButton();
        RBEstudiaNo = new javax.swing.JRadioButton();
        LHijos = new javax.swing.JLabel();
        RBHijosSi = new javax.swing.JRadioButton();
        RBHijosNo = new javax.swing.JRadioButton();
        LCantidadHijos = new javax.swing.JLabel();
        SpiHijos = new javax.swing.JSpinner();
        LObraSocial = new javax.swing.JLabel();
        RBObraSocialSi = new javax.swing.JRadioButton();
        RBObraSocialNo = new javax.swing.JRadioButton();
        LCualObra = new javax.swing.JLabel();
        TFObraSocial = new javax.swing.JTextField();
        BAceptar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();
        LOtros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Nombre y Apellido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 24, -1, -1));

        TFNomyApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNomyApeActionPerformed(evt);
            }
        });
        jPanel1.add(TFNomyApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 24, 335, -1));

        LPasatiempos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LPasatiempos.setText("Pasatiempos");
        jPanel1.add(LPasatiempos, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 64, -1, -1));

        CBEstudiar.setText("Estudiar");
        jPanel1.add(CBEstudiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 65, -1, -1));

        CBTv.setText("Ver Televisión");
        jPanel1.add(CBTv, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 65, -1, -1));

        CBVideojuegos.setText("Jugar Videojuegos");
        jPanel1.add(CBVideojuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 65, -1, -1));

        CBCaminar.setText("Caminar");
        jPanel1.add(CBCaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 65, -1, -1));

        CBMusica.setText("Escuchar Música");
        jPanel1.add(CBMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 91, -1, -1));

        CBLeer.setText("Leer");
        CBLeer.setToolTipText("");
        jPanel1.add(CBLeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 91, -1, -1));

        CBDormir.setText("Dormir");
        jPanel1.add(CBDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 91, -1, -1));

        CBOtros.setText("Otros");
        CBOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOtrosActionPerformed(evt);
            }
        });
        jPanel1.add(CBOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 91, -1, -1));
        jPanel1.add(TFOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 117, 365, -1));

        LSexo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LSexo.setText("Sexo");
        jPanel1.add(LSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 157, -1, -1));

        Sexo.add(RBSexoSi);
        RBSexoSi.setText("Femenino");
        jPanel1.add(RBSexoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 158, -1, -1));

        Sexo.add(RBSexoNo);
        RBSexoNo.setText("Masculino");
        jPanel1.add(RBSexoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 158, -1, -1));

        LCiudad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LCiudad.setText("Ciudad");
        jPanel1.add(LCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 157, -1, -1));

        CBoxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese Opcion Correcta", "Rio Grande", "Tolhuin", "Ushuaia" }));
        CBoxCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBoxCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(CBoxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 157, 229, -1));

        LTrabaja.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LTrabaja.setText("Trabaja");
        jPanel1.add(LTrabaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 197, -1, -1));

        Trabaja.add(RBTrabajoSi);
        RBTrabajoSi.setText("Si");
        RBTrabajoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTrabajoSiActionPerformed(evt);
            }
        });
        jPanel1.add(RBTrabajoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 198, -1, -1));

        Trabaja.add(RBTrabajoNo);
        RBTrabajoNo.setText("No");
        RBTrabajoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTrabajoNoActionPerformed(evt);
            }
        });
        jPanel1.add(RBTrabajoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 198, -1, -1));

        LEstudia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LEstudia.setText("Estudia");
        jPanel1.add(LEstudia, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 197, -1, -1));

        Estudia.add(RBEstudiaSi);
        RBEstudiaSi.setText("Si");
        jPanel1.add(RBEstudiaSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 198, -1, -1));

        Estudia.add(RBEstudiaNo);
        RBEstudiaNo.setText("No");
        jPanel1.add(RBEstudiaNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 198, -1, -1));

        LHijos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LHijos.setText("Hijos");
        jPanel1.add(LHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 237, -1, -1));

        Hijos.add(RBHijosSi);
        RBHijosSi.setText("Si");
        RBHijosSi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RBHijosSiStateChanged(evt);
            }
        });
        jPanel1.add(RBHijosSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 238, -1, -1));

        Hijos.add(RBHijosNo);
        RBHijosNo.setText("No");
        RBHijosNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RBHijosNoStateChanged(evt);
            }
        });
        RBHijosNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBHijosNoActionPerformed(evt);
            }
        });
        jPanel1.add(RBHijosNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 238, -1, -1));

        LCantidadHijos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LCantidadHijos.setText("Cuantos");
        jPanel1.add(LCantidadHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));
        jPanel1.add(SpiHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        LObraSocial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LObraSocial.setText("Obra Social");
        jPanel1.add(LObraSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 277, -1, -1));

        ObraSocial.add(RBObraSocialSi);
        RBObraSocialSi.setText("Si");
        RBObraSocialSi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RBObraSocialSiStateChanged(evt);
            }
        });
        RBObraSocialSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBObraSocialSiActionPerformed(evt);
            }
        });
        jPanel1.add(RBObraSocialSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 278, -1, -1));

        ObraSocial.add(RBObraSocialNo);
        RBObraSocialNo.setText("No");
        jPanel1.add(RBObraSocialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 278, -1, -1));

        LCualObra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LCualObra.setText("Cual?");
        jPanel1.add(LCualObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 277, -1, -1));
        jPanel1.add(TFObraSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 277, 262, -1));

        BAceptar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 317, 233, 59));

        BLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BLimpiar.setText("Limpiar");
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(BLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 317, 233, 59));

        LOtros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LOtros.setText("Otros Pasatiempos");
        jPanel1.add(LOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBObraSocialSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBObraSocialSiActionPerformed
    
    }//GEN-LAST:event_RBObraSocialSiActionPerformed

    private void CBOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOtrosActionPerformed
    if(CBOtros.isSelected())
    {
    TFOtros.setVisible(true);
    LOtros.setVisible(true);
    }
    else
    {
    TFOtros.setVisible(false);
    LOtros.setVisible(false);
    TFOtros.setText("");
    }
    }//GEN-LAST:event_CBOtrosActionPerformed

    private void RBHijosNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBHijosNoActionPerformed
    
    }//GEN-LAST:event_RBHijosNoActionPerformed

    private void RBHijosNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RBHijosNoStateChanged
    
    }//GEN-LAST:event_RBHijosNoStateChanged

    private void RBTrabajoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTrabajoNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBTrabajoNoActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
    
    String msg = "";
    msg= msg + "Nombre y apellido: " + TFNomyApe.getText() + 
        "\nPasatiempos: ";
    if (CBCaminar.isSelected()) msg=msg + "Caminar ";
    if (CBDormir.isSelected()) msg=msg + "Dormir ";
    if (CBEstudiar.isSelected()) msg=msg + "Estudiar ";
    if (CBLeer.isSelected()) msg=msg + "Leer ";
    if (CBMusica.isSelected()) msg=msg + "Musica ";
    if (CBTv.isSelected()) msg=msg + "Ver Television ";
    if (CBVideojuegos.isSelected()) msg=msg + "Jugar Videojuegos ";
    if (CBOtros.isSelected()) msg=msg + TFOtros.getText();
    msg= msg + "\nSexo: ";
    if (RBSexoSi.isSelected()) 
    {
        msg=msg+"Femenino";
    }
    if (RBSexoNo.isSelected())
    {
        msg=msg+"Masculino";
    }
    msg=msg + "\nCiudad: ";
    switch (CBoxCiudad.getSelectedIndex())
        {
        case 1: msg= msg + "Rio Grande";
        break;
        case 2: msg= msg + "Tolhuin";
        break;
        case 3: msg =msg + "Ushuaia";
        break;
        default:
        break;
        }
    msg=msg + "\nTrabaja? ";
    if (RBTrabajoSi.isSelected())
    {
        msg=msg+"Si";
    }
    if (RBSexoNo.isSelected())
    {
        msg=msg+"No";
    }
    msg=msg + "\nEstudia? ";
    if (RBEstudiaSi.isSelected())
    {
        msg=msg+"Si";
    }
    if (RBEstudiaNo.isSelected())
    {
        msg=msg+"No";
    }
    msg=msg+"\nTrabaja? ";
    if (RBTrabajoSi.isSelected())
        msg=msg +"Si";
    if(RBTrabajoNo.isSelected())
        msg=msg+"No";
    msg=msg +"\nHijos: ";
    if (RBHijosSi.isSelected())
        msg=msg+ "Si, " + SpiHijos.getValue().toString();
    if (RBHijosNo.isSelected())
        msg=msg + "No";
    msg=msg + "\nObra Social: ";
    if (RBObraSocialSi.isSelected())
        msg=msg+"Si, " + TFObraSocial.getText();
    if (RBObraSocialNo.isSelected())
        msg=msg+"No";
    JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_BAceptarActionPerformed

    private void RBHijosSiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RBHijosSiStateChanged
    if (RBHijosSi.isSelected())
    {
        LCantidadHijos.setVisible(true);
        SpiHijos.setVisible(true);
    }
    else 
    {
        LCantidadHijos.setVisible(false);
        SpiHijos.setVisible(false);
    }
    }//GEN-LAST:event_RBHijosSiStateChanged

    private void BLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpiarActionPerformed
    Sexo.clearSelection();
    Estudia.clearSelection();
    ObraSocial.clearSelection();
    Hijos.clearSelection();
    Trabaja.clearSelection();
    CBTv.setSelected(false);
    CBCaminar.setSelected(false);
    CBoxCiudad.setSelectedIndex(0);
    CBDormir.setSelected (false);
    CBLeer.setSelected(false);
    CBMusica.setSelected(false);
    CBOtros.setSelected (false);
    CBVideojuegos.setSelected(false);
    TFNomyApe.setText("");
    TFObraSocial.setText("");
    TFOtros.setText("");
    }//GEN-LAST:event_BLimpiarActionPerformed

    private void RBTrabajoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTrabajoSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBTrabajoSiActionPerformed

    private void TFNomyApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNomyApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNomyApeActionPerformed

    private void RBObraSocialSiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RBObraSocialSiStateChanged
    if (RBObraSocialSi.isSelected())
    {
        LCualObra.setVisible(true);
        TFObraSocial.setVisible(true);
    }
    else 
    {
        LCualObra.setVisible(false);
        TFObraSocial.setVisible(false);
    }
    }//GEN-LAST:event_RBObraSocialSiStateChanged

    private void CBoxCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBoxCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBoxCiudadActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JCheckBox CBCaminar;
    private javax.swing.JCheckBox CBDormir;
    private javax.swing.JCheckBox CBEstudiar;
    private javax.swing.JCheckBox CBLeer;
    private javax.swing.JCheckBox CBMusica;
    private javax.swing.JCheckBox CBOtros;
    private javax.swing.JCheckBox CBTv;
    private javax.swing.JCheckBox CBVideojuegos;
    private javax.swing.JComboBox<String> CBoxCiudad;
    private javax.swing.ButtonGroup Estudia;
    private javax.swing.ButtonGroup Hijos;
    private javax.swing.JLabel LCantidadHijos;
    private javax.swing.JLabel LCiudad;
    private javax.swing.JLabel LCualObra;
    private javax.swing.JLabel LEstudia;
    private javax.swing.JLabel LHijos;
    private javax.swing.JLabel LObraSocial;
    private javax.swing.JLabel LOtros;
    private javax.swing.JLabel LPasatiempos;
    private javax.swing.JLabel LSexo;
    private javax.swing.JLabel LTrabaja;
    private javax.swing.ButtonGroup ObraSocial;
    private javax.swing.JRadioButton RBEstudiaNo;
    private javax.swing.JRadioButton RBEstudiaSi;
    private javax.swing.JRadioButton RBHijosNo;
    private javax.swing.JRadioButton RBHijosSi;
    private javax.swing.JRadioButton RBObraSocialNo;
    private javax.swing.JRadioButton RBObraSocialSi;
    private javax.swing.JRadioButton RBSexoNo;
    private javax.swing.JRadioButton RBSexoSi;
    private javax.swing.JRadioButton RBTrabajoNo;
    private javax.swing.JRadioButton RBTrabajoSi;
    private javax.swing.ButtonGroup Sexo;
    private javax.swing.JSpinner SpiHijos;
    private javax.swing.JTextField TFNomyApe;
    private javax.swing.JTextField TFObraSocial;
    private javax.swing.JTextField TFOtros;
    private javax.swing.ButtonGroup Trabaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
