package Vista;

import Controlador.*;
import Modelo.Administrador;
import Modelo.BBDD;
import Modelo.Tecnico;
import Vista.Tecnico.Paciente.VentanaPaciente;
import javax.swing.JOptionPane;
import Vista.Administrador.VentanaAdministradorIngresarEliminar;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnLimpiar = new javax.swing.JButton();
        mnbrVP = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuActDatos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuDatos = new javax.swing.JMenu();
        menuResumen = new javax.swing.JMenu();
        menuDoc = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enfermería a domicilio");
        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(750, 650));
        setName("VPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 650));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        txtUsuario.setText(" ");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        mnbrVP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenu1.setText("Usuario");

        menuActDatos.setText("Actualizar datos");
        menuActDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActDatosActionPerformed(evt);
            }
        });
        jMenu1.add(menuActDatos);

        jMenuItem3.setText("Cerrar sesión");
        jMenu1.add(jMenuItem3);

        mnbrVP.add(jMenu1);

        menuDatos.setText("Datos");
        mnbrVP.add(menuDatos);

        menuResumen.setText("Resumen");
        mnbrVP.add(menuResumen);

        menuDoc.setText("Ayuda");
        mnbrVP.add(menuDoc);

        setJMenuBar(mnbrVP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtContraseña))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt){
    }
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String user;
        char[] psswd;
        user = txtUsuario.getText();
        psswd = txtContraseña.getPassword();

        Administrador admin;
        AdministradorDAO admDAO = new AdministradorDAO();

        Tecnico tecno;
        TecnicoDAO tecnoDAO = new TecnicoDAO();

        BBDDDAO bd = new BBDDDAO();
        BBDD bede = new BBDD();

        bede.setOrigen(1);
        
        if (admDAO.validar(user, psswd) != null) {
            VentanaAdministradorIngresarEliminar VAIE = new VentanaAdministradorIngresarEliminar();

            VAIE.setResizable(false);
            VAIE.setLocationRelativeTo(null);
            VAIE.setTitle("Técnicos");
            VAIE.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

            admin = admDAO.validar(user, psswd);

            bede.setAdministrador(admin.getId_admin());
            bd.modificarAdministrador(bede);

            JOptionPane.showMessageDialog(this, "Bienvenido, administrador.");
            VAIE.setVisible(true);
            dispose();
        } else if (tecnoDAO.validar(user, psswd) != null) {
            VentanaPaciente VP = new VentanaPaciente();

            VP.setResizable(false);
            VP.setLocationRelativeTo(null);
            VP.setTitle("Pacientes");
            VP.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

            tecno = tecnoDAO.validar(user, psswd);

            bede.setTecnico(tecno.getRun_tec());
            bd.modificarTecnico(bede);

            JOptionPane.showMessageDialog(this, "Bienvenido, técnico.");
            VP.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña no válidos");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void menuActDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActDatosActionPerformed
        VistaActUsuario actUsuario;
        actUsuario = new VistaActUsuario();

        actUsuario.setLocationRelativeTo(null);

        actUsuario.setVisible(true);
    }//GEN-LAST:event_menuActDatosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtUsuario.setText("");
        txtContraseña.setText("");
        
        txtUsuario.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal v = new VentanaPrincipal();

        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setTitle("Inicio");
        v.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        v.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem menuActDatos;
    private javax.swing.JMenu menuDatos;
    private javax.swing.JMenu menuDoc;
    private javax.swing.JMenu menuResumen;
    private javax.swing.JMenuBar mnbrVP;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
