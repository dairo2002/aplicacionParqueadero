/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.controllerParqueadero;
import Model.Vehiculo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dairo Santana
 */
/**
 * @Login Usuario y contraseña "admin"
 */
public class FrmParqueadero extends javax.swing.JFrame {

    public LocalDateTime dateTime;
    public DateTimeFormatter formato;
    public controllerParqueadero parqueo;

    public FrmParqueadero() {
        initComponents();
        setLocationRelativeTo(this);
        parqueo = new controllerParqueadero();
        runnableDate();
        btnRegistrar.setEnabled(false);
    }

    private void runnableDate() {
        Runnable runn = new Runnable() {
            public void run() {
                //While: creamos un ciclo infinito
                while (true) {
                    try {
                        // En él, hacemos que el hilo duerma (1000 milis equivale a un segundo) cada segundo se ejecuta
                        Thread.sleep(1000);
                        dateTime = LocalDateTime.now(); // fecha actual
                        formato = DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh:mm:ss a"); //Formato de la fecha
                        //Al cambo de texto le pasamos la fecha y hora actua, en el formato
                        txtEntradaFechaHora.setText(dateTime.format(formato));
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();

                    }

                }
            }
        };
        Thread hilo = new Thread(runn);
        hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRetirarVehiculo = new javax.swing.JTextField();
        cboTipoVehiculo = new javax.swing.JComboBox<>();
        btnListaVehiculo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnHistorialVehiculo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnConsultarVehiculo = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEntradaFechaHora = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMinuto = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 58, 76));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo vehiculo");

        txtRetirarVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        txtRetirarVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetirarVehiculoKeyTyped(evt);
            }
        });

        cboTipoVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboTipoVehiculo.setForeground(new java.awt.Color(23, 22, 22));
        cboTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculos", "Moto", "Carro" }));
        cboTipoVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboTipoVehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoVehiculoItemStateChanged(evt);
            }
        });

        btnListaVehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnListaVehiculo.setText("Lista vehiculo");
        btnListaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaVehiculoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. Placa");

        btnHistorialVehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnHistorialVehiculo.setText("Historial");
        btnHistorialVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialVehiculoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Entrada fecha/hora");

        btnConsultarVehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConsultarVehiculo.setText("Retirar");
        btnConsultarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVehiculoActionPerformed(evt);
            }
        });

        txtPlaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(23, 22, 22));
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora");

        txtEntradaFechaHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEntradaFechaHora.setForeground(new java.awt.Color(23, 22, 22));

        jLabel9.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("30 Min");

        jLabel5.setFont(new java.awt.Font("Arial", 2, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarifas");

        txtHora.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtHora.setForeground(new java.awt.Color(23, 22, 22));
        txtHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraKeyTyped(evt);
            }
        });

        txtMinuto.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtMinuto.setForeground(new java.awt.Color(23, 22, 22));
        txtMinuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinutoKeyTyped(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Consultar Placa");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(18, 40, 73));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parqueadero");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estacionamiento.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEntradaFechaHora, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTipoVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListaVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btnHistorialVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEntradaFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorialVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoVehiculoItemStateChanged
        //Cuando se selecciona el Jcombobox de vehiculos, nos cargar la tarifas que corresponden al tipo de vehiculo.
        //Algunos botones y campos de textos se bloquean 
        if (cboTipoVehiculo.getSelectedItem().equals("Vehiculos")) {
            btnRegistrar.setEnabled(false);
            txtPlaca.setEnabled(false);
//            txtRetirarVehiculo.setEnabled(false);
            txtHora.setText("");
            txtMinuto.setText("");
        } else if (cboTipoVehiculo.getSelectedItem().equals("Moto")) {
            btnRegistrar.setEnabled(true);
            txtPlaca.setEnabled(true);
            txtRetirarVehiculo.setEnabled(true);
            txtHora.setText("$ 1.500");
            txtMinuto.setText("$ 700");
        } else if (cboTipoVehiculo.getSelectedItem().equals("Carro")) {
            btnRegistrar.setEnabled(true);
            txtPlaca.setEnabled(true);
            txtRetirarVehiculo.setEnabled(true);
            txtHora.setText("$ 1.500");
            txtMinuto.setText("$ 2.500");
        }
    }//GEN-LAST:event_cboTipoVehiculoItemStateChanged

    private void txtHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraKeyTyped
        evt.consume();
    }//GEN-LAST:event_txtHoraKeyTyped

    private void txtMinutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutoKeyTyped
        evt.consume();
    }//GEN-LAST:event_txtMinutoKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (!txtPlaca.getText().isEmpty()) {
            boolean resultado = parqueo.registroVehiculo(String.valueOf(cboTipoVehiculo.getSelectedItem()), txtPlaca.getText(), LocalDateTime.parse(txtEntradaFechaHora.getText(), formato));
            if (resultado) {
                JOptionPane.showMessageDialog(null, "Vehiculo registrado con exito!");
                cboTipoVehiculo.setSelectedIndex(0);
                txtPlaca.setText("");
                txtRetirarVehiculo.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el vehiculo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los cambos son obligatorios");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnListaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaVehiculoActionPerformed
        FrmListaVehiculo listaVehi = new FrmListaVehiculo();
        listaVehi.setVisible(true);
    }//GEN-LAST:event_btnListaVehiculoActionPerformed

    private void btnHistorialVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialVehiculoActionPerformed
        FrmListaHistorial vehiculo = new FrmListaHistorial();
        vehiculo.setVisible(true);
    }//GEN-LAST:event_btnHistorialVehiculoActionPerformed

    private void btnConsultarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVehiculoActionPerformed
        if (!txtRetirarVehiculo.getText().isEmpty()) {
            Vehiculo v = null;
            //Consultamos el vehiculo si existe, sale del parqueadero con su valor a pagar $$$
            var resultado = parqueo.consultarSalida(txtRetirarVehiculo.getText());
            if (resultado != null) {
                double pago = parqueo.calcularSalida(LocalDateTime.parse(txtEntradaFechaHora.getText(), formato), dateTime);
                // double pago = vehi.Salida(LocalDateTime.parse(txtEntradaFechaHora.getText(), formato), salida, v.getPrecio());
                JOptionPane.showMessageDialog(null, "El costo del parqueadero es $" + pago);
            } else {
                JOptionPane.showMessageDialog(null, "NO salio");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la placa y seleccione el tipo de vehiculo");
        }
    }//GEN-LAST:event_btnConsultarVehiculoActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed

    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        /**
         * Formato de placa
         *
         * @moto AAA-12A
         * @carro AAA-122
         */

        String placa = txtPlaca.getText();
        char key = evt.getKeyChar();

        if (Character.isLowerCase(key)) {
            evt.setKeyChar(Character.toUpperCase(key));
        }

        //Validacion si la seleccion del tipo vehiculo es igual a "moto"
        if (cboTipoVehiculo.getSelectedItem().equals("Moto")) {
            //la longitud e la placa sea <3
            if (placa.length() < 3) {
                //Verifica si el caracter ingresado no=! es una letra=isLetter
                if (!Character.isLetter(key)) {
                    //Si no es una letras, nos consume los caracteres diferentes
                    evt.consume();
                }
                //la longitud de la placa esta entre 3 y 4
            } else if (placa.length() < 5) {
                //Verifica si el caracter ingresado no=! es una digito=isDigit
                if (!Character.isDigit(key)) {
                    //Si no es una digito, nos consume los caracteres diferentes
                    evt.consume();
                }
                //la longitud de la placa es 5
            } else if (placa.length() < 6) {
                //Verifica si el caracter ingresado no=! es una letra=isLetter
                if (!Character.isLetter(key)) {
                    //Si no es una letras, nos consume los caracteres diferentes
                    evt.consume();
                }
            } else {
                evt.consume();
            }

        }

        if (cboTipoVehiculo.getSelectedItem().equals("Carro")) {
            if (placa.length() < 3) {
                if (!Character.isLetter(key)) {
                    evt.consume();
                }
            } else if (placa.length() < 6) {
                if (!Character.isDigit(key)) {
                    evt.consume();
                }
            } else {
                evt.consume();
            }

        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtRetirarVehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetirarVehiculoKeyTyped
        char mayuscula = evt.getKeyChar();
        //Solo permite digitar 6 caracteres
        if (txtRetirarVehiculo.getText().length() == 6) {
            evt.consume();
        }
        if (Character.isLowerCase(mayuscula)) {
            evt.setKeyChar(Character.toUpperCase(mayuscula));
        }

    }//GEN-LAST:event_txtRetirarVehiculoKeyTyped

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
            java.util.logging.Logger.getLogger(FrmParqueadero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmParqueadero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmParqueadero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmParqueadero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmParqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarVehiculo;
    private javax.swing.JButton btnHistorialVehiculo;
    private javax.swing.JButton btnListaVehiculo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboTipoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtEntradaFechaHora;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMinuto;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtRetirarVehiculo;
    // End of variables declaration//GEN-END:variables
}
