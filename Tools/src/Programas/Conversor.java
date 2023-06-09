
package Programas;

import javax.swing.JOptionPane;


public class Conversor extends javax.swing.JFrame
{
CodigosNumericos objeto2=new CodigosNumericos();
   
    public Conversor() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        decimalabinario = new javax.swing.JRadioButton();
        binarioadecimal = new javax.swing.JRadioButton();
        decimalaoctal = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        decimalahexadecimal = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CONVERSOR DE CODIGOS NUMERICOS"));

        jLabel1.setText("Ingrese el numero :");

        num.setForeground(new java.awt.Color(51, 51, 51));

        resultado.setBackground(new java.awt.Color(0, 204, 0));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CONVERTIR A SISTEMAS DE UNIDADES");

        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        menu.setText("VOLVER AL MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        decimalabinario.setText("DECIMAL A BINARIO");
        decimalabinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalabinarioActionPerformed(evt);
            }
        });

        binarioadecimal.setText("BINARIO A DECIMAL");
        binarioadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarioadecimalActionPerformed(evt);
            }
        });

        decimalaoctal.setText("DECIMAL A OCTAL");
        decimalaoctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalaoctalActionPerformed(evt);
            }
        });

        jLabel3.setText("Escoje el numero que ingresaste:");

        decimalahexadecimal.setText("DECIMAL A HEXADECIMAL");
        decimalahexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalahexadecimalActionPerformed(evt);
            }
        });

        jLabel4.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(decimalabinario)
                        .addGap(18, 18, 18)
                        .addComponent(binarioadecimal)
                        .addGap(18, 18, 18)
                        .addComponent(decimalaoctal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decimalahexadecimal)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(limpiar)))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decimalabinario)
                    .addComponent(binarioadecimal)
                    .addComponent(decimalaoctal)
                    .addComponent(decimalahexadecimal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(menu))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        num.setText("");
        resultado.setText("");
        
    }//GEN-LAST:event_limpiarActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Menu obj4=new Menu();
        obj4.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_menuActionPerformed

    private void decimalabinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalabinarioActionPerformed
        // TODO add your handling code here:
        objeto2.numero1= Integer.parseInt(num.getText());
        objeto2.decimalabinario();
        resultado.setText(objeto2.mensaje1);
       
    }//GEN-LAST:event_decimalabinarioActionPerformed

    private void binarioadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarioadecimalActionPerformed
        // TODO add your handling code here:
        objeto2.numero3=Integer.parseInt(num.getText());
        objeto2.binarioadecimal();
        resultado.setText(objeto2.mensaje3);
        
       
        
        
    }//GEN-LAST:event_binarioadecimalActionPerformed

    private void decimalaoctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalaoctalActionPerformed
        // TODO add your handling code here:
        objeto2.numero2= Integer.parseInt(num.getText());
        objeto2.decimalaoctal();
        resultado.setText(objeto2.mensaje2);
        
    }//GEN-LAST:event_decimalaoctalActionPerformed

    private void decimalahexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalahexadecimalActionPerformed
        // TODO add your handling code here:
        resultado.setText(String.valueOf(objeto2.decimalahexadecimal(Integer.parseInt(num.getText()))));
    }//GEN-LAST:event_decimalahexadecimalActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton binarioadecimal;
    private javax.swing.JRadioButton decimalabinario;
    private javax.swing.JRadioButton decimalahexadecimal;
    private javax.swing.JRadioButton decimalaoctal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton menu;
    private javax.swing.JTextField num;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}