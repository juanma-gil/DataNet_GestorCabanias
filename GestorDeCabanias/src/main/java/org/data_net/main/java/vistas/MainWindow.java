package org.data_net.main.java.vistas;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.data_net.main.java.controladores.CabinsAdministrator;
import org.data_net.main.java.controladores.MainController;
import org.data_net.main.java.controladores.ReservesAdministrator;
import org.data_net.main.java.controladores.StatsController;
import org.data_net.main.java.modelos.StatsModel;
import org.data_net.main.java.modelos.base_de_datos.dao.CabinsDAO;
import org.data_net.main.java.modelos.base_de_datos.dao.ReservesDAO;

public class MainWindow extends javax.swing.JFrame{
    public MainWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        ListPanel = new javax.swing.JPanel();
        ListCabana = new javax.swing.JScrollPane();
        TablaCabana = new javax.swing.JTable();
        ListReserva = new javax.swing.JScrollPane();
        TablaReserva = new javax.swing.JTable();
        DataPanel = new javax.swing.JPanel();
        InputPanel = new javax.swing.JLayeredPane();
        CabinInput = new javax.swing.JPanel();
        txtEtiqueta = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ReserveInput = new javax.swing.JPanel();
        txtInquilino = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtCantInq = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCabana = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        OpsPanel = new javax.swing.JPanel();
        agregarButton = new javax.swing.JButton();
        borrarButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        nuevoButton = new javax.swing.JButton();
        LeftPanel = new javax.swing.JPanel();
        reservasButton = new javax.swing.JButton();
        cabanasButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        StatsPanel = new javax.swing.JPanel();
        NumRep = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totCabLabel = new javax.swing.JLabel();
        cantInqLabel = new javax.swing.JLabel();
        porcOcLabel = new javax.swing.JLabel();
        GraphRep = new javax.swing.JPanel();
        porcOcBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        ButtonsPanel = new javax.swing.JPanel();
        verTxtButton = new javax.swing.JRadioButton();
        verGraphButton = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor Cabañas");
        setBackground(new java.awt.Color(92, 160, 142));

