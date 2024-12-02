package Vista.Paciente;

import Controlador.AdministradorDAO;
import Controlador.AuxiliarDAO;
import Controlador.PacienteDAO;
import Modelo.Paciente;
import Vista.VentanaDatos;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaPaciente extends javax.swing.JFrame {

    public VentanaPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPaciente = new javax.swing.JTabbedPane();
        tabInfo = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnBuscarP = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        btnActu = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        panelAct = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtActID = new javax.swing.JTextField();
        txtActNombre = new javax.swing.JTextField();
        txtActD = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnLimpiarB = new javax.swing.JButton();
        tabReg = new javax.swing.JPanel();
        panelReg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRegID = new javax.swing.JTextField();
        txtRegNombre = new javax.swing.JTextField();
        txtRegD = new javax.swing.JTextField();
        btnReg = new javax.swing.JButton();
        btnLimpiarReg = new javax.swing.JButton();
        tabStats = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRegistrados = new javax.swing.JTextField();
        txtAlDia = new javax.swing.JTextField();
        txtDeben = new javax.swing.JTextField();
        btnDetAlDia = new javax.swing.JButton();
        btnDetDeuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPaciente.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnBuscarP.setText("Buscar");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "RUN", "Nombre", "Diagnóstico", "Observaciones", "Técnico a cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabla.setViewportView(tableDatos);

        btnActu.setText("Actualizar datos");
        btnActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuActionPerformed(evt);
            }
        });

        btnElim.setText("Dar de alta");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        jLabel7.setText("RUT:");

        jLabel8.setText("Nombre:");

        jLabel10.setText("Diagnóstico");

        txtActID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActIDActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnLimpiarB.setText("Limpiar");
        btnLimpiarB.setSelected(true);
        btnLimpiarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActLayout = new javax.swing.GroupLayout(panelAct);
        panelAct.setLayout(panelActLayout);
        panelActLayout.setHorizontalGroup(
            panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(66, 66, 66)
                        .addComponent(txtActD, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addGroup(panelActLayout.createSequentialGroup()
                        .addGroup(panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(80, 80, 80)
                        .addGroup(panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActID)
                            .addComponent(txtActNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(btnLimpiarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelActLayout.setVerticalGroup(
            panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActLayout.createSequentialGroup()
                .addGroup(panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtActID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtActNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtActD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(52, 52, 52)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiarB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabInfoLayout = new javax.swing.GroupLayout(tabInfo);
        tabInfo.setLayout(tabInfoLayout);
        tabInfoLayout.setHorizontalGroup(
            tabInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabInfoLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollTabla)
                    .addGroup(tabInfoLayout.createSequentialGroup()
                        .addGroup(tabInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(panelAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        tabInfoLayout.setVerticalGroup(
            tabInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(tabInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabInfoLayout.createSequentialGroup()
                        .addComponent(btnActu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElim))
                    .addComponent(panelAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnActu.setEnabled(false);
        btnElim.setEnabled(false);
        panelAct.setVisible(false);

        tabPaciente.addTab("Buscar Paciente", tabInfo);

        jLabel3.setText("RUT:");

        jLabel4.setText("Nombre:");

        jLabel6.setText("Diagnóstico");

        txtRegID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegIDActionPerformed(evt);
            }
        });

        btnReg.setText("Registrar");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        btnLimpiarReg.setText("Limpiar");
        btnLimpiarReg.setSelected(true);
        btnLimpiarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegLayout = new javax.swing.GroupLayout(panelReg);
        panelReg.setLayout(panelRegLayout);
        panelRegLayout.setHorizontalGroup(
            panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(66, 66, 66)
                        .addComponent(txtRegD, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                    .addGroup(panelRegLayout.createSequentialGroup()
                        .addGroup(panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(80, 80, 80)
                        .addGroup(panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegID)
                            .addComponent(txtRegNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReg, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(btnLimpiarReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelRegLayout.setVerticalGroup(
            panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegLayout.createSequentialGroup()
                .addGroup(panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtRegID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtRegNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout tabRegLayout = new javax.swing.GroupLayout(tabReg);
        tabReg.setLayout(tabRegLayout);
        tabRegLayout.setHorizontalGroup(
            tabRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRegLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(panelReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(103, 103, 103))
        );
        tabRegLayout.setVerticalGroup(
            tabRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRegLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(panelReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        tabPaciente.addTab("Registrar Paciente", tabReg);

        jLabel1.setText("Total de pacientes registrados:");

        btnRefresh.setText("Refrescar");

        jLabel2.setText("Total de pacientes al día:");

        jLabel5.setText("Total de pacientes con deuda:");

        btnDetAlDia.setText("Ver detalle");
        btnDetAlDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetAlDiaActionPerformed(evt);
            }
        });

        btnDetDeuda.setText("Ver detalle");

        javax.swing.GroupLayout tabStatsLayout = new javax.swing.GroupLayout(tabStats);
        tabStats.setLayout(tabStatsLayout);
        tabStatsLayout.setHorizontalGroup(
            tabStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabStatsLayout.createSequentialGroup()
                        .addGroup(tabStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabStatsLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDeben, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabStatsLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                                .addComponent(txtRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabStatsLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAlDia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabStatsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(tabStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDetAlDia)
                                    .addComponent(btnDetDeuda))))
                        .addGap(23, 23, 23))
                    .addGroup(tabStatsLayout.createSequentialGroup()
                        .addComponent(btnRefresh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        tabStatsLayout.setVerticalGroup(
            tabStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStatsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(tabStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(tabStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetAlDia)
                .addGap(39, 39, 39)
                .addGroup(tabStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDeben, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetDeuda)
                .addGap(133, 133, 133))
        );

        txtRegistrados.setEnabled(false);
        txtAlDia.setEnabled(false);
        txtDeben.setEnabled(false);

        tabPaciente.addTab("Ver estadísticas", tabStats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaciente)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(tabPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegIDActionPerformed

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tableDatos.getModel();
        modelo.setRowCount(0);

        AuxiliarDAO aux = new AdministradorDAO();
        PacienteDAO p = new PacienteDAO();

        try {
            int ID = Integer.parseInt(txtSearch.getText());

            String query = "SELECT run_pac from tbPaciente where run_pac=?";

            int RUN = aux.buscar(ID, query, aux, "");
            if (RUN != -1) {
                query = "SELECT * from tbPaciente where run_pac=" + RUN;

                ArrayList<String> datos = p.view(query);

                for (int i = 0; i < datos.size(); i++) {
                    String[] rp = datos.get(i).split(",");
                    modelo.addRow(new Object[]{rp[0], rp[1], rp[2], rp[3], rp[4]});
                }

                btnActu.setEnabled(true);
                btnElim.setEnabled(true);

                txtActID.setText(txtSearch.getText());
                txtActID.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(this, "No hay registros.");

                txtSearch.setText("");
                txtSearch.requestFocus();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un número en la búsqueda.");
        }
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuActionPerformed
        panelAct.setVisible(true);
    }//GEN-LAST:event_btnActuActionPerformed

    private void txtActIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActIDActionPerformed
    }//GEN-LAST:event_txtActIDActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String nombre_p, diagn;
        int rut_pac;

        rut_pac = Integer.valueOf(txtSearch.getText());

        AuxiliarDAO aux = new AuxiliarDAO();
        PacienteDAO pDAO = new PacienteDAO();

        nombre_p = txtActNombre.getText();
        diagn = txtActD.getText();

        if (nombre_p.equals("") || diagn.equals("")) {
            JOptionPane.showMessageDialog(this, "Recuerde llenar ambos campos.");
        } else {

            Paciente p = new Paciente(rut_pac, nombre_p, diagn, "");

            String query = "UPDATE tbPaciente set nombre_p=?, diagn=? where run_pac=?";

            boolean res = pDAO.modificarReg(p, query);

            if (res) {
                JOptionPane.showMessageDialog(this, "Datos actualizados.");
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error.");
            }
        }


    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnLimpiarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBActionPerformed
        txtSearch.setText("");
        txtActID.setText("");
        txtActNombre.setText("");
        txtActD.setText("");

        txtActNombre.requestFocus();
    }//GEN-LAST:event_btnLimpiarBActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        int dec = JOptionPane.showConfirmDialog(this, "¿Desea eliminar a este paciente?\nEste cambio es irreversible.", "Confirmar acción", JOptionPane.OK_CANCEL_OPTION);
        AuxiliarDAO aux = new AuxiliarDAO();
        
        PacienteDAO p = new PacienteDAO();
        
        int r = Integer.valueOf(txtSearch.getText());
        
        boolean hecho = false;

        if (dec == 0) {
            
            try {
                hecho = p.eliminar(r);
                
                JOptionPane.showMessageDialog(this, "Paciente eliminado.");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnElimActionPerformed

    private void btnLimpiarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRegActionPerformed
        txtRegID.setText("");
        txtRegNombre.setText("");
        txtRegD.setText("");
        
        txtRegID.requestFocus();
    }//GEN-LAST:event_btnLimpiarRegActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
       String nombre, diagn;
       int rut;
       
       nombre = txtRegNombre.getText();
       diagn = txtRegD.getText();
       
       try{
           rut = Integer.parseInt(txtRegID.getText());
       
           PacienteDAO pdao = new PacienteDAO();
           Paciente p = new Paciente(rut, nombre, diagn, "");
       
           String query = "SELECT run_pac from tbPaciente where run_pac=?";
           
           int id = pdao.buscar(rut, query, pdao, "");
           
           if(id == -1){
               pdao.ingreso(p);
               
               JOptionPane.showMessageDialog(this, "Paciente agregado con éxito.");
               
           }
           else{
               JOptionPane.showMessageDialog(this, "El paciente ya existe en el sistema.");
           }
       }
       catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un número como RUT.");
        }
       
       
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnDetAlDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetAlDiaActionPerformed
        VentanaDatos v = new VentanaDatos();
        
        
    }//GEN-LAST:event_btnDetAlDiaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActu;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDetAlDia;
    private javax.swing.JButton btnDetDeuda;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnLimpiarB;
    private javax.swing.JButton btnLimpiarReg;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelAct;
    private javax.swing.JPanel panelReg;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JPanel tabInfo;
    private javax.swing.JTabbedPane tabPaciente;
    private javax.swing.JPanel tabReg;
    private javax.swing.JPanel tabStats;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtActD;
    private javax.swing.JTextField txtActID;
    private javax.swing.JTextField txtActNombre;
    private javax.swing.JTextField txtAlDia;
    private javax.swing.JTextField txtDeben;
    private javax.swing.JTextField txtRegD;
    private javax.swing.JTextField txtRegID;
    private javax.swing.JTextField txtRegNombre;
    private javax.swing.JTextField txtRegistrados;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
