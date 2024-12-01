package Vista.Administrador;

import Controlador.TecnicoDAO;
import Modelo.Tecnico;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class VentanaAdministradorCrearTecnico extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAdministradorCrearTecnico
     */
    public VentanaAdministradorCrearTecnico() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        brnCrear = new javax.swing.JButton();
        txtRut = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pswdCrearTec = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Rut");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        brnCrear.setText("Crear");
        brnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCrearActionPerformed(evt);
            }
        });

        jLabel4.setText("Creacion de usuarios");

        pswdCrearTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdCrearTecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brnCrear)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pswdCrearTec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(pswdCrearTec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(brnCrear))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCrearActionPerformed
        int rut;
        String usuario;
        char[] contrasenia;

        rut = Integer.parseInt(txtRut.getText());
        usuario = txtUsuario.getText();
        contrasenia = pswdCrearTec.getPassword();

        Tecnico tec = new Tecnico(rut, usuario, contrasenia);
        /*TecnicoDAO tecDAO = new TecnicoDAO();  

        if (txtRut.getText()
                .length() > 0 && txtUsuario.getText().length() > 0 && Arrays.toString(pswdCrearTec.getPassword()).length() > 0) {
            if (tecDAO.validar(usuario, contrasenia,) == null) {
                tecDAO.ingresarTecnico(tec);
                JOptionPane.showMessageDialog(this, "Tecnico añadido correctamente");
                VentanaAdministradorIngresarEliminar VAIE = new VentanaAdministradorIngresarEliminar();

                VAIE.setResizable(false);
                VAIE.setLocationRelativeTo(null);
                VAIE.setTitle("Técnicos");
                VAIE.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                VAIE.setVisible(true);

                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingresa datos validos porfavor");
        }*/
    }//GEN-LAST:event_brnCrearActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        VentanaAdministradorIngresarEliminar VAIE = new VentanaAdministradorIngresarEliminar();

        VAIE.setResizable(false);
        VAIE.setLocationRelativeTo(null);
        VAIE.setTitle("Técnicos");
        VAIE.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        VAIE.setVisible(true);

        VAIE.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void pswdCrearTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdCrearTecActionPerformed
    }//GEN-LAST:event_pswdCrearTecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCrear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pswdCrearTec;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