        ListPanel.setBackground(new java.awt.Color(92, 160, 142));
        ListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));
        ListPanel.setLayout(new java.awt.CardLayout());

        TablaCabana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Etiqueta", "Capacidad"
            }
        ));
        ListCabana.setViewportView(TablaCabana);

        ListPanel.add(ListCabana, "card2");

        TablaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Inquilino", "Telefono", "Mail", "CantInq", "Cabana", "FechaDesde", "FechaHasta", "Costo"
            }
        ));
        ListReserva.setViewportView(TablaReserva);

        ListPanel.add(ListReserva, "card3");

        DataPanel.setBackground(new java.awt.Color(92, 160, 142));
        DataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        InputPanel.setLayout(new java.awt.CardLayout());

        CabinInput.setBackground(new java.awt.Color(92, 160, 142));
        CabinInput.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));

        txtEtiqueta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEtiquetaActionPerformed(evt);
            }
        });

        txtCapacidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setText("ETIQUETA:");

        jLabel10.setText("CAPACIDAD:");

        javax.swing.GroupLayout CabinInputLayout = new javax.swing.GroupLayout(CabinInput);
        CabinInput.setLayout(CabinInputLayout);
        CabinInputLayout.setHorizontalGroup(
            CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabinInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        CabinInputLayout.setVerticalGroup(
            CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabinInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(CabinInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        InputPanel.add(CabinInput, "card2");

        ReserveInput.setBackground(new java.awt.Color(92, 160, 142));
        ReserveInput.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));

        txtInquilino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCantInq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setText("INQUILINO:");

        jLabel14.setText("TELEFONO:");

        jLabel15.setText("MAIL:");

        jLabel16.setText("CANT INQUILINOS:");

        txtCabana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setText("CABAÑA:");

        jLabel18.setText("DESDE:");

        txtDesde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDesde.setText("DD-MM-YYYY");
        txtDesde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDesdeMouseClicked(evt);
            }
        });
        txtDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesdeActionPerformed(evt);
            }
        });

        txtHasta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHasta.setText("DD-MM-YYYY");

        jLabel19.setText("HASTA:");

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setText("COSTO:");

        javax.swing.GroupLayout ReserveInputLayout = new javax.swing.GroupLayout(ReserveInput);
        ReserveInput.setLayout(ReserveInputLayout);
        ReserveInputLayout.setHorizontalGroup(
            ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReserveInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ReserveInputLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCosto)
                    .addComponent(txtHasta)
                    .addComponent(txtDesde)
                    .addComponent(txtCabana)
                    .addComponent(txtCantInq)
                    .addComponent(txtMail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInquilino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        ReserveInputLayout.setVerticalGroup(
            ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReserveInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantInq, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCabana, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InputPanel.add(ReserveInput, "card2");

        OpsPanel.setBackground(new java.awt.Color(92, 160, 142));
        OpsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        agregarButton.setText("AGREGAR");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        borrarButton.setText("BORRAR");

        actualizarButton.setText("ACTUALIZAR");

        javax.swing.GroupLayout OpsPanelLayout = new javax.swing.GroupLayout(OpsPanel);
        OpsPanel.setLayout(OpsPanelLayout);
        OpsPanelLayout.setHorizontalGroup(
            OpsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(OpsPanelLayout.createSequentialGroup()
                        .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OpsPanelLayout.setVerticalGroup(
            OpsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrarButton)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DataPanelLayout = new javax.swing.GroupLayout(DataPanel);
        DataPanel.setLayout(DataPanelLayout);
        DataPanelLayout.setHorizontalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OpsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DataPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(InputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGap(190, 190, 190)))
        );
        DataPanelLayout.setVerticalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPanelLayout.createSequentialGroup()
                .addComponent(OpsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DataPanelLayout.createSequentialGroup()
                    .addComponent(InputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        editarButton.setText("EDITAR");

        nuevoButton.setText("NUEVO");

        LeftPanel.setBackground(new java.awt.Color(0, 106, 78));

        reservasButton.setText("Reservas");

        cabanasButton.setText("Cabañas");
        cabanasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabanasButtonActionPerformed(evt);
            }
        });

        logo.setMaximumSize(new java.awt.Dimension(128, 128));
        logo.setMinimumSize(new java.awt.Dimension(128, 128));
        logo.setPreferredSize(new java.awt.Dimension(128, 128));

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reservasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cabanasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cabanasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(reservasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        StatsPanel.setBackground(new java.awt.Color(138, 186, 174));
        StatsPanel.setMaximumSize(new java.awt.Dimension(180, 139));
        StatsPanel.setMinimumSize(new java.awt.Dimension(180, 139));
        StatsPanel.setLayout(new java.awt.CardLayout());

        NumRep.setBackground(new java.awt.Color(138, 186, 174));
        NumRep.setMaximumSize(new java.awt.Dimension(256, 636));
        NumRep.setMinimumSize(new java.awt.Dimension(256, 636));
        NumRep.setPreferredSize(new java.awt.Dimension(256, 636));

        jLabel2.setText("Cabañas Totales");

        jLabel3.setText("Cantidad de Inquilinos ");

        jLabel4.setText("Porcentaje de Ocupación");

        totCabLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totCabLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totCabLabel.setText("-");
        totCabLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cantInqLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantInqLabel.setText("-");
        cantInqLabel.setFocusable(false);
        cantInqLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        porcOcLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        porcOcLabel.setText("-");
        porcOcLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout NumRepLayout = new javax.swing.GroupLayout(NumRep);
        NumRep.setLayout(NumRepLayout);
        NumRepLayout.setHorizontalGroup(
            NumRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumRepLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(NumRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NumRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(NumRepLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel3)))
                    .addGroup(NumRepLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(NumRepLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(totCabLabel))
                    .addGroup(NumRepLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cantInqLabel))
                    .addGroup(NumRepLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(porcOcLabel)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        NumRepLayout.setVerticalGroup(
            NumRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumRepLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totCabLabel)
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantInqLabel)
                .addGap(81, 81, 81)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(porcOcLabel)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        StatsPanel.add(NumRep, "card2");

        GraphRep.setBackground(new java.awt.Color(138, 186, 174));
        GraphRep.setMaximumSize(new java.awt.Dimension(256, 636));
        GraphRep.setMinimumSize(new java.awt.Dimension(256, 636));
        GraphRep.setPreferredSize(new java.awt.Dimension(256, 636));

        jLabel1.setText("Ocupación");

        javax.swing.GroupLayout GraphRepLayout = new javax.swing.GroupLayout(GraphRep);
        GraphRep.setLayout(GraphRepLayout);
        GraphRepLayout.setHorizontalGroup(
            GraphRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GraphRepLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(porcOcBar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(GraphRepLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GraphRepLayout.setVerticalGroup(
            GraphRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GraphRepLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(porcOcBar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StatsPanel.add(GraphRep, "card3");

        ButtonsPanel.setBackground(new java.awt.Color(138, 186, 174));

        verTxtButton.setBackground(new java.awt.Color(138, 186, 174));
        verTxtButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        verTxtButton.setSelected(true);
        verTxtButton.setText("Ver Texto");
        verTxtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTxtButtonActionPerformed(evt);
            }
        });

        verGraphButton.setBackground(new java.awt.Color(138, 186, 174));
        verGraphButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        verGraphButton.setText("Ver Grafico");
        verGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGraphButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(verTxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verTxtButton)
                    .addComponent(verGraphButton))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(editarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevoButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cabanasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabanasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cabanasButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void txtEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEtiquetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEtiquetaActionPerformed

    private void txtDesdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDesdeMouseClicked
        
    }//GEN-LAST:event_txtDesdeMouseClicked

    private void txtDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesdeActionPerformed

    private void verTxtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTxtButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verTxtButtonActionPerformed

    private void verGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGraphButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verGraphButtonActionPerformed

    public static void main(String args[]) {
       MainWindow v=new MainWindow();
       MainController con=new MainController(v);
       StatsModel statsModel=new StatsModel(con);
       StatsController stCon=new StatsController(v,statsModel);
       con.getAll();
       con.setTipoDAO(new ReservesDAO());
       con.setAdministrator(new ReservesAdministrator(v));
       con.getAll();
       con.setTipoDAO(new CabinsDAO());
       con.setAdministrator(new CabinsAdministrator(v));
       v.setVisible(true);
       v.setLocationRelativeTo(null);
    }

    public JTable getTablaCabana() {
        return TablaCabana;
    }

    public void setTablaCabana(JTable TablaCabana) {
        this.TablaCabana = TablaCabana;
    }

    public JTable getTablaReserva() {
        return TablaReserva;
    }

    public void setTablaReserva(JTable TablaReserva) {
        this.TablaReserva = TablaReserva;
    }

    public JScrollPane getListCabana() {
        return ListCabana;
    }

    public void setListCabana(JScrollPane ListCabana) {
        this.ListCabana = ListCabana;
    }

    public JScrollPane getListReserva() {
        return ListReserva;
    }

    public void setListReserva(JScrollPane ListReserva) {
        this.ListReserva = ListReserva;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    public javax.swing.JPanel CabinInput;
    private javax.swing.JPanel DataPanel;
    public javax.swing.JPanel GraphRep;
    public javax.swing.JLayeredPane InputPanel;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JScrollPane ListCabana;
    public javax.swing.JPanel ListPanel;
    private javax.swing.JScrollPane ListReserva;
    public javax.swing.JPanel NumRep;
    private javax.swing.JPanel OpsPanel;
    public javax.swing.JPanel ReserveInput;
    public javax.swing.JPanel StatsPanel;
    private javax.swing.JTable TablaCabana;
    private javax.swing.JTable TablaReserva;
    public javax.swing.JButton actualizarButton;
    public javax.swing.JButton agregarButton;
    public javax.swing.JButton borrarButton;
    public javax.swing.JButton cabanasButton;
    public javax.swing.JLabel cantInqLabel;
    public javax.swing.JButton editarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel logo;
    public javax.swing.JButton nuevoButton;
    public javax.swing.JProgressBar porcOcBar;
    public javax.swing.JLabel porcOcLabel;
    public javax.swing.JButton reservasButton;
    public javax.swing.JLabel totCabLabel;
    public javax.swing.JTextField txtCabana;
    public javax.swing.JTextField txtCantInq;
    public javax.swing.JTextField txtCapacidad;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtDesde;
    public javax.swing.JTextField txtEtiqueta;
    public javax.swing.JTextField txtHasta;
    public javax.swing.JTextField txtInquilino;
    public javax.swing.JTextField txtMail;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JRadioButton verGraphButton;
    public javax.swing.JRadioButton verTxtButton;
    // End of variables declaration//GEN-END:variables
}
