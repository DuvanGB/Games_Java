
package Programas;

import java.awt.Color;


public class InterfazResistencias extends javax.swing.JFrame 
{
    Resistencias objeto1=new Resistencias();
    

    public InterfazResistencias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        Tolerancia1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Espacio1 = new javax.swing.JTextField();
        Espacio2 = new javax.swing.JTextField();
        Espacio3 = new javax.swing.JTextField();
        Espacio4 = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        banda1 = new javax.swing.JComboBox();
        banda2 = new javax.swing.JComboBox();
        Multiplicador = new javax.swing.JComboBox();
        Tolerancia = new javax.swing.JComboBox();
        valor4 = new javax.swing.JTextField();
        valor2 = new javax.swing.JTextField();
        valor1 = new javax.swing.JTextField();
        valor3 = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla resistencias.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla resistencias.jpg"))); // NOI18N

        jLabel3.setText("jLabel3");

        jTextField1.setFont(new java.awt.Font("SWRomnt", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("SWRomnt", 0, 24)); // NOI18N
        jTextField2.setText("Tolerancia:");

        jTextField3.setText("jTextField3");
        jTextField3.setCaretColor(new java.awt.Color(255, 0, 51));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("CALCULAR RESISTENCIAS"));
        jPanel3.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Banda 1");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(570, 40, 70, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Banda 2");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(570, 130, 70, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Multiplicador");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(570, 220, 102, 24);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Tolerancia");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(570, 310, 82, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Valor:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(460, 450, 86, 34);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Tolerancia:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(460, 510, 89, 30);

        Valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });
        jPanel3.add(Valor);
        Valor.setBounds(560, 460, 150, 23);

        Tolerancia1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tolerancia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tolerancia1ActionPerformed(evt);
            }
        });
        jPanel3.add(Tolerancia1);
        Tolerancia1.setBounds(560, 510, 100, 23);

        jPanel4.setLayout(null);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField4);
        jTextField4.setBounds(10, 22, 20, 65);
        jPanel4.add(jTextField5);
        jTextField5.setBounds(82, 22, 20, 65);
        jPanel4.add(jTextField6);
        jTextField6.setBounds(257, 22, 20, 65);
        jPanel4.add(jTextField7);
        jTextField7.setBounds(219, 22, 20, 65);
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 0, 0, 0);
        jPanel4.add(jLabel16);
        jLabel16.setBounds(106, 0, 109, 87);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(47, 543, 0, 0);

        Espacio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio1ActionPerformed(evt);
            }
        });
        jPanel3.add(Espacio1);
        Espacio1.setBounds(140, 460, 20, 80);

        Espacio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio2ActionPerformed(evt);
            }
        });
        jPanel3.add(Espacio2);
        Espacio2.setBounds(190, 460, 20, 80);

        Espacio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio3ActionPerformed(evt);
            }
        });
        jPanel3.add(Espacio3);
        Espacio3.setBounds(240, 460, 20, 80);
        jPanel3.add(Espacio4);
        Espacio4.setBounds(290, 460, 20, 80);

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel3.add(Calcular);
        Calcular.setBounds(580, 560, 170, 40);

        banda1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Morado", "Gris", "Blanco" }));
        banda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banda1ActionPerformed(evt);
            }
        });
        jPanel3.add(banda1);
        banda1.setBounds(570, 70, 100, 19);

        banda2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Morado", "Gris", "Blanco" }));
        banda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banda2ActionPerformed(evt);
            }
        });
        jPanel3.add(banda2);
        banda2.setBounds(570, 160, 100, 19);

        Multiplicador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Dorado", "Plateado" }));
        Multiplicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicadorActionPerformed(evt);
            }
        });
        jPanel3.add(Multiplicador);
        Multiplicador.setBounds(570, 250, 100, 19);

        Tolerancia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cafe", "Rojo", "Dorado", "Plateado" }));
        Tolerancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToleranciaActionPerformed(evt);
            }
        });
        jPanel3.add(Tolerancia);
        Tolerancia.setBounds(570, 340, 100, 19);

        valor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor4ActionPerformed(evt);
            }
        });
        jPanel3.add(valor4);
        valor4.setBounds(680, 330, 130, 30);

        valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2ActionPerformed(evt);
            }
        });
        jPanel3.add(valor2);
        valor2.setBounds(680, 150, 140, 30);

        valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1ActionPerformed(evt);
            }
        });
        jPanel3.add(valor1);
        valor1.setBounds(680, 70, 140, 30);

        valor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor3ActionPerformed(evt);
            }
        });
        jPanel3.add(valor3);
        valor3.setBounds(680, 240, 130, 30);

        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel3.add(limpiar);
        limpiar.setBounds(740, 650, 80, 21);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla resistencias.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 20, 550, 380);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Resistencia.jpg"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 430, 420, 150);

        jButton1.setText("VOLVER AL MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(40, 623, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1432, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1060, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorActionPerformed

    private void Tolerancia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tolerancia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tolerancia1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void Espacio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Espacio1ActionPerformed

    private void Espacio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Espacio3ActionPerformed

    private void Espacio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Espacio2ActionPerformed

    private void banda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banda1ActionPerformed
if (banda1.getSelectedIndex()==0)
{
    banda1.setBackground(Color.black);
    Espacio1.setBackground(Color.black);
    int j=0;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
    }//GEN-LAST:event_banda1ActionPerformed
if(banda1.getSelectedIndex()==1)
{
    banda1.setBackground(new Color(153,51,0));
    Espacio1.setBackground(new Color(153,51,0));
    int j=10;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
}
if(banda1.getSelectedIndex()==2)
{
    banda1.setBackground(Color.red);
    Espacio1.setBackground(Color.red);
    int j=20;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
}
if(banda1.getSelectedIndex()==3)
{
    banda1.setBackground(Color.orange);
    Espacio1.setBackground(Color.orange);
    int j=30;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
}

if (banda1.getSelectedIndex()==4)
{
    banda1.setBackground(Color.yellow);
    Espacio1.setBackground(Color.yellow);
    int j=40;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
 }                                      
if(banda1.getSelectedIndex()==5)
{
    banda1.setBackground(Color.green);
    Espacio1.setBackground(Color.green);
    int j=50;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
}
if(banda1.getSelectedIndex()==6)
{
    banda1.setBackground(Color.blue);
    Espacio1.setBackground(Color.blue);
    int j=60;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
}
if(banda1.getSelectedIndex()==7)
{
    banda1.setBackground(new Color(102,0,102));
    Espacio1.setBackground(new Color(102,0,102));
    int j=70;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
}
if (banda1.getSelectedIndex()==8)
{
    banda1.setBackground(Color.gray);
    Espacio1.setBackground(Color.gray);
    int j=80;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
 }                                      
if(banda1.getSelectedIndex()==9)
{
    banda1.setBackground(Color.white);
    Espacio1.setBackground(Color.white);
    int j=90;
    String res;
    res= Integer.toString(j);
    valor1.setText(res);
}
    }
    
    private void banda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banda2ActionPerformed
        // TODO add your handling code here:
        if (banda2.getSelectedIndex()==0)
{
    banda1.setBackground(Color.black);
    Espacio2.setBackground(Color.black);
    int x=0;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
    }                                      
