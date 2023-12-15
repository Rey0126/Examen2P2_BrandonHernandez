package Examen2P2_BrandonHernandez;

import java.awt.Color;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    private Color color;
    private Jugador jugadorActual;
    private int cont = 0;

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vBuscandoU = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        pBar1 = new javax.swing.JProgressBar();
        jLabel27 = new javax.swing.JLabel();
        vCrearUser = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nPass = new javax.swing.JPasswordField();
        bttnCrearUser = new javax.swing.JButton();
        fNacimiento = new com.toedter.calendar.JDateChooser();
        vUsuario = new javax.swing.JDialog();
        tab = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        garaje = new javax.swing.JScrollPane();
        tablaUser = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        barra3 = new javax.swing.JProgressBar();
        jPanel6 = new javax.swing.JPanel();
        jtComprar = new javax.swing.JScrollPane();
        comprar = new javax.swing.JTable();
        bttnComprar = new javax.swing.JButton();
        cbConcesionarias = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        barra1 = new javax.swing.JProgressBar();
        jPanel11 = new javax.swing.JPanel();
        jtVender = new javax.swing.JScrollPane();
        vender = new javax.swing.JTable();
        bttnVender = new javax.swing.JButton();
        barra2 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        partes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cbClas1 = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        cbDrag = new javax.swing.JComboBox<>();
        cbCar1 = new javax.swing.JComboBox<>();
        cbCar2 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        barraCarro2 = new javax.swing.JProgressBar();
        barraCarro1 = new javax.swing.JProgressBar();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        nName = new javax.swing.JTextField();
        nCorreo = new javax.swing.JTextField();
        nPrecio = new javax.swing.JTextField();
        nPais = new javax.swing.JTextField();
        bttnModificar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bttnEliminarCuenta = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        vAdmin = new javax.swing.JDialog();
        tabPane = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cbUbic = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        btnAgregarConce = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        bttnAgregar = new javax.swing.JButton();
        cbPais = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbModelo = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        bttnColor = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        hp = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        vp = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tiempo = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tiempo1 = new javax.swing.JTextField();
        cbConse = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        longitud = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        curvas = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        locacion = new javax.swing.JTextField();
        btnAgregarCir = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        cbMarcas = new javax.swing.JComboBox<>();
        cbClas = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnAgregarPieza = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        logIn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        bttnIniciar = new javax.swing.JButton();
        bttnCrear = new javax.swing.JButton();
        bttnAdmin = new javax.swing.JButton();

        pBar1.setForeground(new java.awt.Color(0, 0, 204));

        jLabel27.setText("Buscado Usuario...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel27)))
                .addGap(97, 97, 97))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(pBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel27)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vBuscandoULayout = new javax.swing.GroupLayout(vBuscandoU.getContentPane());
        vBuscandoU.getContentPane().setLayout(vBuscandoULayout);
        vBuscandoULayout.setHorizontalGroup(
            vBuscandoULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        vBuscandoULayout.setVerticalGroup(
            vBuscandoULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Crear Usuario");

        jLabel5.setText("Nombre");

        jLabel6.setText("Correo");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Pais");

        jLabel8.setText("Fecha de nacimiento");

        jLabel9.setText("Usuario");

        jLabel10.setText("Contraseña");

        bttnCrearUser.setText("Crear");
        bttnCrearUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnCrearUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel5)
                .addGap(25, 25, 25)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addComponent(fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(nUser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(nPass, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(bttnCrearUser))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGap(35, 35, 35)
                .addComponent(bttnCrearUser))
        );

        javax.swing.GroupLayout vCrearUserLayout = new javax.swing.GroupLayout(vCrearUser.getContentPane());
        vCrearUser.getContentPane().setLayout(vCrearUserLayout);
        vCrearUserLayout.setHorizontalGroup(
            vCrearUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vCrearUserLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        vCrearUserLayout.setVerticalGroup(
            vCrearUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vCrearUserLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        tablaUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Color", "Año", "Recon/Agen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        garaje.setViewportView(tablaUser);

        jScrollPane2.setViewportView(List);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(garaje, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barra3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(barra3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(garaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        tab.addTab("Garaje", jPanel5);

        comprar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Color", "Año", "Recons/Agen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtComprar.setViewportView(comprar);

        bttnComprar.setText("Comprar");
        bttnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnComprarMouseClicked(evt);
            }
        });

        cbConcesionarias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbConcesionariasItemStateChanged(evt);
            }
        });

        jLabel40.setText("Concesionarias:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(cbConcesionarias, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jtComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(bttnComprar)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConcesionarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jtComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnComprar)
                        .addGap(215, 215, 215))))
        );

        tab.addTab("Compra de Carros", jPanel6);

        vender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Color", "Año", "Reconstruido"
            }
        ));
        jtVender.setViewportView(vender);

        bttnVender.setText("Vender");
        bttnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnVenderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jtVender, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(bttnVender)
                .addGap(90, 90, 90))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(barra2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(barra2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jtVender, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(bttnVender)
                        .addGap(205, 205, 205))))
        );

        tab.addTab("Venta de Carros", jPanel11);

        partes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Marca", "Precio", "Tiempo"
            }
        ));
        jScrollPane1.setViewportView(partes);

        jButton1.setText("Instalar");

        cbClas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spoiler", "Rear Bumper", "Front Bumper", "Side Skirts", "Front Fender", "Rear Fender", "Hood", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(cbClas1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(cbClas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        tab.addTab("Instalacion de Partes", jPanel2);

        jLabel42.setText("Circuito:");

        jLabel43.setText("Carro 1:");

        jLabel44.setText("Carro 2:");

        jLabel45.setText("Carro 1:");

        jLabel46.setText("Carro 2:");

        btnComenzar.setText("Comenzar");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbDrag, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbCar1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbCar2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(barraCarro2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraCarro1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComenzar)
                .addGap(374, 374, 374))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDrag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraCarro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraCarro2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(87, 87, 87)
                .addComponent(btnComenzar)
                .addGap(119, 119, 119))
        );

        jTabbedPane1.addTab("Drag", jPanel16);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        tab.addTab("Simulacion", jPanel15);

        jLabel20.setText("Nombre:");

        jLabel21.setText("Correo:");

        jLabel22.setText("Pais:");

        jLabel23.setText("Saldo:");

        bttnModificar.setText("Modificar");
        bttnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnModificarMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("Modificar Jugador");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(305, 305, 305))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nPais, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bttnModificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel19)
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(nName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(nCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(58, 58, 58)
                .addComponent(bttnModificar)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        tab.addTab("Modificar Jugador", jPanel7);

        bttnEliminarCuenta.setText("Eliminar Cuenta");
        bttnEliminarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnEliminarCuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(bttnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(bttnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        tab.addTab("Eliminar Jugador", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        tab.addTab("Salir :D", jPanel9);

        javax.swing.GroupLayout vUsuarioLayout = new javax.swing.GroupLayout(vUsuario.getContentPane());
        vUsuario.getContentPane().setLayout(vUsuarioLayout);
        vUsuarioLayout.setHorizontalGroup(
            vUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        vUsuarioLayout.setVerticalGroup(
            vUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tabPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPaneStateChanged(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setText("Agregar Concesionaria");

        jLabel29.setText("Ubicacion:");

        cbUbic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Japon", "Italia", "Usa", "Alemania" }));

        jLabel30.setText("Nombre:");

        btnAgregarConce.setText("Agregar");
        btnAgregarConce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarConceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbUbic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(btnAgregarConce, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)))))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel28)
                .addGap(51, 51, 51)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cbUbic, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(btnAgregarConce, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        tabPane.addTab("Agregar Concesionaria", jPanel12);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Agregar Carro");

        bttnAgregar.setText("Agregar");
        bttnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnAgregarMouseClicked(evt);
            }
        });

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Japon", "Italia", "Usa", "Alemania" }));
        cbPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPaisItemStateChanged(evt);
            }
        });

        jLabel11.setText("Pais:");

        jLabel12.setText("Marca:");

        cbMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMarcaItemStateChanged(evt);
            }
        });

        jLabel13.setText("Modelo:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agencia", "Reconstruido" }));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Tipo:");

        bttnColor.setText("Color");
        bttnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnColorMouseClicked(evt);
            }
        });

        jLabel15.setText("Color:");

        jLabel16.setText("Año:");

        jLabel17.setText("Precio:");

        jLabel24.setText("HorsePower:");

        jLabel25.setText("Velocidad Punta:");

        jLabel26.setText("Tiempo 0 - 60 Km/h:");

        jLabel36.setText("Tiempo 0 - 100 Km/h:");

        jLabel41.setText("Concesionaria:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(189, 189, 189))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(19, 19, 19)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hp)
                                    .addComponent(cbPais, 0, 171, Short.MAX_VALUE)
                                    .addComponent(cbModelo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbConse, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bttnColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(148, 148, 148)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(year)
                            .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE)
                            .addComponent(cbMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precio))
                        .addGap(57, 57, 57))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel36))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tiempo)
                        .addComponent(vp)
                        .addComponent(tiempo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbConse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttnColor)
                            .addComponent(jLabel15)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addComponent(tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(bttnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        tabPane.addTab("Agregar Carro", jPanel4);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setText("Agregar Circuitos");

        jLabel32.setText("Longitud:");

        jLabel33.setText("Curvas:");

        jLabel34.setText("Tipo:");

        jLabel35.setText("Locacion:");

        btnAgregarCir.setText("Agregar");
        btnAgregarCir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCirMouseClicked(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drag", "off-Road", "Circuito" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel34))
                                    .addComponent(jLabel35))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(locacion)
                            .addComponent(curvas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(longitud, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnAgregarCir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel31)
                .addGap(51, 51, 51)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(curvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(89, 89, 89)
                .addComponent(btnAgregarCir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        tabPane.addTab("Agregar Circuitos", jPanel13);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setText("Agregar Partes");

        cbMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Advance", "DTM Fiberwerkz", "Fifteen52", "Origin Lab", "RocketBunny", "Urban Outlaw" }));

        cbClas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spoiler", "Rear Bumper", "Front Bumper", "Side Skirts", "Front Fender", "Rear Fender", "Hood", " " }));

        jLabel38.setText("Marca:");

        jLabel39.setText("Clasificacion:");

        btnAgregarPieza.setText("Agregar");
        btnAgregarPieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPiezaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbClas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMarcas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel37))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnAgregarPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel37)
                .addGap(51, 51, 51)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(39, 39, 39)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbClas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(66, 66, 66)
                .addComponent(btnAgregarPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        tabPane.addTab("Agregar Partes", jPanel14);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        tabPane.addTab("Salir ", jPanel10);

        javax.swing.GroupLayout vAdminLayout = new javax.swing.GroupLayout(vAdmin.getContentPane());
        vAdmin.getContentPane().setLayout(vAdminLayout);
        vAdminLayout.setHorizontalGroup(
            vAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );
        vAdminLayout.setVerticalGroup(
            vAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Log in");
        logIn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel1.setText("Usuario:");
        logIn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel3.setText("Contraseña:");
        logIn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        logIn.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 230, 31));
        logIn.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 230, 30));

        bttnIniciar.setText("Iniciar Sesión");
        bttnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnIniciarMouseClicked(evt);
            }
        });
        logIn.add(bttnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        bttnCrear.setText("Crear Usuario");
        bttnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnCrearMouseClicked(evt);
            }
        });
        logIn.add(bttnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        bttnAdmin.setText("Ingresar como Admin");
        bttnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnAdminMouseClicked(evt);
            }
        });
        logIn.add(bttnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        getContentPane().add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 427, 428));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnIniciarMouseClicked

        AdminJugador ad = new AdminJugador("./Usuarios.usr");
        ad.cargar();
        boolean correct = true;
        for (Jugador j : ad.getJugadores()) {

            if (j.getUser().equals(user.getText()) && j.getPass().equals(pass.getText())) {
                jugadorActual = j;
                //Agregar Concesionarias al cbConcesionarias
                AdminConcesionaria adc = new AdminConcesionaria("./Concesionarias.cns");
                adc.cargar();
                DefaultComboBoxModel m = (DefaultComboBoxModel) cbConcesionarias.getModel();
                m.removeAllElements();
                for (Concesionaria cns : adc.getConcecionarias()) {
                    m.addElement(cns.getName());
                }
                pBar1.setMaximum(ad.getJugadores().indexOf(j) + 1);
                break;
            } else {
                correct = false;
            }
        }

        if (!correct) {
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña Incorrectos");
        }

        pBar1.setMinimum(0);
        BuscarUser bu = new BuscarUser(pBar1, vBuscandoU, vUsuario, this);
        bu.start();

        user.setText("");
        pass.setText("");
    }//GEN-LAST:event_bttnIniciarMouseClicked

    private void bttnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnCrearMouseClicked
        vCrearUser.pack();
        vCrearUser.setVisible(true);
        vCrearUser.setLocationRelativeTo(null);
    }//GEN-LAST:event_bttnCrearMouseClicked

    private void bttnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnAdminMouseClicked
        vAdmin.pack();
        vAdmin.setVisible(true);
        vAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_bttnAdminMouseClicked

    private void bttnCrearUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnCrearUserMouseClicked
        Date years = fNacimiento.getDate();
        int year = years.getYear() + 1900;
        if ((2023 - year) < 12) {
            JOptionPane.showMessageDialog(this, "Menores de Edad no pueden jugar XD");
        } else {
            Jugador jd = new Jugador(nombre.getText(), correo.getText(), pais.getText(), fNacimiento.getDate().getYear(), nUser.getText(), nPass.getText());
            AdminJugador ad = new AdminJugador("./Usuarios.usr");
            ad.cargar();
            ad.setJugador(jd);
            ad.escribir();
            JOptionPane.showMessageDialog(vAdmin, "Usuario Agregado");
            nombre.setText("");
            correo.setText("");
            pais.setText("");
            fNacimiento.setDate(null);
            nUser.setText("");
            nPass.setText("");
            vCrearUser.setVisible(false);
            this.setVisible(true);
        }
    }//GEN-LAST:event_bttnCrearUserMouseClicked

    private void bttnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnComprarMouseClicked

        AdminJugador ad = new AdminJugador("./Usuarios.usr");
        ad.cargar();

        AdminConcesionaria adc = new AdminConcesionaria("./Concesionarias.cns");
        adc.cargar();

        if (comprar.getSelectedRow() >= 0) {
            for (Concesionaria cns : adc.getConcecionarias()) {
                if (cbConcesionarias.getSelectedItem().equals(cns.getName())) {
                    for (Carro car : cns.getCarrosVenta()) {
                        if (comprar.getSelectedRow() == cns.getCarrosVenta().indexOf(car)) {
                            for (Jugador j : ad.getJugadores()) {
                                if (j.getName().equals(jugadorActual.getName())) {
                                    if (j.getSaldo() < car.getPrecio()) {
                                        JOptionPane.showMessageDialog(vUsuario, "Falta Plata");
                                    } else {
                                        barra1.setStringPainted(true);
                                        barra1.setString("Precio: " + Double.toString(car.getPrecio()));
                                        Progress p = new Progress(barra1, "C");
                                        p.start();
                                        j.getCarrosJ().add(car);
                                        j.setSaldo(j.getSaldo() - car.getPrecio());
                                        jugadorActual.getCarrosJ().add(car);
                                        ad.escribir();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_bttnComprarMouseClicked

    private void bttnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnModificarMouseClicked
        jugadorActual.setName(nName.getText());
        jugadorActual.setCorreo(nCorreo.getText());
        jugadorActual.setPais(nPais.getText());
        jugadorActual.setSaldo(Double.parseDouble(nPrecio.getText()));
        JOptionPane.showMessageDialog(this, "Jugador Modificado");
    }//GEN-LAST:event_bttnModificarMouseClicked

    private void bttnEliminarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnEliminarCuentaMouseClicked

        JOptionPane.showMessageDialog(this, "Cuenta Eliminada");
        vUsuario.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_bttnEliminarCuentaMouseClicked

    private void btnAgregarConceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarConceMouseClicked
        Concesionaria c = new Concesionaria(name.getText(), (String) cbUbic.getSelectedItem());
        AdminConcesionaria ad = new AdminConcesionaria("./Concesionarias.cns");
        ad.cargar();
        ad.setConcesionaria(c);
        ad.escribir();

        DefaultComboBoxModel m = (DefaultComboBoxModel) cbConcesionarias.getModel();
        m.removeAllElements();
        for (Concesionaria cns : ad.getConcecionarias()) {
            m.addElement(cns.getName());
        }
        name.setText("");
        JOptionPane.showMessageDialog(this, "Concesionaria Agregada");
    }//GEN-LAST:event_btnAgregarConceMouseClicked

    private void bttnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnAgregarMouseClicked
        Carro c = new Carro(((String) cbMarca.getSelectedItem()),
                (String) cbModelo.getSelectedItem(),
                ((String) cbTipo.getSelectedItem()),
                color,
                Double.parseDouble(precio.getText()),
                (String) cbPais.getSelectedItem(),
                year.getText(),
                Integer.parseInt(hp.getText()),
                Integer.parseInt(vp.getText()),
                Integer.parseInt(tiempo.getText()),
                Integer.parseInt(tiempo1.getText()));

        AdminCarro adcarro = new AdminCarro("./Carros.car");
        adcarro.cargar();
        adcarro.setCarro(c);
        adcarro.escribir();

        //Agregar carro a la concesionaria
        AdminConcesionaria ad = new AdminConcesionaria("./Concesionarias.cns");
        ad.cargar();
        for (Concesionaria cns : ad.getConcecionarias()) {
            if (cbConse.getSelectedItem().equals(cns.getName())) {
                cns.getCarrosVenta().add(c);
            }
        }
        ad.escribir();
        JOptionPane.showMessageDialog(vAdmin, "Carro Agregado");
        year.setText("");
        precio.setText("");
        hp.setText("");
        vp.setText("");
        tiempo.setText("");
        tiempo1.setText("");
    }//GEN-LAST:event_bttnAgregarMouseClicked

    private void cbPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPaisItemStateChanged
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        if (cbPais.getSelectedItem().equals("Japon")) {
            cbMarca.setModel(modelo);
            cbMarca.addItem("Subaru");
            cbMarca.addItem("Toyota");
            cbMarca.addItem("Nissan");
            cbMarca.addItem("Honda");

        }
        if (cbPais.getSelectedItem().equals("Italia")) {
            cbMarca.setModel(modelo);
            cbMarca.addItem("Ferrari");
            cbMarca.addItem("Lamborghini");

        }
        if (cbPais.getSelectedItem().equals("Usa")) {
            cbMarca.setModel(modelo);
            cbMarca.addItem("FORD");
            cbMarca.addItem("Chevrolet");
            cbMarca.addItem("ACORH");

        }
        if (cbPais.getSelectedItem().equals("Alemania")) {
            cbMarca.setModel(modelo);
            cbMarca.addItem("BMW");
            cbMarca.addItem("Mercedes-Benz");
            cbMarca.addItem("VW");
            cbMarca.addItem("Audi");
            cbMarca.addItem("Porsche");

        }

        DefaultComboBoxModel m = (DefaultComboBoxModel) cbConse.getModel();
        m.removeAllElements();
        AdminConcesionaria ad = new AdminConcesionaria("./Concesionarias.cns");
        ad.cargar();
        for (Concesionaria c : ad.getConcecionarias()) {
            if (cbPais.getSelectedItem().equals(c.getUbi())) {
                m.addElement(c.getName());
            }
        }

    }//GEN-LAST:event_cbPaisItemStateChanged

    private void cbMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMarcaItemStateChanged
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        if (cbMarca.getSelectedItem().equals("Subaru")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("WPZ-x");
            cbModelo.addItem("Imprez");
            cbModelo.addItem("BRZ");
        }
        if (cbMarca.getSelectedItem().equals("Toyota")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("GT-86");
            cbModelo.addItem("Supra");
        }
        if (cbMarca.getSelectedItem().equals("Honda")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("Civic Type-R");
            cbModelo.addItem("Integra Type-R");
            cbModelo.addItem("CR-X");
        }
        if (cbMarca.getSelectedItem().equals("Nissan")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("Skyline-GTR34");
            cbModelo.addItem("Skyline-GTR32");
            cbModelo.addItem("GTR-R35");
            cbModelo.addItem("240SX");
            cbModelo.addItem("350Z");
        }
        if (cbMarca.getSelectedItem().equals("Ferrari")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("LaFerrari");
            cbModelo.addItem("Testorroso");
            cbModelo.addItem("240");
        }
        if (cbMarca.getSelectedItem().equals("Lamborghini")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("Diablo");
            cbModelo.addItem("Huracan");
            cbModelo.addItem("Murcielago");
        }
        if (cbMarca.getSelectedItem().equals("FORD")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("Mustang");
            cbModelo.addItem("F-150");
        }
        if (cbMarca.getSelectedItem().equals("Chevrolet")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("Camaro");
            cbModelo.addItem("Bel-Hir");
        }
        if (cbMarca.getSelectedItem().equals("ACORH")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("NSX");
        }
        if (cbMarca.getSelectedItem().equals("BMW")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("M3");
            cbModelo.addItem("X6");
            cbModelo.addItem("M5");
        }
        if (cbMarca.getSelectedItem().equals("Mercedes-Benz")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("Clase A");
            cbModelo.addItem("GLA");
            cbModelo.addItem("GLC");
            cbModelo.addItem("CLS");
        }
        if (cbMarca.getSelectedItem().equals("VW")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("Beetle");
        }
        if (cbMarca.getSelectedItem().equals("Audi")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("R8");
            cbModelo.addItem("T-Coupe");
        }
        if (cbMarca.getSelectedItem().equals("Porsche")) {
            cbModelo.setModel(modelo);
            cbModelo.addItem("All Carrera");
            cbModelo.addItem("978");
        }
    }//GEN-LAST:event_cbMarcaItemStateChanged

    private void bttnColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnColorMouseClicked
        color = JColorChooser.showDialog(vAdmin, "Escoja el color", Color.yellow);
    }//GEN-LAST:event_bttnColorMouseClicked

    private void btnAgregarCirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCirMouseClicked
        Circuito c = new Circuito(Integer.parseInt(longitud.getText()), Integer.parseInt(curvas.getText()), (String)tipo.getSelectedItem(), locacion.getText());
        AdminCircuitos ad = new AdminCircuitos("./Circuitos.cct");
        ad.cargar();
        ad.setCircuito(c);
        ad.escribir();
        longitud.setText("");
        curvas.setText("");
        locacion.setText("");
        JOptionPane.showMessageDialog(this, "Circuito Agregado");
    }//GEN-LAST:event_btnAgregarCirMouseClicked

    private void tabPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPaneStateChanged
        if (tabPane.getSelectedIndex() == 4) {
            vAdmin.setVisible(false);
            this.setVisible(true);
        }
    }//GEN-LAST:event_tabPaneStateChanged

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged

        if (tab.getSelectedIndex() == 7) {
            vUsuario.setVisible(false);
            this.setVisible(true);
        }
        if (tab.getSelectedIndex() == 0) {
            TablaGaraje();
        }
        if (tab.getSelectedIndex() == 2) {
            TablaVender();
        }
