/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.currency_converter;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Ganesh
 */
public class TicTacToe extends javax.swing.JFrame {
     private String startGame="x";
     private int xcount=0;
     private int ocount=0;
    /**
     * Creates new form TicTacToe
     */
    
    public TicTacToe() {
        initComponents();
    }
    private void gameScore(){
        playerxxx.setText(String.valueOf(xcount));
        playerooo.setText(String.valueOf(ocount));
    }
    private void winningGame(){
        String b1=btn1.getText();
        String b2=btn2.getText();
        String b3=btn3.getText();
        String b4=btn4.getText();
        String b5=btn5.getText();
        String b6=btn6.getText();
        String b7=btn7.getText();
        String b8=btn8.getText();
        String b9=btn9.getText();
        
         if(b1==("x") && b2==("x") && b3==("x")){
             JOptionPane.showMessageDialog(this,"PlayerX win","TIC TAC TOE",
                     JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gameScore();
             btn1.setBackground(Color.orange);
              btn2.setBackground(Color.orange);
               btn3.setBackground(Color.orange);
         }
         if(b4==("x") && b5==("x") && b6==("x")){
             JOptionPane.showMessageDialog(this,"PlayerX win","TIC TAC TOE",
                     JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gameScore();
             btn4.setBackground(Color.orange);
              btn5.setBackground(Color.orange);
               btn6.setBackground(Color.orange);
         }
          if(b1==("x") && b4==("x") && b7==("x")){
             JOptionPane.showMessageDialog(this,"PlayerX win","TIC TAC TOE",
                     JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gameScore();
             btn1.setBackground(Color.orange);
              btn4.setBackground(Color.orange);
               btn7.setBackground(Color.orange);
         }
           if(b2==("x") && b5==("x") && b8==("x")){
             JOptionPane.showMessageDialog(this,"PlayerX win","TIC TAC TOE",
                     JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gameScore();
             btn2.setBackground(Color.orange);
              btn5.setBackground(Color.orange);
               btn8.setBackground(Color.orange);
         }
            if(b3==("x") && b6==("x") && b9==("x")){
//             JOption.showMessageDialog(this,"PlayerX win","TIC TAC TOE",
//                     JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gameScore();
             btn3.setBackground(Color.orange);
              btn6.setBackground(Color.orange);
               btn9.setBackground(Color.orange);
         }
         if(b7==("x") && b8==("x") && b9==("x")){
             JOptionPane.showMessageDialog(this,"PlayerX win","TIC TAC TOE",
                     JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gameScore();
             btn7.setBackground(Color.orange);
              btn8.setBackground(Color.orange);
               btn9.setBackground(Color.orange);
         }
          if(b3==("x") && b5==("x") && b7==("x")){
             JOptionPane.showMessageDialog(this,"PlayerX win","TIC TAC TOE",
                     JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gameScore();
             btn3.setBackground(Color.orange);
              btn5.setBackground(Color.orange);
               btn7.setBackground(Color.orange);
         }
           if(b1==("x") && b5==("x") && b9==("x")){
             JOptionPane.showMessageDialog(this,"PlayerX win","TIC TAC TOE",
                     JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gameScore();
             btn1.setBackground(Color.orange);
              btn5.setBackground(Color.orange);
               btn9.setBackground(Color.orange);
         }
            // PLAYER O CODING
        
        
        if(b1 == ("o") && b2 ==("o") && b3 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("o") && b5 ==("o") && b6 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            btn4.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);           
        }
         
        if(b7 == ("o") && b8 ==("o") && b9 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);           
        }
        
        if(b1 == ("o") && b4 ==("o") && b7 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            btn1.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);           
        }
        
        if(b2 == ("o") && b5 ==("o") && b8 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            btn2.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);           
        }
        if(b3 == ("o") && b6 ==("o") && b9 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            btn3.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);           
        }
        
        
        if(b1 == ("o") && b5 ==("o") && b9 == ("o"))
        {
             JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                     ocount++;
            gameScore();
            
            btn1.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);           
        }
        
        if(b3 == ("o") && b5 ==("o") && b7 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            btn3.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);           
        }
        
    }
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("x"))
        {
            startGame="o";
            
        }
        else
        {
            startGame="x";
        }
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
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerxxx = new javax.swing.JTextField();
        playerooo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 200, 151));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton11.setBackground(new java.awt.Color(153, 255, 153));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton11.setText("EXIT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 153, 153));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton10.setText("RESET");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerx.setText("PLAYER-X:");

        playero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playero.setText("PLAYER-O:");

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerxxx.setText("     -");

        playerooo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerooo.setText("     -");
        playerooo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playeroooActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
//JFrame frame=new JFrame("EXIT");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btn1.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn1.setForeground(Color.BLACK);
            
        }
        else
        {
            btn1.setForeground(Color.blue);
        }
            choose_a_Player();
            winningGame();
            
            
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
            btn2.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn2.setForeground(Color.black);
            
        }
        else
        {
            btn2.setForeground(Color.blue);
        }
            choose_a_Player();
            winningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
            btn3.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn3.setForeground(Color.black);
            
        }
        else
        {
            btn3.setForeground(Color.BLUE);
        }
            choose_a_Player();
            winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
            btn4.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn4.setForeground(Color.black);
            
        }
        else
        {
            btn4.setForeground(Color.BLUE);
        }
            choose_a_Player();
            winningGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
            btn5.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn5.setForeground(Color.black);
            
        }
        else
        {
            btn5.setForeground(Color.BLUE);
        }
            choose_a_Player();
            winningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
            btn6.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn6.setForeground(Color.black);
            
        }
        else
        {
            btn6.setForeground(Color.BLUE);
        }
            choose_a_Player();
            winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
            btn7.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn7.setForeground(Color.black);
            
        }
        else
        {
            btn7.setForeground(Color.BLUE);
        }
            choose_a_Player();
            winningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
            btn8.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn8.setForeground(Color.black);
            
        }
        else
        {
            btn8.setForeground(Color.BLUE);
        }
            choose_a_Player();
            winningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
            btn9.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
        {
            btn9.setForeground(Color.black);
            
        }
        else
        {
            btn9.setForeground(Color.BLUE);
        }
            choose_a_Player();
            winningGame();
    }//GEN-LAST:event_btn9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:btn1.setText(null);
        
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        btn1.setBackground(Color.lightGray);
        btn2.setBackground(Color.lightGray);
        btn3.setBackground(Color.lightGray);
        btn4.setBackground(Color.lightGray);
        btn5.setBackground(Color.lightGray);
        btn6.setBackground(Color.lightGray);
        btn7.setBackground(Color.lightGray);
        btn8.setBackground(Color.lightGray);
        btn9.setBackground(Color.lightGray);
       
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void playeroooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playeroooActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playeroooActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playero;
    private javax.swing.JTextField playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JTextField playerxxx;
    // End of variables declaration//GEN-END:variables
}