if(banda2.getSelectedIndex()==1)
{
    banda1.setBackground(new Color(153,51,0));
    Espacio2.setBackground(new Color(153,51,0));
    int x=1;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
}
if(banda2.getSelectedIndex()==2)
{
    banda1.setBackground(Color.red);
    Espacio2.setBackground(Color.red);
    int x=2;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
}
if(banda2.getSelectedIndex()==3)
{
    banda1.setBackground(Color.orange);
    Espacio2.setBackground(Color.orange);
    int x=3;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
}

if (banda2.getSelectedIndex()==4)
{
    banda1.setBackground(Color.yellow);
    Espacio2.setBackground(Color.yellow);
    int x=4;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
 }                                      
if(banda2.getSelectedIndex()==5)
{
    banda1.setBackground(Color.green);
    Espacio2.setBackground(Color.green);
    int x=5;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
}
if(banda2.getSelectedIndex()==6)
{
    banda1.setBackground(Color.blue);
    Espacio2.setBackground(Color.blue);
    int x=6;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
}
if(banda2.getSelectedIndex()==7)
{
    banda1.setBackground(new Color(102,0,102));
    Espacio2.setBackground(new Color(102,0,102));
    int x=7;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
}
if (banda2.getSelectedIndex()==8)
{
    banda1.setBackground(Color.gray);
    Espacio2.setBackground(Color.gray);
    int x=8;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
 }                                      
if(banda2.getSelectedIndex()==9)
{
    banda1.setBackground(Color.white);
    Espacio2.setBackground(Color.white);
    int x=9;
    String res1;
    res1= Integer.toString(x);
    valor2.setText(res1);
}
    }//GEN-LAST:event_banda2ActionPerformed

    private void MultiplicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicadorActionPerformed
        // TODO add your handling code here:
        if (Multiplicador.getSelectedIndex()==0)
{
    banda1.setBackground(Color.black);
    Espacio3.setBackground(Color.black);
    int y=1;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
    }                                      
