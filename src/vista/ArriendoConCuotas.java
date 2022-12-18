/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import controlador.ControladorAgregarClientes;
import controlador.VehiculoController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author Lorraine
 */
public class ArriendoConCuotas extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    int xMouse, yMouse;
    
    Cliente c = new Cliente();
    Vehiculo v = new Vehiculo();
    Arriendo a = new Arriendo();
    CuotaArriendo cu = new CuotaArriendo();
    
    DefaultTableModel modelo = new DefaultTableModel();
    public ArriendoConCuotas() {

        initComponents();
        this.setLocationRelativeTo(null);
        
        modelo.addColumn("Días arriendo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Patente");
        modelo.addColumn("Monto");
        this.tabla.setModel(modelo);
        
        poblarComboboxCliente();
        poblarComboboxVehiculo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new FondoPanel();
        barra = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        listadoClientesComboBox = new javax.swing.JComboBox<>();
        listadoVehiculosComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaArriendoTxt = new javax.swing.JTextField();
        diasTxt = new javax.swing.JTextField();
        montoPagarTxt = new javax.swing.JTextField();
        cantidadCuotasTxt = new javax.swing.JTextField();
        guardarArriendoBtn = new javax.swing.JPanel();
        guardarArriendoTxt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cuotasPagarPanel = new javax.swing.JPanel();
        cuotasPagarTxt = new javax.swing.JLabel();
        volverBtn = new javax.swing.JPanel();
        volverTxt = new javax.swing.JLabel();
        ingresarNuevoClienteBtn = new javax.swing.JPanel();
        ingresarNuevoClienteTxt = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        barra.setBackground(new java.awt.Color(0, 153, 153));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
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

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setText("Arriendo con cuotas");

    
        jLabel2.setText("Fecha arriendo:");

        jLabel3.setText("Días:");

        jLabel5.setText("Monto a Pagar");

        jLabel6.setText("Cantidad de cuotas:");

        diasTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diasTxtKeyTyped(evt);
            }
        });

        montoPagarTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoPagarTxtKeyTyped(evt);
            }
        });

        cantidadCuotasTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadCuotasTxtKeyTyped(evt);
            }
        });

        guardarArriendoBtn.setBackground(new java.awt.Color(0, 153, 153));

        guardarArriendoTxt.setBackground(new java.awt.Color(0, 153, 153));
        guardarArriendoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guardarArriendoTxt.setForeground(new java.awt.Color(255, 255, 255));
        guardarArriendoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardarArriendoTxt.setText("Guardar arriendo y mostrar cuotas >>");
        guardarArriendoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarArriendoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarArriendoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarArriendoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarArriendoTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout guardarArriendoBtnLayout = new javax.swing.GroupLayout(guardarArriendoBtn);
        guardarArriendoBtn.setLayout(guardarArriendoBtnLayout);
        guardarArriendoBtnLayout.setHorizontalGroup(
            guardarArriendoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarArriendoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );
        guardarArriendoBtnLayout.setVerticalGroup(
            guardarArriendoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarArriendoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        cuotasPagarPanel.setBackground(new java.awt.Color(0, 153, 153));

        cuotasPagarTxt.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        cuotasPagarTxt.setForeground(new java.awt.Color(255, 255, 255));
        cuotasPagarTxt.setText("Cuotas a Pagar");

        javax.swing.GroupLayout cuotasPagarPanelLayout = new javax.swing.GroupLayout(cuotasPagarPanel);
        cuotasPagarPanel.setLayout(cuotasPagarPanelLayout);
        cuotasPagarPanelLayout.setHorizontalGroup(
            cuotasPagarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuotasPagarPanelLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(cuotasPagarTxt)
                .addGap(125, 125, 125))
        );
        cuotasPagarPanelLayout.setVerticalGroup(
            cuotasPagarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuotasPagarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cuotasPagarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        volverBtn.setBackground(new java.awt.Color(0, 153, 153));
        volverBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
            .addComponent(volverTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        ingresarNuevoClienteBtn.setBackground(new java.awt.Color(0, 153, 153));

        ingresarNuevoClienteTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresarNuevoClienteTxt.setForeground(new java.awt.Color(255, 255, 255));
        ingresarNuevoClienteTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresarNuevoClienteTxt.setText("Ingresar nuevo Cliente");
        ingresarNuevoClienteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarNuevoClienteTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarNuevoClienteTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarNuevoClienteTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ingresarNuevoClienteBtnLayout = new javax.swing.GroupLayout(ingresarNuevoClienteBtn);
        ingresarNuevoClienteBtn.setLayout(ingresarNuevoClienteBtnLayout);
        ingresarNuevoClienteBtnLayout.setHorizontalGroup(
            ingresarNuevoClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarNuevoClienteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ingresarNuevoClienteBtnLayout.setVerticalGroup(
            ingresarNuevoClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarNuevoClienteTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fechaArriendoTxt)
                                    .addComponent(diasTxt)
                                    .addComponent(montoPagarTxt)
                                    .addComponent(cantidadCuotasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                            .addComponent(guardarArriendoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cuotasPagarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingresarNuevoClienteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listadoClientesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listadoVehiculosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(304, 304, 304))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listadoClientesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(listadoVehiculosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresarNuevoClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(cuotasPagarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaArriendoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(montoPagarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cantidadCuotasTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(guardarArriendoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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

    private void guardarArriendoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarArriendoTxtMouseClicked
        
        a.setDiasArriendo(Integer.parseInt(this.diasTxt.getText()));
        c.setNombre(this.listadoClientesComboBox.getSelectedItem().toString());
        v.setPatente(this.listadoVehiculosComboBox.getSelectedItem().toString());
        cu.setValorCuota(Integer.parseInt(this.montoPagarTxt.getText()));
       
        Object[] datos = {a.getDiasArriendo(), c.getNombre(), v.getPatente(), cu.getValorCuota()};
        modelo.addRow(datos);
        
        JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
    }//GEN-LAST:event_guardarArriendoTxtMouseClicked
    
    private void diasTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diasTxtKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_diasTxtKeyTyped

    private void cantidadCuotasTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadCuotasTxtKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_cantidadCuotasTxtKeyTyped

    private void montoPagarTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoPagarTxtKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_montoPagarTxtKeyTyped
    
    private void poblarComboboxCliente(){
        ControladorAgregarClientes controladorAgregarCliente = new ControladorAgregarClientes();
        
        ArrayList<Cliente> listaClientes = controladorAgregarCliente.getListaClientes();

        listadoClientesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un cliente" }));
        for (Cliente cliente : listaClientes) {
            listadoClientesComboBox.addItem(cliente.getNombre());
        }
    }
    
    private void poblarComboboxVehiculo(){
         VehiculoController vehiculoCtrl = new VehiculoController();
      
        ArrayList<Vehiculo> listaVehiculos = vehiculoCtrl.getListaVehiculos();

        listadoVehiculosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un vehiculo" }));
        for (Vehiculo vehiculo : listaVehiculos) {
            listadoVehiculosComboBox.addItem(vehiculo.getPatente());
        }
    }
    
    private void soloNumeros(java.awt.event.KeyEvent evt){
    
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }
    
    private void barraMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {
        exitBtn.setBackground(new Color(0, 153, 153));
        exitTxt.setForeground(Color.black);
    }

    private void guardarArriendoTxtMouseEntered(java.awt.event.MouseEvent evt) {
        guardarArriendoBtn.setBackground(new Color(60, 205, 93));
        guardarArriendoTxt.setForeground(Color.black);
    }

    private void guardarArriendoTxtMouseExited(java.awt.event.MouseEvent evt) {
        guardarArriendoBtn.setBackground(new Color(0, 153, 153));
        guardarArriendoTxt.setForeground(Color.white);
    }

    private void volverTxtMouseEntered(java.awt.event.MouseEvent evt) {
        volverBtn.setBackground(Color.orange);
        volverTxt.setForeground(Color.black);
    }

    private void volverTxtMouseExited(java.awt.event.MouseEvent evt) {
        volverBtn.setBackground(new Color(0, 153, 153));
        volverTxt.setForeground(Color.white);
    }

    private void volverTxtMouseClicked(java.awt.event.MouseEvent evt) {
        MenuPrincipal v = new MenuPrincipal();
        v.setVisible(true);
        this.dispose();
    }
    
    private void ingresarNuevoClienteTxtMouseClicked(java.awt.event.MouseEvent evt) {
        AgregarCliente v = new AgregarCliente();
        v.setVisible(true);
        this.dispose();
    }

    private void ingresarNuevoClienteTxtMouseEntered(java.awt.event.MouseEvent evt) {
        ingresarNuevoClienteBtn.setBackground(new Color(60, 205, 93));
        ingresarNuevoClienteTxt.setForeground(Color.black);
    }

    private void ingresarNuevoClienteTxtMouseExited(java.awt.event.MouseEvent evt) {
        ingresarNuevoClienteBtn.setBackground(new Color(0, 153, 153));
        ingresarNuevoClienteTxt.setForeground(Color.white);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArriendoConCuotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JTextField cantidadCuotasTxt;
    private javax.swing.JPanel cuotasPagarPanel;
    private javax.swing.JLabel cuotasPagarTxt;
    private javax.swing.JTextField diasTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JTextField fechaArriendoTxt;
    private javax.swing.JPanel guardarArriendoBtn;
    private javax.swing.JLabel guardarArriendoTxt;
    private javax.swing.JPanel ingresarNuevoClienteBtn;
    private javax.swing.JLabel ingresarNuevoClienteTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listadoClientesComboBox;
    private javax.swing.JComboBox<String> listadoVehiculosComboBox;
    private javax.swing.JTextField montoPagarTxt;
    private javax.swing.JTable tabla;
    private javax.swing.JPanel volverBtn;
    private javax.swing.JLabel volverTxt;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
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
