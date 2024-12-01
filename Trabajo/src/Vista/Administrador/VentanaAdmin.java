package Vista.Administrador;

import Vista.Paciente.VentanaPaciente;
import Vista.VentanaDatos;
import Vista.VentanaLogin;
import Vista.VentanaManejoTec;
import Vista.VistaActUsuario;
import javax.swing.JOptionPane;

public class VentanaAdmin extends javax.swing.JFrame {

    public VentanaAdmin() {
        this.setTitle("Enfermería a Domicilio - Bienvenida");

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmTec = new javax.swing.JButton();
        btnAdmPac = new javax.swing.JButton();
        btnAdmPay = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAdmLogout = new javax.swing.JButton();
        mnbrVP = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        menuActDatos = new javax.swing.JMenuItem();
        menuCerrarSesion = new javax.swing.JMenuItem();
        menuNav = new javax.swing.JMenu();
        menuNavReg = new javax.swing.JMenuItem();
        menuNavPac = new javax.swing.JMenuItem();
        menuNavTec = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdmTec.setText("Técnicos");

        btnAdmPac.setText("Pacientes");

        btnAdmPay.setText("Pagos");

        jButton1.setText("Registro");

        btnAdmLogout.setText("Cerrar sesión");
        btnAdmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmLogoutActionPerformed(evt);
            }
        });

        mnbrVP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuUsuario.setText("Usuario");

        menuActDatos.setText("Actualizar datos");
        menuActDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActDatosActionPerformed(evt);
            }
        });
        menuUsuario.add(menuActDatos);

        menuCerrarSesion.setText("Cerrar sesión");
        menuCerrarSesion.setToolTipText("No hay sesión iniciada");
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        menuUsuario.add(menuCerrarSesion);

        mnbrVP.add(menuUsuario);

        menuNav.setText("Navegar");

        menuNavReg.setText("Registro");
        menuNavReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNavRegActionPerformed(evt);
            }
        });
        menuNav.add(menuNavReg);

        menuNavPac.setText("Pacientes");
        menuNavPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNavPacActionPerformed(evt);
            }
        });
        menuNav.add(menuNavPac);

        menuNavTec.setText("Técnicos");
        menuNavTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNavTecActionPerformed(evt);
            }
        });
        menuNav.add(menuNavTec);

        mnbrVP.add(menuNav);

        setJMenuBar(mnbrVP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdmLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmTec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnAdmTec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdmPac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdmPay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdmLogout)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActDatosActionPerformed
        VistaActUsuario v;
        v = new VistaActUsuario();

        v.setLocationRelativeTo(null);

        v.setVisible(true);
    }//GEN-LAST:event_menuActDatosActionPerformed

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesión?", "Cerrar sesión", JOptionPane.OK_CANCEL_OPTION);

        if (choice == 0) {
            VentanaLogin v = new VentanaLogin();

            v.setLocationRelativeTo(null);
            v.setResizable(false);
            v.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void menuNavTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNavTecActionPerformed
        VentanaManejoTec v = new VentanaManejoTec();

        v.setLocationRelativeTo(null);
        v.setResizable(false);
        v.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_menuNavTecActionPerformed

    private void menuNavRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNavRegActionPerformed
        VentanaDatos v = new VentanaDatos();

        v.setLocationRelativeTo(null);
        v.setResizable(false);
        v.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_menuNavRegActionPerformed

    private void menuNavPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNavPacActionPerformed
        VentanaPaciente v = new VentanaPaciente();

        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_menuNavPacActionPerformed

    private void btnAdmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmLogoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesión?", "Cerrar sesión", JOptionPane.OK_CANCEL_OPTION);

        if (choice == 0) {
            VentanaLogin v = new VentanaLogin();

            v.setLocationRelativeTo(null);
            v.setResizable(false);
            v.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_btnAdmLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmLogout;
    private javax.swing.JButton btnAdmPac;
    private javax.swing.JButton btnAdmPay;
    private javax.swing.JButton btnAdmTec;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem menuActDatos;
    private javax.swing.JMenuItem menuCerrarSesion;
    private javax.swing.JMenu menuNav;
    private javax.swing.JMenuItem menuNavPac;
    private javax.swing.JMenuItem menuNavReg;
    private javax.swing.JMenuItem menuNavTec;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuBar mnbrVP;
    // End of variables declaration//GEN-END:variables
}
