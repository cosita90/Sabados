/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Anto
 */
public class RadioButton extends javax.swing.JFrame {

    /**
     * Creates new form RadioButton
     */
    public RadioButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPostres = new javax.swing.ButtonGroup();
        BGPlatos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LComFav = new javax.swing.JLabel();
        LPlaPri = new javax.swing.JLabel();
        LPos = new javax.swing.JLabel();
        RBHel = new javax.swing.JRadioButton();
        RBTort = new javax.swing.JRadioButton();
        RBGel = new javax.swing.JRadioButton();
        RBChoc = new javax.swing.JRadioButton();
        RBFlan = new javax.swing.JRadioButton();
        RBAsado = new javax.swing.JRadioButton();
        RBPizza = new javax.swing.JRadioButton();
        RBMila = new javax.swing.JRadioButton();
        RBLomito = new javax.swing.JRadioButton();
        RBEmpanada = new javax.swing.JRadioButton();
        RBPasta = new javax.swing.JRadioButton();
        BBorrar = new javax.swing.JButton();
        RBTiram = new javax.swing.JRadioButton();
        BAceptar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LComFav.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LComFav.setText("Comidas Favoritas");
        jPanel1.add(LComFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 20));

        LPlaPri.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LPlaPri.setText("Platos Principales");
        jPanel1.add(LPlaPri, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        LPos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LPos.setText("Postres");
        jPanel1.add(LPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        BGPostres.add(RBHel);
        RBHel.setText("Helado");
        RBHel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBHelActionPerformed(evt);
            }
        });
        jPanel1.add(RBHel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        BGPostres.add(RBTort);
        RBTort.setText("Torta");
        RBTort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTortActionPerformed(evt);
            }
        });
        jPanel1.add(RBTort, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        BGPostres.add(RBGel);
        RBGel.setText("Gelatina");
        RBGel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBGelActionPerformed(evt);
            }
        });
        jPanel1.add(RBGel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        BGPostres.add(RBChoc);
        RBChoc.setText("Chocotorta");
        RBChoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBChocActionPerformed(evt);
            }
        });
        jPanel1.add(RBChoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        BGPostres.add(RBFlan);
        RBFlan.setText("Flan");
        RBFlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBFlanActionPerformed(evt);
            }
        });
        jPanel1.add(RBFlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        BGPlatos.add(RBAsado);
        RBAsado.setText("Asado");
        jPanel1.add(RBAsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        BGPlatos.add(RBPizza);
        RBPizza.setText("Pizza");
        jPanel1.add(RBPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        BGPlatos.add(RBMila);
        RBMila.setText("Mila Napo");
        RBMila.setToolTipText("");
        jPanel1.add(RBMila, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        BGPlatos.add(RBLomito);
        RBLomito.setText("Lomito");
        jPanel1.add(RBLomito, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        BGPlatos.add(RBEmpanada);
        RBEmpanada.setText("Empanada");
        jPanel1.add(RBEmpanada, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        BGPlatos.add(RBPasta);
        RBPasta.setText("Ñoquis");
        jPanel1.add(RBPasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        BBorrar.setText("Borrar");
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(BBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 110, 40));

        BGPostres.add(RBTiram);
        RBTiram.setText("Tiramisú");
        RBTiram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTiramActionPerformed(evt);
            }
        });
        jPanel1.add(RBTiram, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        BAceptar1.setText("Aceptar");
        BAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBTiramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTiramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBTiramActionPerformed

    private void RBHelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBHelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBHelActionPerformed

    private void RBTortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBTortActionPerformed

    private void RBGelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBGelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBGelActionPerformed

    private void RBChocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBChocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBChocActionPerformed

    private void RBFlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBFlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBFlanActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
    BGPlatos.clearSelection();
    BGPostres.clearSelection();
    }//GEN-LAST:event_BBorrarActionPerformed

    private void BAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptar1ActionPerformed
    String mensPostre="";
    String mensPlato="";
        if (RBChoc.isSelected()==true)
        {
        mensPostre="Chocotorta";
        }
        if (RBFlan.isSelected()==true)
        {
        mensPostre="Flan";
        }
        if (RBGel.isSelected()==true)
        {
        mensPostre="Gelatina";
        }
        if (RBTiram.isSelected()==true)
        {
        mensPostre="Tiramizú";
        }
        if (RBTort.isSelected()==true)
        {
        mensPostre="Torta";
        }
        if (RBHel.isSelected()==true)
        {
        mensPostre="Helado";
        }
        if (RBAsado.isSelected()==true)
        {
        mensPlato="Asado";
        }
        if (RBEmpanada.isSelected()==true)
        {
        mensPlato="Empanada";
        }
        if (RBLomito.isSelected()==true)
        {
        mensPlato="Lomito";
        }
        if (RBMila.isSelected()==true)
        {
        mensPlato="Milanesa a la Napolitana";
        }
        if (RBPasta.isSelected()==true)
        {
        mensPlato="Ñoquis";
        }
        if (RBPizza.isSelected()==true)
        {
        mensPlato="Pizza";
        }
        
        JOptionPane.showMessageDialog(rootPane, "Plato Principal Preferido: " + mensPlato + "\nPostre Preferido: " + mensPostre);
        
        
    }//GEN-LAST:event_BAceptar1ActionPerformed

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
            java.util.logging.Logger.getLogger(RadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar1;
    private javax.swing.JButton BBorrar;
    private javax.swing.ButtonGroup BGPlatos;
    private javax.swing.ButtonGroup BGPostres;
    private javax.swing.JLabel LComFav;
    private javax.swing.JLabel LPlaPri;
    private javax.swing.JLabel LPos;
    private javax.swing.JRadioButton RBAsado;
    private javax.swing.JRadioButton RBChoc;
    private javax.swing.JRadioButton RBEmpanada;
    private javax.swing.JRadioButton RBFlan;
    private javax.swing.JRadioButton RBGel;
    private javax.swing.JRadioButton RBHel;
    private javax.swing.JRadioButton RBLomito;
    private javax.swing.JRadioButton RBMila;
    private javax.swing.JRadioButton RBPasta;
    private javax.swing.JRadioButton RBPizza;
    private javax.swing.JRadioButton RBTiram;
    private javax.swing.JRadioButton RBTort;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
