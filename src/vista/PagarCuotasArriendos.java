/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controlador.ControladorArriendoConCuotas;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author Lorraine
 */
public class PagarCuotasArriendos extends javax.swing.JFrame {

    FondoPanelPagarCuotas fondo = new FondoPanelPagarCuotas();
    int xMouse, yMouse;

    ArriendoCuota arriendoSeleccionado;
    CuotaArriendo cuotaSeleccionada;

    ControladorArriendoConCuotas controladorArriendoConCuotas = new ControladorArriendoConCuotas();

    public PagarCuotasArriendos() {
        initComponents();
        this.setLocationRelativeTo(null);

        poblarCombobox();

    }

    private void poblarCombobox() {
        ArrayList<Cliente> listaClientes = controladorArriendoConCuotas.getClientesConCuotas();

        // Listar clientes en el combobox y se determina el cliente seleccionado
        // En el combobox se muestra solo el nombre del cliente
        listadoClientesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Seleccione un cliente"}));

        for (Cliente cliente : listaClientes) {
            listadoClientesComboBox.addItem(cliente.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanelPagarCuotas();
        barraMenuPrincipal = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        listadoClientesComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaArriendo = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuotas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        mostrarArriendoBtn = new javax.swing.JPanel();
        mostrarArriendoTxt = new javax.swing.JLabel();
        pagoBtn = new javax.swing.JPanel();
        pagoTxt = new javax.swing.JLabel();
        volverBtn = new javax.swing.JPanel();
        volverTxt = new javax.swing.JLabel();

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraMenuPrincipalLayout.setVerticalGroup(
            barraMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagar cuotas Arriendo");

        listadoClientesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listadoClientesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoClientesComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione arriendo:");

        jScrollPane1.setViewportView(listaArriendo);

        tablaCuotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Número", "Valor", "¿Pagada?"
            }
        ));
        jScrollPane2.setViewportView(tablaCuotas);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pagos:");

        mostrarArriendoBtn.setBackground(new java.awt.Color(0, 153, 153));

        mostrarArriendoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrarArriendoTxt.setForeground(new java.awt.Color(255, 255, 255));
        mostrarArriendoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarArriendoTxt.setText("Mostrar pagos arriendo seleccionado >>");
        mostrarArriendoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarArriendoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarArriendoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarArriendoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarArriendoTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mostrarArriendoBtnLayout = new javax.swing.GroupLayout(mostrarArriendoBtn);
        mostrarArriendoBtn.setLayout(mostrarArriendoBtnLayout);
        mostrarArriendoBtnLayout.setHorizontalGroup(
            mostrarArriendoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarArriendoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );
        mostrarArriendoBtnLayout.setVerticalGroup(
            mostrarArriendoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarArriendoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        pagoBtn.setBackground(new java.awt.Color(0, 153, 153));

        pagoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pagoTxt.setForeground(new java.awt.Color(255, 255, 255));
        pagoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagoTxt.setText("Realizar Pago");
        pagoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagoTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pagoBtnLayout = new javax.swing.GroupLayout(pagoBtn);
        pagoBtn.setLayout(pagoBtnLayout);
        pagoBtnLayout.setHorizontalGroup(
            pagoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        pagoBtnLayout.setVerticalGroup(
            pagoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        volverBtn.setBackground(new java.awt.Color(0, 153, 153));

        volverTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volverTxt.setForeground(new java.awt.Color(255, 255, 255));
        volverTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volverTxt.setText("Volver");
        volverTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(volverTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(listadoClientesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mostrarArriendoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pagoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listadoClientesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(mostrarArriendoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pagoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagoTxtMouseClicked
        
        int[] fila = tablaCuotas.getSelectedRows();
        for(int i= 0; i < fila.length; i+=1){
            int cuota = fila[i];
            System.out.println(fila[i]);
            cuotaSeleccionada = this.arriendoSeleccionado.getCuotas().get(cuota);
            System.out.println(cuotaSeleccionada.getValorCuota());
        }
        
        controladorArriendoConCuotas.pagarCuota((ArriendoCuota) this.arriendoSeleccionado, cuotaSeleccionada);
        JOptionPane.showMessageDialog(null, "Pago exitoso, puede volver a seleccionar cliente");
        
        tablaCuotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Número", "Valor", "¿Pagada?"
            }
        ));
    }//GEN-LAST:event_pagoTxtMouseClicked

    private void mostrarArriendoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarArriendoTxtMouseClicked
            
            // Se obtiene el numero de arriendo seleccionado en jList1
            int numArriendoSeleccionado = Integer.parseInt(listaArriendo.getSelectedValue());

            // se extrae el ArriendoCuota con el metodo getArriendoConCuotasByNumArriendo
            this.arriendoSeleccionado = controladorArriendoConCuotas.getArriendoConCuotasByNumArriendo(numArriendoSeleccionado);

            // Se obtiene el listado de cuotas del arriendo seleccionado
            ArrayList<CuotaArriendo> listaCuotas = this.arriendoSeleccionado.getCuotas();
            // Se muestra el listado de pagos en la tabla jTable1

            DefaultTableModel modelo = (DefaultTableModel) tablaCuotas.getModel();

            // Se recorre el listado de cuotas
            for (CuotaArriendo cuota : listaCuotas) {
                    // Se obtiene el numero de la cuota
                    int numCuota = cuota.getNumCuota();
                    // Se obtiene el valor de la cuota
                    int valorCuota = cuota.getValorCuota();
                    // Se obtiene el estado de la cuota
                    boolean estadoCuota = cuota.isPagada();

                    // Se pasan numCuota, valorCuota y estadoCuota a String
                    String numCuotaStr = String.valueOf(numCuota);
                    String valorCuotaStr = String.valueOf(valorCuota);
                    String estadoCuotaStr = String.valueOf(estadoCuota);
                    // Se crea un array de objetos con los datos de la cuota
                    Object[] datosCuota = { numCuota, valorCuota, estadoCuota };
                    // Se agrega la fila a la tabla
                    modelo.addRow(datosCuota);
            }
            tablaCuotas.setModel(modelo);
    }//GEN-LAST:event_mostrarArriendoTxtMouseClicked

    private void listadoClientesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoClientesComboBoxActionPerformed

        ArrayList<Cliente> listaClientes = controladorArriendoConCuotas.getClientesConCuotas();

        String nombreClienteSeleccionado = listadoClientesComboBox.getSelectedItem().toString();
        Cliente clienteSeleccionado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equals(nombreClienteSeleccionado)) {
                clienteSeleccionado = cliente;
            }
        }
        ArrayList<ArriendoCuota> listaArriendos = controladorArriendoConCuotas.getArriendosConCuotas(clienteSeleccionado);

