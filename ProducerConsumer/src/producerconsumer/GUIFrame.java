package producerconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdegante
 */

public class GUIFrame extends javax.swing.JFrame {
    static public DefaultTableModel model;
    static public DefaultTableModel model2;

    /**
     * Creates new form GUIFrame
     */
    public GUIFrame() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        model2 = (DefaultTableModel) jTable2.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        j = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RangeM = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ProductoresCant = new javax.swing.JSpinner();
        ConsumidoresCant = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ProductoresEspera = new javax.swing.JSpinner();
        ConsumidoresEspera = new javax.swing.JSpinner();
        TamBuffer = new javax.swing.JSpinner();
        RangeN = new javax.swing.JSpinner();
        errorLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TareasPorHacer = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TareasRealizadas = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        STOPbtn = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setText("Tiempo de Espera (ms)");

        jLabel6.setText("Rango de Valores (n, m)");

        RangeM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel1.setText("Productores");

        jLabel2.setText("Consumidores");

        ProductoresCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        ProductoresCant.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProductoresCant.setEditor(new javax.swing.JSpinner.NumberEditor(ProductoresCant, ""));
        ProductoresCant.setValue(1);

        ConsumidoresCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel3.setText("Tamaño del Buffer");

        jLabel4.setText("Cantidad");

        ProductoresEspera.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1000));

        ConsumidoresEspera.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1000));

        TamBuffer.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        RangeN.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConsumidoresCant)
                            .addComponent(ProductoresCant)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(TamBuffer)
                            .addComponent(RangeN))
                        .addGap(18, 18, 18)
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProductoresEspera)
                            .addComponent(ConsumidoresEspera)
                            .addComponent(RangeM))))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProductoresCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProductoresEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ConsumidoresCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsumidoresEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TamBuffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RangeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RangeN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(errorLabel))
        );

        javax.swing.JSpinner.DefaultEditor editor7 = ( javax.swing.JSpinner.DefaultEditor ) RangeM.getEditor();
        editor7.getTextField().setEnabled( true );
        editor7.getTextField().setEditable( false );
        javax.swing.JSpinner.DefaultEditor editor = ( javax.swing.JSpinner.DefaultEditor ) ProductoresCant.getEditor();
        editor.getTextField().setEnabled( true );
        editor.getTextField().setEditable( false );
        javax.swing.JSpinner.DefaultEditor editor2 = ( javax.swing.JSpinner.DefaultEditor ) ConsumidoresCant.getEditor();
        editor2.getTextField().setEnabled( true );
        editor2.getTextField().setEditable( false );
        javax.swing.JSpinner.DefaultEditor editor3 = ( javax.swing.JSpinner.DefaultEditor ) ProductoresEspera.getEditor();
        editor3.getTextField().setEnabled( true );
        editor3.getTextField().setEditable( false );
        javax.swing.JSpinner.DefaultEditor editor4 = ( javax.swing.JSpinner.DefaultEditor ) ConsumidoresEspera.getEditor();
        editor4.getTextField().setEnabled( true );
        editor4.getTextField().setEditable( false );
        javax.swing.JSpinner.DefaultEditor editor5 = ( javax.swing.JSpinner.DefaultEditor ) TamBuffer.getEditor();
        editor5.getTextField().setEnabled( true );
        editor5.getTextField().setEditable( false );
        javax.swing.JSpinner.DefaultEditor editor6 = ( javax.swing.JSpinner.DefaultEditor ) RangeN.getEditor();
        editor6.getTextField().setEnabled( true );
        editor6.getTextField().setEditable( false );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Configuración", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Problem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TareasPorHacer.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Operation", "Solution"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TareasRealizadas.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(50);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable2.getColumnModel().getColumn(1).setMinWidth(120);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(120);
        }

        jLabel7.setText("Tareas por hacer");

        jLabel8.setText("Tareas realizadas");

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(51, 51, 255));

        STOPbtn.setText("STOP");
        STOPbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STOPbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TareasPorHacer, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(TareasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(STOPbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TareasRealizadas, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(TareasPorHacer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(STOPbtn, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jTabbedPane1.addTab("Procesos", jPanel3);

        Iniciar.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        Iniciar.setForeground(new java.awt.Color(0, 102, 51));
        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
       ProducerConsumer pc = new ProducerConsumer();
       String[] args = {ProductoresCant.getValue().toString(), ConsumidoresCant.getValue().toString(), ProductoresEspera.getValue().toString(),
            ConsumidoresEspera.getValue().toString(), TamBuffer.getValue().toString(), RangeN.getValue().toString(), RangeM.getValue().toString()};
       
       if((Integer) RangeN.getValue() > (Integer) RangeM.getValue()) {
           System.out.println("ERROR n > m");
           errorLabel.setText("ERROR: n  can't be > m");
       } else {
           errorLabel.setText("");
           pc.run(args);
       }
       
      //model.insertRow(model.getRowCount(), new Object[]{1, "Hola"} );
    }//GEN-LAST:event_IniciarActionPerformed

    private void STOPbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STOPbtnActionPerformed
        exit();
    }//GEN-LAST:event_STOPbtnActionPerformed

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
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ConsumidoresCant;
    private javax.swing.JSpinner ConsumidoresEspera;
    private javax.swing.JButton Iniciar;
    private javax.swing.JSpinner ProductoresCant;
    private javax.swing.JSpinner ProductoresEspera;
    private javax.swing.JSpinner RangeM;
    private javax.swing.JSpinner RangeN;
    private javax.swing.JButton STOPbtn;
    private javax.swing.JSpinner TamBuffer;
    private javax.swing.JScrollPane TareasPorHacer;
    private javax.swing.JScrollPane TareasRealizadas;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
