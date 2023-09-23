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
public class Ejercicio6 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio6
     */
    public Ejercicio6() {
        initComponents();
        LApellido.setVisible(false);
        LNombre.setVisible(false);
        LAutor1.setVisible(false);
        TFApe1.setVisible(false);
        TFNom1.setVisible(false);
        LAutor2.setVisible(false);
        TFApe2.setVisible(false);
        TFNom2.setVisible(false);
        LAutor3.setVisible(false);
        TFApe3.setVisible(false);
        TFNom3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Idioma = new javax.swing.ButtonGroup();
        Autores = new javax.swing.ButtonGroup();
        Genero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LTitulo = new javax.swing.JLabel();
        LLibro = new javax.swing.JLabel();
        TFLibro = new javax.swing.JTextField();
        RBEspanol = new javax.swing.JRadioButton();
        RBPortugues = new javax.swing.JRadioButton();
        RBIngles = new javax.swing.JRadioButton();
        LHojas = new javax.swing.JLabel();
        TFHojas = new javax.swing.JTextField();
        LAutores = new javax.swing.JLabel();
        RB1 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        LAutor1 = new javax.swing.JLabel();
        LAutor2 = new javax.swing.JLabel();
        LAutor3 = new javax.swing.JLabel();
        LApellido = new javax.swing.JLabel();
        TFApe1 = new javax.swing.JTextField();
        TFApe2 = new javax.swing.JTextField();
        TFEdit = new javax.swing.JTextField();
        LNombre = new javax.swing.JLabel();
        TFNom1 = new javax.swing.JTextField();
        TFNom2 = new javax.swing.JTextField();
        TFNom3 = new javax.swing.JTextField();
        LGenero = new javax.swing.JLabel();
        RBNovela = new javax.swing.JRadioButton();
        RBPoesia = new javax.swing.JRadioButton();
        RBCuento = new javax.swing.JRadioButton();
        RBMitologia = new javax.swing.JRadioButton();
        RBHumor = new javax.swing.JRadioButton();
        RBTerror = new javax.swing.JRadioButton();
        RBCiencia = new javax.swing.JRadioButton();
        RBInfantil = new javax.swing.JRadioButton();
        LEditorial = new javax.swing.JLabel();
        TFApe3 = new javax.swing.JTextField();
        BAceptar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LTitulo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        LTitulo.setText("Libros");
        jPanel1.add(LTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 32, -1, -1));

        LLibro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LLibro.setText("Titulo");
        jPanel1.add(LLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 88, -1, -1));

        TFLibro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(TFLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 85, 595, -1));

        Idioma.add(RBEspanol);
        RBEspanol.setText("Español");
        jPanel1.add(RBEspanol, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 134, -1, -1));

        Idioma.add(RBPortugues);
        RBPortugues.setText("Portugues");
        jPanel1.add(RBPortugues, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 134, -1, -1));

        Idioma.add(RBIngles);
        RBIngles.setText("Ingles");
        jPanel1.add(RBIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 134, -1, -1));

        LHojas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LHojas.setText("Cantidad de Hojas");
        jPanel1.add(LHojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 133, -1, -1));

        TFHojas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(TFHojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 130, 227, -1));

        LAutores.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LAutores.setText("Cantidad de Autores");
        jPanel1.add(LAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        Autores.add(RB1);
        RB1.setText("1");
        RB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB1ActionPerformed(evt);
            }
        });
        jPanel1.add(RB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        Autores.add(RB2);
        RB2.setText("2");
        RB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB2ActionPerformed(evt);
            }
        });
        jPanel1.add(RB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        Autores.add(RB3);
        RB3.setText("3");
        RB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB3ActionPerformed(evt);
            }
        });
        jPanel1.add(RB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        LAutor1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LAutor1.setText("Autor 1:");
        jPanel1.add(LAutor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 247, -1, -1));

        LAutor2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LAutor2.setText("Autor 2");
        jPanel1.add(LAutor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 287, -1, -1));

        LAutor3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LAutor3.setText("Autor 3");
        jPanel1.add(LAutor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 329, -1, -1));

        LApellido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LApellido.setText("Apellido:");
        jPanel1.add(LApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 215, -1, -1));
        jPanel1.add(TFApe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 244, 243, -1));
        jPanel1.add(TFApe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 284, 243, -1));
        jPanel1.add(TFEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 550, -1));

        LNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LNombre.setText("Nombre:");
        jPanel1.add(LNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 215, -1, -1));
        jPanel1.add(TFNom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 244, 279, -1));
        jPanel1.add(TFNom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 284, 279, -1));
        jPanel1.add(TFNom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 324, 279, -1));

        LGenero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LGenero.setText("Genero");
        jPanel1.add(LGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        Genero.add(RBNovela);
        RBNovela.setText("Novela");
        RBNovela.setToolTipText("");
        jPanel1.add(RBNovela, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 364, -1, -1));

        Genero.add(RBPoesia);
        RBPoesia.setText("Poesía");
        jPanel1.add(RBPoesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 364, -1, -1));

        Genero.add(RBCuento);
        RBCuento.setText("Cuento");
        jPanel1.add(RBCuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 364, -1, -1));

        Genero.add(RBMitologia);
        RBMitologia.setText("Mitología");
        jPanel1.add(RBMitologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 364, -1, -1));

        Genero.add(RBHumor);
        RBHumor.setText("Humor");
        jPanel1.add(RBHumor, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 364, -1, -1));

        Genero.add(RBTerror);
        RBTerror.setText("Terror y Misterio");
        jPanel1.add(RBTerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 391, -1, -1));

        Genero.add(RBCiencia);
        RBCiencia.setText("Ciencia Ficción");
        jPanel1.add(RBCiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 391, -1, -1));

        Genero.add(RBInfantil);
        RBInfantil.setText("Infantil");
        jPanel1.add(RBInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 391, -1, -1));

        LEditorial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LEditorial.setText("Editorial");
        jPanel1.add(LEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));
        jPanel1.add(TFApe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 324, 243, -1));

        BAceptar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 470, 308, 56));

        BBorrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BBorrar.setText("Borrar");
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(BBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 470, 299, 56));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 728, 548));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB1ActionPerformed
    LApellido.setVisible(true);
    LNombre.setVisible(true);
    LAutor1.setVisible(true);
    TFApe1.setVisible(true);
    TFNom1.setVisible(true);
    LAutor2.setVisible(false);
    TFApe2.setVisible(false);
    TFNom2.setVisible(false);
    LAutor3.setVisible(false);
    TFApe3.setVisible(false);
    TFNom3.setVisible(false);
    }//GEN-LAST:event_RB1ActionPerformed

    private void RB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB2ActionPerformed
     LApellido.setVisible(true);
    LNombre.setVisible(true);
    LAutor1.setVisible(true);
    TFApe1.setVisible(true);
    TFNom1.setVisible(true);
    LAutor2.setVisible(true);
    TFApe2.setVisible(true);
    TFNom2.setVisible(true);
    LAutor3.setVisible(false);
    TFApe3.setVisible(false);
    TFNom3.setVisible(false);
    }//GEN-LAST:event_RB2ActionPerformed
    
    private void RB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB3ActionPerformed
    LApellido.setVisible(true);
    LNombre.setVisible(true);
    LAutor1.setVisible(true);
    TFApe1.setVisible(true);
    TFNom1.setVisible(true);
    LAutor2.setVisible(true);
    TFApe2.setVisible(true);
    TFNom2.setVisible(true);
    LAutor3.setVisible(true);
    TFApe3.setVisible(true);
    TFNom3.setVisible(true);
    }//GEN-LAST:event_RB3ActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
    String msj="";
    msj="Titulo: " + TFLibro.getText() +
        "\nIdioma: ";
    if (RBIngles.isSelected())
    {
        msj=msj + "Ingles";
    }
    if (RBEspanol.isSelected())
    {
        msj=msj + "Español";
    }
    if (RBPortugues.isSelected())
    {
        msj=msj + "Portugués";
    }
        msj=msj + "\nCantidad de Hojas: " + TFHojas.getText();
    if (RB1.isSelected())
    {
        msj=msj+"\nCantidad autores: 1"+
                "\nAutor 1: " + TFApe1.getText() +", " + TFNom1.getText();
    }
    if (RB2.isSelected())
    {
        msj=msj+"\nCantidad autores: 2"+
                "\nAutor 1: " + TFApe1.getText() +", " + TFNom1.getText() +
                "\nAutor 2: " + TFApe2.getText() +", " + TFNom2.getText();
    }
    if (RB3.isSelected())
    {
        msj="\nAutor 3: " +
                msj+"\nCantidad autores: 3"+
                "\nAutor 1: " + TFApe1.getText() +", " + TFNom1.getText() +
                "\nAutor 2: " + TFApe2.getText() +", " + TFNom2.getText() +
                "\nAutor 3: " + TFApe3.getText() +", " + TFNom3.getText();
    }
    msj= msj + "\nGenero: ";
    if (RBCiencia.isSelected())
    {
        msj=msj + "Ciencia Ficción";
    }
    if(RBCuento.isSelected())
    {
        msj=msj + "Cuento";
    }
    if(RBHumor.isSelected())
    {
        msj=msj + "Humor";
    }
    if(RBInfantil.isSelected())
    {
        msj=msj + "Infantil";
    }
    if(RBMitologia.isSelected())
    {
        msj=msj + "Mitología";
    }
    if(RBNovela.isSelected())
    {
        msj=msj + "Novela";
    }
    if(RBPoesia.isSelected())
    {
        msj=msj + "Poesía";
    }
    if(RBTerror.isSelected())
    {
        msj=msj + "Terror y Misterio";
    }
    msj= msj + "\nEditorial: " + TFEdit.getText();
        JOptionPane.showMessageDialog(null, msj);
    }//GEN-LAST:event_BAceptarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        TFLibro.setText("");
        Idioma.clearSelection();
        Autores.clearSelection();
        Genero.clearSelection();
        TFApe1.setText("");
        TFApe2.setText("");
        TFApe3.setText("");
        TFNom1.setText("");
        TFNom2.setText("");
        TFNom3.setText("");
        TFEdit.setText("");
        TFHojas.setText("");
        LApellido.setVisible(false);
        LNombre.setVisible(false);
        LAutor1.setVisible(false);
        TFApe1.setVisible(false);
        TFNom1.setVisible(false);
        LAutor2.setVisible(false);
        TFApe2.setVisible(false);
        TFNom2.setVisible(false);
        LAutor3.setVisible(false);
        TFApe3.setVisible(false);
        TFNom3.setVisible(false);
    }//GEN-LAST:event_BBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Autores;
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BBorrar;
    private javax.swing.ButtonGroup Genero;
    private javax.swing.ButtonGroup Idioma;
    private javax.swing.JLabel LApellido;
    private javax.swing.JLabel LAutor1;
    private javax.swing.JLabel LAutor2;
    private javax.swing.JLabel LAutor3;
    private javax.swing.JLabel LAutores;
    private javax.swing.JLabel LEditorial;
    private javax.swing.JLabel LGenero;
    private javax.swing.JLabel LHojas;
    private javax.swing.JLabel LLibro;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LTitulo;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RBCiencia;
    private javax.swing.JRadioButton RBCuento;
    private javax.swing.JRadioButton RBEspanol;
    private javax.swing.JRadioButton RBHumor;
    private javax.swing.JRadioButton RBInfantil;
    private javax.swing.JRadioButton RBIngles;
    private javax.swing.JRadioButton RBMitologia;
    private javax.swing.JRadioButton RBNovela;
    private javax.swing.JRadioButton RBPoesia;
    private javax.swing.JRadioButton RBPortugues;
    private javax.swing.JRadioButton RBTerror;
    private javax.swing.JTextField TFApe1;
    private javax.swing.JTextField TFApe2;
    private javax.swing.JTextField TFApe3;
    private javax.swing.JTextField TFEdit;
    private javax.swing.JTextField TFHojas;
    private javax.swing.JTextField TFLibro;
    private javax.swing.JTextField TFNom1;
    private javax.swing.JTextField TFNom2;
    private javax.swing.JTextField TFNom3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}