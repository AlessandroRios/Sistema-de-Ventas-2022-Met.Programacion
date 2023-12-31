package Interfaces.MenuAdmin;

import Interfaces.pnAuxiliarCommingSoon;
import Clases.Paneles;
import Interfaces.Jfrm_Login;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Alessandro del Piero
 */
public class Jfrm_MenuAdministrador extends javax.swing.JFrame implements Paneles {

    //Instanciamos Paneles 
    pnInicio pnInicio = new pnInicio();
    pnGestionClientes pnGestionClientes = new pnGestionClientes();
    pnGestionEmpleados pnGestionEmpleados = new pnGestionEmpleados();
    pnGestionProductos pnGestionProductos = new pnGestionProductos();

    pnAuxiliarCommingSoon pnAuxiliar = new pnAuxiliarCommingSoon();

    
    public Jfrm_MenuAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SISTEMA DE VENTAS - MENU ADMINISTRADOR");
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
        btnGestionProductos = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnGestionClientes = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        logoEmpresa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGestionPersonal = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        pnVariable = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1016, 640));
        setMinimumSize(new java.awt.Dimension(1016, 640));
        setPreferredSize(new java.awt.Dimension(1016, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnBotones.setBackground(new java.awt.Color(211, 10, 20));
        pnBotones.setMinimumSize(new java.awt.Dimension(300, 600));
        pnBotones.setPreferredSize(new java.awt.Dimension(300, 600));

        btnGestionProductos.setBackground(new java.awt.Color(211, 10, 20));
        btnGestionProductos.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnGestionProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario.png"))); // NOI18N
        btnGestionProductos.setText("GESTION DE PRODUCTOS");
        btnGestionProductos.setBorder(null);
        btnGestionProductos.setPreferredSize(new java.awt.Dimension(300, 23));
        btnGestionProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionProductosActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(211, 10, 20));
        btnCerrarSesion.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnGestionClientes.setBackground(new java.awt.Color(211, 10, 20));
        btnGestionClientes.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnGestionClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        btnGestionClientes.setText("GESTION DE CLIENTES");
        btnGestionClientes.setBorder(null);
        btnGestionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionClientesActionPerformed(evt);
            }
        });

        btnInformes.setBackground(new java.awt.Color(211, 10, 20));
        btnInformes.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnInformes.setForeground(new java.awt.Color(255, 255, 255));
        btnInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        btnInformes.setText("INFORMES");
        btnInformes.setBorder(null);
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-erickson.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO ADMINISTRADOR");

        btnGestionPersonal.setBackground(new java.awt.Color(211, 10, 20));
        btnGestionPersonal.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnGestionPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleados 3.png"))); // NOI18N
        btnGestionPersonal.setText("GESTION DE PERSONAL");
        btnGestionPersonal.setBorder(null);
        btnGestionPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionPersonalActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(211, 10, 20));
        btnInicio.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-de-inicio.png"))); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotonesLayout = new javax.swing.GroupLayout(pnBotones);
        pnBotones.setLayout(pnBotonesLayout);
        pnBotonesLayout.setHorizontalGroup(
            pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotonesLayout.createSequentialGroup()
                .addGroup(pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnBotonesLayout.createSequentialGroup()
                        .addGroup(pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBotonesLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(logoEmpresa))
                            .addGroup(pnBotonesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnGestionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnBotonesLayout.setVerticalGroup(
            pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotonesLayout.createSequentialGroup()
                .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 600));

        pnVariable.setBackground(new java.awt.Color(255, 255, 255));
        pnVariable.setMaximumSize(new java.awt.Dimension(700, 600));
        pnVariable.setMinimumSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout pnVariableLayout = new javax.swing.GroupLayout(pnVariable);
        pnVariable.setLayout(pnVariableLayout);
        pnVariableLayout.setHorizontalGroup(
            pnVariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        pnVariableLayout.setVerticalGroup(
            pnVariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(pnVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionPersonalActionPerformed
        // TODO add your handling code here:
        mostrarPanel(pnGestionEmpleados);
    }//GEN-LAST:event_btnGestionPersonalActionPerformed

    private void btnGestionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionClientesActionPerformed
        // TODO add your handling code here:
        mostrarPanel(pnGestionClientes);
    }//GEN-LAST:event_btnGestionClientesActionPerformed

    private void btnGestionProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionProductosActionPerformed
        // TODO add your handling code here:
        mostrarPanel(pnGestionProductos);
    }//GEN-LAST:event_btnGestionProductosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        mostrarPanel(pnInicio);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
        mostrarPanel(pnAuxiliar);
        
    }//GEN-LAST:event_btnInformesActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        Jfrm_Login login = new Jfrm_Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    @Override
    public void mostrarPanel(JPanel p) {
        p.setSize(700, 600);
        p.setLocation(0, 0);
        //agregamos los paneles al panel "panVariable"
        pnVariable.removeAll();
        pnVariable.add(p, BorderLayout.CENTER);
        pnVariable.revalidate();
        pnVariable.repaint();
    }
    
    

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
            java.util.logging.Logger.getLogger(Jfrm_MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfrm_MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfrm_MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfrm_MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jfrm_MenuAdministrador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGestionClientes;
    private javax.swing.JButton btnGestionPersonal;
    private javax.swing.JButton btnGestionProductos;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JPanel pnBotones;
    private javax.swing.JPanel pnVariable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void placeHolder() {
    }

    @Override
    public void agregar() {
    }

}
