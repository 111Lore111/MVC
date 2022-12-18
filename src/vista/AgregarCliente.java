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

import controlador.ControladorAgregarClientes;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoCliente();
        barra1 = new javax.swing.JPanel();
        exitBtn1 = new javax.swing.JPanel();
        exitTxt1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vigenteBtn = new javax.swing.JPanel();
        vigenteTxt = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JPanel();
        agregarTxt = new javax.swing.JLabel();
        volverBtn = new javax.swing.JPanel();
        volverTxt = new javax.swing.JLabel();
        rutCliente = new javax.swing.JTextField();

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
                .addGap(0, 0, Short.MAX_VALUE)
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

        nombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreClienteKeyTyped(evt);
            }
        });

        jLabel4.setText("¿Vigente? :");

        vigenteBtn.setBackground(new java.awt.Color(0, 153, 153));

        vigenteTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vigenteTxt.setForeground(new java.awt.Color(255, 255, 255));
        vigenteTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vigenteTxt.setText("True");
        vigenteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
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
            .addComponent(agregarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        volverBtn.setBackground(new java.awt.Color(0, 153, 153));

        volverTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volverTxt.setForeground(new java.awt.Color(255, 255, 255));
        volverTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volverTxt.setText("Volver");
        volverTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout volverBtnLayout = new javax.swing.GroupLayout(volverBtn);
        volverBtn.setLayout(volverBtnLayout);
        volverBtnLayout.setHorizontalGroup(
            volverBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        volverBtnLayout.setVerticalGroup(
            volverBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        rutCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vigenteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(vigenteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
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

    private void volverTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverTxtMouseClicked
        
        ArriendoConCuotas v = new ArriendoConCuotas();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverTxtMouseClicked

    private void volverTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverTxtMouseEntered
        volverBtn.setBackground(Color.orange);
        volverTxt.setForeground(Color.black);
    }//GEN-LAST:event_volverTxtMouseEntered

    private void volverTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverTxtMouseExited
        volverBtn.setBackground(new Color(0, 153, 153));
        volverTxt.setForeground(Color.white);
    }//GEN-LAST:event_volverTxtMouseExited

    private void rutClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutClienteKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_rutClienteKeyTyped

    private void nombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreClienteKeyTyped
       soloLetas(evt);
        
    }//GEN-LAST:event_nombreClienteKeyTyped
    
    private void soloNumeros(java.awt.event.KeyEvent evt){
    
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }
    
    private void soloLetas(java.awt.event.KeyEvent evt){
    
        Character c = evt.getKeyChar();
        if(!Character.isLetter(c)){
            evt.consume();
        }
    }
    
    private boolean validarRut(String rut) {
        File archivo = new File("archivoClientes.csv");

        boolean validacion = false;

        String rut2 = rut.toUpperCase();
        rut2 = rut.replace(".", "");
        rut2 = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut2.substring(0, rut2.length() - 1));

        char dv = rut2.charAt(rut2.length() - 1);

        int m = 0, s = 1;
        for (; rutAux != 0; rutAux /= 10) {
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) {
            validacion = true;
        }

        if (!archivo.exists()) {
            throw new IllegalArgumentException("El archivo no existe.");
        }

        long largo = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            while (reader.readLine() != null) largo++;
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner leer = new Scanner(archivo)) {
            leer.nextLine();

            while (largo != 1) {
                String linea = leer.nextLine();
                String siguiente[] = linea.split(";");
                String cedula = siguiente[0];
                String cedula2 = cedula.toUpperCase();
                cedula2 = cedula2.replace(".", "");
                cedula2 = cedula2.replace("-", "");
                if (rut2.equals(cedula2)) {
                    validacion = false;
                    System.out.println("El rut ya existe.");
                    break;
                }
                largo -= 1;
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

        return validacion;
    }

    private void exitTxt1MouseClicked(java.awt.event.MouseEvent evt) {
            System.exit(0);
    }

    private void exitTxt1MouseEntered(java.awt.event.MouseEvent evt) {
            exitBtn1.setBackground(Color.red);
            exitTxt1.setForeground(Color.white);
    }

    private void exitTxt1MouseExited(java.awt.event.MouseEvent evt) {
            exitBtn1.setBackground(new Color(0, 153, 153));
            exitTxt1.setForeground(Color.black);
    }

    private void barra1MouseDragged(java.awt.event.MouseEvent evt) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xMouse, y - yMouse);
    }

    private void barra1MousePressed(java.awt.event.MouseEvent evt) {
            xMouse = evt.getX();
            yMouse = evt.getY();
    }
    private void agregarTxtMouseClicked(java.awt.event.MouseEvent evt) {

           // Tomamos los datos de los campos textfields rut y nombre
            String rut = rutCliente.getText();
            String nombre = nombreCliente.getText();
            String vigente = vigenteTxt.getText();
            // Pasamos vigente de String to boolean
            boolean vigenteBool = Boolean.parseBoolean(vigente);
            if (!validarRut(rut)) {
                JOptionPane.showMessageDialog(null, "El rut ingresado no es valido");
                System.out.println("El rut ingresado no es valido"); 
            } else {
                ControladorAgregarClientes AgregarClienteCtrl = new ControladorAgregarClientes();
                // llamamos al metodo para agregar cliente
                String rutBase = rut.toUpperCase();
                rutBase = rut.replace(".", "");
                rutBase = rut.replace("-", "");
                String rutFinal = rutBase.substring(0,8) + "-" + rutBase.substring(8);
                AgregarClienteCtrl.agregarCliente(rutFinal, nombre, vigenteBool);

                // Cerramos la ventana actual
                this.dispose();

                // Abrimos la ventana de arriendo con cuotas
                ArriendoConCuotas v = new ArriendoConCuotas();
                v.setVisible(true);
            }
    }

    private void agregarTxtMouseEntered(java.awt.event.MouseEvent evt) {
            agregarBtn.setBackground(Color.orange);
            agregarTxt.setForeground(Color.black);
    }

    private void agregarTxtMouseExited(java.awt.event.MouseEvent evt) {
            agregarBtn.setBackground(new Color(0, 153, 153));
            agregarTxt.setForeground(Color.white);
    }

    private void vigenteTxtMouseEntered(java.awt.event.MouseEvent evt) {
            vigenteBtn.setBackground(new Color(44, 131, 236));
            vigenteTxt.setForeground(Color.black);
    }

    private void vigenteTxtMouseExited(java.awt.event.MouseEvent evt) {
            vigenteBtn.setBackground(new Color(0, 153, 153));
            vigenteTxt.setForeground(Color.white);
    }

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
    private javax.swing.JPanel barra1;
    private javax.swing.JPanel exitBtn1;
    private javax.swing.JLabel exitTxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField rutCliente;
    public javax.swing.JPanel vigenteBtn;
    public javax.swing.JLabel vigenteTxt;
    private javax.swing.JPanel volverBtn;
    private javax.swing.JLabel volverTxt;
    // End of variables declaration//GEN-END:variables

        class FondoCliente extends JPanel {
                private Image imagen;

                @Override
                public void paint(Graphics g) {

                        imagen = new ImageIcon(getClass().getResource("/image/Engranajes2.jpg")).getImage();
                        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
                        setOpaque(false);
                        super.paint(g);
                }
        }

}
