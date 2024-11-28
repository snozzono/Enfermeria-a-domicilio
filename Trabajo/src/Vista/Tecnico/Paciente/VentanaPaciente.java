package Vista.Tecnico.Paciente;

import Controlador.BBDDDAO;
import Controlador.PacienteDAO;
import Modelo.BBDD;
import Modelo.Paciente;
import Modelo.Tecnico;
import Vista.Administrador.VentanaAdministradorIngresarEliminar;
import Vista.VentanaPrincipal;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.Tecnico.Paciente.ProcedimientosMedicamentos.VentanaMain;

public class VentanaPaciente extends javax.swing.JFrame {

    BBDD bd = new BBDD();
    BBDDDAO bdao = new BBDDDAO();
    PacienteDAO pacDAO = new PacienteDAO();
    Paciente paciente = new Paciente();

    /**
     * Creates new form VentanaPaciente
     */
    public VentanaPaciente() {
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

        btnRevisar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPaciente = new javax.swing.JTable();
        jbcPacientes = new javax.swing.JComboBox<>();
        btnCrearPaciente = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRevisar.setText("Revisar");
        btnRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActionPerformed(evt);
            }
        });

        btnEliminar.setText("dar de alta");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jtPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "run del paciente", "nombre", "diagnostico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtPaciente);

        jbcPacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jbcPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcPacientesActionPerformed(evt);
            }
        });

        btnCrearPaciente.setText("Crear Paciente");
        btnCrearPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPacienteActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar por RUN");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCrearPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbcPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRevisar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnRevisar)
                    .addComponent(jbcPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnCrearPaciente))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String usuarioSeleccionado = (String) jbcPacientes.getSelectedItem();
            if (usuarioSeleccionado != null) {
                boolean eliminado = pacDAO.eliminarPaciente(usuarioSeleccionado); //quizá deberia modificar esto para que pase por la bd y no por codigo 
                if (eliminado) {
                    // actualizar tabla
                    JOptionPane.showMessageDialog(this, "El técnico fue eliminado exitosamente.");
                    DefaultTableModel modelo = (DefaultTableModel) jtPaciente.getModel();
                    modelo.setRowCount(0); // Limpiar tabla
                    ArrayList<Paciente> lista = pacDAO.obtenerTodos();
                    for (Paciente tmp : lista) {
                        modelo.addRow(new Object[]{tmp.getRun_pac(), tmp.getNombre_p(), tmp.getDiagn()});
                    }
                    // actualizar combobox
                   llenarjbcPacientes();
                } else {
                    JOptionPane.showMessageDialog(this, "Hubo un error al eliminar el paciente.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un paciente para eliminar.");
            }
        } catch (HeadlessException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "e.");
        }
     }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCrearPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPacienteActionPerformed
        // TODO add your handling code here:
        VentanaCrearPaciente VCP = new VentanaCrearPaciente();

        VCP.setResizable(false);
        VCP.setLocationRelativeTo(null);
        VCP.setTitle("Crear paciente");
        VCP.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        VCP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearPacienteActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        if (bd.getOrigen() == 1) {
            VentanaPrincipal VP = new VentanaPrincipal();

            VP.setResizable(false);
            VP.setLocationRelativeTo(null);
            VP.setTitle("Inicio");
            VP.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

            VP.setVisible(true);
            dispose();
        } else if (bd.getOrigen() == 0) {
            VentanaAdministradorIngresarEliminar VAIE = new VentanaAdministradorIngresarEliminar();

            VAIE.setResizable(false);
            VAIE.setLocationRelativeTo(null);
            VAIE.setTitle("Técnicos");
            VAIE.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

            VAIE.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnVolverActionPerformed


    private void jbcPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcPacientesActionPerformed
       
    }//GEN-LAST:event_jbcPacientesActionPerformed

    public void llenarjbcPacientes() {
         jbcPacientes.setEnabled(true);
        jbcPacientes.removeAllItems();
        ArrayList<Paciente> listaPacientes = pacDAO.obtenerTodos();
        for (Paciente temp : listaPacientes) {
            jbcPacientes.addItem(String.valueOf(temp.getRun_pac()));
        }
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {

            DefaultTableModel modelo = (DefaultTableModel) this.jtPaciente.getModel();
            modelo.setRowCount(0); // Limpiar tabla
            String textoBuscar = txtBuscar.getText().trim();

            if (textoBuscar.isEmpty()) {

                ArrayList<Paciente> lista = pacDAO.obtenerTodos();
                for (Paciente tmp : lista) {
                    modelo.addRow(new Object[]{tmp.getRun_pac(), tmp.getNombre_p(), tmp.getDiagn()});
                }
                //barra con texto
            } else {
                int runTec = Integer.parseInt(textoBuscar);
                Paciente paciente = pacDAO.buscarPac(runTec);
                if (paciente != null) {
                    modelo.addRow(new Object[]{paciente.getRun_pac(), paciente.getNombre_p(), paciente.getDiagn()});
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un paciente con el RUN ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            llenarjbcPacientes();
            
        } catch (NumberFormatException e) {
            // Mostrar mensaje si el texto ingresado no es un número
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de búsqueda.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            // Capturar errores generales para evitar bloqueos
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActionPerformed
        String a = jbcPacientes.getSelectedItem().toString();
        bd.setPaciente(Integer.parseInt(a));
        bdao.modificarPaciente(bd);

        VentanaMain VM = new VentanaMain();

        VM.setResizable(false);
        VM.setLocationRelativeTo(null);
        VM.setTitle("Tratamientos");
        VM.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        VM.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRevisarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearPaciente;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRevisar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jbcPacientes;
    private javax.swing.JTable jtPaciente;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
