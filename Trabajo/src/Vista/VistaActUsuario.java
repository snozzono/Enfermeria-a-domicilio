package Vista;

import Controlador.AdministradorDAO;
import Controlador.Conexion;
import Controlador.TecnicoDAO;
import Modelo.Administrador;
import Modelo.Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaActUsuario extends javax.swing.JFrame {

    public VistaActUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChoice = new javax.swing.ButtonGroup();
        TESTpopup = new javax.swing.JPopupMenu();
        llbUsuario = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        pswdActuser = new javax.swing.JPasswordField();
        btnChoiceAdmin = new javax.swing.JRadioButton();
        btnChoiceTec = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNewUser = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        pswdUpdate = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enfermería a domicilio - Actualizar datos");
        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(500, 650));
        setName("VActUsuario"); // NOI18N
        setSize(new java.awt.Dimension(500, 650));

        llbUsuario.setText("Usuario");

        lblPass.setText("Contraseña");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnLogin.setText("Verificar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        pswdActuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdActuserActionPerformed(evt);
            }
        });

        btnChoice.add(btnChoiceAdmin);
        btnChoiceAdmin.setText("Soy administrador");
        btnChoiceAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoiceAdminActionPerformed(evt);
            }
        });

        btnChoice.add(btnChoiceTec);
        btnChoiceTec.setText("Soy técnico");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Verificar datos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Modificar datos");

        jLabel3.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel4.setText("Nuevo Usuario");

        jLabel5.setText("Nueva Contraseña");

        txtNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewUserActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnChoiceTec)
                                .addGap(30, 30, 30))
                            .addComponent(btnChoiceAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblPass)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pswdActuser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(llbUsuario))
                        .addGap(0, 132, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(txtID)
                                    .addComponent(pswdUpdate))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llbUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(pswdActuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnChoiceAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChoiceTec)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pswdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnVolver))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String user;
        char[] psswd;
        user = txtUsuario.getText();
        psswd = pswdActuser.getPassword();
        boolean logged = false;

        String str = new String(psswd);

        if (btnChoiceAdmin.isSelected()) {
            AdministradorDAO admDAO;
            admDAO = new AdministradorDAO();

            String query = "Select id_admin from tbAdministrador WHERE usuario = ? AND passwrd = ?";

            int ID = admDAO.validar(user, psswd, query, admDAO);

            if (ID != 1) {
                txtID.setText(String.valueOf(ID));
                txtID.setEnabled(false);
            }

            logged = true;

        } else if (btnChoiceTec.isSelected()) {
            TecnicoDAO tecDAO;
            tecDAO = new TecnicoDAO();

            String query = "Select run_tec from tbTecnico WHERE usuario = ? AND passwrd = ?";

            int ID = tecDAO.validar(user, psswd, query, tecDAO);
            if (ID != 1) {
                txtID.setText(String.valueOf(ID));
                txtID.setEnabled(false);
            }
            logged = true;
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de usuario.");
            btnChoiceAdmin.requestFocus();
        }
        if (logged) {
            txtUsuario.setEnabled(false);
            pswdActuser.setEnabled(false);

            btnLogin.setEnabled(false);
        } else if (logged == false) {
            JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void pswdActuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdActuserActionPerformed
    }//GEN-LAST:event_pswdActuserActionPerformed

    private void btnChoiceAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoiceAdminActionPerformed
    }//GEN-LAST:event_btnChoiceAdminActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String user, str1, code;
        char[] pass;
        int id;

        user = txtNewUser.getText();
        pass = pswdUpdate.getPassword();
        str1 = new String(pass);

        code = txtID.getText();
        id = Integer.valueOf(code);

        if (btnChoiceAdmin.isSelected()) {
            String query = "update tbAdministrador set Usuario=?,Passwrd=? where id_admin=?";

            Administrador adm = new Administrador(id, user, pass);
            AdministradorDAO admDAO = new AdministradorDAO();

            if (admDAO.modificar(admDAO, query, user, str1, id)) {
                JOptionPane.showMessageDialog(this, "Modificado con éxito.");

                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error.");
                txtNewUser.setText("");
                pswdUpdate.setText("");

                txtNewUser.requestFocus();
            }
        } else if (btnChoiceTec.isSelected()) {
            Tecnico tec = new Tecnico(id, user, pass);
            TecnicoDAO tecDAO = new TecnicoDAO();

            String query = "update tbTecnico set Usuario=?,Passwrd=? where run_tec=?";

            if (tecDAO.modificar(tecDAO, query, user, str1, id)) {
                JOptionPane.showMessageDialog(this, "Modificado con éxito.");

                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error.");

                txtNewUser.setText("");
                pswdUpdate.setText("");

                txtNewUser.requestFocus();
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewUserActionPerformed
    }//GEN-LAST:event_txtNewUserActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu TESTpopup;
    private javax.swing.ButtonGroup btnChoice;
    private javax.swing.JRadioButton btnChoiceAdmin;
    private javax.swing.JRadioButton btnChoiceTec;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel llbUsuario;
    private javax.swing.JPasswordField pswdActuser;
    private javax.swing.JPasswordField pswdUpdate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNewUser;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
