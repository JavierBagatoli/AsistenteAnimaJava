/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import Logica.Enemigo;
import Logica.Personaje;
import java.awt.Color;
import static java.lang.Integer.toString;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Bagatoli
 * fecha 14/04/2022
 */

public class VentanaCrearPersonaje extends javax.swing.JFrame {
    private Personaje personaje;
    private Interfaz interfazMadre;
    
    /**
     * Creates new form VentanaCrearPersonaje
     * @param personajeAtraido
     */
    public VentanaCrearPersonaje(Personaje personajeAtraido, Interfaz origen) {
        setUndecorated(true);
        setLocationRelativeTo(null);
        this.personaje = personajeAtraido;
        this.interfazMadre = origen;
        initComponents();
        if(yaExiste(personaje)){
            //Modificamos los valores de la plantilla a los del objeto
            jTextNombreJ1.setText(personaje.getNombre());
            jSpVida.setValue(personaje.getVida());
            jSDefensa0.setValue(personaje.getVectorDeDefensas()[0]);
            jSDefensa1.setValue(personaje.getVectorDeDefensas()[1]);
            jSDefensa2.setValue(personaje.getVectorDeDefensas()[2]);
            jSDefensa3.setValue(personaje.getVectorDeDefensas()[3]);
            jSDefensa4.setValue(personaje.getVectorDeDefensas()[4]);
            jSDefensa5.setValue(personaje.getVectorDeDefensas()[5]);
            jSDefensa6.setValue(personaje.getVectorDeDefensas()[6]);
            jSpHabilidadAtaque.setValue(personaje.getHabilidadAtaque());
            jSpHabilidadDefensa.setValue(personaje.getHabilidadDefensa());
        }        
    }