        listaArriendo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = new String[listaArriendos.size()];

            {
                for (int i = 0; i < listaArriendos.size(); i++) {
                    strings[i] = String.valueOf(listaArriendos
                            .get(i).getNumArriendo());
                }
            }

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
    }//GEN-LAST:event_listadoClientesComboBoxActionPerformed

    // pagoBtn mouse events
    private void pagoBtnMouseClicked(java.awt.event.MouseEvent evt, ArriendoConCuotas arriendo, CuotaArriendo cuota) {
       
        controladorArriendoConCuotas.pagarCuota(arriendo, cuota);

        JOptionPane.showMessageDialog(null, "Pago exitoso");
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

    private void barraMenuPrincipalMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }

    private void barraMenuPrincipalMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    private void volverTxtMouseClicked(java.awt.event.MouseEvent evt) {
        MenuPrincipal v = new MenuPrincipal();
        v.setVisible(true);
        this.dispose();
    }

    private void volverTxtMouseEntered(java.awt.event.MouseEvent evt) {
        volverBtn.setBackground(Color.orange);
        volverTxt.setForeground(Color.black);
    }

    private void volverTxtMouseExited(java.awt.event.MouseEvent evt) {
        volverBtn.setBackground(new Color(0, 153, 153));
        volverTxt.setForeground(Color.white);
    }

    private void pagoTxtMouseEntered(java.awt.event.MouseEvent evt) {
        pagoBtn.setBackground(new Color(44, 131, 236));
        pagoTxt.setForeground(Color.black);
    }

    private void pagoTxtMouseExited(java.awt.event.MouseEvent evt) {
        pagoBtn.setBackground(new Color(0, 153, 153));
        pagoTxt.setForeground(Color.white);
    }

    private void mostrarArriendoTxtMouseEntered(java.awt.event.MouseEvent evt) {
        mostrarArriendoBtn.setBackground(new Color(60, 205, 93));
        mostrarArriendoTxt.setForeground(Color.black);
    }

    private void mostrarArriendoTxtMouseExited(java.awt.event.MouseEvent evt) {
        mostrarArriendoBtn.setBackground(new Color(0, 153, 153));
        mostrarArriendoTxt.setForeground(Color.white);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagarCuotasArriendos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraMenuPrincipal;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaArriendo;
    private javax.swing.JComboBox<String> listadoClientesComboBox;
    private javax.swing.JPanel mostrarArriendoBtn;
    private javax.swing.JLabel mostrarArriendoTxt;
    private javax.swing.JPanel pagoBtn;
    private javax.swing.JLabel pagoTxt;
    private javax.swing.JTable tablaCuotas;
    private javax.swing.JPanel volverBtn;
    private javax.swing.JLabel volverTxt;
    // End of variables declaration//GEN-END:variables

    class FondoPanelPagarCuotas extends JPanel {

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
