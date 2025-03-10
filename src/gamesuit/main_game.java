/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gamesuit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author asus
 */
public class main_game extends javax.swing.JFrame {

    /**
     * Creates new form main_game
     */
    private String[] pilihan = {"Batu", "Gunting", "Kertas"};
    private Timer timer;
    private Random rand = new Random();
    String komputer;
    public main_game() {
        initComponents();
        
        
   }    public main_game(String nama) {
        initComponents();
        nama_user.setText(nama);
        animasi_acak();
        
   }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nama_user = new javax.swing.JLabel();
        pil_komputer = new javax.swing.JLabel();
        btn_batu = new javax.swing.JButton();
        btn_gunting = new javax.swing.JButton();
        btn_kertas = new javax.swing.JButton();
        lblHasil = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nama_user.setText("jLabel1");

        btn_batu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Batu.png"))); // NOI18N
        btn_batu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batuActionPerformed(evt);
            }
        });

        btn_gunting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gunting.png"))); // NOI18N
        btn_gunting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guntingActionPerformed(evt);
            }
        });

        btn_kertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Kertas.png"))); // NOI18N
        btn_kertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kertasActionPerformed(evt);
            }
        });

        lblHasil.setText("jLabel1");

        jButton1.setText("lagi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHasil)
                            .addComponent(btn_batu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(pil_komputer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btn_gunting, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btn_kertas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(nama_user)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nama_user)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pil_komputer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHasil)
                        .addGap(66, 66, 66)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_gunting)
                    .addComponent(btn_batu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kertas))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_batuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batuActionPerformed
        // TODO add your handling code here:
        userMemilih("Batu");
    }//GEN-LAST:event_btn_batuActionPerformed

    private void btn_guntingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guntingActionPerformed
        // TODO add your handling code here:
        userMemilih("Gunting");
    }//GEN-LAST:event_btn_guntingActionPerformed

    private void btn_kertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kertasActionPerformed
        // TODO add your handling code here:
        userMemilih("Kertas");
    }//GEN-LAST:event_btn_kertasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        animasi_acak();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(main_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batu;
    private javax.swing.JButton btn_gunting;
    private javax.swing.JButton btn_kertas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel nama_user;
    private javax.swing.JLabel pil_komputer;
    // End of variables declaration//GEN-END:variables

    public void animasi_acak() {
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                komputer = (pilihan[rand.nextInt(3)]);
//                pil_komputer.setText(komputer);
                String path_komputer = "/img/"+komputer+ ".png";
                ImageIcon icon = new ImageIcon(getClass().getResource(path_komputer));
                pil_komputer.setIcon(icon);
            }
        });
        timer.start();
    }
    private String tentukanPemenang(String user, String komputer) {
        if (user.equals(komputer)) {
            seri seri = new seri();
            seri.setVisible(true);
            return "Seri";
            
        }
        if ((user.equals("Batu") && komputer.equals("Gunting")) ||
            (user.equals("Gunting") && komputer.equals("Kertas")) ||
            (user.equals("Kertas") && komputer.equals("Batu"))) {
            menag menang = new menag();
            menang.setVisible(true);
            return "Menang";
        }
        kalah kalah = new kalah();
        kalah.setVisible(true);
        return "Kalah";
        
    }
    private void userMemilih(String userChoice) {
        timer.stop();
        String komputerChoice = komputer;
        
        String hasil = tentukanPemenang(userChoice, komputerChoice);
        lblHasil.setText("Hasil: " + hasil);
        
//        if (hasil.equals("Menang")) {
//            currentScore++;
//        } else {
//            currentScore = 0;
//        }
//        
//        if (currentScore > highScore) {
//            highScore = currentScore;
//            saveHighScore(highScore);
//        }
//        
//        lblHighScore.setText("High Score: " + highScore);
    }
}
