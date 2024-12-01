package Vista;

import Controlador.AuxiliarDAO;
import Controlador.PacienteDAO;
import Controlador.RemedioDAO;
import Controlador.TecnicoDAO;
import Modelo.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaDatos extends javax.swing.JFrame {

    public VentanaDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        infoPacientes = new javax.swing.JPanel();
        scrollDatosP = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        boxSearch = new javax.swing.JComboBox<>();
        btnBuscarP = new javax.swing.JButton();
        btnMostrarPac = new javax.swing.JButton();
        checkCronico = new javax.swing.JCheckBox();
        checkNoCr = new javax.swing.JCheckBox();
        checkDeuda = new javax.swing.JCheckBox();
        checkNoD = new javax.swing.JCheckBox();
        infoTecnicos = new javax.swing.JPanel();
        scrollDatosT = new javax.swing.JScrollPane();
        tablaT = new javax.swing.JTable();
        txtSearchT = new javax.swing.JTextField();
        boxSearchT = new javax.swing.JComboBox<>();
        btnBuscarT = new javax.swing.JButton();
        btnMostrarT = new javax.swing.JButton();
        infoRemedios = new javax.swing.JPanel();
        scrollDatosR = new javax.swing.JScrollPane();
        tablaR = new javax.swing.JTable();
        txtSearchR = new javax.swing.JTextField();
        boxSearchR = new javax.swing.JComboBox<>();
        btnBuscarR = new javax.swing.JButton();
        btnMostrarR = new javax.swing.JButton();
        infoTratamiento = new javax.swing.JPanel();
        scrollDatosTr = new javax.swing.JScrollPane();
        tablaTr = new javax.swing.JTable();
        txtSearchTr = new javax.swing.JTextField();
        boxSearchTr = new javax.swing.JComboBox<>();
        btnBuscarTr = new javax.swing.JButton();
        btnMostrarTr = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RUT", "Nombre", "Diagnóstico", "Técnico a cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaP.setColumnSelectionAllowed(true);
        scrollDatosP.setViewportView(tablaP);
        tablaP.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaP.getColumnModel().getColumnCount() > 0) {
            tablaP.getColumnModel().getColumn(3).setHeaderValue("Técnico a cargo");
        }

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        boxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paciente", "Técnico a cargo" }));
        boxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSearchActionPerformed(evt);
            }
        });

        btnBuscarP.setText("Buscar");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        btnMostrarPac.setText("Mostrar todos");
        btnMostrarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPacActionPerformed(evt);
            }
        });

        checkCronico.setText("Crónico");
        checkCronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCronicoActionPerformed(evt);
            }
        });

        checkNoCr.setText("No crónico");
        checkNoCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNoCrActionPerformed(evt);
            }
        });

        checkDeuda.setText("Tiene deuda");
        checkDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDeudaActionPerformed(evt);
            }
        });

        checkNoD.setText("Sin deudas");
        checkNoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNoDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPacientesLayout = new javax.swing.GroupLayout(infoPacientes);
        infoPacientes.setLayout(infoPacientesLayout);
        infoPacientesLayout.setHorizontalGroup(
            infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPacientesLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addComponent(scrollDatosP)
                    .addGroup(infoPacientesLayout.createSequentialGroup()
                        .addGroup(infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkCronico)
                            .addComponent(checkNoCr))
                        .addGap(18, 18, 18)
                        .addGroup(infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPacientesLayout.createSequentialGroup()
                                .addComponent(checkDeuda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrarPac))
                            .addGroup(infoPacientesLayout.createSequentialGroup()
                                .addComponent(checkNoD)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        infoPacientesLayout.setVerticalGroup(
            infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPacientesLayout.createSequentialGroup()
                        .addGroup(infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarPac)
                            .addComponent(btnBuscarP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPacientesLayout.createSequentialGroup()
                        .addGroup(infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkCronico)
                            .addComponent(checkDeuda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkNoD)
                            .addComponent(checkNoCr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(scrollDatosP, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Pacientes", infoPacientes);

        tablaT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RUT", "Nombre", "Administrador a cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollDatosT.setViewportView(tablaT);
        tablaT.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtSearchT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTActionPerformed(evt);
            }
        });

        boxSearchT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUN", "Usuario", "Administrador a cargo" }));
        boxSearchT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSearchTActionPerformed(evt);
            }
        });

        btnBuscarT.setText("Buscar");
        btnBuscarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTActionPerformed(evt);
            }
        });

        btnMostrarT.setText("Mostrar todos");
        btnMostrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoTecnicosLayout = new javax.swing.GroupLayout(infoTecnicos);
        infoTecnicos.setLayout(infoTecnicosLayout);
        infoTecnicosLayout.setHorizontalGroup(
            infoTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoTecnicosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(infoTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollDatosT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTecnicosLayout.createSequentialGroup()
                        .addComponent(btnBuscarT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarT))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTecnicosLayout.createSequentialGroup()
                        .addComponent(txtSearchT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxSearchT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, Short.MAX_VALUE))
        );
        infoTecnicosLayout.setVerticalGroup(
            infoTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTecnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxSearchT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarT)
                    .addComponent(btnMostrarT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollDatosT, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Técnicos", infoTecnicos);

        tablaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Paciente asociado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollDatosR.setViewportView(tablaR);
        tablaR.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtSearchR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchRActionPerformed(evt);
            }
        });

        boxSearchR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Paciente" }));
        boxSearchR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSearchRActionPerformed(evt);
            }
        });

        btnBuscarR.setText("Buscar");
        btnBuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRActionPerformed(evt);
            }
        });

        btnMostrarR.setText("Mostrar todos");
        btnMostrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoRemediosLayout = new javax.swing.GroupLayout(infoRemedios);
        infoRemedios.setLayout(infoRemediosLayout);
        infoRemediosLayout.setHorizontalGroup(
            infoRemediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoRemediosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(infoRemediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollDatosR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoRemediosLayout.createSequentialGroup()
                        .addComponent(btnBuscarR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarR))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoRemediosLayout.createSequentialGroup()
                        .addComponent(txtSearchR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, Short.MAX_VALUE))
        );
        infoRemediosLayout.setVerticalGroup(
            infoRemediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoRemediosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoRemediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoRemediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarR)
                    .addComponent(btnMostrarR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollDatosR, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Remedios", infoRemedios);

        tablaTr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Tipo", "Descripción", "Paciente asociado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollDatosTr.setViewportView(tablaTr);
        tablaTr.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtSearchTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTrActionPerformed(evt);
            }
        });

        boxSearchTr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Paciente" }));
        boxSearchTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSearchTrActionPerformed(evt);
            }
        });

        btnBuscarTr.setText("Buscar");
        btnBuscarTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTrActionPerformed(evt);
            }
        });

        btnMostrarTr.setText("Mostrar todos");
        btnMostrarTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTrActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Pagados");

        javax.swing.GroupLayout infoTratamientoLayout = new javax.swing.GroupLayout(infoTratamiento);
        infoTratamiento.setLayout(infoTratamientoLayout);
        infoTratamientoLayout.setHorizontalGroup(
            infoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoTratamientoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(infoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollDatosTr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTratamientoLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarTr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarTr))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTratamientoLayout.createSequentialGroup()
                        .addComponent(txtSearchTr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxSearchTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, Short.MAX_VALUE))
        );
        infoTratamientoLayout.setVerticalGroup(
            infoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTratamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxSearchTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarTr)
                    .addComponent(btnMostrarTr)
                    .addComponent(jCheckBox1))
                .addGap(36, 36, 36)
                .addComponent(scrollDatosTr, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tratamientos", infoTratamiento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTActionPerformed
    }//GEN-LAST:event_txtSearchTActionPerformed

    private void boxSearchTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSearchTActionPerformed
    }//GEN-LAST:event_boxSearchTActionPerformed

    private void btnBuscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tablaT.getModel();
        modelo.setRowCount(0);

        ArrayList<Integer> hits = new ArrayList<>();
        ArrayList<Integer> adds;

        AuxiliarDAO p = new AuxiliarDAO();
        TecnicoDAO te = new TecnicoDAO();

        String cod, query;
        int tipo = 0;

        cod = txtSearchT.getText();

        if (boxSearchT.getSelectedItem().equals("RUN")) {
            tipo = 1;
        }

        if (boxSearchT.getSelectedItem().equals("Usuario")) {
            tipo = 2;
        }

        if (boxSearchT.getSelectedItem().equals("Administrador a cargo")) {
            tipo = 3;
        }

        if ("".equals(cod)) {
            JOptionPane.showMessageDialog(this, "Ingrese un término de búsqueda o elija mostrar todos.");
            boxSearchT.requestFocus();
        } else {
            switch (tipo) {
                case 1:
                    try {
                        int ID = Integer.parseInt(cod);
                        query = "Select run_tec from tbTecnico WHERE run_tec = ?";

                        adds = p.selectSearch(false, ID, "", query, "run_tec", p);

                        for (int i = 0; i < adds.size(); i++) {
                            if (!hits.contains(adds.get(i))) {
                                hits.add(adds.get(i));
                            }
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Ingresa un número en la búsqueda.");
                    }
                    txtSearchT.setText("");
                    txtSearchT.requestFocus();
                    break;
                case 2:
                    query = "Select run_tec from tbTecnico WHERE usuario = ?";
                    adds = p.selectSearch(false, -1, cod, query, "run_tec", p);
                    for (int i = 0; i < adds.size(); i++) {
                        if (!hits.contains(adds.get(i))) {
                            hits.add(adds.get(i));
                        }
                    }
                    txtSearchT.setText("");
                    txtSearchT.requestFocus();
                    break;
                case 3:
                    try {
                        int ID = Integer.parseInt(cod);
                        query = "Select run_tec from tbTecnico WHERE admin_id_admin = ?";

                        adds = p.selectSearch(false, ID, "", query, "run_tec", p);

                        for (int i = 0; i < adds.size(); i++) {
                            if (!hits.contains(adds.get(i))) {
                                hits.add(adds.get(i));
                            }
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Ingresa un número en la búsqueda.");
                    }
                    txtSearchT.setText("");
                    txtSearchT.requestFocus();
                    break;
            }
        }

        hits.sort(null);
        ArrayList<String> str;

        for (int i = 0; i < hits.size(); i++) {
            query = "SELECT * from tbTecnico where run_tec=" + hits.get(i);

            str = te.view(query);

            String[] rp = str.get(0).split(",");

            modelo.addRow(new Object[]{rp[0], rp[1], rp[2]});
        }

        if (hits.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay registros que coincidan con los criterios.");
            txtSearch.setText("");
            txtSearch.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarTActionPerformed

    private void btnMostrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tablaT.getModel();
        modelo.setRowCount(0);

        ArrayList<String> str;
        TecnicoDAO te = new TecnicoDAO();

        String query = "SELECT * from tbTecnico";

        str = te.view(query);

        for (int i = 0; i < str.size(); i++) {
            String[] rp = str.get(i).split(",");

            modelo.addRow(new Object[]{rp[0], rp[1], rp[2]});
        }

        txtSearchT.setText("");
        txtSearchT.requestFocus();
    }//GEN-LAST:event_btnMostrarTActionPerformed

    private void btnMostrarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPacActionPerformed
        checkDeuda.setSelected(false);
        checkCronico.setSelected(false);

        checkNoD.setSelected(false);
        checkNoCr.setSelected(false);

        DefaultTableModel modelo = (DefaultTableModel) this.tablaP.getModel();
        modelo.setRowCount(0);

        ArrayList<String> str;
        PacienteDAO pa = new PacienteDAO();

        String query = "SELECT * from tbPaciente";

        str = pa.view(query);

        for (int i = 0; i < str.size(); i++) {
            String[] rp = str.get(i).split(",");

            modelo.addRow(new Object[]{rp[0], rp[1], rp[2], rp[3]});
        }
        
        
    }//GEN-LAST:event_btnMostrarPacActionPerformed

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tablaP.getModel();
        modelo.setRowCount(0);

        ArrayList<Integer> hits = new ArrayList<>();
        ArrayList<Integer> adds;

        AuxiliarDAO p = new AuxiliarDAO();
        PacienteDAO pa = new PacienteDAO();

        String cod, tipo, query;

        cod = txtSearch.getText();
        tipo = (String) boxSearch.getSelectedItem();

        if (checkCronico.isSelected() || checkNoCr.isSelected()) {
            boolean cronico = false;
            if (checkCronico.isSelected()) {
                cronico = true;
            }
            query = "Select pac_run_pac from tbMedicamento WHERE cronico = ?";
            adds = p.selectSearch(cronico, -1, "", query, "pac_run_pac", p);

            for (int i = 0; i < adds.size(); i++) {
                if (!hits.contains(adds.get(i))) {
                    hits.add(adds.get(i));
                }
            }

        }

        if (checkDeuda.isSelected() || checkNoD.isSelected()) {
            boolean deuda = false;
            if (checkDeuda.isSelected()) {
                deuda = true;
            }

            query = "Select pac_run_pac from tbProcedimiento WHERE pago = ?";
            adds = p.selectSearch(deuda, -1, "", query, "pac_run_pac", p);

            for (int i = 0; i < adds.size(); i++) {
                if (!hits.contains(adds.get(i))) {
                    hits.add(adds.get(i));
                }
            }
        }

        if (!"".equals(cod)) {
            try {
                int ID = Integer.parseInt(cod);

                if (!"Paciente".equals(tipo)) {
                    query = "Select run_pac from tbPaciente WHERE tec_run_tec = ?";

                    adds = p.selectSearch(false, ID, "", query, "run_pac", p);

                    for (int i = 0; i < adds.size(); i++) {
                        if (!hits.contains(adds.get(i))) {
                            hits.add(adds.get(i));
                        }
                    }
                } else {
                    query = "Select run_pac from tbPaciente WHERE run_pac =?";

                    adds = p.selectSearch(false, ID, "", query, "run_pac", p);

                    for (int i = 0; i < adds.size(); i++) {
                        if (!hits.contains(adds.get(i))) {
                            hits.add(adds.get(i));
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingresa un número en la búsqueda.");
            }

        }

        hits.sort(null);
        ArrayList<String> str;

        for (int i = 0; i < hits.size(); i++) {
            query = "SELECT * from tbPaciente where run_pac=" + hits.get(i);

            str = pa.view(query);

            String[] rp = str.get(0).split(",");

            modelo.addRow(new Object[]{rp[0], rp[1], rp[2], rp[3]});
        }

        if (hits.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay registros que coincidan con los criterios.");
            checkDeuda.setSelected(false);
            checkCronico.setSelected(false);

            checkNoD.setSelected(false);
            checkNoCr.setSelected(false);

            txtSearch.setText("");
            txtSearch.requestFocus();
        }
        
        checkDeuda.setSelected(false);
        checkCronico.setSelected(false);

        checkNoD.setSelected(false);
        checkNoCr.setSelected(false);
        
        checkDeuda.setEnabled(true);
        checkCronico.setEnabled(true);

        checkNoD.setEnabled(true);
        checkNoCr.setEnabled(true);
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void boxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSearchActionPerformed
    }//GEN-LAST:event_boxSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchRActionPerformed
    }//GEN-LAST:event_txtSearchRActionPerformed

    private void boxSearchRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSearchRActionPerformed
    }//GEN-LAST:event_boxSearchRActionPerformed

    private void btnBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tablaR.getModel();
        modelo.setRowCount(0);

        ArrayList<Integer> hits = new ArrayList<>();
        ArrayList<Integer> adds;

        AuxiliarDAO p = new AuxiliarDAO();
        RemedioDAO rem = new RemedioDAO();

        String cod, query;
        int tipo = 0;

        cod = txtSearchR.getText();

        if (boxSearchR.getSelectedItem().equals("Código")) {
            tipo = 1;
        }

        if (boxSearchR.getSelectedItem().equals("Paciente")) {
            tipo = 2;
        }

        if ("".equals(cod)) {
            JOptionPane.showMessageDialog(this, "Ingrese un término de búsqueda o elija mostrar todos.");
            boxSearchR.requestFocus();
        } else {
            switch (tipo) {
                case 1:
                    try {
                        int ID = Integer.parseInt(cod);
                        query = "Select id_med from tbMedicamento WHERE id_med = ?";

                        adds = p.selectSearch(false, ID, "", query, "id_med", p);

                        for (int i = 0; i < adds.size(); i++) {
                            if (!hits.contains(adds.get(i))) {
                                hits.add(adds.get(i));
                            }
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Ingresa un número en la búsqueda.");
                    }
                    txtSearchR.setText("");
                    txtSearchR.requestFocus();

                    break;
                case 2:
                    query = "Select id_med from tbMedicamento WHERE pac_run_pac = ?";
                    adds = p.selectSearch(false, -1, cod, query, "id_med", p);
                    for (int i = 0; i < adds.size(); i++) {
                        if (!hits.contains(adds.get(i))) {
                            hits.add(adds.get(i));
                        }
                    }
                    txtSearchR.setText("");
                    txtSearchR.requestFocus();

                    break;
            }
        }

        hits.sort(null);
        ArrayList<String> str;

        for (int i = 0; i < hits.size(); i++) {
            query = "SELECT * from tbMedicamento where id_med=" + hits.get(i);

            str = rem.view(query);

            String[] rp = str.get(0).split(",");

            modelo.addRow(new Object[]{rp[0], rp[1], rp[2]});
        }

        if (hits.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay registros que coincidan con los criterios.");
            txtSearch.setText("");
            txtSearch.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarRActionPerformed

    private void btnMostrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tablaR.getModel();
        modelo.setRowCount(0);

        ArrayList<String> str;
        RemedioDAO rem = new RemedioDAO();

        String query = "SELECT * from tbMedicamento";

        str = rem.view(query);

        for (int i = 0; i < str.size(); i++) {
            String[] rp = str.get(i).split(",");

            modelo.addRow(new Object[]{rp[0], rp[1], rp[2]});
        }

        txtSearchT.setText("");
        txtSearchT.requestFocus();
    }//GEN-LAST:event_btnMostrarRActionPerformed

    private void txtSearchTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchTrActionPerformed

    private void boxSearchTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSearchTrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSearchTrActionPerformed

    private void btnBuscarTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTrActionPerformed

    private void btnMostrarTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarTrActionPerformed

    private void checkCronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCronicoActionPerformed
        checkNoCr.setEnabled(false);
    }//GEN-LAST:event_checkCronicoActionPerformed

    private void checkNoCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNoCrActionPerformed
        checkCronico.setEnabled(false);
    }//GEN-LAST:event_checkNoCrActionPerformed

    private void checkDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDeudaActionPerformed
        checkNoD.setEnabled(false);
    }//GEN-LAST:event_checkDeudaActionPerformed

    private void checkNoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNoDActionPerformed
        checkDeuda.setEnabled(false);
    }//GEN-LAST:event_checkNoDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSearch;
    private javax.swing.JComboBox<String> boxSearchR;
    private javax.swing.JComboBox<String> boxSearchT;
    private javax.swing.JComboBox<String> boxSearchTr;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnBuscarR;
    private javax.swing.JButton btnBuscarT;
    private javax.swing.JButton btnBuscarTr;
    private javax.swing.JButton btnMostrarPac;
    private javax.swing.JButton btnMostrarR;
    private javax.swing.JButton btnMostrarT;
    private javax.swing.JButton btnMostrarTr;
    private javax.swing.JCheckBox checkCronico;
    private javax.swing.JCheckBox checkDeuda;
    private javax.swing.JCheckBox checkNoCr;
    private javax.swing.JCheckBox checkNoD;
    private javax.swing.JPanel infoPacientes;
    private javax.swing.JPanel infoRemedios;
    private javax.swing.JPanel infoTecnicos;
    private javax.swing.JPanel infoTratamiento;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane scrollDatosP;
    private javax.swing.JScrollPane scrollDatosR;
    private javax.swing.JScrollPane scrollDatosT;
    private javax.swing.JScrollPane scrollDatosTr;
    private javax.swing.JTable tablaP;
    private javax.swing.JTable tablaR;
    private javax.swing.JTable tablaT;
    private javax.swing.JTable tablaTr;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchR;
    private javax.swing.JTextField txtSearchT;
    private javax.swing.JTextField txtSearchTr;
    // End of variables declaration//GEN-END:variables
}
