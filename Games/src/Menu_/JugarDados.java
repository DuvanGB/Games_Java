/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author estiven
 */
public class JugarDados extends javax.swing.JFrame {

    ImageIcon imagen1 = new ImageIcon(getClass().getResource("/dado/1.png"));
    ImageIcon imagen2 = new ImageIcon(getClass().getResource("/dado/2.png"));
    ImageIcon imagen3 = new ImageIcon(getClass().getResource("/dado/3.png"));
    ImageIcon imagen4 = new ImageIcon(getClass().getResource("/dado/4.png"));
    ImageIcon imagen5 = new ImageIcon(getClass().getResource("/dado/5.png"));
    ImageIcon imagen6 = new ImageIcon(getClass().getResource("/dado/6.png"));
    aleatorio numero = new aleatorio();
    int x = 0;
    int y =0 ;
    
    public JugarDados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dadoizquierdo = new javax.swing.JButton();
        lanzar = new javax.swing.JButton();
        dadoderecho = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        dadoizquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoizquierdoActionPerformed(evt);
            }
        });

        lanzar.setBackground(new java.awt.Color(204, 255, 204));
        lanzar.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lanzar.setText("LANZAR");
        lanzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lanzarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lanzarMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lanzarMouseClicked(evt);
            }
        });
        lanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarActionPerformed(evt);
            }
        });

        dadoderecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoderechoActionPerformed(evt);
            }
        });

        volver.setText("VOLVER");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(dadoizquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dadoderecho, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(volver)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadoizquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadoderecho, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(volver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarActionPerformed
       
       
     

    }//GEN-LAST:event_lanzarActionPerformed

    private void lanzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanzarMouseClicked
     boolean verdad = true;
     
     do{
          
          switch (numero.Aleatorio(x))
          {
              case 1:
                   dadoizquierdo.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(dadoizquierdo.getWidth(), dadoizquierdo.getHeight(), Image.SCALE_SMOOTH)));
                   verdad = false;
                   break;
              case 2:
                  dadoizquierdo.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(dadoizquierdo.getWidth(), dadoizquierdo.getHeight(), Image.SCALE_SMOOTH))); 
                   verdad = false;
                  break;
              case 3:
                   dadoizquierdo.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(dadoizquierdo.getWidth(), dadoizquierdo.getHeight(), Image.SCALE_SMOOTH)));    
                   verdad = false;
                   break;
              
              case 4: 
                   dadoizquierdo.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(dadoizquierdo.getWidth(), dadoizquierdo.getHeight(), Image.SCALE_SMOOTH))); 
                   verdad = false;
                   break;
              case 5:
                         dadoizquierdo.setIcon(new ImageIcon(imagen5.getImage().getScaledInstance(dadoizquierdo.getWidth(), dadoizquierdo.getHeight(), Image.SCALE_SMOOTH)));  
                   verdad = false;
                         break;
                  
              case 6 :
                     dadoizquierdo.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(dadoizquierdo.getWidth(), dadoizquierdo.getHeight(), Image.SCALE_SMOOTH)));    
                   verdad = false;
                     break;
                  
              
          }
        

      }while (verdad == true);  
     
      verdad = true;
     
      do{
         
         
         
          switch (numero.Aleatorio(y))
          {
              case 1:
                   dadoderecho.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(dadoderecho.getWidth(), dadoderecho.getHeight(), Image.SCALE_SMOOTH)));
                   verdad = false;
                   break;
              case 2:
                  dadoderecho.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(dadoderecho.getWidth(), dadoderecho.getHeight(), Image.SCALE_SMOOTH))); 
                   verdad = false;
                  break;
              case 3:
                   dadoderecho.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(dadoderecho.getWidth(), dadoderecho.getHeight(), Image.SCALE_SMOOTH)));    
                   verdad = false;
                   break;
              
              case 4: 
                   dadoderecho.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(dadoderecho.getWidth(), dadoderecho.getHeight(), Image.SCALE_SMOOTH))); 
                   verdad = false;
                   break;
              case 5:
                   dadoderecho.setIcon(new ImageIcon(imagen5.getImage().getScaledInstance(dadoderecho.getWidth(), dadoderecho.getHeight(), Image.SCALE_SMOOTH)));  
                   verdad = false;
                   break;
                  
              case 6 :
                     dadoderecho.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(dadoderecho.getWidth(), dadoderecho.getHeight(), Image.SCALE_SMOOTH)));    
                    verdad = false;
                     break;
                  
              
          }
        

      }while (verdad == true);  
    }//GEN-LAST:event_lanzarMouseClicked

    private void dadoizquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoizquierdoActionPerformed
       
    }//GEN-LAST:event_dadoizquierdoActionPerformed

    private void dadoderechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoderechoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadoderechoActionPerformed

    private void lanzarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanzarMousePressed
        lanzar.setBackground(Color.BLUE);
    }//GEN-LAST:event_lanzarMousePressed

    private void lanzarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanzarMouseReleased
      
    }//GEN-LAST:event_lanzarMouseReleased

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Menu mostrar = new Menu();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(JugarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dadoderecho;
    private javax.swing.JButton dadoizquierdo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lanzar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