    private VentanaCrearPersonaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSDefensa0 = new javax.swing.JSpinner();
        jSDefensa1 = new javax.swing.JSpinner();
        jSDefensa2 = new javax.swing.JSpinner();
        jSDefensa3 = new javax.swing.JSpinner();
        jSDefensa4 = new javax.swing.JSpinner();
        jSDefensa5 = new javax.swing.JSpinner();
        jSDefensa6 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jTextNombreJ1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPAccionCrear = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPAccionSalir = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSpVida = new javax.swing.JSpinner();
        jSpHabilidadAtaque = new javax.swing.JSpinner();
        jSpHabilidadDefensa = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Personaje");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Defensas");

        jSDefensa0.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)10), Byte.valueOf((byte)1)));

        jSDefensa1.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)10), Byte.valueOf((byte)1)));

        jSDefensa2.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)10), Byte.valueOf((byte)1)));

        jSDefensa3.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)10), Byte.valueOf((byte)1)));

        jSDefensa4.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)10), Byte.valueOf((byte)1)));

        jSDefensa5.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)10), Byte.valueOf((byte)1)));

        jSDefensa6.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)10), Byte.valueOf((byte)1)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jTextNombreJ1.setText("Nombre");
        jTextNombreJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreJ1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Vida:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Habilidad Ataque");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Habilida Defensa");

        jPAccionCrear.setBackground(new java.awt.Color(0, 102, 102));
        jPAccionCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPAccionCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPAccionCrearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPAccionCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPAccionCrearMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crear");

        javax.swing.GroupLayout jPAccionCrearLayout = new javax.swing.GroupLayout(jPAccionCrear);
        jPAccionCrear.setLayout(jPAccionCrearLayout);
        jPAccionCrearLayout.setHorizontalGroup(
            jPAccionCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAccionCrearLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPAccionCrearLayout.setVerticalGroup(
            jPAccionCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAccionCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPAccionSalir.setBackground(new java.awt.Color(102, 0, 0));
        jPAccionSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPAccionSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPAccionSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPAccionSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPAccionSalirMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salir");

        javax.swing.GroupLayout jPAccionSalirLayout = new javax.swing.GroupLayout(jPAccionSalir);
        jPAccionSalir.setLayout(jPAccionSalirLayout);
        jPAccionSalirLayout.setHorizontalGroup(
            jPAccionSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAccionSalirLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel9)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPAccionSalirLayout.setVerticalGroup(
            jPAccionSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAccionSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSpVida.setModel(new javax.swing.SpinnerNumberModel());

        jSpHabilidadAtaque.setModel(new javax.swing.SpinnerNumberModel());

        jSpHabilidadDefensa.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpVida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSDefensa0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSDefensa1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSDefensa2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSpHabilidadDefensa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(jSpHabilidadAtaque, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSDefensa3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSDefensa4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSDefensa5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSDefensa6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPAccionCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPAccionSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSDefensa0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jSDefensa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSDefensa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSDefensa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSDefensa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSDefensa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSDefensa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpHabilidadAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpHabilidadDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPAccionCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPAccionSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void jTextNombreJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreJ1ActionPerformed
        
    }//GEN-LAST:event_jTextNombreJ1ActionPerformed

    private void jPAccionSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAccionSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPAccionSalirMouseClicked

    private void jPAccionCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAccionCrearMouseClicked
        //Guardamos los datos del formulario
        String nombre = (String) jTextNombreJ1.getText();
        int vida = (int) jSpVida.getValue();
        int habilidadAtaque = (int) jSpHabilidadAtaque.getValue();
        int habilidadDefensa = (int) jSpHabilidadDefensa.getValue();
        byte[] vectorDefensa = new byte[7];
        vectorDefensa[0] = (byte) jSDefensa0.getValue();
        vectorDefensa[1] = (byte) jSDefensa1.getValue();
        vectorDefensa[2] = (byte) jSDefensa2.getValue();
        vectorDefensa[3] = (byte) jSDefensa3.getValue();
        vectorDefensa[4] = (byte) jSDefensa4.getValue();
        vectorDefensa[5] = (byte) jSDefensa5.getValue();
        vectorDefensa[6] = (byte) jSDefensa6.getValue();
        //Modificamos los valores segun correspondan al formulario
        personaje.setNombre(nombre);
        personaje.setVida(vida);
        personaje.setHabilidadAtaque(habilidadAtaque);
        
        personaje.setHabilidadDefensa(habilidadDefensa);
        personaje.setVectorDeDefensas(vectorDefensa);
        JOptionPane.showMessageDialog(rootPane, "spin: " + jSpHabilidadAtaque.getValue());
        JOptionPane.showMessageDialog(rootPane, "var: " + habilidadAtaque);
        JOptionPane.showMessageDialog(rootPane, "personaje: " + personaje.getHabilidadAtaque());
        interfazMadre.mostrarDatosPer1();
        this.dispose();
    }//GEN-LAST:event_jPAccionCrearMouseClicked

    private void jPAccionCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAccionCrearMouseEntered
        jPAccionCrear.setBorder(BorderFactory.createLoweredBevelBorder());
        jPAccionCrear.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_jPAccionCrearMouseEntered

    private void jPAccionCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAccionCrearMouseExited
        jPAccionCrear.setBorder(BorderFactory.createRaisedBevelBorder());
        jPAccionCrear.setBackground(new Color(0,114,123));
    }//GEN-LAST:event_jPAccionCrearMouseExited

    private void jPAccionSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAccionSalirMouseEntered
        jPAccionSalir.setBorder(BorderFactory.createLoweredBevelBorder());
        jPAccionSalir.setBackground(new Color(37, 13, 20));
    }//GEN-LAST:event_jPAccionSalirMouseEntered

    private void jPAccionSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAccionSalirMouseExited
        jPAccionSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        jPAccionSalir.setBackground(new Color(76, 25, 41));
    }//GEN-LAST:event_jPAccionSalirMouseExited

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
            java.util.logging.Logger.getLogger(VentanaCrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrearPersonaje().setVisible(true);
            }
        });
    }
    private boolean yaExiste(Personaje personaje){
        boolean yaExiste = !(personaje.getNombre()).equals("test");
        return yaExiste;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPAccionCrear;
    private javax.swing.JPanel jPAccionSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSDefensa0;
    private javax.swing.JSpinner jSDefensa1;
    private javax.swing.JSpinner jSDefensa2;
    private javax.swing.JSpinner jSDefensa3;
    private javax.swing.JSpinner jSDefensa4;
    private javax.swing.JSpinner jSDefensa5;
    private javax.swing.JSpinner jSDefensa6;
    private javax.swing.JSpinner jSpHabilidadAtaque;
    private javax.swing.JSpinner jSpHabilidadDefensa;
    private javax.swing.JSpinner jSpVida;
    private javax.swing.JTextField jTextNombreJ1;
    // End of variables declaration//GEN-END:variables
}
