
package Menu_;

import java.awt.Color;


public class Triqui extends javax.swing.JFrame {

   Juego X = new Juego();
   Juego O = new Juego ();
   int matrizX[][]= new int[3][3];
   int matrizO[][]= new int[3][3];
   int inicio = 1;
   int puntosX = 0 ;
   int puntosO= 0;
   boolean ciclo = false;
   public Triqui() {
   initComponents();
       
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        UnJugadorBoton = new javax.swing.JRadioButton();
        DosJugadoresBoton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JTextField();
        jugador2 = new javax.swing.JTextField();
        ReiniciarPartida = new javax.swing.JButton();
        ReiniciarJuego = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        texto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        puntaje1 = new javax.swing.JLabel();
        puntaje2 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(UnJugadorBoton);
        UnJugadorBoton.setText("Un Jugador");
        UnJugadorBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnJugadorBotonMouseClicked(evt);
            }
        });
        UnJugadorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnJugadorBotonActionPerformed(evt);
            }
        });

        buttonGroup1.add(DosJugadoresBoton);
        DosJugadoresBoton.setText("Dos Jugadores");
        DosJugadoresBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosJugadoresBotonActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE JUGADOR (X) :");

        jLabel2.setText("NOMBRE JUGADOR (O) :");

        ReiniciarPartida.setBackground(new java.awt.Color(204, 255, 204));
        ReiniciarPartida.setText("REINICIAR PARTIDA");
        ReiniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarPartidaActionPerformed(evt);
            }
        });

        ReiniciarJuego.setBackground(new java.awt.Color(204, 255, 204));
        ReiniciarJuego.setText("REINICIAR JUEGO");
        ReiniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarJuegoActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        jLabel3.setText("GANADOR : ");

        jLabel7.setText("PUNTAJES");

        puntaje1.setText("0");

        puntaje2.setText("0");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jugador1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DosJugadoresBoton)
                                    .addComponent(UnJugadorBoton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ReiniciarPartida)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(ReiniciarJuego))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puntaje1)
                                    .addComponent(jLabel7)
                                    .addComponent(puntaje2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UnJugadorBoton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DosJugadoresBoton)
                        .addGap(18, 18, 18)
                        .addComponent(ReiniciarPartida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReiniciarJuego)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puntaje1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puntaje2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(volver))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnJugadorBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnJugadorBotonMouseClicked
         
         X.InicializarMatriz(matrizX);     
         O.InicializarMatriz(matrizO);  
          
    }//GEN-LAST:event_UnJugadorBotonMouseClicked

    private void UnJugadorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnJugadorBotonActionPerformed
            
    }//GEN-LAST:event_UnJugadorBotonActionPerformed

    private void DosJugadoresBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosJugadoresBotonActionPerformed

        X.InicializarMatriz(matrizX);
        O.InicializarMatriz(matrizO); 
        
    }//GEN-LAST:event_DosJugadoresBotonActionPerformed

    public void bloquear ()
    {
        
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        
    }
    
    public void unJugador()
    {
        int aleatorio=0;
      
        do {
            
          
            
            aleatorio = 1 + (int) (Math.random() * 9);
           
            switch (aleatorio) {
                
                
                case 1:{
 
                        if (b1.isEnabled() == true)
                      {
                        matrizO[0][0] = 9;  
                        b1.setText("O");
                        b1.setEnabled(false);
                        ciclo = true;
                         
                        
                         if(O.vectorh1(matrizO)==16)
                        {
                           bloquear();
                           puntosO = puntosO + 1;
                           puntaje2.setText(Integer.toString(puntosO));
                           texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
                        }
                         if(O.vectorv1(matrizO)==17)
                        {
                           bloquear();
                           puntosO = puntosO + 1;
                           puntaje2.setText(Integer.toString(puntosO));
                           texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
                        }
                          if(O.diagonal1(matrizO)==23)
                        {
                           bloquear();
                           puntosO = puntosO + 1;
                           puntaje2.setText(Integer.toString(puntosO));
                           texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
                        }
                       
                       
                    }
                 break;}
                    
                case 2:{
                     
                    if (b2.isEnabled() == true)
                    {
                        matrizO[0][1] = 3;
                        b2.setText("O");
                        b2.setEnabled(false);
                        ciclo = true;
                        
                        if(O.vectorh1(matrizO)==16)
                        {
                           bloquear();
                           puntosO = puntosO + 1;
                           puntaje2.setText(Integer.toString(puntosO));
                           texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
                        }
                         if(O.vectorv2(matrizO)==14)
                        {
                           bloquear();
                           puntosO = puntosO + 1;
                           puntaje2.setText(Integer.toString(puntosO));
                           texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
                        }
                       
                        
                    }
                 break;}
                   
                case 3:{
                    
                    
                    if (b3.isEnabled() == true) 
                    {
                        matrizO[0][2] = 4;
                        b3.setText("O");
                        b3.setEnabled(false);
                        ciclo = true;
                       
                         if(O.vectorh1(matrizO)==16)
                        {
                            bloquear();
                           puntosO = puntosO + 1;
                           puntaje2.setText(Integer.toString(puntosO));
                           texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
                        }
                         if(O.vectorv3(matrizO)==14)
                        {
                            bloquear();
                           puntosO = puntosO + 1;
                           puntaje2.setText(Integer.toString(puntosO));
                           texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
                        }
                          if(O.diagonal2(matrizO)==11)
                        {
                            bloquear();
                           puntosO = puntosO + 1;
                           puntaje2.setText(Integer.toString(puntosO));
                           texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
                        }
                      
                       
                    }
                     break;}
                    

                case 4:{
                     
                    if (b4.isEnabled() == true) 
                    {
                        matrizO[1][0] = 7;
                        b4.setText("O");
                        b4.setEnabled(false);
                        ciclo = true;
                        if(O.vectorh2(matrizO)==15)
                    {
                        bloquear();
                       puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.vectorv1(matrizO)==17)
                    {
                       bloquear();
                       puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                       
                       
                    }
                     break;}
                case 5:{
                     
                    if (b5.isEnabled() == true)
                    {
                        matrizO[1][1] = 6;
                        b5.setText("O");
                        b5.setEnabled(false);
                        ciclo = true;
                      
                           if(O.vectorh2(matrizO)==15)
                    {
                         bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.vectorv2(matrizO)==14)
                    {
                        bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }

                     if(O.diagonal2(matrizO)==11)
                    {
                        bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.diagonal1(matrizO)==23)
                    {
                        bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                       
                         

                    }
                    break;}

                case 6:{
                    
                 if (b6.isEnabled() == true)
                    {   
                        matrizO[1][2] = 2;
                        b6.setText("O");
                        b6.setEnabled(false);
                        ciclo = true;
                        
                         if(O.vectorh2(matrizO)==15)
                    {
                        bloquear();
                       puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.vectorv3(matrizO)==14)
                    {
                         bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                       
                       

                    }
                 break;}
                    
                case 7:{
                     
                    if (b7.isEnabled() == true)
                    { 
                        matrizO[2][0] = 1;
                        b7.setText("O");
                        b7.setEnabled(false);
                        ciclo = true;
                      
                         if(O.vectorh3(matrizO)==14)
                    {
                         bloquear();
                       puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.vectorv1(matrizO)==17)
                    {
                      bloquear();
                       puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.diagonal2(matrizO)==11)
                    {
                         bloquear();
                       puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     
                       
 
                    }
                     break;}
                case 8:{
                    
                    if (b8.isEnabled() == true)
                    {   
                        matrizO[2][1] = 5;
                        b8.setText("O");
                        b8.setEnabled(false);
                        ciclo = true;
                        
                        if(O.vectorh3(matrizO)==14)
                    {
                       bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.vectorv2(matrizO)==14)
                    {
                        bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                       
                        
                    }
                 break;}
                case 9:{
                   
                    if (b9.isEnabled() == true)
                    {
                        matrizO[2][2] = 8;
                        b9.setText("O");
                        b9.setEnabled(false);
                        ciclo = true;
                        
                        if(O.vectorh3(matrizO)==14)
                    {
                       bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.vectorv3(matrizO)==14)
                    {
                       bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                     if(O.diagonal1(matrizO)==23)
                    {
                        bloquear();
                         puntosO = puntosO + 1;
                       puntaje2.setText(Integer.toString(puntosO));
                       texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");

                    }
                      
                       

                    }
                  
                    break;}
               
                        

            }
        }while (ciclo == false);
        
    }
    
    
    
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       
        if (DosJugadoresBoton.isSelected())
        {
            
        if( inicio == 1)
       {
           inicio=2;
           matrizX[0][1] = 3;
           b2.setText("X");
           b2.setEnabled(false);
           
            if(X.vectorh1(matrizX)==16)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
             
              
           }
            if(X.vectorv2(matrizX)==14)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
               
           }
        
             
           
           
       }else
       {
           inicio=1;
            matrizO[0][1] = 3;
           b2.setText("O");
           b2.setEnabled(false);
         
           if(O.vectorh1(matrizO)==16)
           {
              bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
           }
            if(O.vectorv2(matrizO)==14)
           {
              bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
           }
         
             
           
       }
        }
        
        
         if (UnJugadorBoton.isSelected())
        {
          b2.setText("X");
          b2.setEnabled(false);
          matrizX[0][1] = 3;
          if(X.vectorh1(matrizX)==16)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(X.vectorv2(matrizX)==14)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
               
           }
          unJugador();
        } 
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       
        
        if (DosJugadoresBoton.isSelected())
        {
         if( inicio == 1)
       {
           inicio=2;
           matrizX[0][2] = 4;
           b3.setText("X");
           b3.setEnabled(false);
          
         
            if(X.vectorh1(matrizX)==16)
           {
               bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
               
           }
          if(X.vectorv3(matrizX)==14)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           
            if(X.diagonal2(matrizX)==11)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          
           
       }else
       {
           inicio=1;
           matrizO[0][2] = 4;
           b3.setText("O");
           b3.setEnabled(false);
           

            if(O.vectorh1(matrizO)==16)
           {
               bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
           }
            if(O.vectorv3(matrizO)==14)
           {
               bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
           }
             if(O.diagonal2(matrizO)==11)
           {
               bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
           }
          
       }
        } 
       
       
       if (UnJugadorBoton.isSelected())
        {
         
          b3.setText("X");
          b3.setEnabled(false);
          matrizX[0][2] = 4;
          if(X.vectorh1(matrizX)==16)
           {
               bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          if(X.vectorv3(matrizX)==14)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           
            if(X.diagonal2(matrizX)==11)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          unJugador();
        } 
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        
      if (DosJugadoresBoton.isSelected())
        {
       if( inicio == 1)
       {
           inicio=2;
           matrizX[0][0] = 9;
           b1.setText("X");
           b1.setEnabled(false);
          
      
            if(X.vectorh1(matrizX)==16)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv1(matrizX)==17)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
             if(X.diagonal1(matrizX)==23)
           {
               bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          
             
       }else
       {
           inicio=1;
           matrizO[0][0] = 9;
           b1.setText("O");
           b1.setEnabled(false);
          
          
            if(O.vectorh1(matrizO)==16)
           {
               bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
           }
            if(O.vectorv1(matrizO)==17)
           {
               bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
           }
             if(O.diagonal1(matrizO)==23)
           {
                bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
           }
          
       }
        
        }
      
          if (UnJugadorBoton.isSelected())
        {
          b1.setText("X");
          b1.setEnabled(false);
          matrizX[0][0] = 9;
         if(X.vectorh1(matrizX)==16)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv1(matrizX)==17)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
             if(X.diagonal1(matrizX)==23)
           {
               bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          unJugador();
        } 
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       
         if (DosJugadoresBoton.isSelected())
        {
        if( inicio == 1)
       {
           inicio=2;
           matrizX[1][0] = 7;
           b4.setText("X");
           b4.setEnabled(false);
          
         
            if(X.vectorh2(matrizX)==15)
           {
               bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv1(matrizX)==17)
           {
                bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           
          
           
       }else
       {
           inicio=1;
            matrizO[1][0] = 7;
           b4.setText("O");
           b4.setEnabled(false);
          
         
            if(O.vectorh2(matrizO)==15)
           {
               bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.vectorv1(matrizO)==17)
           {
              bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
         
           
       }
        }
         
             if (UnJugadorBoton.isSelected())
        {
          b4.setText("X");
          b4.setEnabled(false);
          matrizX[1][0] = 7;
          if(X.vectorh2(matrizX)==15)
           {
               bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv1(matrizX)==17)
           {
                bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          unJugador();
        } 
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (DosJugadoresBoton.isSelected())
        {
        if( inicio == 1)
       {
           inicio=2;
            matrizX[1][1] = 6;
           b5.setText("X");
           b5.setEnabled(false);
          
          
            if(X.vectorh2(matrizX)==15)
           {
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv2(matrizX)==14)
           { 
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           
            if(X.diagonal2(matrizX)==11)
           {
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.diagonal1(matrizX)==23)
           {
                bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          
           
       }else
       {
           inicio=1;
           matrizO[1][1] = 6;
           b5.setText("O");
           b5.setEnabled(false);
           
           
              if(O.vectorh2(matrizO)==15)
           {
                bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.vectorv2(matrizO)==14)
           {
               bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
           
            if(O.diagonal2(matrizO)==11)
           {
               bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.diagonal1(matrizO)==23)
           {
               bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
          
       }
        }
        
        
            if (UnJugadorBoton.isSelected())
        {
          b5.setText("X");
          b5.setEnabled(false);
          matrizX[1][1] = 6;
          
            if(X.vectorh2(matrizX)==15)
           {
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv2(matrizX)==14)
           { 
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           
            if(X.diagonal2(matrizX)==11)
           {
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.diagonal1(matrizX)==23)
           {
                bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          unJugador();
        } 
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       if (DosJugadoresBoton.isSelected())
        {
        if( inicio == 1)
       {
           inicio=2;
            matrizX[1][2] = 2;
           b6.setText("X");
           b6.setEnabled(false);
          
           
              if(X.vectorh2(matrizX)==15)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv3(matrizX)==14)
           {  
               bloquear(); 
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           

         
           
       }else
       {
          inicio=1;
          matrizO[1][2] = 2;
          b6.setText("O");
          b6.setEnabled(false);
          
         
              if(O.vectorh2(matrizO)==15)
           {
               bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.vectorv3(matrizO)==14)
           {
                bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
           
          
          
       }
        }
       
       
           if (UnJugadorBoton.isSelected())
        {
          b6.setText("X");
          b6.setEnabled(false);
         matrizX[1][2] = 2;
           if(X.vectorh2(matrizX)==15)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv3(matrizX)==14)
           {  
               bloquear(); 
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
          unJugador();
        } 
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
         if (DosJugadoresBoton.isSelected())
        {
        if( inicio == 1)
       {
           inicio=2;
           matrizX[2][0] = 1;
           b7.setText("X");
           b7.setEnabled(false);
           
         
           
              if(X.vectorh3(matrizX)==14)
           {
                bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv1(matrizX)==17)
           {
               bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           } 
            
            if(X.diagonal2(matrizX)==11)
           {
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            
          
           
       }else
       {
           inicio=1;
           matrizO[2][0] = 1;
           b7.setText("O");
           b7.setEnabled(false);
           
           
            
           if(O.vectorh3(matrizO)==14)
           {
                bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.vectorv1(matrizO)==17)
           {
             bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.diagonal2(matrizO)==11)
           {
                bloquear();
              puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
          
       }
        }
         
         
             if (UnJugadorBoton.isSelected())
        {
            b7.setText("X");
            b7.setEnabled(false);
            matrizX[2][0] = 1;
            if(X.vectorh3(matrizX)==14)
           {
                bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv1(matrizX)==17)
           {
               bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           } 
            
            if(X.diagonal2(matrizX)==11)
           {
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            
            unJugador();
      
        } 
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (DosJugadoresBoton.isSelected())
        {
        if( inicio == 1)
       {
            inicio=2;
            matrizX[2][1] = 5;
           b8.setText("X");
           b8.setEnabled(false);
            
         
           if(X.vectorh3(matrizX)==14)
           {
             bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv2(matrizX)==14)
           {
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           
           
          
           
       }else
       {
            inicio=1;
             matrizO[2][1] = 5;
           b8.setText("O");
           b8.setEnabled(false);
          
          
           
           if(O.vectorh3(matrizO)==14)
           {
              bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.vectorv2(matrizO)==14)
           {
               bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            
          
       }
        }
        
        
            if (UnJugadorBoton.isSelected())
        {
            b8.setText("X");
            b8.setEnabled(false);
            matrizX[2][1] = 5;
             if(X.vectorh3(matrizX)==14)
           {
             bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            if(X.vectorv2(matrizX)==14)
           {
               bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            unJugador();
        
        } 
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (DosJugadoresBoton.isSelected())
        {
        if( inicio == 1)
       {
           inicio=2;
           matrizX[2][2] = 8;
           b9.setText("X");
           b9.setEnabled(false);
          
         
           if(X.vectorh3(matrizX)==14)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(X.vectorv3(matrizX)==14)
           {
              bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           if(X.diagonal1(matrizX)==23)
           {
              bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           
           
       }else
       {
           inicio=1;
           matrizO[2][2] = 8;
           b9.setText("O");
           b9.setEnabled(false);
           
          
           if(O.vectorh3(matrizO)==14)
           {
              bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.vectorv3(matrizO)==14)
           {
              bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(O.diagonal1(matrizO)==23)
           {
               bloquear();
                puntosO = puntosO + 1;
              puntaje2.setText(Integer.toString(puntosO));
              texto.setText("FELICIDADES "+jugador2.getText().toUpperCase()+" HAS GANADO");
               
           }
          
       }
        }
        
        
            if (UnJugadorBoton.isSelected())
        {
            b9.setText("X");
            b9.setEnabled(false);
           matrizX[2][2] = 8;
           if(X.vectorh3(matrizX)==14)
           {
              bloquear();
              puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
               
           }
            if(X.vectorv3(matrizX)==14)
           {
              bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
           if(X.diagonal1(matrizX)==23)
           {
              bloquear();
               puntosX = puntosX + 1;
              puntaje1.setText(Integer.toString(puntosX));
              texto.setText("FELICIDADES "+jugador1.getText().toUpperCase()+" HAS GANADO");
           }
            unJugador();
       
        } 
    }//GEN-LAST:event_b9ActionPerformed

    private void ReiniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarPartidaActionPerformed
       
          ciclo = false;
          X.InicializarMatriz(matrizX);
          O.InicializarMatriz(matrizO);
          b1.setEnabled(true);
          b2.setEnabled(true);
          b3.setEnabled(true);
          b4.setEnabled(true);
          b5.setEnabled(true);
          b6.setEnabled(true);
          b7.setEnabled(true);
          b8.setEnabled(true);
          b9.setEnabled(true);
          b1.setText("");
          b2.setText("");
          b3.setText("");
          b4.setText("");
          b5.setText("");           
          b6.setText("");
          b7.setText("");
          b8.setText("");
          b9.setText(""); 
          texto.setText("");
          inicio = 1;
          
        
    }//GEN-LAST:event_ReiniciarPartidaActionPerformed

    private void ReiniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarJuegoActionPerformed
      
          ciclo = false;
          X.InicializarMatriz(matrizX);
          O.InicializarMatriz(matrizO);
          puntaje1.setText("");
          puntaje2.setText("");
          jugador1.setText("");
          jugador2.setText("");
          b1.setEnabled(true);
          b2.setEnabled(true);
          b3.setEnabled(true);
          b4.setEnabled(true);
          b5.setEnabled(true);
          b6.setEnabled(true);
          b7.setEnabled(true);
          b8.setEnabled(true);
          b9.setEnabled(true);
          b1.setText("");
          b2.setText("");
          b3.setText("");
          b4.setText("");
          b5.setText("");           
          b6.setText("");
          b7.setText("");
          b8.setText("");
          b9.setText(""); 
          texto.setText("");
          puntosX = 0;
          puntosO = 0; 
          inicio = 1;
          
    }//GEN-LAST:event_ReiniciarJuegoActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Menu mostrar = new Menu();
        mostrar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_volverMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       
        
    }//GEN-LAST:event_volverActionPerformed

    
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
            java.util.logging.Logger.getLogger(Triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triqui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DosJugadoresBoton;
    private javax.swing.JButton ReiniciarJuego;
    private javax.swing.JButton ReiniciarPartida;
    private javax.swing.JRadioButton UnJugadorBoton;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jugador1;
    private javax.swing.JTextField jugador2;
    private javax.swing.JLabel puntaje1;
    private javax.swing.JLabel puntaje2;
    private javax.swing.JTextField texto;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
