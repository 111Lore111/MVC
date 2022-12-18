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
public class MenuPrincipal extends javax.swing.JFrame {

    FondoPanelPrincipal fondo = new FondoPanelPrincipal();
    int xMouse, yMouse;
    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new FondoPanelPrincipal();
        barraMenuPrincipal = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        TituloTxt = new javax.swing.JLabel();
        arriendoCuotaBtn = new javax.swing.JPanel();
        arriendoCuotaTxt = new javax.swing.JLabel();
        pagarCuotasArriendoBtn = new javax.swing.JPanel();
        pagarCuotasArriendoTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        barraMenuPrincipal.setBackground(new java.awt.Color(0, 153, 153));
        barraMenuPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMenuPrincipalMouseDragged(evt);
            }
        });
        barraMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMenuPrincipalMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(0, 153, 153));

        exitTxt.setBackground(new java.awt.Color(255, 255, 255));
        exitTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraMenuPrincipalLayout = new javax.swing.GroupLayout(barraMenuPrincipal);
        barraMenuPrincipal.setLayout(barraMenuPrincipalLayout);
        barraMenuPrincipalLayout.setHorizontalGroup(
            barraMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraMenuPrincipalLayout.createSequentialGroup()
                .addGap(0, 764, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraMenuPrincipalLayout.setVerticalGroup(
            barraMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TituloTxt.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        TituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloTxt.setText("Bienvenido a Car-Rent");

        arriendoCuotaBtn.setBackground(new java.awt.Color(0, 153, 153));

        arriendoCuotaTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arriendoCuotaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arriendoCuotaTxt.setText("Arriendo con cuotas");
        arriendoCuotaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arriendoCuotaTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arriendoCuotaTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arriendoCuotaTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout arriendoCuotaBtnLayout = new javax.swing.GroupLayout(arriendoCuotaBtn);
        arriendoCuotaBtn.setLayout(arriendoCuotaBtnLayout);
        arriendoCuotaBtnLayout.setHorizontalGroup(
            arriendoCuotaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(arriendoCuotaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        arriendoCuotaBtnLayout.setVerticalGroup(
            arriendoCuotaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(arriendoCuotaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pagarCuotasArriendoBtn.setBackground(new java.awt.Color(0, 153, 153));

        pagarCuotasArriendoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pagarCuotasArriendoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagarCuotasArriendoTxt.setText("Pagar cuota arriendos");
        pagarCuotasArriendoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagarCuotasArriendoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagarCuotasArriendoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagarCuotasArriendoTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pagarCuotasArriendoBtnLayout = new javax.swing.GroupLayout(pagarCuotasArriendoBtn);
        pagarCuotasArriendoBtn.setLayout(pagarCuotasArriendoBtnLayout);
        pagarCuotasArriendoBtnLayout.setHorizontalGroup(
            pagarCuotasArriendoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagarCuotasArriendoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        pagarCuotasArriendoBtnLayout.setVerticalGroup(
            pagarCuotasArriendoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagarCuotasArriendoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TituloTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(arriendoCuotaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pagarCuotasArriendoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(259, 259, 259))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(barraMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(TituloTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(arriendoCuotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pagarCuotasArriendoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(0,153,153));
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void barraMenuPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMenuPrincipalMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_barraMenuPrincipalMouseDragged

    private void barraMenuPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMenuPrincipalMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMenuPrincipalMousePressed

    private void arriendoCuotaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arriendoCuotaTxtMouseClicked
        ArriendoConCuotas v = new ArriendoConCuotas();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arriendoCuotaTxtMouseClicked

    private void arriendoCuotaTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arriendoCuotaTxtMouseEntered
        arriendoCuotaBtn.setBackground(Color.CYAN);
        arriendoCuotaBtn.setForeground(Color.white);
    }//GEN-LAST:event_arriendoCuotaTxtMouseEntered

    private void arriendoCuotaTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arriendoCuotaTxtMouseExited
        arriendoCuotaBtn.setBackground(new Color(0,153,153));
        arriendoCuotaBtn.setForeground(Color.black);
    }//GEN-LAST:event_arriendoCuotaTxtMouseExited

    private void pagarCuotasArriendoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarCuotasArriendoTxtMouseExited
        pagarCuotasArriendoBtn.setBackground(new Color(0,153,153));
        pagarCuotasArriendoBtn.setForeground(Color.black);
    }//GEN-LAST:event_pagarCuotasArriendoTxtMouseExited

    private void pagarCuotasArriendoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarCuotasArriendoTxtMouseEntered
        pagarCuotasArriendoBtn.setBackground(Color.CYAN);
        pagarCuotasArriendoBtn.setForeground(Color.white);
    }//GEN-LAST:event_pagarCuotasArriendoTxtMouseEntered

    private void pagarCuotasArriendoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarCuotasArriendoTxtMouseClicked
        PagarCuotasArriendos v = new PagarCuotasArriendos();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pagarCuotasArriendoTxtMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloTxt;
    private javax.swing.JPanel arriendoCuotaBtn;
    private javax.swing.JLabel arriendoCuotaTxt;
    private javax.swing.JPanel barraMenuPrincipal;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pagarCuotasArriendoBtn;
    private javax.swing.JLabel pagarCuotasArriendoTxt;
    // End of variables declaration//GEN-END:variables

    class FondoPanelPrincipal extends JPanel{
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
