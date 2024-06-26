
package Vistas;

import Controladores.ControladorMenuInformacion;
import Controladores.ControladorVentanaTarifas;
import Modelos.Puesto;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 */
public class VentanaMenuInformacion extends javax.swing.JFrame {

    private ControladorMenuInformacion controlador;
    private ControladorVentanaTarifas controlador2;
    private int fila;
    private int columna;
    private Puesto puesto;
//    
    /**
     * Creates new form VentanaGestPrendas
     */
    public VentanaMenuInformacion(int fila, int columna, Puesto puesto) {
        initComponents();
        controlador = new ControladorMenuInformacion(puesto);
        controlador2 = new ControladorVentanaTarifas();
        this.fila = fila;
        this.columna = columna;
        this.puesto = puesto;
        double valorPorHora = controlador2.valor(puesto);
        if(puesto != null){
            txfNumContenedor.setText(String.valueOf(puesto.getNumero()));
            txtModelo.setText(puesto.getVehiculo().getModelo());
            txtPlaca.setText(puesto.getVehiculo().getPlaca());
            txtFechaIngreso.setText(String.valueOf(puesto.getFechaIngreso()));
            txtHoraIngreso.setText(String.valueOf(puesto.getHoraIngreso()));
            txtTipoVehiculo.setText(puesto.getTipovehiculo());
            txtValorHora.setText(String.valueOf(valorPorHora));
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
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfNumContenedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnInfo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnDesocupar = new javax.swing.JLabel();
        txtHoraIngreso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtTipoVehiculo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txtModelo2 = new javax.swing.JTextField();
        Tipo = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtValorHora = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtModelo4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 339, 16));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Información del puesto");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Número de puesto:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, -1));

