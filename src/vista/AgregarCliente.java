/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Lorraine
 */
public class AgregarCliente extends javax.swing.JFrame {
    
    FondoCliente fondo = new FondoCliente();
    int xMouse, yMouse;
    
    public AgregarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoCliente();
        barra1 = new javax.swing.JPanel();
        exitBtn1 = new javax.swing.JPanel();
        exitTxt1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vigenteBtn = new javax.swing.JPanel();
        vigenteTxt = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JPanel();
        agregarTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        barra1.setBackground(new java.awt.Color(0, 153, 153));
        barra1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra1MouseDragged(evt);
            }
        });
        barra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra1MousePressed(evt);
            }
        });

        exitBtn1.setBackground(new java.awt.Color(0, 153, 153));

        exitTxt1.setBackground(new java.awt.Color(255, 255, 255));
        exitTxt1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt1.setText("X");
        exitTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn1Layout = new javax.swing.GroupLayout(exitBtn1);
        exitBtn1.setLayout(exitBtn1Layout);
        exitBtn1Layout.setHorizontalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );
        exitBtn1Layout.setVerticalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barra1Layout = new javax.swing.GroupLayout(barra1);
        barra1.setLayout(barra1Layout);
        barra1Layout.setHorizontalGroup(
            barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra1Layout.createSequentialGroup()
                .addGap(0, 535, Short.MAX_VALUE)
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra1Layout.setVerticalGroup(
            barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes:");

        jLabel2.setText("Cédula:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("¿Vigente? :");

        vigenteBtn.setBackground(new java.awt.Color(0, 153, 153));

        vigenteTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vigenteTxt.setForeground(new java.awt.Color(255, 255, 255));
        vigenteTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vigenteTxt.setText("True");
        vigenteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vigenteTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vigenteTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vigenteTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout vigenteBtnLayout = new javax.swing.GroupLayout(vigenteBtn);
        vigenteBtn.setLayout(vigenteBtnLayout);
        vigenteBtnLayout.setHorizontalGroup(
            vigenteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vigenteTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );
        vigenteBtnLayout.setVerticalGroup(
            vigenteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vigenteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        agregarBtn.setBackground(new java.awt.Color(0, 153, 153));

        agregarTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregarTxt.setForeground(new java.awt.Color(255, 255, 255));
        agregarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarTxt.setText("Agregar");
        agregarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout agregarBtnLayout = new javax.swing.GroupLayout(agregarBtn);
        agregarBtn.setLayout(agregarBtnLayout);
        agregarBtnLayout.setHorizontalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(231, 231, 231))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(vigenteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97))))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(vigenteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxt1MouseClicked

    private void exitTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseEntered
        exitBtn1.setBackground(Color.red);
        exitTxt1.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt1MouseEntered

    private void exitTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseExited
        exitBtn1.setBackground(new Color(0,153,153));
        exitTxt1.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt1MouseExited

    private void barra1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_barra1MouseDragged

    private void barra1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barra1MousePressed

    private void agregarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTxtMouseClicked
        ArriendoConCuotas v = new ArriendoConCuotas();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarTxtMouseClicked

    private void agregarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTxtMouseEntered
        agregarBtn.setBackground(Color.orange);
        agregarTxt.setForeground(Color.black);
    }//GEN-LAST:event_agregarTxtMouseEntered

    private void agregarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTxtMouseExited
        agregarBtn.setBackground(new Color(0,153,153));
        agregarTxt.setForeground(Color.white);
    }//GEN-LAST:event_agregarTxtMouseExited

    private void vigenteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vigenteTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vigenteTxtMouseClicked

    private void vigenteTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vigenteTxtMouseEntered
        vigenteBtn.setBackground(new Color(44,131,236));
        vigenteTxt.setForeground(Color.black);
    }//GEN-LAST:event_vigenteTxtMouseEntered

    private void vigenteTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vigenteTxtMouseExited
        vigenteBtn.setBackground(new Color(0,153,153));
        vigenteTxt.setForeground(Color.white);
    }//GEN-LAST:event_vigenteTxtMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JLabel agregarTxt;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel barra1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel exitBtn1;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel exitTxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JPanel vigenteBtn;
    public javax.swing.JLabel vigenteTxt;
    // End of variables declaration//GEN-END:variables

    class FondoCliente extends JPanel{
       private Image imagen;

       @Override
       public void paint(Graphics g){

           imagen = new ImageIcon(getClass().getResource("/image/Engranajes2.jpg")).getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           super.paint(g);
       }
    }
}
