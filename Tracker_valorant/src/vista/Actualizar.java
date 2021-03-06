/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Jugador;
import controlador.Registro;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author isaac
 */
public class Actualizar extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    Registro reg = new Registro();
    

    /**
     * Creates new form Actualizar
     */
    public Actualizar() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo (null);
        this.jtxt_nombre.setEditable(false);
        this.jtxt_rango.setEditable(false);
        this.jtxt_kills.setEditable(false);
        this.jtxt_muertes.setEditable(false);
        this.jchk_ban.setEnabled(false); //Tarea en proceso
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxt_buscar = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_rango = new javax.swing.JTextField();
        jtxt_kills = new javax.swing.JTextField();
        jtxt_muertes = new javax.swing.JTextField();
        jchk_ban = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jbtn_editar = new javax.swing.JButton();
        jbtn_aceptar = new javax.swing.JButton();
        jbtn_salir = new javax.swing.JButton();
        jbtn_limpiar = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Jugador");

        jPanel1.setBackground(new java.awt.Color(154, 15, 15));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese ID del jugador:");

        jtxt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_buscarActionPerformed(evt);
            }
        });

        jbtn_buscar.setText("buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rango:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kills:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Muertes:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ban:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt_nombre)
                                    .addComponent(jchk_ban)
                                    .addComponent(jtxt_rango)
                                    .addComponent(jtxt_muertes)
                                    .addComponent(jtxt_kills, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtxt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_rango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_kills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxt_muertes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jchk_ban))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(1, 1, 39));

        jbtn_editar.setText("Editar");
        jbtn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_editarActionPerformed(evt);
            }
        });

        jbtn_aceptar.setText("Aceptar");
        jbtn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_aceptarActionPerformed(evt);
            }
        });

        jbtn_salir.setText("Salir");
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });

        jbtn_limpiar.setText("Limpiar");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbtn_editar)
                .addGap(29, 29, 29)
                .addComponent(jbtn_aceptar)
                .addGap(39, 39, 39)
                .addComponent(jbtn_limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jbtn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_editar)
                    .addComponent(jbtn_aceptar)
                    .addComponent(jbtn_salir)
                    .addComponent(jbtn_limpiar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_buscarActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        int id = Integer.parseInt(this.jtxt_buscar.getText());

        Jugador jugador = reg.buscarPorId(id);

        String nombre = jugador.getNombre();
        String rango = jugador.getRango();
        double kills = jugador.getKills();
        double muerte = jugador.getMuerte();
        boolean ban = jugador.isBaneado();

        this.jtxt_nombre.setText(nombre);
        this.jtxt_rango.setText(rango);
        this.jtxt_kills.setText(String.valueOf(kills));
        this.jtxt_muertes.setText(String.valueOf(muerte));
        this.jchk_ban.setSelected(ban);// proceso de tarea: Bien

    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void jbtn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_editarActionPerformed
        if (Integer.parseInt(jtxt_buscar.getText()) != 0) {
            this.jtxt_nombre.setEditable(true);
            this.jtxt_rango.setEditable(true);
            this.jtxt_kills.setEditable(true);
            this.jtxt_muertes.setEditable(true);
            this.jchk_ban.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese ID", "Aviso", 1);
        }

    }//GEN-LAST:event_jbtn_editarActionPerformed

    private void jbtn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_aceptarActionPerformed
        double kills, muerte;
        int id;
        String nombre, rango;
        boolean ban;

        id = Integer.parseInt(this.jtxt_buscar.getText());
        nombre = this.jtxt_nombre.getText();
        rango = this.jtxt_rango.getText();
        kills = Double.parseDouble(this.jtxt_kills.getText());
        muerte = Double.parseDouble(this.jtxt_muertes.getText());
        ban = this.jchk_ban.isSelected();  //TAREA FINALIZADA SIN BUSQUEDA DE AYUDA SIIIIUUUUU!!!!

        Jugador jugador = new Jugador(id, nombre, rango, kills, muerte, ban);

        reg.Actualizar(jugador);
        JOptionPane.showMessageDialog(this, "Datos Actualizados", "Aviso", 1);


    }//GEN-LAST:event_jbtn_aceptarActionPerformed

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtn_salirActionPerformed

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed
        this.jtxt_buscar.setText("");
        this.jtxt_nombre.setText("");
        this.jtxt_rango.setText("");
        this.jtxt_kills.setText("");
        this.jtxt_muertes.setText("");
        this.jchk_ban.setSelected(false);
        this.jtxt_buscar.requestFocus();
        this.jtxt_nombre.setEditable(false);
        this.jtxt_rango.setEditable(false);
        this.jtxt_kills.setEditable(false);
        this.jtxt_muertes.setEditable(false);
        this.jchk_ban.setEnabled(false);
    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Actualizar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_editar;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JButton jbtn_salir;
    private javax.swing.JCheckBox jchk_ban;
    private javax.swing.JTextField jtxt_buscar;
    private javax.swing.JTextField jtxt_kills;
    private javax.swing.JTextField jtxt_muertes;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_rango;
    // End of variables declaration//GEN-END:variables

    
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/valorant2.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