        txfNumContenedor.setEditable(false);
        txfNumContenedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txfNumContenedor.setForeground(new java.awt.Color(0, 0, 153));
        txfNumContenedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNumContenedor.setBorder(null);
        jPanel2.add(txfNumContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cliente:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 116, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Información del vehículo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtPlaca.setEditable(false);
        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(0, 0, 153));
        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaca.setBorder(null);
        jPanel2.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 130, 20));

        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Placa:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 40, 20));

        txtModelo.setEditable(false);
        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(0, 0, 153));
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModelo.setBorder(null);
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel2.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 130, 20));

        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Modelo:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 60, 20));

        txtFechaIngreso.setEditable(false);
        txtFechaIngreso.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaIngreso.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtFechaIngreso.setForeground(new java.awt.Color(0, 0, 153));
        txtFechaIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaIngreso.setBorder(null);
        jPanel2.add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 130, 20));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInfo.setText("Ver información propietario");
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 150, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 130, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 130, 10));

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 70, 20));

        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Fecha ingreso:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 20));

        jPanel9.setBackground(new java.awt.Color(0, 0, 153));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 80, 20));

        jPanel10.setBackground(new java.awt.Color(0, 0, 153));

        btnDesocupar.setBackground(new java.awt.Color(0, 0, 153));
        btnDesocupar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDesocupar.setForeground(new java.awt.Color(255, 255, 255));
        btnDesocupar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDesocupar.setText("Dar salida");
        btnDesocupar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesocupar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesocuparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDesocupar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDesocupar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 80, -1));

        txtHoraIngreso.setEditable(false);
        txtHoraIngreso.setBackground(new java.awt.Color(255, 255, 255));
        txtHoraIngreso.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtHoraIngreso.setForeground(new java.awt.Color(0, 0, 153));
        txtHoraIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraIngreso.setBorder(null);
        txtHoraIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraIngresoKeyTyped(evt);
            }
        });
        jPanel2.add(txtHoraIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 130, 20));

        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Hora ingreso:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, 20));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 130, 10));

        txtTipoVehiculo.setEditable(false);
        txtTipoVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtTipoVehiculo.setForeground(new java.awt.Color(0, 0, 153));
        txtTipoVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoVehiculo.setBorder(null);
        txtTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoVehiculoActionPerformed(evt);
            }
        });
        jPanel2.add(txtTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 130, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 10));

        txtModelo2.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtModelo2.setForeground(new java.awt.Color(0, 0, 153));
        txtModelo2.setBorder(null);
        txtModelo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelo2ActionPerformed(evt);
            }
        });
        jPanel2.add(txtModelo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 130, 20));

        Tipo.setForeground(new java.awt.Color(0, 0, 153));
        Tipo.setText("Tipo Vehículo:");
        jPanel2.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 80, 20));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, 10));

        txtValorHora.setEditable(false);
        txtValorHora.setBackground(new java.awt.Color(255, 255, 255));
        txtValorHora.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtValorHora.setForeground(new java.awt.Color(0, 0, 153));
        txtValorHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorHora.setBorder(null);
        txtValorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorHoraActionPerformed(evt);
            }
        });
        jPanel2.add(txtValorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 130, 20));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 130, 10));

        txtModelo4.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtModelo4.setForeground(new java.awt.Color(0, 0, 153));
        txtModelo4.setBorder(null);
        txtModelo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelo4ActionPerformed(evt);
            }
        });
        jPanel2.add(txtModelo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 130, 20));

        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Valor hora:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 60, 20));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 130, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseClicked
        String mensaje = "Información del Propietario" + "\nIdentificación: " + puesto.getVehiculo().getPropietario().getId()+ "\nNombre: " + puesto.getVehiculo().getPropietario().getNombre() + "\nTelefono: " + puesto.getVehiculo().getPropietario().getNumTelefono() + "\nCorreo: " + puesto.getVehiculo().getPropietario().getCorreo() + "\nEdad: " + puesto.getVehiculo().getPropietario().getEdad();
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnInfoMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        VistaOcuparPuesto ventana = new VistaOcuparPuesto();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnDesocuparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesocuparMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro de sacar el vehículo del puesto", "Confirmación", JOptionPane.YES_NO_OPTION);
        double valorHora = controlador2.valor(puesto);
        if(confirmar == JOptionPane.YES_OPTION){
            double valor =  calcularValorAPagar(puesto.getFechaIngreso(), puesto.getHoraIngreso(), valorHora);
            JOptionPane.showMessageDialog(null, "El valor a pagar es: "+valor);
            controlador.actualizarInfo(puesto, valor);
            controlador.desocuparPuesto();
            VistaPrincipal ventana = new VistaPrincipal();
            ventana.setVisible(true);
            this.dispose();
        }     
    }//GEN-LAST:event_btnDesocuparMouseClicked

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtHoraIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraIngresoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraIngresoKeyTyped

    private void txtTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoVehiculoActionPerformed

    private void txtModelo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelo2ActionPerformed

    private void txtValorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorHoraActionPerformed

    private void txtModelo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelo4ActionPerformed
  

    public static double calcularValorAPagar(LocalDate diaIngreso, LocalTime horaIngreso, double valorPorHora) {
        // Combina la fecha y hora de ingreso en un solo objeto LocalDateTime
        LocalDateTime fechaHoraIngreso = LocalDateTime.of(diaIngreso, horaIngreso);
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        // Calcula la duración entre la hora de ingreso y la hora actual
        Duration duracion = Duration.between(fechaHoraIngreso, fechaHoraActual);
       
        // Calcula el número de horas completas, redondeando hacia arriba si hay un segundo extra
        long horasCompletas = duracion.toHours();
        if (duracion.getSeconds() % 3600 > 0) {
            horasCompletas += 1;
        }
        // Calcula el valor total a pagar
        double valorAPagar = horasCompletas * valorPorHora;
        return valorAPagar;
    }
    
    private void limpiarCampos(){
        txtFechaIngreso.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel btnDesocupar;
    private javax.swing.JLabel btnInfo;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txfNumContenedor;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtHoraIngreso;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModelo2;
    private javax.swing.JTextField txtModelo4;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTipoVehiculo;
    private javax.swing.JTextField txtValorHora;
    // End of variables declaration//GEN-END:variables
}