if(Multiplicador.getSelectedIndex()==1)
{
    banda1.setBackground(new Color(153,51,0));
    Espacio3.setBackground(new Color(153,51,0));
    int y=10;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
}
if(Multiplicador.getSelectedIndex()==2)
{
    banda1.setBackground(Color.red);
    Espacio3.setBackground(Color.red);
    int y=100;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
}
if(Multiplicador.getSelectedIndex()==3)
{
    banda1.setBackground(Color.orange);
    Espacio3.setBackground(Color.orange);
    int y=1000;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
}

if (Multiplicador.getSelectedIndex()==4)
{
    banda1.setBackground(Color.yellow);
    Espacio3.setBackground(Color.yellow);
    int y=10000;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
 }                                      
if(Multiplicador.getSelectedIndex()==5)
{
    banda1.setBackground(Color.green);
    Espacio3.setBackground(Color.green);
    int y=100000;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
}
if(Multiplicador.getSelectedIndex()==6)
{
    banda1.setBackground(Color.blue);
    Espacio3.setBackground(Color.blue);
    int y=1000000;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
}
if(Multiplicador.getSelectedIndex()==7)
{
    banda1.setBackground(new Color(239,184,16));
    Espacio3.setBackground(new Color(239,184,16));
    int y=1/10;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
}
if (Multiplicador.getSelectedIndex()==8)
{
    banda1.setBackground(new Color(153,153,153));
    Espacio3.setBackground(new Color(153,153,153));
    int y=1/100;
    String res2;
    res2= Integer.toString(y);
    valor3.setText(res2);
 }                                      

    }//GEN-LAST:event_MultiplicadorActionPerformed

    private void ToleranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToleranciaActionPerformed
        // TODO add your handling code here:
        if(Tolerancia.getSelectedIndex()==0)
{
    banda1.setBackground(new Color(153,53,0));
    Espacio4.setBackground(new Color(153,53,0));
    int i=1;
    String res3;
    res3= Integer.toString(i);
    valor4.setText(res3);
}
if(Tolerancia.getSelectedIndex()==1)
{
    banda1.setBackground(Color.red);
    Espacio4.setBackground(Color.red);
    int i=2;
    String res3;
    res3= Integer.toString(i);
    valor4.setText(res3);
}
if(Tolerancia.getSelectedIndex()==2)
{
    banda1.setBackground(new Color(239,184,16));
    Espacio4.setBackground(new Color(239,184,16));
    int i=5;
    String res3;
    res3= Integer.toString(i);
    valor4.setText(res3);
}
if (Tolerancia.getSelectedIndex()==3)
{
    banda1.setBackground(new Color(153,153,153));
    Espacio4.setBackground(new Color(153,153,153));
    int i=10;
    String res3;
    res3= Integer.toString(i);
    valor4.setText(res3);
 }                 
    }//GEN-LAST:event_ToleranciaActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        int band1=Integer.parseInt(valor1.getText());
        int band2=Integer.parseInt(valor2.getText());
        int band3=Integer.parseInt(valor3.getText());
        int band4=Integer.parseInt(valor4.getText());
        
        String transformar1= Integer.toString(band1);
        String transformar2= Integer.toString(band2);
        String transformar3= Integer.toString(band3);
        String transformar4= Integer.toString(band4);
        
        int result=0;
        result=result+((band1+band2)*band3);
        String resul=Integer.toString(result);
        String toler=Integer.toString(band4);
        Valor.setText(resul+"Ω");
        Tolerancia1.setText("+/-"+toler+"%");
    }//GEN-LAST:event_CalcularActionPerformed

    private void valor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor4ActionPerformed

    private void valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor2ActionPerformed

    private void valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor1ActionPerformed

    private void valor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor3ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        valor1.setText("");
        valor2.setText("");
        valor3.setText("");
        valor4.setText("");
        Valor.setText("");
        Espacio1.setText("");
        Espacio2.setText("");
        Espacio3.setText("");
        Espacio4.setText("");
        Tolerancia1.setText("");
        
    }//GEN-LAST:event_limpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu obj4=new Menu();
        obj4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    

  
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
            java.util.logging.Logger.getLogger(InterfazResistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazResistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazResistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazResistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazResistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField Espacio1;
    private javax.swing.JTextField Espacio2;
    private javax.swing.JTextField Espacio3;
    private javax.swing.JTextField Espacio4;
    private javax.swing.JComboBox Multiplicador;
    private javax.swing.JComboBox Tolerancia;
    private javax.swing.JTextField Tolerancia1;
    private javax.swing.JTextField Valor;
    private javax.swing.JComboBox banda1;
    private javax.swing.JComboBox banda2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField valor1;
    private javax.swing.JTextField valor2;
    private javax.swing.JTextField valor3;
    private javax.swing.JTextField valor4;
    // End of variables declaration//GEN-END:variables
}
