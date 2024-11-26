package Vista.Tecnico.Paciente.ProcedimientosMedicamentos;

import Controlador.MedicamentoDAO;
import Controlador.ProcedimientoDAO;
import Modelo.Medicamento;
import Modelo.Procedimiento;
import Modelo.Tecnico;
import Vista.Tecnico.Paciente.VentanaPaciente;
import java.awt.HeadlessException;
import java.util.ArrayList;
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre ", "Cuanto, cada cuanto", "Hasta cuando"
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

        jcbMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuscarPro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jcbProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminarProcedimiento))
                                    .addComponent(btnAgregarMedicamento))
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarMedicamento)
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
        VP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProcedimientoActionPerformed
        try {
            String usuarioSeleccionado = (String) jcbProcedimiento.getSelectedItem();
            if (usuarioSeleccionado != null) {
                boolean eliminado = proceDAO.eliminarProcedimiento(usuarioSeleccionado); //quizá deberia modificar esto para que pase por la bd y no por codigo 
                if (eliminado) {
                    // actualizar tabla
                    JOptionPane.showMessageDialog(this, "El procedimiento fue eliminado exitosamente.");
                    DefaultTableModel modelo = (DefaultTableModel) jtProcedimiento.getModel();
                    modelo.setRowCount(0); // Limpiar tabla
                    ArrayList<Procedimiento> lista = proceDAO.obtenerTodos();
                    for (Procedimiento tmp : lista) {
                        modelo.addRow(new Object[]{tmp.getId_pr(), tmp.getPrecio(), tmp.getNombre(), tmp.getDescr(), tmp.isPago(), tmp.getFecha()});
                    }
                    // actualizar combobox
                    jcbProcedimiento.removeAllItems(); // Limpiar los items previos

                    // Obtener la lista de técnicos
                    ArrayList<Procedimiento> listaTecnicos = proceDAO.obtenerTodos();

                    // Añadir los usuarios al JComboBox
                    for (Procedimiento tecnico : listaTecnicos) {
                        jcbProcedimiento.addItem(String.valueOf(tecnico.getId_pr()));  // Asumimos que getUsuario() devuelve el nombre de usuario
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Hubo un error al eliminar el procedimiento.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un procedimiento para eliminar.");
            }
        } catch (HeadlessException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "e.");
        }
    }//GEN-LAST:event_btnEliminarProcedimientoActionPerformed

    private void btnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProActionPerformed

        try {

            DefaultTableModel modelo = (DefaultTableModel) this.jtProcedimiento.getModel();
            modelo.setRowCount(0); // Limpiar tabla
            String textoBuscar = txtBuscarPro.getText().trim();

            if (textoBuscar.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo de búsqueda está vacío. Mostrando todos los procedimientos.", "Información", JOptionPane.INFORMATION_MESSAGE);

                ArrayList<Procedimiento> lista = new ArrayList<>();
                lista = proceDAO.obtenerTodos();
                for (Procedimiento tmp : lista) {
                    modelo.addRow(new Object[]{tmp.getId_pr(), tmp.getFecha(), tmp.getNombre(), tmp.getDescr(), tmp.getPrecio(), tmp.isPago()});
                }
                //barra con texto
            } else {
                int runTec = Integer.parseInt(textoBuscar);
                proce = proceDAO.BuscarProcedimiento(runTec);
                if (proce != null) {
                    modelo.addRow(new Object[]{proce.getId_pr(), proce.getPrecio(), proce.getNombre(), proce.getDescr(), proce.isPago(), proce.getFecha()});
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
      }//GEN-LAST:event_btnBuscarProActionPerformed

    private void btnBuscarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMedActionPerformed
        try {

            DefaultTableModel modelo = (DefaultTableModel) this.jtMedicamento.getModel();
            modelo.setRowCount(0); // Limpiar tabla
            String textoBuscar = txtBuscarPro.getText().trim();

            if (textoBuscar.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo de búsqueda está vacío. Mostrando todos los medicamentos.", "Información", JOptionPane.INFORMATION_MESSAGE);

                ArrayList<Medicamento> lista = new ArrayList<>();
                lista = medDAO.obtenerTodos();
                for (Medicamento tmp : lista) {
                    modelo.addRow(new Object[]{tmp.isCronico(), tmp.getCiclo(), tmp.getId_med(), tmp.getNombre_med(), tmp.getTomar()});
                }
                //barra con texto
            } else {
                int runTec = Integer.parseInt(textoBuscar);
                med = medDAO.BuscarMedicamento(runTec);
                if (med != null) {
                    modelo.addRow(new Object[]{med.isCronico(), med.getCiclo(), med.getId_med(), med.getNombre_med(), med.getTomar()});
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
     }//GEN-LAST:event_btnBuscarMedActionPerformed

    private void jcbProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProcedimientoActionPerformed
        jcbProcedimiento.removeAllItems();

        ArrayList<Procedimiento> listaTecnicos = proceDAO.obtenerTodos();

        if (listaTecnicos != null && !listaTecnicos.isEmpty()) {
            for (Procedimiento temp : listaTecnicos) {
                jcbProcedimiento.addItem(String.valueOf(temp.getId_pr()));
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay procedimientos registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        jcbProcedimiento.revalidate();
        jcbProcedimiento.repaint();


    }//GEN-LAST:event_jcbProcedimientoActionPerformed

    private void btnAgregarProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProcedimientoActionPerformed
        VentanaCrearProcedimiento VCP = new VentanaCrearProcedimiento();
        VCP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarProcedimientoActionPerformed

    private void btnAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoActionPerformed
        VentanaCrearMedicamento VCM = new VentanaCrearMedicamento();
        VCM.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarMedicamentoActionPerformed

    private void jcbMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMedicamentoActionPerformed
        jcbMedicamento.removeAllItems();

        ArrayList<Medicamento> listaMedicamentos = medDAO.obtenerTodos();

        if (listaMedicamentos != null && !listaMedicamentos.isEmpty()) {
            for (Medicamento temp : listaMedicamentos) {
                jcbMedicamento.addItem(String.valueOf(temp.getId_med()));
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay Medicamentos registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        jcbMedicamento.revalidate();
        jcbMedicamento.repaint();

    }//GEN-LAST:event_jcbMedicamentoActionPerformed

    private void btnEliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedicamentoActionPerformed
        try {
            String usuarioSeleccionado = (String) jcbMedicamento.getSelectedItem();
            if (usuarioSeleccionado != null) {
                boolean eliminado = medDAO.eliminarMedicamento(usuarioSeleccionado); //quizá deberia modificar esto para que pase por la bd y no por codigo 
                if (eliminado) {
                    // actualizar tabla
                    JOptionPane.showMessageDialog(this, "El medicamento fue eliminado exitosamente.");
                    DefaultTableModel modelo = (DefaultTableModel) jtMedicamento.getModel();
                    modelo.setRowCount(0); // Limpiar tabla
                    ArrayList<Medicamento> lista = medDAO.obtenerTodos();
                    for (Medicamento tmp : lista) {
                        modelo.addRow(new Object[]{tmp.isCronico(), tmp.getCiclo(), tmp.getId_med(), tmp.getNombre_med(), tmp.getTomar()});
                    }
                    // actualizar combobox
                    jcbMedicamento.removeAllItems(); // Limpiar los items previos

                    // Obtener la lista de técnicos
                    ArrayList<Medicamento> listaTecnicos = medDAO.obtenerTodos();

                    // Añadir los usuarios al JComboBox
                    for (Medicamento tecnico : listaTecnicos) {
                        jcbMedicamento.addItem(String.valueOf(tecnico.getId_med()));  // Asumimos que getUsuario() devuelve el nombre de usuario
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Hubo un error al eliminar el medicamento.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un medicamento para eliminar.");
            }
        } catch (HeadlessException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "e.");
        }
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
