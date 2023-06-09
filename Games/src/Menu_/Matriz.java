/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author estiven
 */
public class Matriz extends javax.swing.JFrame {

    DefaultTableModel Sumar = new DefaultTableModel();
    DefaultTableModel Multiplicar_ = new DefaultTableModel();
    DefaultTableModel Mostrar = new DefaultTableModel();
    Matrices Matriz = new Matrices();

    
    public Matriz() {
        initComponents();
    Tablamostrar.setModel(Mostrar);
   
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablasumar = new javax.swing.JTable();
        Restar = new javax.swing.JButton();
        Traspuesta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablamultiplicar = new javax.swing.JTable();
        MULTIPLICAR = new javax.swing.JButton();
        Sumar_ = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablamostrar = new javax.swing.JTable();
        Operar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Filastablasumar = new javax.swing.JTextField();
        Columnastablasumar = new javax.swing.JTextField();
        Botoncrear = new javax.swing.JButton();
        mensaje = new javax.swing.JTextField();
        volver1 = new javax.swing.JButton();

        volver.setBackground(new java.awt.Color(51, 255, 204));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        Tablasumar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tablasumar);

        Restar.setBackground(new java.awt.Color(204, 204, 255));
        Restar.setText("RESTAR");
        Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarActionPerformed(evt);
            }
        });

        Traspuesta.setBackground(new java.awt.Color(204, 204, 255));
        Traspuesta.setText("A x B ^-1");
        Traspuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraspuestaActionPerformed(evt);
            }
        });

        Tablamultiplicar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tablamultiplicar);

        MULTIPLICAR.setBackground(new java.awt.Color(204, 204, 255));
        MULTIPLICAR.setText("MULTIPLICAR");
        MULTIPLICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIPLICARActionPerformed(evt);
            }
        });

        Sumar_.setBackground(new java.awt.Color(204, 204, 255));
        Sumar_.setText("SUMAR");
        Sumar_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sumar_MouseClicked(evt);
            }
        });
        Sumar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sumar_ActionPerformed(evt);
            }
        });

        Tablamostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tablamostrar);

        Operar.setBackground(new java.awt.Color(255, 204, 204));
        Operar.setText("OPERAR");
        Operar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperarActionPerformed(evt);
            }
        });

        jLabel1.setText("NUMERO DE FILAS: ");

        jLabel2.setText("NUMERO DE COLUMNAS: ");

        Columnastablasumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColumnastablasumarActionPerformed(evt);
            }
        });

        Botoncrear.setBackground(new java.awt.Color(204, 255, 204));
        Botoncrear.setText("CREAR");
        Botoncrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotoncrearMouseClicked(evt);
            }
        });
        Botoncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoncrearActionPerformed(evt);
            }
        });

        volver1.setBackground(new java.awt.Color(51, 255, 204));
        volver1.setText("VOLVER");
        volver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver1MouseClicked(evt);
            }
        });
        volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(Sumar_)
                                    .addGap(18, 18, 18)
                                    .addComponent(Restar))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(MULTIPLICAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Traspuesta)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(volver1)
                                        .addGap(156, 156, 156))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Operar)
                                        .addGap(159, 159, 159))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Filastablasumar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Columnastablasumar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botoncrear)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 145, Short.MAX_VALUE)
                                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Filastablasumar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Columnastablasumar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(Botoncrear)
                        .addGap(4, 4, 4)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Operar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volver1)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Restar)
                            .addComponent(Sumar_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MULTIPLICAR)
                            .addComponent(Traspuesta))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotoncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoncrearActionPerformed
       
        int cont=1;
       String DatosTabla[] =  new String [Integer.parseInt(Filastablasumar.getText())];
       
          for( int x=0; x< Integer.parseInt(Columnastablasumar.getText()); x++)
        {
              Sumar.addColumn("Nº "+ cont++ );
        }
           for( int y=0;y< Integer.parseInt(Filastablasumar.getText()); y++)
        {
              
              Sumar.addRow(DatosTabla);
        }
       
        Tablasumar.setModel(Sumar);
        
        
       int cont2=1;
     
         String DatosTabla2[] =  new String [Integer.parseInt(Filastablasumar.getText())];
         
          for( int r=0; r< Integer.parseInt(Columnastablasumar.getText()); r++)
        {
              Multiplicar_.addColumn("Nº "+ cont2++ );
        }
           for( int t=0;t< Integer.parseInt(Filastablasumar.getText()); t++)
        {
              
            Multiplicar_.addRow(DatosTabla2);
        }
       
        Tablamultiplicar.setModel(Multiplicar_);
        
        
          int cont3=1;
     
         String DatosTabla3[] =  new String [Integer.parseInt(Filastablasumar.getText())];
         
          for( int x=0; x< Integer.parseInt(Columnastablasumar.getText()); x++)
        {
              Mostrar.addColumn("Nº "+ cont3++ );
        }
           for( int y=0;y< Integer.parseInt(Filastablasumar.getText()); y++)
        {
              
            Mostrar.addRow(DatosTabla3);
        }
       
        Tablamostrar.setModel(Mostrar);
       
      
        
    }//GEN-LAST:event_BotoncrearActionPerformed

    private void BotoncrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoncrearMouseClicked
        Botoncrear.setEnabled(false);
    }//GEN-LAST:event_BotoncrearMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Menu mostrar = new Menu();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseClicked
        Menu mostrar = new Menu();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volver1MouseClicked

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
      
        
    }//GEN-LAST:event_volver1ActionPerformed

    private void Sumar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sumar_ActionPerformed
   
                int filas=0,columnas=0;
    filas=Integer.parseInt(Filastablasumar.getText());
    columnas=Integer.parseInt(Columnastablasumar.getText());
    int j[][] = new int [filas][columnas];
    int k[][] = new int [filas][columnas];
    int l[][] = new int [filas][columnas];
       for (int x=0; x<filas; x++)
        {
            for (int y=0; y<columnas; y++)
            {
               
                j[x][y]= (Integer.parseInt((String) Tablasumar.getValueAt(x, y)));
              
              
            }
        }
      
        
         for (int r=0; r<filas; r++)
        {
            for (int t=0; t<columnas; t++)
            {
                k[r][t] = (Integer.parseInt((String) Tablamultiplicar.getValueAt(r,t)));
                
            }
        }
       
        
        Matriz.sumar(filas, columnas , j, k, l);

 
         
          for (int q=0; q<Integer.parseInt(Filastablasumar.getText()); q++)
        {
            for (int w=0;w <Integer.parseInt(Columnastablasumar.getText()); w++)
            {
                 Tablamostrar.setValueAt(Integer.toString(l[q][w]), q, w);
                
            }
        }
        
        
         
    }//GEN-LAST:event_Sumar_ActionPerformed

    private void Sumar_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sumar_MouseClicked
   
    }//GEN-LAST:event_Sumar_MouseClicked

    private void RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarActionPerformed
  
     int filas=0,columnas=0;
    filas=Integer.parseInt(Filastablasumar.getText());
    columnas=Integer.parseInt(Columnastablasumar.getText());
    int j[][] = new int [filas][columnas];
    int k[][] = new int [filas][columnas];
    int l[][] = new int [filas][columnas];
       for (int x=0; x<filas; x++)
        {
            for (int y=0; y<columnas; y++)
            {
               
                j[x][y]= (Integer.parseInt((String) Tablasumar.getValueAt(x, y)));
              
              
            }
        }
      
        
         for (int r=0; r<filas; r++)
        {
            for (int t=0; t<columnas; t++)
            {
                k[r][t] = (Integer.parseInt((String) Tablamultiplicar.getValueAt(r,t)));
                
            }
        }
       
        
        Matriz.restar(filas, columnas , j, k, l);
         
         
          for (int q=0; q<Integer.parseInt(Filastablasumar.getText()); q++)
        {
            for (int w=0;w <Integer.parseInt(Columnastablasumar.getText()); w++)
            {
                 Tablamostrar.setValueAt(Integer.toString(l[q][w]), q, w);
                
            }
        }
       
                                    
    }//GEN-LAST:event_RestarActionPerformed

    private void MULTIPLICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIPLICARActionPerformed
    
    int filas=0,columnas=0;
    filas=Integer.parseInt(Filastablasumar.getText());
    columnas=Integer.parseInt(Columnastablasumar.getText());
    int j[][] = new int [filas][columnas];
    int k[][] = new int [filas][columnas];
    int l[][] = new int [filas][columnas];
    
        if(filas==columnas)
        {
           
       
        
       for (int x=0; x<filas; x++)
        {
            for (int y=0; y<columnas; y++)
            {
               
                j[x][y]= (Integer.parseInt((String) Tablasumar.getValueAt(x, y)));
              
              
            }
        }
      
        
         for (int r=0; r<filas; r++)
        {
            for (int t=0; t<columnas; t++)
            {
                k[r][t] = (Integer.parseInt((String) Tablamultiplicar.getValueAt(r,t)));
                
            }
        }
           
         Matriz.multiplicar(filas, j, k, l);
         
         
          for (int q=0; q<Integer.parseInt(Filastablasumar.getText()); q++)
        {
            for (int w=0;w <Integer.parseInt(Columnastablasumar.getText()); w++)
            {
                 Tablamostrar.setValueAt(Integer.toString(l[q][w]), q, w);
                
            }
        }
          
        }else 
        {
            mensaje.setText("EL NUMERO DE FILAS TIENE QUE SER IGUAL AL NUMERO DE COLUMNAS");
            
        }
        
    }//GEN-LAST:event_MULTIPLICARActionPerformed

    private void OperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperarActionPerformed
        
        
        
    }//GEN-LAST:event_OperarActionPerformed

    private void TraspuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraspuestaActionPerformed
        int filas=0,columnas=0;
    filas=Integer.parseInt(Filastablasumar.getText());
    columnas=Integer.parseInt(Columnastablasumar.getText());
    int j[][] = new int [filas][columnas];
    int k[][] = new int [filas][columnas];
    int l[][] = new int [filas][columnas];
       
       for (int x=0; x<filas; x++)
        {
            for (int y=0; y<columnas; y++)
            {
               
                j[x][y]= (Integer.parseInt((String) Tablasumar.getValueAt(x, y)));
              
              
            }
        }
      
        
         for (int r=0; r<filas; r++)
        {
            for (int t=0; t<columnas; t++)
            {
                k[r][t] = (Integer.parseInt((String) Tablamultiplicar.getValueAt(r,t)));
                
            }
        }
       
        
        Matriz.transpuesta(filas , j, k, l);

         
         for (int r=0; r<filas; r++)
        {
            for (int t=0; t<columnas; t++)
            {
                System.out.print(l[r][t]+" ");
                
            }
            System.out.println();
        }
         
         
         for (int q=0; q<Integer.parseInt(Filastablasumar.getText()); q++)
        {
            for (int w=0;w <Integer.parseInt(Columnastablasumar.getText()); w++)
            {
                 Tablamostrar.setValueAt(Integer.toString(l[q][w]), q, w);
                
            }
        }
        
        
    }//GEN-LAST:event_TraspuestaActionPerformed

    private void ColumnastablasumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColumnastablasumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColumnastablasumarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botoncrear;
    private javax.swing.JTextField Columnastablasumar;
    private javax.swing.JTextField Filastablasumar;
    private javax.swing.JButton MULTIPLICAR;
    private javax.swing.JButton Operar;
    private javax.swing.JButton Restar;
    private javax.swing.JButton Sumar_;
    private javax.swing.JTable Tablamostrar;
    private javax.swing.JTable Tablamultiplicar;
    private javax.swing.JTable Tablasumar;
    private javax.swing.JButton Traspuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mensaje;
    private javax.swing.JButton volver;
    private javax.swing.JButton volver1;
    // End of variables declaration//GEN-END:variables
}
