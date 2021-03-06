/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import Logica.Enemigo;
import Logica.IPersona;
import Logica.Personaje;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Javier Bagatoli
 * fecha 12/04/202
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    Personaje personaje1;
    Enemigo enemigo1;

    public Interfaz() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpDanio = new javax.swing.JSpinner();
        jSpDado = new javax.swing.JSpinner();
        jBMostrarDatosPersonaje1 = new javax.swing.JButton();
        jLabelValores = new javax.swing.JLabel();
        jPBotonCrear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBCurar = new javax.swing.JButton();
        jSpVidaACurar = new javax.swing.JSpinner();
        jLTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        danioEnemigo = new javax.swing.JSpinner();
        jCTipoDanio = new javax.swing.JComboBox<>();
        habilidadAtaqueEnemigo = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jActionCrearEnemigo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jBCalcular = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jBAplicarDanio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setText("Da??o");

        jLabel4.setText("Dado");

        jSpDanio.setModel(new javax.swing.SpinnerNumberModel());

        jSpDado.setModel(new javax.swing.SpinnerNumberModel((short)0, null, null, (short)1));

        jBMostrarDatosPersonaje1.setText("Mostrar Datos");
        jBMostrarDatosPersonaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarDatosPersonaje1ActionPerformed(evt);
            }
        });

        jLabelValores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelValores.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValores.setText("Valores:");

        jPBotonCrear.setBackground(new java.awt.Color(0, 102, 102));
        jPBotonCrear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPBotonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPBotonCrearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPBotonCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPBotonCrearMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear personaje");

        javax.swing.GroupLayout jPBotonCrearLayout = new javax.swing.GroupLayout(jPBotonCrear);
        jPBotonCrear.setLayout(jPBotonCrearLayout);
        jPBotonCrearLayout.setHorizontalGroup(
            jPBotonCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotonCrearLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );
        jPBotonCrearLayout.setVerticalGroup(
            jPBotonCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotonCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBCurar.setText("Curar");
        jBCurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCurarMouseClicked(evt);
            }
        });
        jBCurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCurarActionPerformed(evt);
            }
        });

        jSpVidaACurar.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValores, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSpDanio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBMostrarDatosPersonaje1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jSpDado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpVidaACurar)
                            .addComponent(jBCurar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                    .addComponent(jPBotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpDanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpVidaACurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMostrarDatosPersonaje1)
                    .addComponent(jBCurar))
                .addGap(18, 18, 18)
                .addComponent(jLabelValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLTitulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("Asistente de combate");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        danioEnemigo.setModel(new javax.swing.SpinnerNumberModel());

        jCTipoDanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filo", "Penetrante", "Cortante", "Calor", "Electrico", "Frio", "Energia" }));

        habilidadAtaqueEnemigo.setModel(new javax.swing.SpinnerNumberModel());

        jLabel9.setText("Da??o Enemigo");

        jLabel10.setText("Ataque Enemigo");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enemigo 1");

        jActionCrearEnemigo.setBackground(new java.awt.Color(0, 102, 102));
        jActionCrearEnemigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jActionCrearEnemigo.setForeground(new java.awt.Color(0, 102, 102));
        jActionCrearEnemigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jActionCrearEnemigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jActionCrearEnemigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jActionCrearEnemigoMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Crear");

        javax.swing.GroupLayout jActionCrearEnemigoLayout = new javax.swing.GroupLayout(jActionCrearEnemigo);
        jActionCrearEnemigo.setLayout(jActionCrearEnemigoLayout);
        jActionCrearEnemigoLayout.setHorizontalGroup(
            jActionCrearEnemigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jActionCrearEnemigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jActionCrearEnemigoLayout.setVerticalGroup(
            jActionCrearEnemigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jActionCrearEnemigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBCalcular.setText("Calcular da??o");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        jLabelResultado.setText("Da??o Producido");

        jBAplicarDanio.setText("Aplicar Da??o a P1");
        jBAplicarDanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAplicarDanioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCTipoDanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(habilidadAtaqueEnemigo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(danioEnemigo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jActionCrearEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAplicarDanio))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelResultado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(danioEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(habilidadAtaqueEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addComponent(jActionCrearEnemigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCTipoDanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBAplicarDanio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCalcular)
                    .addComponent(jLabelResultado))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        try{
        int danioEnemigo1 = (int) danioEnemigo.getValue();
        int habilidadAtaqueEnemigo1 = (int) habilidadAtaqueEnemigo.getValue();
        byte tipoAtaque = (byte) jCTipoDanio.getSelectedIndex();
        
        double resultadoAtaque = personaje1.
            calcularDanioRecibido(20, tipoAtaque, habilidadAtaqueEnemigo1, danioEnemigo1);
        mostrarDa??oAProducirConFormato(resultadoAtaque);
        }catch(NullPointerException e){
            jLabelResultado.setText("No calculable");
        }
    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jBAplicarDanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAplicarDanioActionPerformed
        try{
            int danioEnemigo1 = (int) danioEnemigo.getValue();
            int habilidadAtaqueEnemigo1 = (int) habilidadAtaqueEnemigo.getValue();
            byte tipoAtaque = (byte) jCTipoDanio.getSelectedIndex();
            
            int resultadoAtaque = personaje1.
                calcularDanioRecibido(20, tipoAtaque, habilidadAtaqueEnemigo1, danioEnemigo1);
                    
            personaje1.recibirDanio(resultadoAtaque);
            mostrarDatosPersonaje();
        }catch(NullPointerException e){
            mostrarNoExistePersonaje();
        }
    }//GEN-LAST:event_jBAplicarDanioActionPerformed

    private void jBMostrarDatosPersonaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarDatosPersonaje1ActionPerformed
        try{
            mostrarDatosPersonaje();
        }catch(NullPointerException e){
            mostrarNoExistePersonaje();
        }
    }//GEN-LAST:event_jBMostrarDatosPersonaje1ActionPerformed

    private void jPBotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBotonCrearMouseClicked
        if (personaje1 == null){
            personaje1 = new Personaje();
        }
        llamarVentanaCreacion(personaje1);
    }//GEN-LAST:event_jPBotonCrearMouseClicked

    private void jPBotonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBotonCrearMouseEntered
        mouseEntraEstiloColor(jPBotonCrear, new Color(0,102,102));
    }//GEN-LAST:event_jPBotonCrearMouseEntered

    private void jPBotonCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBotonCrearMouseExited
        mouseSaleEstiloColor(jPBotonCrear, new Color(0,114,123));
    }//GEN-LAST:event_jPBotonCrearMouseExited

    private void jActionCrearEnemigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActionCrearEnemigoMouseClicked
        if (enemigo1 == null){
            enemigo1 = new Enemigo();
        }
        llamarVentanaCreacion(enemigo1);
    }//GEN-LAST:event_jActionCrearEnemigoMouseClicked

    private void jBCurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCurarActionPerformed

    private void jBCurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCurarMouseClicked
        int cantidadVida = (int) jSpVidaACurar.getValue();
        try{
            personaje1.curar(cantidadVida);
            mostrarDatosPersonaje();
        }catch(NullPointerException e){
            mostrarNoExistePersonaje();
        }
    }//GEN-LAST:event_jBCurarMouseClicked

    private void jActionCrearEnemigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActionCrearEnemigoMouseEntered
        mouseEntraEstiloColor(jActionCrearEnemigo,new Color(0,102,102));
    }//GEN-LAST:event_jActionCrearEnemigoMouseEntered

    private void jActionCrearEnemigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActionCrearEnemigoMouseExited
        mouseSaleEstiloColor(jActionCrearEnemigo,new Color(0,114,123));
    }//GEN-LAST:event_jActionCrearEnemigoMouseExited

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner danioEnemigo;
    private javax.swing.JSpinner habilidadAtaqueEnemigo;
    private javax.swing.JPanel jActionCrearEnemigo;
    private javax.swing.JButton jBAplicarDanio;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBCurar;
    private javax.swing.JButton jBMostrarDatosPersonaje1;
    private javax.swing.JComboBox<String> jCTipoDanio;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelValores;
    private javax.swing.JPanel jPBotonCrear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpDado;
    private javax.swing.JSpinner jSpDanio;
    private javax.swing.JSpinner jSpVidaACurar;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatosPersonaje() {
        jLabelValores.setText("<html><body>Nombre: " +
            personaje1.mostrarDatos()+ 
            "</body></html>");
    }
    
    private void mostrarNoExistePersonaje(){
        jLabelValores.setText("El personaje seleccionado no existe.");
    }

    private double calcularDanio() {
        //Entrada de datos
        //int DefensaDelOponente = (int) jSpDefensaOponente.getValue();
        short valorDelDado = (short)  jSpDado.getValue(); 
        
        byte tipoDeDanio = (byte) jCTipoDanio.getSelectedIndex();
        //Procesar datos
        int valorDelAtaque = valorDelDado; //-                DefensaDelOponente;
        double valorPorcentual = (valorDelAtaque*1.00/100);
        double valorDelDa??o = valorPorcentual;
        //Resultado
        return valorDelDa??o;
    }
    
        private void mostrarDa??oAProducirConFormato(Double Resultado) {
        DecimalFormat formatoDecimal = new DecimalFormat("###,##0.0");
        jLabelResultado.setText("Da??o Recibido: " +
            formatoDecimal.format(Resultado));
    }

    private void llamarVentanaCreacion(Personaje personaje) {
        VentanaCrearPersonaje ventanaEnemigo1 = new VentanaCrearPersonaje(personaje, this);
        ventanaEnemigo1.setVisible(true);
    }
    
    public void mostrarDatosPer1(){
        try{
            mostrarDatosPersonaje();
        }catch(NullPointerException e){
            jLabelResultado.setText("No es valido");
        }
    }
    
    private void mouseEntraEstiloColor(JPanel panel, Color color){
        panel.setBorder(BorderFactory.createLoweredBevelBorder());
        panel.setBackground(color);
    }
    
    private void mouseSaleEstiloColor(JPanel panel, Color color){
        panel.setBorder(BorderFactory.createRaisedBevelBorder());
        panel.setBackground(color);
    }
}
