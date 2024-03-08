
import javax.swing.DefaultListModel;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Registrar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jp_password_Registrar = new javax.swing.JPasswordField();
        jt_Nombre_Registrar = new javax.swing.JTextField();
        chb_participante_Registrar = new javax.swing.JCheckBox();
        chb_Administrador_Registrar = new javax.swing.JCheckBox();
        bt_registrar_Registrar = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jd_menuAdmin = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        lb_usuarioIngresado_menuAdmin = new javax.swing.JLabel();
        bt_crearTorneo_menuAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_listaTorneos_menuAdmin = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_usuariosTorneo_menuAdmin = new javax.swing.JList<>();
        bt_cerrarTorneo_menuAdmin = new javax.swing.JButton();
        bt_marcarGanador_menuAdmin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jd_crearTorney = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_nombreTorneo_crearTorney = new javax.swing.JTextField();
        lb_usuarioLogin_crearTorney = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jsp_rondas_crearTorney = new javax.swing.JSpinner();
        bt_crearTorney_crearTorney = new javax.swing.JButton();
        jd_menuParticipante = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        lb_usuarioLogin_menuParticipante = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_torneosCerrados_menuParticipante = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_torneosGanados_menuParticipante = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_torneosDisp_menuParticipante = new javax.swing.JList<>();
        bt_unirseTorneo_menuParticipante = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jp_password = new javax.swing.JPasswordField();
        jb_Registrar = new javax.swing.JButton();
        jb_Registrar1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña");

        buttonGroup1.add(chb_participante_Registrar);
        chb_participante_Registrar.setForeground(new java.awt.Color(0, 0, 0));
        chb_participante_Registrar.setText("Participante");

        buttonGroup1.add(chb_Administrador_Registrar);
        chb_Administrador_Registrar.setForeground(new java.awt.Color(0, 0, 0));
        chb_Administrador_Registrar.setText("Administrador");

        bt_registrar_Registrar.setText("Registrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chb_participante_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chb_Administrador_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jp_password_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                        .addComponent(jt_Nombre_Registrar)))
                .addContainerGap(325, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_registrar_Registrar)
                .addGap(174, 174, 174))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_Nombre_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_password_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_participante_Registrar)
                    .addComponent(chb_Administrador_Registrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(bt_registrar_Registrar)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout jd_RegistrarLayout = new javax.swing.GroupLayout(jd_Registrar.getContentPane());
        jd_Registrar.getContentPane().setLayout(jd_RegistrarLayout);
        jd_RegistrarLayout.setHorizontalGroup(
            jd_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_RegistrarLayout.setVerticalGroup(
            jd_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 51, 255));

        bt_crearTorneo_menuAdmin.setText("Crear Torneo");

        jl_listaTorneos_menuAdmin.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_listaTorneos_menuAdmin);

        jl_usuariosTorneo_menuAdmin.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_usuariosTorneo_menuAdmin);

        bt_cerrarTorneo_menuAdmin.setText("jButton2");

        bt_marcarGanador_menuAdmin.setText("jButton1");

        jLabel5.setText("Torneos");

        jLabel6.setText("Lista Personas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_crearTorneo_menuAdmin)
                .addGap(39, 39, 39))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(bt_cerrarTorneo_menuAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_marcarGanador_menuAdmin)
                .addGap(209, 209, 209))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lb_usuarioIngresado_menuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(205, 205, 205))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lb_usuarioIngresado_menuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_crearTorneo_menuAdmin)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cerrarTorneo_menuAdmin)
                    .addComponent(bt_marcarGanador_menuAdmin))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_menuAdminLayout = new javax.swing.GroupLayout(jd_menuAdmin.getContentPane());
        jd_menuAdmin.getContentPane().setLayout(jd_menuAdminLayout);
        jd_menuAdminLayout.setHorizontalGroup(
            jd_menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_menuAdminLayout.setVerticalGroup(
            jd_menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre del Torneo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Rondas");

        bt_crearTorney_crearTorney.setText("Crear");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsp_rondas_crearTorney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(tf_nombreTorneo_crearTorney, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_usuarioLogin_crearTorney, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(bt_crearTorney_crearTorney)
                        .addGap(111, 111, 111))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lb_usuarioLogin_crearTorney)
                .addGap(57, 57, 57)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_nombreTorneo_crearTorney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jsp_rondas_crearTorney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(bt_crearTorney_crearTorney)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jd_crearTorneyLayout = new javax.swing.GroupLayout(jd_crearTorney.getContentPane());
        jd_crearTorney.getContentPane().setLayout(jd_crearTorneyLayout);
        jd_crearTorneyLayout.setHorizontalGroup(
            jd_crearTorneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearTorneyLayout.setVerticalGroup(
            jd_crearTorneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 255, 204));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Torneos Disponibles");

        jl_torneosCerrados_menuParticipante.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_torneosCerrados_menuParticipante);

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Torneos Cerrados");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Torneos Ganados");

        jl_torneosGanados_menuParticipante.setModel(DefaultListModel());
        jScrollPane4.setViewportView(jl_torneosGanados_menuParticipante);

        jl_torneosDisp_menuParticipante.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jl_torneosDisp_menuParticipante);

        bt_unirseTorneo_menuParticipante.setText("Unirse a torneo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel9)
                .addGap(145, 145, 145)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_usuarioLogin_menuParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(bt_unirseTorneo_menuParticipante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lb_usuarioLogin_menuParticipante)
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(bt_unirseTorneo_menuParticipante)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_menuParticipanteLayout = new javax.swing.GroupLayout(jd_menuParticipante.getContentPane());
        jd_menuParticipante.getContentPane().setLayout(jd_menuParticipanteLayout);
        jd_menuParticipanteLayout.setHorizontalGroup(
            jd_menuParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_menuParticipanteLayout.setVerticalGroup(
            jd_menuParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");

        jb_Registrar.setBackground(new java.awt.Color(51, 255, 51));
        jb_Registrar.setForeground(new java.awt.Color(0, 0, 0));
        jb_Registrar.setText("Registrar");
        jb_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_RegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jb_RegistrarMouseEntered(evt);
            }
        });

        jb_Registrar1.setBackground(new java.awt.Color(102, 255, 51));
        jb_Registrar1.setForeground(new java.awt.Color(0, 0, 0));
        jb_Registrar1.setText("Ingresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_nombre)
                    .addComponent(jp_password, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jb_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(jb_Registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_RegistrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_RegistrarMouseEntered

    private void jb_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_RegistrarMouseClicked
        this.setVisible(false);
        jd_Registrar.pack(); 
        jd_Registrar.setLocationRelativeTo(this);
        jd_Registrar.setVisible(true);
    }//GEN-LAST:event_jb_RegistrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cerrarTorneo_menuAdmin;
    private javax.swing.JButton bt_crearTorneo_menuAdmin;
    private javax.swing.JButton bt_crearTorney_crearTorney;
    private javax.swing.JButton bt_marcarGanador_menuAdmin;
    private javax.swing.JButton bt_registrar_Registrar;
    private javax.swing.JButton bt_unirseTorneo_menuParticipante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chb_Administrador_Registrar;
    private javax.swing.JCheckBox chb_participante_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jb_Registrar;
    private javax.swing.JButton jb_Registrar1;
    private javax.swing.JDialog jd_Registrar;
    private javax.swing.JDialog jd_crearTorney;
    private javax.swing.JDialog jd_menuAdmin;
    private javax.swing.JDialog jd_menuParticipante;
    private javax.swing.JList<String> jl_listaTorneos_menuAdmin;
    private javax.swing.JList<String> jl_torneosCerrados_menuParticipante;
    private javax.swing.JList<String> jl_torneosDisp_menuParticipante;
    private javax.swing.JList<String> jl_torneosGanados_menuParticipante;
    private javax.swing.JList<String> jl_usuariosTorneo_menuAdmin;
    private javax.swing.JPasswordField jp_password;
    private javax.swing.JPasswordField jp_password_Registrar;
    private javax.swing.JSpinner jsp_rondas_crearTorney;
    private javax.swing.JTextField jt_Nombre_Registrar;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JLabel lb_usuarioIngresado_menuAdmin;
    private javax.swing.JLabel lb_usuarioLogin_crearTorney;
    private javax.swing.JLabel lb_usuarioLogin_menuParticipante;
    private javax.swing.JTextField tf_nombreTorneo_crearTorney;
    // End of variables declaration//GEN-END:variables
}
