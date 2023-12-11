/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ai;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author daliakhlaif
 */
public class OnePlayerMedium extends javax.swing.JFrame {
String xURL="/Users/hp/Documents/NetBeansProjects/AI/src/ai/Images/xnew.png";
String oURL="/Users/hp/Documents/NetBeansProjects/AI/src/ai/Images/onew.png";
int countX = 0;
int countO = 0;
int winningPlayer=-2;
int winner=0;
Icon x = new ImageIcon(xURL);
Icon o = new ImageIcon(oURL);
char board[]=new char[9];
int turn;
    /**
     * Creates new form OnePlayerMedium
     */
    public OnePlayerMedium() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jB3 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xcounter = new javax.swing.JLabel();
        ocounter = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(245, 245, 220));
        jPanel4.setMaximumSize(new java.awt.Dimension(530, 800));
        jPanel4.setMinimumSize(new java.awt.Dimension(530, 800));
        jPanel4.setPreferredSize(new java.awt.Dimension(530, 800));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB3.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB3.setForeground(new java.awt.Color(102, 51, 0));
        jB3.setMaximumSize(new java.awt.Dimension(100, 100));
        jB3.setMinimumSize(new java.awt.Dimension(100, 100));
        jB3.setPreferredSize(new java.awt.Dimension(100, 100));
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        jPanel1.add(jB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jB1.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB1.setForeground(new java.awt.Color(102, 51, 0));
        jB1.setMaximumSize(new java.awt.Dimension(100, 100));
        jB1.setMinimumSize(new java.awt.Dimension(100, 100));
        jB1.setPreferredSize(new java.awt.Dimension(100, 100));
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jB2.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB2.setForeground(new java.awt.Color(102, 51, 0));
        jB2.setMaximumSize(new java.awt.Dimension(100, 100));
        jB2.setMinimumSize(new java.awt.Dimension(100, 100));
        jB2.setPreferredSize(new java.awt.Dimension(100, 100));
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        jPanel1.add(jB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jB6.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB6.setForeground(new java.awt.Color(102, 51, 0));
        jB6.setMaximumSize(new java.awt.Dimension(100, 100));
        jB6.setMinimumSize(new java.awt.Dimension(100, 100));
        jB6.setPreferredSize(new java.awt.Dimension(100, 100));
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        jPanel1.add(jB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jB5.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB5.setForeground(new java.awt.Color(102, 51, 0));
        jB5.setMaximumSize(new java.awt.Dimension(100, 100));
        jB5.setMinimumSize(new java.awt.Dimension(100, 100));
        jB5.setPreferredSize(new java.awt.Dimension(100, 100));
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });
        jPanel1.add(jB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jB4.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB4.setForeground(new java.awt.Color(102, 51, 0));
        jB4.setMaximumSize(new java.awt.Dimension(100, 100));
        jB4.setMinimumSize(new java.awt.Dimension(100, 100));
        jB4.setPreferredSize(new java.awt.Dimension(100, 100));
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });
        jPanel1.add(jB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jB9.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB9.setForeground(new java.awt.Color(102, 51, 0));
        jB9.setMaximumSize(new java.awt.Dimension(100, 100));
        jB9.setMinimumSize(new java.awt.Dimension(100, 100));
        jB9.setPreferredSize(new java.awt.Dimension(100, 100));
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });
        jPanel1.add(jB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jB8.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB8.setForeground(new java.awt.Color(102, 51, 0));
        jB8.setMaximumSize(new java.awt.Dimension(100, 100));
        jB8.setMinimumSize(new java.awt.Dimension(100, 100));
        jB8.setPreferredSize(new java.awt.Dimension(100, 100));
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });
        jPanel1.add(jB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jB7.setFont(new java.awt.Font("Helvetica Neue", 1, 56)); // NOI18N
        jB7.setForeground(new java.awt.Color(102, 51, 0));
        jB7.setMaximumSize(new java.awt.Dimension(100, 100));
        jB7.setMinimumSize(new java.awt.Dimension(100, 100));
        jB7.setPreferredSize(new java.awt.Dimension(100, 100));
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });
        jPanel1.add(jB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 340, 340));

        jPanel3.setBackground(new java.awt.Color(245, 245, 220));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 80));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 110));

        jPanel6.setBackground(new java.awt.Color(245, 245, 220));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Player O:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 50));

        xcounter.setBackground(new java.awt.Color(204, 204, 204));
        xcounter.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        xcounter.setForeground(new java.awt.Color(102, 51, 0));
        jPanel6.add(xcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 40, 50));

        ocounter.setBackground(new java.awt.Color(204, 204, 204));
        ocounter.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ocounter.setForeground(new java.awt.Color(102, 51, 0));
        jPanel6.add(ocounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(79, 0, 0));
        jLabel4.setText("Level:Medium");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 150, 160));

        jPanel5.setBackground(new java.awt.Color(245, 245, 220));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setBackground(new java.awt.Color(94, 39, 11));
        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Images/price-sticker.png"))); // NOI18N
        jButton12.setText("New game");
        jButton12.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton12.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton12.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 60));

        jButton13.setBackground(new java.awt.Color(94, 39, 11));
        jButton13.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Images/go-back-arrow.png"))); // NOI18N
        jButton13.setText("Reset");
        jButton13.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton13.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton13.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 60));

        jButton14.setBackground(new java.awt.Color(94, 39, 11));
        jButton14.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Images/logout.png"))); // NOI18N
        jButton14.setText("Exit");
        jButton14.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton14.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton14.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, 60));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 340, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        // TODO add your handling code here:
        if(board[2]=='\0'&&winner==0){
            jB3.setIcon(o);
            board[2] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
        if(board[0]=='\0'&&winner==0){
            jB1.setIcon(o);
            board[0] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        // TODO add your handling code here:
        if(board[1]=='\0'&&winner==0){
            jB2.setIcon(o);
            board[1] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        // TODO add your handling code here:
        if(board[5]=='\0'&&winner==0){
            jB6.setIcon(o);
            board[5] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        // TODO add your handling code here:
        if(board[4]=='\0'&&winner==0){
            jB5.setIcon(o);
            board[4] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        // TODO add your handling code here:
        if(board[3]=='\0'&&winner==0){
            jB4.setIcon(o);
            board[3] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        // TODO add your handling code here:
        if(board[8]=='\0'&&winner==0){
            jB9.setIcon(o);
            board[8] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        // TODO add your handling code here:
        if(board[7]=='\0'&&winner==0){
            jB8.setIcon(o);
            board[7] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        // TODO add your handling code here:
        if(board[6]=='\0'&&winner==0){
            jB7.setIcon(o);
            board[6] = 'o';
            winningGame();
            if(winner == 0)
            NextMove();
        }
    }//GEN-LAST:event_jB7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        countX = 0;
        countO = 0;
        xcounter.setText(String.valueOf(countX));
        ocounter.setText(String.valueOf(countO));
        jB1.setIcon(null);
        jB2.setIcon(null);
        jB3.setIcon(null);
        jB4.setIcon(null);
        jB5.setIcon(null);
        jB6.setIcon(null);
        jB7.setIcon(null);
        jB8.setIcon(null);
        jB9.setIcon(null);
        for(int i=0;i<9;i++)
        board[i]='\0';
        winner=0;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jB1.setIcon(null);
        jB2.setIcon(null);
        jB3.setIcon(null);
        jB4.setIcon(null);
        jB5.setIcon(null);
        jB6.setIcon(null);
        jB7.setIcon(null);
        jB8.setIcon(null);
        jB9.setIcon(null);
        for(int i=0;i<9;i++)
        board[i]='\0';
        winner=0;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main frame = new main();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(OnePlayerMedium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnePlayerMedium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnePlayerMedium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnePlayerMedium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnePlayerMedium().setVisible(true);
            }
        });
    }
public void NextMove(){
     int bestValue=Integer.MIN_VALUE;
     int nextm = 0;
          for(int i=0;i<9;i++){
              
            if(board[i]=='\0'){
              board[i]='x';
              turn=getRandomNumberUsingNextInt(-1,1);
              System.out.print(turn);
              int v = alphaBeta( board , 2,Integer.MIN_VALUE, Integer.MAX_VALUE, false);
              
              board[i] ='\0';
              if(v >= bestValue) nextm = i;
              bestValue = max(bestValue, v);
              
            }
           
            
          } 
        board[nextm]='x';
       switch(nextm){
         case 0:{jB1.setIcon(x);break;}
         case 1:{jB2.setIcon(x);break;}
         case 2:{jB3.setIcon(x);break;}
         case 3:{jB4.setIcon(x);break;}
         case 4:{jB5.setIcon(x);break;}
         case 5:{jB6.setIcon(x);break;}
         case 6:{jB7.setIcon(x);break;}
         case 7:{jB8.setIcon(x);break;}
         case 8:{jB9.setIcon(x);break;}
     }
        winningGame();
     }

public int alphaBeta(char board[],int depth,int alpha,int beta, boolean maximizingPlayer){
       //check if we are in terminal node:
         int h = gameOver();
         if(h!=-2 ||depth ==0 )return h;
         if(maximizingPlayer){
            int bestValue=Integer.MIN_VALUE;
            
            for(int i=0;i<9;i++){
            if(board[i]=='\0'){
              board[i]='x';
              int v = alphaBeta( board, depth-1,alpha,beta,false);
              board[i]='\0';
              bestValue=max(bestValue,v);
              alpha=max(alpha,bestValue);
              if(alpha>=beta)break;
            }
            }
            return bestValue;
         }
         else{
             int bestValue=Integer.MAX_VALUE;
            for(int i=0;i<9; i++){
            if(board[i]=='\0'){
              board[i]='o';
              int v=alphaBeta( board, depth+1,alpha,beta,true);
              board[i]='\0';
              bestValue=min(bestValue,v);
              beta=min(beta,bestValue);
              if(alpha>=beta)break;
            }
            }
            return bestValue;   
         }
      
     }
      
     
  boolean isFull(){
      for(int i=0;i<9;i++){
          if(board[i]=='\0')return false;
      }
      return true;
  }
     
public int getRandomNumberUsingNextInt(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min) + min;
}

     public int gameOver(){
         winningPlayer=-2;
         
         
 if( board[0] == 'x'&&  board[1] == 'x' &&  board[2] == 'x'){    // row0 
    
         winningPlayer=-1*turn;
     }
    else if( board[3] == 'x'&&  board[4] == 'x' &&  board[5] == 'x' ){  //row1
      
          winningPlayer=-1*turn;

     }
    else if( board[6] == 'x'&&  board[7] == 'x' &&  board[8] == 'x' ){  //row2
    
          winningPlayer=-1*turn;

     }
    else if( board[0] == 'x'&&  board[3] == 'x' &&  board[6] == 'x' ){  // col0

          winningPlayer=-1*turn;

     }
     else if( board[1] == 'x'&&  board[4] == 'x' &&  board[7] == 'x' ){  //col1

          winningPlayer=-1*turn;

     }
     else if( board[2] == 'x'&&  board[5] == 'x' &&  board[8] == 'x' ){  //col2

          winningPlayer=-1*turn;

     }
     else if( board[0] == 'x'&&  board[4] == 'x' &&  board[8] == 'x' ){   // Top-left to bottom-right diagonal.
 
          winningPlayer=-1*turn;

     }
     else if(board[2] == 'x'&&  board[4] == 'x' &&  board[6] == 'x' ){    //Top-right to bottom-left diagonal.
    
          winningPlayer=-1*turn;

     }
     
     
     if( board[0] == 'o'&&  board[1] == 'o' &&  board[2] == 'o' ){
     
          winningPlayer=turn;

     }
    else if( board[3] == 'o'&&  board[4] == 'o' &&  board[5] == 'o'  ){
       
         winningPlayer=turn;

     }
    else if( board[6] == 'o'&&  board[7] == 'o' &&  board[8] == 'o'  ){
       
        winningPlayer=turn;
 
     }
    else if( board[0] == 'o'&&  board[3] == 'o' &&  board[6] == 'o'  ){
 
         winningPlayer=turn;

     }
     else if( board[1] == 'o'&&  board[4] == 'o' &&  board[7] == 'o' ){

         winningPlayer=turn;

     }
     else if( board[2] == 'o'&&  board[5] == 'o' &&  board[8] == 'o'  ){
 
         winningPlayer=turn;

     }
     else if( board[0] == 'o'&&  board[4] == 'o' &&  board[8] == 'o'  ){

         winningPlayer=turn;

     }
     else if( board[2] == 'o'&&  board[4] == 'o' &&  board[6] == 'o' ){

         winningPlayer=turn;

     }
     if(isFull() && winningPlayer ==-2)winningPlayer=1;
     return winningPlayer;     }
     
     public void winningGame(){
        
       
     if( jB1.getIcon() == x && jB2.getIcon()==x  && jB3.getIcon() == x ){
         countX++;
         xcounter.setText(String.valueOf(countX));
         JOptionPane. showMessageDialog(this ," Player X Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
    else if( jB1.getIcon() == x && jB4.getIcon()==x  && jB7.getIcon() == x ){
         countX++;
    
         xcounter.setText(String.valueOf(countX));
         JOptionPane. showMessageDialog(this ," Player X Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
        winner=1;
     }
    else if( jB5.getIcon() == x && jB2.getIcon()==x  && jB8.getIcon() == x ){
         countX++;
         
         xcounter.setText(String.valueOf(countX));
         JOptionPane. showMessageDialog(this ," Player X Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
        winner=1;
     }
    else if( jB9.getIcon() == x && jB6.getIcon()==x  && jB3.getIcon() == x ){
         countX++;
        
         xcounter.setText(String.valueOf(countX));
         JOptionPane. showMessageDialog(this ," Player X Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     else if( jB4.getIcon() == x && jB5.getIcon()==x  && jB6.getIcon() == x ){
         countX++;
        
         xcounter.setText(String.valueOf(countX));
         JOptionPane. showMessageDialog(this ," Player X Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
        winner=1;
     }
     else if( jB7.getIcon() == x && jB8.getIcon()==x  && jB9.getIcon() == x ){
         countX++;
         
         xcounter.setText(String.valueOf(countX));
         JOptionPane. showMessageDialog(this ," Player X Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     else if( jB1.getIcon() == x && jB5.getIcon()==x  && jB9.getIcon() == x ){
         countX++;
          
         xcounter.setText(String.valueOf(countX));
         JOptionPane. showMessageDialog(this ," Player X Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     else if( jB3.getIcon() == x && jB5.getIcon()==x  && jB7.getIcon() == x ){
         countX++;
         
         xcounter.setText(String.valueOf(countX));
         JOptionPane. showMessageDialog(this ," Player X Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     
     
     if( jB1.getIcon() == o && jB2.getIcon()== o  && jB3.getIcon() == o ){
         countO++;
    
         ocounter.setText(String.valueOf(countO));
         JOptionPane. showMessageDialog(this ," Player O Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
       winner=1;
     }
    else if( jB1.getIcon() == o && jB4.getIcon()==o  && jB7.getIcon() == o ){
         countO++;
      
         ocounter.setText(String.valueOf(countO));
         JOptionPane. showMessageDialog(this ," Player O Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
           winner=1;
     }
    else if( jB5.getIcon() == o && jB2.getIcon()== o  && jB8.getIcon() == o ){
        countO++;
     
         ocounter.setText(String.valueOf(countO));
         JOptionPane. showMessageDialog(this ," Player O Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
    else if( jB9.getIcon() == o && jB6.getIcon()== o  && jB3.getIcon() == o ){
         countO++;
       
         ocounter.setText(String.valueOf(countO));
         JOptionPane. showMessageDialog(this ," Player O Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     else if( jB4.getIcon() == o && jB5.getIcon()== o  && jB6.getIcon() == o ){
         countO++;
       
         ocounter.setText(String.valueOf(countO));
         JOptionPane. showMessageDialog(this ," Player O Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     else if( jB7.getIcon() == o && jB8.getIcon()== o  && jB9.getIcon() == o ){
         countO++;
        
         ocounter.setText(String.valueOf(countO));
         JOptionPane. showMessageDialog(this ," Player O Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     else if( jB1.getIcon() == o && jB5.getIcon()== o  && jB9.getIcon() == o ){
         countO++;
    
         ocounter.setText(String.valueOf(countO));
         JOptionPane. showMessageDialog(this ," Player O Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     else if( jB3.getIcon() == o && jB5.getIcon()== o  && jB7.getIcon() == o ){
         countO++;
      
         ocounter.setText(String.valueOf(countO));
         JOptionPane. showMessageDialog(this ," Player O Won!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
     else if(isFull()){
         JOptionPane. showMessageDialog(this ," Tie!" , "Round Ends" , JOptionPane.INFORMATION_MESSAGE);
         winner=1;
     }
    
     }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel ocounter;
    private javax.swing.JLabel xcounter;
    // End of variables declaration//GEN-END:variables
}
