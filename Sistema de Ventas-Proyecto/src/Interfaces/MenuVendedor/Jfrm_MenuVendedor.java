package Interfaces.MenuVendedor;

import Clases.Cliente;
import Clases.Paneles;
import Interfaces.Jfrm_Login;
import Interfaces.pnAuxiliarCommingSoon;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Alessandro Rios
 */
public class Jfrm_MenuVendedor extends javax.swing.JFrame implements Paneles {

    pnVentas pnVentas = new pnVentas();

    public Jfrm_MenuVendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SISTEMA DE VENTAS - MENU VENDEDOR");
        labelUsuario.setText("CAJERO");
        
    }

    @Override//Agregamos una img al logo del sistema
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo-erickson.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotones = new javax.swing.JPanel();
        logoEmpresa = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        pnVariable = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 640));
        setMinimumSize(new java.awt.Dimension(1020, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnBotones.setBackground(new java.awt.Color(211, 10, 20));
        pnBotones.setPreferredSize(new java.awt.Dimension(300, 640));

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-erickson.png"))); // NOI18N

        labelUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO ");

        btnVenta.setBackground(new java.awt.Color(211, 10, 20));
        btnVenta.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setText("INICIAR VENTA");
        btnVenta.setBorder(null);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(211, 10, 20));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnAgregarCliente.setBackground(new java.awt.Color(211, 10, 20));
        btnAgregarCliente.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setText("AGREGAR CLIENTE");
        btnAgregarCliente.setBorder(null);
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotonesLayout = new javax.swing.GroupLayout(pnBotones);
        pnBotones.setLayout(pnBotonesLayout);
        pnBotonesLayout.setHorizontalGroup(
            pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotonesLayout.createSequentialGroup()
                .addGroup(pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBotonesLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnBotonesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBotonesLayout.setVerticalGroup(
            pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotonesLayout.createSequentialGroup()
                .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        getContentPane().add(pnBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnVariable.setMaximumSize(null);
        pnVariable.setPreferredSize(new java.awt.Dimension(700, 630));

        javax.swing.GroupLayout pnVariableLayout = new javax.swing.GroupLayout(pnVariable);
        pnVariable.setLayout(pnVariableLayout);
        pnVariableLayout.setHorizontalGroup(
            pnVariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        pnVariableLayout.setVerticalGroup(
            pnVariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(pnVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
        mostrarPanel(pnVentas);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        Jfrm_Login login = new Jfrm_Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
        pnAuxiliarCommingSoon aux = new pnAuxiliarCommingSoon();
        mostrarPanel(aux);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Jfrm_MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfrm_MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfrm_MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfrm_MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jfrm_MenuVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JPanel pnBotones;
    private javax.swing.JPanel pnVariable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarPanel(JPanel p) {
        p.setSize(720, 640);
        p.setLocation(0, 0);
        //agregamos los paneles al panel "panVariable"
        pnVariable.removeAll();
        pnVariable.add(p, BorderLayout.CENTER);
        pnVariable.revalidate();
        pnVariable.repaint();
    }

    @Override
    public void placeHolder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
