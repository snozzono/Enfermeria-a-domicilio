package Vista.Administrador;

import Controlador.BBDDDAO;
import Controlador.TecnicoDAO;
import Modelo.BBDD;
import Modelo.Tecnico;
import Vista.Tecnico.Paciente.VentanaPaciente;
import Vista.VentanaPrincipal;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaAdministradorIngresarEliminar extends javax.swing.JFrame {

    TecnicoDAO tecDAO = new TecnicoDAO();
    Tecnico tecnico;
    BBDDDAO bdao = new BBDDDAO();
    BBDD bd = new BBDD();

    /**
     * Creates new form VentanaAdministradorIngresarEliminar
     */
    public VentanaAdministradorIngresarEliminar() {
        initComponents();
        llenarjtUsuarios();
        llenarjbcUsuarios();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTecnico = new javax.swing.JTable();
        jcbUsuarios = new javax.swing.JComboBox<>();
        btnCrearNuevoTecnico = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jtTecnico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "run del tecnico", "usuario", "contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTecnico);

        jcbUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jcbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUsuariosActionPerformed(evt);
            }
        });

        btnCrearNuevoTecnico.setText("Crear nuevo tecnico");
        btnCrearNuevoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevoTecnicoActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCrearNuevoTecnico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresar)
                        .addGap(27, 27, 27)
                        .addComponent(btnEliminar)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnCrearNuevoTecnico))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUsuariosActionPerformed


    }//GEN-LAST:event_jcbUsuariosActionPerformed

    public void llenarjbcUsuarios() {

        TecnicoDAO TDAO = new TecnicoDAO();
        ArrayList<Tecnico> listaTecnicos = TDAO.obtenerTodos();
        this.jcbUsuarios.removeAllItems();
        for (Tecnico temp : listaTecnicos) {
            this.jcbUsuarios.addItem(String.valueOf(temp.getRun_tec()));

        }
    }

    public void llenarjtUsuarios() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtTecnico.getModel();
        modelo.setRowCount(0);
        ArrayList<Tecnico> lista = tecDAO.obtenerTodos();
        for (Tecnico tmp : lista) {
            modelo.addRow(new Object[]{tmp.getRun_tec(), tmp.getUsuario(), tmp.getPasswrd()});

        }
    }

    private void btnCrearNuevoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevoTecnicoActionPerformed
        // TODO add your handling code here:
        VentanaAdministradorCrearTecnico VACT = new VentanaAdministradorCrearTecnico();

        VACT.setResizable(false);
        VACT.setLocationRelativeTo(null);
        VACT.setTitle("Crear técnico");
        VACT.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        VACT.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearNuevoTecnicoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        VentanaPrincipal VP = new VentanaPrincipal();

        VP.setResizable(false);
        VP.setLocationRelativeTo(null);
        VP.setTitle("Pacientes");
        VP.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        VP.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {

            DefaultTableModel modelo = (DefaultTableModel) this.jtTecnico.getModel();
            modelo.setRowCount(0); // Limpiar tabla
            String textoBuscar = txtBuscar.getText().trim();

            if (textoBuscar.isEmpty()) {

                ArrayList<Tecnico> lista = tecDAO.obtenerTodos();
                for (Tecnico tmp : lista) {
                    modelo.addRow(new Object[]{tmp.getRun_tec(), tmp.getUsuario(), tmp.getPasswrd()});
                }
                llenarjbcUsuarios();
            } else {
                Tecnico tec = tecDAO.BuscarTecnicoPorRut(Integer.parseInt(textoBuscar));
                if (tec != null) {
                    modelo.addRow(new Object[]{tec.getRun_tec(), tec.getUsuario(), tec.getPasswrd()});
                    jcbUsuarios.removeAllItems();
                    jcbUsuarios.addItem(String.valueOf(tec.getRun_tec()));
                } else {
                    jcbUsuarios.removeAllItems();
                    JOptionPane.showMessageDialog(this, "No se encontró un técnico con el RUN ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        } catch (NumberFormatException e) {
            // Mostrar mensaje si el texto ingresado no es un número
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de búsqueda.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            // Capturar errores generales para evitar bloqueos
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String usuarioSeleccionado = (String) jcbUsuarios.getSelectedItem();

            if (usuarioSeleccionado != null) {
                int e = Integer.parseInt(usuarioSeleccionado);
                String nombre = tecDAO.BuscarTecnicoPorRut(e).getUsuario();
                boolean eliminado = tecDAO.eliminarTecnico(usuarioSeleccionado); //quizá deberia modificar esto para que pase por la bd y no por codigo 
                if (eliminado) {
                    // actualizar tabla
                    JOptionPane.showMessageDialog(this, (nombre + " fue retirado de la base de datos exitosamente."));
                    DefaultTableModel modelo = (DefaultTableModel) jtTecnico.getModel();
                    modelo.setRowCount(0); // Limpiar tabla
                    ArrayList<Tecnico> lista = tecDAO.obtenerTodos();
                    for (Tecnico tmp : lista) {
                        modelo.addRow(new Object[]{tmp.getRun_tec(), tmp.getUsuario(), tmp.getPasswrd()});
                    }
                    // actualizar combobox
                    jcbUsuarios.removeAllItems(); // Limpiar los items previos

                    // Obtener la lista de técnicos
                    ArrayList<Tecnico> listaTecnicos = tecDAO.obtenerTodos();

                    // Añadir los usuarios al JComboBox
                    for (Tecnico tec : listaTecnicos) {
                        jcbUsuarios.addItem(String.valueOf(tec.getRun_tec()));  // Asumimos que getUsuario() devuelve el nombre de usuario
                    }
                } else {
                    JOptionPane.showMessageDialog(this, ("Hubo un error al retirar a " + nombre));
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un técnico para eliminar.");
            }
        } catch (HeadlessException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "e.");
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuarioSeleccionado = jcbUsuarios.getSelectedItem().toString(); //esta linea deberia estar hecha para seleccionar el tecnico especifico pero no se como haerlo
        int usuario = Integer.parseInt(usuarioSeleccionado);

        BBDDDAO bddao = new BBDDDAO();
        BBDD bede = new BBDD();

        bede.setOrigen(1);
        bede.setTecnico(Integer.parseInt(usuarioSeleccionado));
        bddao.modificarTecnico(bede);

        VentanaPaciente VP = new VentanaPaciente();

        VP.setResizable(false);
        VP.setLocationRelativeTo(null);
        VP.setTitle("Pacientes");
        VP.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        JOptionPane.showMessageDialog(this, ("Ingresaste como " + tecDAO.BuscarTecnicoPorRut(Integer.parseInt(usuarioSeleccionado)).getUsuario()));
        VP.setVisible(true);
        dispose();


    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearNuevoTecnico;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbUsuarios;
    private javax.swing.JTable jtTecnico;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