//        if (tab.getSelectedIndex() == 1) {
//            DefaultTableModel model = (DefaultTableModel)comprar.getModel();
//            model.setRowCount(0);
//        }

    }//GEN-LAST:event_tabStateChanged

    private void btnAgregarPiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPiezaMouseClicked
        double precio = 2500.0;
        Partes p = new Partes((String) cbMarca.getSelectedItem(), (String) cbClas.getSelectedItem(), precio);
        AdminPartes ad = new AdminPartes("./Partes.pt");
        ad.cargar();
        ad.setParte(p);
        ad.escribir();
        JOptionPane.showMessageDialog(vAdmin, "Parte Agregada");
    }//GEN-LAST:event_btnAgregarPiezaMouseClicked

    private void cbConcesionariasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbConcesionariasItemStateChanged
        //Llenar tabla con los carros de las concesionarias
        TablaComprar();
    }//GEN-LAST:event_cbConcesionariasItemStateChanged

    private void bttnVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnVenderMouseClicked
        if (vender.getSelectedRow() >= 0) {
            AdminJugador ad = new AdminJugador("./Usuarios.usr");
            ad.cargar();
            for (Jugador j : ad.getJugadores()) {
                if (j.getName().equals(jugadorActual.getName())) {
                    for (Carro car : j.getCarrosJ()) {
                        if (vender.getSelectedRow() == j.getCarrosJ().indexOf(car)) {

                            j.getCarrosJ().remove(car);
                            j.setSaldo(j.getSaldo() + car.getPrecio());
                            ad.setJugadores(ad.getJugadores());
                            ad.escribir();
                            barra2.setStringPainted(true);
                            barra2.setString("Precio: " + Double.toString(car.getPrecio()));
                            Progress p = new Progress(barra2, "V");
                            p.start();
                            break;
                        }
                    }
                }
            }
        }
        TablaVender();
    }//GEN-LAST:event_bttnVenderMouseClicked

    private void TablaGaraje() {
        System.out.println("Entra al garaje");
        if (jugadorActual != null) {
            AdminJugador ad = new AdminJugador("./Usuarios.usr");
            ad.cargar();
            DefaultTableModel m = (DefaultTableModel) comprar.getModel();
            for (Jugador u : ad.getJugadores()) {
                if (u.getUser().equals(jugadorActual.getName())) {
                    Hilos h = new Hilos(m, jugadorActual.getCarrosJ(), "G");
                    h.start();
                    tablaUser.setModel(m);
                }

            }
        }
    }

    private void TablaComprar() {
        System.out.println("Entra a comprar");
        //Le quite el try
        AdminConcesionaria aCon = new AdminConcesionaria("./Concesionarias.cns");
        aCon.cargar();
        DefaultTableModel m = (DefaultTableModel) comprar.getModel();
        for (Concesionaria con : aCon.getConcecionarias()) {
            if (cbConcesionarias.getSelectedItem() != null) {
                if (cbConcesionarias.getSelectedItem().equals(con.getName())) {
                    cont++;
                    System.out.println(cont);
                    Hilos h = new Hilos(m, con.getCarrosVenta(), "C");
                    h.start();
                    comprar.setModel(m);
                }
            }
        }
    }

    private void TablaVender() {
        System.out.println("Entra a vender");
        AdminJugador ad = new AdminJugador("./Usuarios.usr");
        ad.cargar();
        DefaultTableModel m = (DefaultTableModel) comprar.getModel();
        for (Jugador u : ad.getJugadores()) {
            if (u.getUser().equals(jugadorActual.getName())) {
                Hilos h = new Hilos(m, jugadorActual.getCarrosJ(), "V");
                h.start();
                vender.setModel(m);
            }

        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List;
    private javax.swing.JProgressBar barra1;
    private javax.swing.JProgressBar barra2;
    private javax.swing.JProgressBar barra3;
    private javax.swing.JProgressBar barraCarro1;
    private javax.swing.JProgressBar barraCarro2;
    private javax.swing.JButton btnAgregarCir;
    private javax.swing.JButton btnAgregarConce;
    private javax.swing.JButton btnAgregarPieza;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton bttnAdmin;
    private javax.swing.JButton bttnAgregar;
    private javax.swing.JButton bttnColor;
    private javax.swing.JButton bttnComprar;
    private javax.swing.JButton bttnCrear;
    private javax.swing.JButton bttnCrearUser;
    private javax.swing.JButton bttnEliminarCuenta;
    private javax.swing.JButton bttnIniciar;
    private javax.swing.JButton bttnModificar;
    private javax.swing.JButton bttnVender;
    private javax.swing.JComboBox<String> cbCar1;
    private javax.swing.JComboBox<String> cbCar2;
    private javax.swing.JComboBox<String> cbClas;
    private javax.swing.JComboBox<String> cbClas1;
    private javax.swing.JComboBox<String> cbConcesionarias;
    private javax.swing.JComboBox<String> cbConse;
    private javax.swing.JComboBox<String> cbDrag;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbMarcas;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbUbic;
    private javax.swing.JTable comprar;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField curvas;
    private com.toedter.calendar.JDateChooser fNacimiento;
    private javax.swing.JScrollPane garaje;
    private javax.swing.JTextField hp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane jtComprar;
    private javax.swing.JScrollPane jtVender;
    private javax.swing.JTextField locacion;
    private javax.swing.JPanel logIn;
    private javax.swing.JTextField longitud;
    private javax.swing.JTextField nCorreo;
    private javax.swing.JTextField nName;
    private javax.swing.JTextField nPais;
    private javax.swing.JPasswordField nPass;
    private javax.swing.JTextField nPrecio;
    private javax.swing.JTextField nUser;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nombre;
    private javax.swing.JProgressBar pBar1;
    private javax.swing.JTextField pais;
    private javax.swing.JTable partes;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField precio;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tablaUser;
    private javax.swing.JTextField tiempo;
    private javax.swing.JTextField tiempo1;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JTextField user;
    private javax.swing.JDialog vAdmin;
    private javax.swing.JDialog vBuscandoU;
    private javax.swing.JDialog vCrearUser;
    private javax.swing.JDialog vUsuario;
    private javax.swing.JTable vender;
    private javax.swing.JTextField vp;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
