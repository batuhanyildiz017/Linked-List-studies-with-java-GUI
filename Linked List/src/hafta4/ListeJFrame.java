/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hafta4;

/**
 *
 * @author yildi
 */
public class ListeJFrame extends javax.swing.JFrame {

    ciftListe c1;
    public ListeJFrame() {
        c1=new ciftListe();
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        basaekle = new javax.swing.JButton();
        sonaekle = new javax.swing.JButton();
        bastansil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lsitele = new javax.swing.JButton();
        tersListele = new javax.swing.JButton();
        enbLabel = new javax.swing.JLabel();
        enbBTN = new javax.swing.JButton();
        sıralıBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sayı:");

        basaekle.setText("Başa Ekle");
        basaekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basaekleActionPerformed(evt);
            }
        });

        sonaekle.setText("Sona Ekle");
        sonaekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonaekleActionPerformed(evt);
            }
        });

        bastansil.setText("Baştan Sil");
        bastansil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bastansilActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lsitele.setText("Listele");
        lsitele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsiteleActionPerformed(evt);
            }
        });

        tersListele.setText("Ters Listele");
        tersListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tersListeleActionPerformed(evt);
            }
        });

        enbBTN.setText("En Büyük Bul");
        enbBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enbBTNActionPerformed(evt);
            }
        });

        sıralıBTN.setText("Sıralı Ekle");
        sıralıBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sıralıBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enbBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sıralıBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addGap(18, 18, 18)
                                .addComponent(basaekle)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sonaekle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bastansil))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tersListele)
                                    .addComponent(lsitele, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basaekle)
                    .addComponent(sonaekle)
                    .addComponent(bastansil))
                .addGap(18, 18, 18)
                .addComponent(sıralıBTN)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lsitele)
                        .addGap(18, 18, 18)
                        .addComponent(tersListele)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enbBTN))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basaekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basaekleActionPerformed
        cEleman yeni=new cEleman(Integer.parseInt(jTextField1.getText()));
        c1.basaEkle(yeni);
        
        
    }//GEN-LAST:event_basaekleActionPerformed

    private void sonaekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonaekleActionPerformed
        cEleman yeni=new cEleman(Integer.parseInt(jTextField1.getText()));
        c1.sonaEkle(yeni);
    }//GEN-LAST:event_sonaekleActionPerformed

    private void bastansilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bastansilActionPerformed
        c1.bastanSil();
    }//GEN-LAST:event_bastansilActionPerformed

    private void lsiteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsiteleActionPerformed
        jTextArea1.setText(c1.listele());
        
    }//GEN-LAST:event_lsiteleActionPerformed

    private void tersListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tersListeleActionPerformed
        jTextArea1.setText(c1.terstenListele());
    }//GEN-LAST:event_tersListeleActionPerformed

    private void enbBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enbBTNActionPerformed
        enbLabel.setText(Integer.toString(c1.enBuyukBul()));
        
    }//GEN-LAST:event_enbBTNActionPerformed

    private void sıralıBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sıralıBTNActionPerformed
        cEleman yeni=new cEleman(Integer.parseInt(jTextField1.getText()));
        c1.siraliEkle(yeni);
    }//GEN-LAST:event_sıralıBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ListeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basaekle;
    private javax.swing.JButton bastansil;
    private javax.swing.JButton enbBTN;
    private javax.swing.JLabel enbLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lsitele;
    private javax.swing.JButton sonaekle;
    private javax.swing.JButton sıralıBTN;
    private javax.swing.JButton tersListele;
    // End of variables declaration//GEN-END:variables
}
