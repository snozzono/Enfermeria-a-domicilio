package Vista.Tecnico.Paciente.ProcedimientosMedicamentos;

import Controlador.MedicamentoDAO;
import Controlador.ProcedimientoDAO;
import Modelo.Medicamento;
import Modelo.Procedimiento;
import Modelo.Tecnico;
import Vista.Tecnico.Paciente.VentanaPaciente;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaMain extends javax.swing.JFrame {

    Procedimiento proce = new Procedimiento();
    ProcedimientoDAO proceDAO = new ProcedimientoDAO();
    Medicamento med = new Medicamento();
    MedicamentoDAO medDAO = new MedicamentoDAO();

    /**
     * Creates new form VentanaMain
     */
    public VentanaMain() {
        initComponents();

        llenarjcbMedicamento();
        llnearjcbProcedimiento();

        /*
        llenarjcbMedicamento();
        llnearjcbProcedimiento();
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtMedicamento = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProcedimiento = new javax.swing.JTable();
        jcbMedicamento = new javax.swing.JComboBox<>();
        jcbProcedimiento = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnAgregarMedicamento = new javax.swing.JButton();
        btnEliminarMedicamento = new javax.swing.JButton();
        btnAgregarProcedimiento = new javax.swing.JButton();
        btnEliminarProcedimiento = new javax.swing.JButton();
        btnBuscarPro = new javax.swing.JButton();
        txtBuscarPro = new javax.swing.JTextField();
        btnBuscarMed = new javax.swing.JButton();
        txtBuscarMed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cronico?", "Cada cuantas horas?", "ID", "Nombre ", "Hasta cuando"
            }
        ));
        jScrollPane1.setViewportView(jtMedicamento);

        jtProcedimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Nombre", "Descripción", "Precio", "Pagó?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtProcedimiento);

        jcbMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jcbMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMedicamentoActionPerformed(evt);
            }
        });

        jcbProcedimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProcedimientoActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAgregarMedicamento.setText("Agregar medicamento");
        btnAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicamentoActionPerformed(evt);
            }
        });

        btnEliminarMedicamento.setText("Eliminar");
        btnEliminarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMedicamentoActionPerformed(evt);
            }
        });

        btnAgregarProcedimiento.setText("Agregar procedimiento");
        btnAgregarProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProcedimientoActionPerformed(evt);
            }
        });

        btnEliminarProcedimiento.setText("Eliminar");
        btnEliminarProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProcedimientoActionPerformed(evt);
            }
        });

        btnBuscarPro.setText("Buscar por ID");
        btnBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProActionPerformed(evt);
            }
        });

        btnBuscarMed.setText("Buscar por ID");
        btnBuscarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregarProcedimiento)
                                    .addComponent(btnAgregarMedicamento))
                                .addGap(0, 480, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarMedicamento)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarProcedimiento)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarMedicamento)
                    .addComponent(btnBuscarMed)
                    .addComponent(txtBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAgregarMedicamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProcedimiento)
                    .addComponent(btnBuscarPro)
                    .addComponent(txtBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAgregarProcedimiento)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        VentanaPaciente VP = new VentanaPaciente();

        VP.setResizable(false);
        VP.setLocationRelativeTo(null);
        VP.setTitle("Pacientes");
        VP.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        VP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProcedimientoActionPerformed

        String usuarioSeleccionado = (String) jcbProcedimiento.getSelectedItem();
        if (proceDAO.obtenerTodos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay nada para eliminar");
        }
        else {
        if (usuarioSeleccionado != null) {
            try {
                proceDAO.eliminarProcedimiento(usuarioSeleccionado); //quizá deberia modificar esto para que pase por la bd y no por codigo 
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "El procedimiento fue eliminado exitosamente.");
            llnearjcbProcedimiento();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Elige el id de algún procedimiento primero");
        }}

    }//GEN-LAST:event_btnEliminarProcedimientoActionPerformed

    private void btnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProActionPerformed

        String textoBuscar = txtBuscarPro.getText().trim();
        if (proceDAO.obtenerTodos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay procedimientos registrados");

        } else {
            if (textoBuscar.isEmpty()) {

                llnearjcbProcedimiento();

            } else {

                int id = Integer.parseInt(textoBuscar);

                proce = proceDAO.BuscarProcedimiento(id);
                if (proce != null) {
                    jcbProcedimiento.removeAllItems();
                    DefaultTableModel modelo = (DefaultTableModel) jtProcedimiento.getModel();
                    modelo.setRowCount(0); // Limpiar tabla
                    modelo.addRow(new Object[]{proce.getId_pr(), proce.getPrecio(), proce.getNombre(), proce.getDescr(), proce.isPago(), proce.getFecha()});
                    jcbProcedimiento.addItem(String.valueOf(proce.getId_pr()));

                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un Medicamento con el ID ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        /*
        try {

            DefaultTableModel modelo = (DefaultTableModel) this.jtProcedimiento.getModel();
            modelo.setRowCount(0); // Limpiar tabla
            String textoBuscar = txtBuscarPro.getText().trim();

            if (textoBuscar.isEmpty()) {

                llnearjcbProcedimiento();
                //barra con texto
            } else {
                int runTec = Integer.parseInt(textoBuscar);
                proce = proceDAO.BuscarProcedimiento(runTec);
                if (proce != null) {
                    modelo.addRow(new Object[]{proce.getId_pr(), proce.getPrecio(), proce.getNombre(), proce.getDescr(), proce.isPago(), proce.getFecha()});
                    llnearjcbProcedimiento();
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un procedimiento con el ID ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            // Mostrar mensaje si el texto ingresado no es un número
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de búsqueda.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            // Capturar errores generales para evitar bloqueos
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
         */
      }//GEN-LAST:event_btnBuscarProActionPerformed

    private void btnBuscarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMedActionPerformed

        String textoBuscar = txtBuscarMed.getText().trim();

        if (medDAO.obtenerTodos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, ("El paciente no tiene medicamentos registrados"));
        } else {
            if (textoBuscar.isEmpty()) {

                llenarjcbMedicamento();

            } else {

                int id = Integer.parseInt(textoBuscar);

                med = medDAO.BuscarMedicamento(id);
                if (med != null) {
                    jcbMedicamento.removeAllItems();
                    DefaultTableModel modelo = (DefaultTableModel) jtMedicamento.getModel();
                    modelo.setRowCount(0);
                    modelo.addRow(new Object[]{med.isCronico(), med.getCiclo(), med.getId_med(), med.getNombre_med(), med.getTomar()});
                    jcbMedicamento.addItem(String.valueOf(med.getId_med()));

                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un Medicamento con el ID ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    jcbMedicamento.removeAllItems();
                }
            }
        }


        /*
        try {

            DefaultTableModel modelo = (DefaultTableModel) this.jtMedicamento.getModel();
            modelo.setRowCount(0); // Limpiar tabla
            String textoBuscar = txtBuscarPro.getText().trim();

            if (textoBuscar.isEmpty()) {

                ArrayList<Medicamento> lista = medDAO.obtenerTodos();
                for (Medicamento tmp : lista) {
                    modelo.addRow(new Object[]{tmp.isCronico(), tmp.getCiclo(), tmp.getId_med(), tmp.getNombre_med(), tmp.getTomar()});
                }
                llenarjcbMedicamento();
                //barra con texto
            } else {
                int runTec = Integer.parseInt(textoBuscar);
                med = medDAO.BuscarMedicamento(runTec);
                if (med != null) {
                    modelo.addRow(new Object[]{med.isCronico(), med.getCiclo(), med.getId_med(), med.getNombre_med(), med.getTomar()});
                    llenarjcbMedicamento();
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un Medicamento con el ID ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            // Mostrar mensaje si el texto ingresado no es un número
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de búsqueda.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            // Capturar errores generales para evitar bloqueos
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
         */
     }//GEN-LAST:event_btnBuscarMedActionPerformed

    private void jcbProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProcedimientoActionPerformed


    }//GEN-LAST:event_jcbProcedimientoActionPerformed

    private void llnearjcbProcedimiento() {

        DefaultTableModel modelo = (DefaultTableModel) jtProcedimiento.getModel();
        modelo.setRowCount(0); // Limpiar tabla
        ArrayList<Procedimiento> lista = new ArrayList<>();
        lista = proceDAO.obtenerTodos();
        for (Procedimiento tmp : lista) {
            modelo.addRow(new Object[]{tmp.getId_pr(), tmp.getFecha(), tmp.getNombre(), tmp.getDescr(), tmp.getPrecio(), tmp.isPago()});
        }

        ArrayList<Procedimiento> listaTecnicos = proceDAO.obtenerTodos();
        jcbProcedimiento.removeAllItems();
        for (Procedimiento temp : listaTecnicos) {
            jcbProcedimiento.addItem(String.valueOf(temp.getId_pr()));

            jcbProcedimiento.revalidate();
            jcbProcedimiento.repaint();

        }

    }
    private void btnAgregarProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProcedimientoActionPerformed
        VentanaCrearProcedimiento VCP = new VentanaCrearProcedimiento();

        VCP.setResizable(false);
        VCP.setLocationRelativeTo(null);
        VCP.setTitle("Crear procedimiento");
        VCP.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        VCP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarProcedimientoActionPerformed

    private void btnAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoActionPerformed
        VentanaCrearMedicamento VCM = new VentanaCrearMedicamento();

        VCM.setResizable(false);
        VCM.setLocationRelativeTo(null);
        VCM.setTitle("Crear medicamento");
        VCM.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        VCM.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarMedicamentoActionPerformed

    private void jcbMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMedicamentoActionPerformed

    }//GEN-LAST:event_jcbMedicamentoActionPerformed

    public void llenarjcbMedicamento() {

        DefaultTableModel modelo = (DefaultTableModel) jtMedicamento.getModel();
        modelo.setRowCount(0); // Limpiar tabla
        ArrayList<Medicamento> lista = medDAO.obtenerTodos();
        for (Medicamento tmp : lista) {
            modelo.addRow(new Object[]{tmp.isCronico(), tmp.getCiclo(), tmp.getId_med(), tmp.getNombre_med(), tmp.getTomar()});

            ArrayList<Medicamento> listaMedicamentos = medDAO.obtenerTodos();
            jcbMedicamento.removeAllItems();
            for (Medicamento temp : listaMedicamentos) {
                jcbMedicamento.addItem(String.valueOf(temp.getId_med()));

                jcbMedicamento.revalidate();
                jcbMedicamento.repaint();

            }
        }
    }

    private void btnEliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedicamentoActionPerformed

        if (medDAO.obtenerTodos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay medicamentos para eliminar");
        } else {
            String run = jcbMedicamento.getSelectedItem().toString();

            if (run == null) {
                JOptionPane.showMessageDialog(rootPane, "Elige el id de algún medicamento porfavor");
            } else {
                try {
                    String medicamento = medDAO.BuscarMedicamento(Integer.parseInt(run)).getNombre_med();
                    medDAO.eliminarMedicamento(run);
                    JOptionPane.showMessageDialog(rootPane, (medicamento + " eliminad@ correctamente"));
                    llenarjcbMedicamento();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VentanaMain.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        /*
            try {
            String usuarioSeleccionado = (String) jcbMedicamento.getSelectedItem();
            if (usuarioSeleccionado != null) {
            medDAO.eliminarMedicamento(usuarioSeleccionado); //quizá deberia modificar esto para que pase por la bd y no por codigo
            // actualizar tabla
            JOptionPane.showMessageDialog(this, "El medicamento fue eliminado exitosamente.");

            }
            // actualizar combobox
            llenarjcbMedicamento();
            
            } else {
            JOptionPane.showMessageDialog(this, "Hubo un error al eliminar el medicamento.");
            }
            } catch (HeadlessException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "e.");
            }
            
         */

    }//GEN-LAST:event_btnEliminarMedicamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMedicamento;
    private javax.swing.JButton btnAgregarProcedimiento;
    private javax.swing.JButton btnBuscarMed;
    private javax.swing.JButton btnBuscarPro;
    private javax.swing.JButton btnEliminarMedicamento;
    private javax.swing.JButton btnEliminarProcedimiento;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbMedicamento;
    private javax.swing.JComboBox<String> jcbProcedimiento;
    private javax.swing.JTable jtMedicamento;
    private javax.swing.JTable jtProcedimiento;
    private javax.swing.JTextField txtBuscarMed;
    private javax.swing.JTextField txtBuscarPro;
    // End of variables declaration//GEN-END:variables
}
