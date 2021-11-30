/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author isaac
 */
public class Menu extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    
    
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        
        this.setContentPane(fondo); //Nueva funcionalidad: agregar fondo a//Nueva funcionalidad: agregar fondo a JFrame y al JPanel
        initComponents();
        setLocationRelativeTo (null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmi_agregar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jmi_actualizar = new javax.swing.JMenuItem();
        jmi_listar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_soporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jMenu1.setText("Jugadores");

        jMenu3.setText("Opciones");

        jmi_agregar.setText("Agregar jugador");
        jmi_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_agregar);

        jmi_eliminar.setText("Eliminar jugador");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_eliminar);

        jmi_actualizar.setText("Actualizar jugador");
        jmi_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualizarActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_actualizar);

        jMenu1.add(jMenu3);

        jmi_listar.setText("Listar jugadores");
        jmi_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_listar);
        jMenu1.add(jSeparator1);

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");

        jmi_soporte.setText("Soporte");
        jmi_soporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_soporteActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_soporte);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarActionPerformed
        new Agregar().setVisible(true);
    }//GEN-LAST:event_jmi_agregarActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        new Eliminar().setVisible(true);
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jmi_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualizarActionPerformed
        new Actualizar().setVisible(true);
    }//GEN-LAST:event_jmi_actualizarActionPerformed

    private void jmi_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarActionPerformed
        new Listar().setVisible(true);
    }//GEN-LAST:event_jmi_listarActionPerformed

    private void jmi_soporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_soporteActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ")); //nueva funcionalidad, agregar links
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Link caido", "Aviso", 2);
        }
    }//GEN-LAST:event_jmi_soporteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmi_actualizar;
    private javax.swing.JMenuItem jmi_agregar;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_listar;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JMenuItem jmi_soporte;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/valorant1.jpg")).getImage();            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);            
            setOpaque(false);            
            super.paint(g);
        }
    }
}
