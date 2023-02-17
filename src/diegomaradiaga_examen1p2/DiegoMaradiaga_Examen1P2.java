package diegomaradiaga_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class DiegoMaradiaga_Examen1P2 extends javax.swing.JFrame {

    static ArrayList <PC> lista = new ArrayList();
    static Scanner leer = new Scanner(System.in);
    
    public DiegoMaradiaga_Examen1P2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrudPC = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        Listar = new javax.swing.JTabbedPane();
        AgregarPanel = new javax.swing.JPanel();
        tipo = new javax.swing.JLabel();
        Ip = new javax.swing.JLabel();
        mascaraRed = new javax.swing.JLabel();
        jTFhost = new javax.swing.JTextField();
        host1 = new javax.swing.JLabel();
        laptop = new javax.swing.JRadioButton();
        escritorio = new javax.swing.JRadioButton();
        jTFip = new javax.swing.JTextField();
        jTFmascara = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ListarPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        EliminarPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Eliminar = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Laptop = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFmarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFpantalla = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBTrue = new javax.swing.JRadioButton();
        jBFalse = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Escritorio = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jBTruee = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jBFalsee = new javax.swing.JRadioButton();
        Aceptar2 = new javax.swing.JButton();
        jTFram = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFalmacenamiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFtipo = new javax.swing.JTextField();
        buttonGroup3 = new javax.swing.ButtonGroup();
        Principal = new javax.swing.JPanel();
        btnSimulacion = new javax.swing.JButton();
        btnCRUD1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        CrudPC.setBackground(new java.awt.Color(204, 0, 0));
        CrudPC.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        CrudPC.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        Listar.setBackground(new java.awt.Color(255, 255, 255));
        Listar.setForeground(new java.awt.Color(0, 0, 0));
        Listar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        AgregarPanel.setBackground(new java.awt.Color(204, 204, 204));
        AgregarPanel.setForeground(new java.awt.Color(204, 204, 204));

        tipo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tipo.setForeground(new java.awt.Color(0, 0, 0));
        tipo.setText("Tipo de PC:");

        Ip.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Ip.setForeground(new java.awt.Color(0, 0, 0));
        Ip.setText("Direccion IP: ");

        mascaraRed.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        mascaraRed.setForeground(new java.awt.Color(0, 0, 0));
        mascaraRed.setText("Mascara de red:");

        jTFhost.setBackground(new java.awt.Color(255, 255, 255));
        jTFhost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTFhost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        host1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        host1.setForeground(new java.awt.Color(0, 0, 0));
        host1.setText("Host name:");

        buttonGroup1.add(laptop);
        laptop.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        laptop.setForeground(new java.awt.Color(0, 0, 0));
        laptop.setText("Laptop");

        buttonGroup1.add(escritorio);
        escritorio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        escritorio.setForeground(new java.awt.Color(0, 0, 0));
        escritorio.setText("Escritorio");

        jTFip.setBackground(new java.awt.Color(255, 255, 255));
        jTFip.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTFip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFmascara.setBackground(new java.awt.Color(255, 255, 255));
        jTFmascara.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTFmascara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("S");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgregarPanelLayout = new javax.swing.GroupLayout(AgregarPanel);
        AgregarPanel.setLayout(AgregarPanelLayout);
        AgregarPanelLayout.setHorizontalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mascaraRed, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ip, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(host1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFhost, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AgregarPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(laptop, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jTFip, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFmascara, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        AgregarPanelLayout.setVerticalGroup(
            AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ip, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFip, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mascaraRed, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFmascara, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFhost, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(host1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(AgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escritorio)
                    .addComponent(laptop)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );

        Listar.addTab("Agregar", AgregarPanel);

        ListarPanel.setBackground(new java.awt.Color(153, 153, 153));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Listar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListarPanelLayout = new javax.swing.GroupLayout(ListarPanel);
        ListarPanel.setLayout(ListarPanelLayout);
        ListarPanelLayout.setHorizontalGroup(
            ListarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(ListarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        ListarPanelLayout.setVerticalGroup(
            ListarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );

        Listar.addTab("Listar", ListarPanel);

        EliminarPanel.setBackground(new java.awt.Color(102, 102, 102));

        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EliminarPanelLayout = new javax.swing.GroupLayout(EliminarPanel);
        EliminarPanel.setLayout(EliminarPanelLayout);
        EliminarPanelLayout.setHorizontalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eliminar)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        EliminarPanelLayout.setVerticalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Listar.addTab("Eliminar", EliminarPanel);

        CrudPC.getContentPane().add(Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));
        Listar.getAccessibleContext().setAccessibleName("Agregar");

        Laptop.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Laptop");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RGB_?");

        jTFmarca.setBackground(new java.awt.Color(255, 255, 255));
        jTFmarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Marca: ");

        jTFpantalla.setBackground(new java.awt.Color(255, 255, 255));
        jTFpantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Definicion de pantalla: ");

        jBTrue.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jBTrue.setForeground(new java.awt.Color(0, 0, 0));
        jBTrue.setText("Sí");

        jBFalse.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jBFalse.setForeground(new java.awt.Color(0, 0, 0));
        jBFalse.setText("No");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBTrue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Aceptar))
                                .addComponent(jTFpantalla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTrue)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Aceptar))
                .addGap(23, 23, 23))
        );

        Laptop.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 340));

        jLabel5.setText("jLabel5");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 389));

        jLabel7.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Escritorio");

        buttonGroup3.add(jBTruee);
        jBTruee.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jBTruee.setForeground(new java.awt.Color(0, 0, 0));
        jBTruee.setText("Sí");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("RGB_?");

        jBFalsee.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jBFalsee.setForeground(new java.awt.Color(0, 0, 0));
        jBFalsee.setText("No");

        Aceptar2.setText("Guardar");
        Aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar2ActionPerformed(evt);
            }
        });

        jTFram.setBackground(new java.awt.Color(255, 255, 255));
        jTFram.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Capacidad de RAM:");

        jTFalmacenamiento.setBackground(new java.awt.Color(255, 255, 255));
        jTFalmacenamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Capacidad de almacenamiento:");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo de almacenamiento:");

        jTFtipo.setBackground(new java.awt.Color(255, 255, 255));
        jTFtipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBTruee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFram, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jBFalsee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Aceptar2))
                        .addComponent(jTFalmacenamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFram, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFalmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTruee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFalsee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Aceptar2))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio.getContentPane());
        Escritorio.getContentPane().setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principal.setBackground(new java.awt.Color(51, 51, 51));
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSimulacion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnSimulacion.setForeground(new java.awt.Color(98, 189, 255));
        btnSimulacion.setText("Simulacion PC");
        btnSimulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimulacionMouseClicked(evt);
            }
        });
        Principal.add(btnSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 140, 50));

        btnCRUD1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCRUD1.setForeground(new java.awt.Color(98, 189, 255));
        btnCRUD1.setText("CRUD PC");
        btnCRUD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCRUD1MouseClicked(evt);
            }
        });
        btnCRUD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCRUD1ActionPerformed(evt);
            }
        });
        Principal.add(btnCRUD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/360_F_461332724_06x1KjY98sZHT4DVzBVoLx2fMrwFTSzk (1).jpg"))); // NOI18N
        Principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        getContentPane().add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCRUD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCRUD1MouseClicked
        CrudPC.setLocationRelativeTo(null);
        CrudPC.setVisible(true);
        CrudPC.setSize(620, 400);
        this.dispose();
    }//GEN-LAST:event_btnCRUD1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (escritorio.isSelected()){
            Escritorio.setLocationRelativeTo(null);
            Escritorio.setVisible(true);
            Escritorio.setSize(250, 340);
            CrudPC.dispose();
        } else if (laptop.isSelected()){
            Laptop.setLocationRelativeTo(null);
            Laptop.setVisible(true);
            Laptop.setSize(268, 429);
            CrudPC.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        String Ip = jTFip.getText();
        String Mascara = jTFmascara.getText();
        String Host = jTFhost.getText();
        
        String marca = jTFmarca.getText();
        String pantalla = jTFpantalla.getText();
        boolean tg= true;
        if (jBTrue.isSelected()){
            tg = true;
        } else if (jBFalse.isSelected()){
            tg = false;
        }
        
        lista.add(new PClaptop(marca, pantalla, tg, Ip, Mascara, Host));
        JOptionPane.showMessageDialog(null, "Agregado con exito");
        
        CrudPC.setLocationRelativeTo(null);
        CrudPC.setVisible(true);
        CrudPC.setSize(499, 478);
    }//GEN-LAST:event_AceptarActionPerformed

    private void Aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar2ActionPerformed
        String Ip = jTFip.getText();
        String Mascara = jTFmascara.getText();
        String Host = jTFhost.getText();
        
        int ram = Integer.parseInt(jTFram.getText());
        int almacenamiento = Integer.parseInt(jTFalmacenamiento.getText());
        String tipo = jTFtipo.getText();
        boolean Rgb= true;
        if (jBTruee.isSelected()){
            Rgb = true;
        } else if (jBFalsee.isSelected()){
            Rgb = false;
        }
        lista.add(new PCescritorio(ram, almacenamiento, tipo, Rgb, Ip, Mascara, Host));
        JOptionPane.showMessageDialog(null, "Agregado con exito");
        CrudPC.setLocationRelativeTo(null);
        CrudPC.setVisible(true);
        CrudPC.setSize(499, 478);
    }//GEN-LAST:event_Aceptar2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String listar = "";
        for (Object t : lista) {
            if (t instanceof PC){
                listar += ""+lista.indexOf(t)+") "+t+"";
            }
        }
        jTextArea1.setText(listar);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        String listar = "";
        for (Object t : lista) {
            if (t instanceof PC){
                listar += ""+lista.indexOf(t)+") "+t+"";
            }
        }
        jTextArea1.setText(listar);
        
        int indexD = Integer.parseInt(JOptionPane.showInputDialog(null, "Que computadora desea eliminar? "));
        lista.remove(indexD);
    }//GEN-LAST:event_EliminarActionPerformed

    private void btnCRUD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCRUD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCRUD1ActionPerformed

    private void btnSimulacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimulacionMouseClicked
        this.setVisible(false);
        System.out.println("Simulacion\n"
                + "");
        System.out.print("1. Ping\n"
                        +"2. Show\n"
                        +"3. Exit\n"
                        +"Que opcion desea? ");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:{
                
            }break;
            case 2:{
                
            }break;
            case 3:{
                this.setVisible(true);
            }break;
            default:{
                System.out.println("Opcion no valida");
            }break;
                
        }
        
    }//GEN-LAST:event_btnSimulacionMouseClicked

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
            java.util.logging.Logger.getLogger(DiegoMaradiaga_Examen1P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiegoMaradiaga_Examen1P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiegoMaradiaga_Examen1P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiegoMaradiaga_Examen1P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiegoMaradiaga_Examen1P2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Aceptar2;
    private javax.swing.JPanel AgregarPanel;
    private javax.swing.JFrame CrudPC;
    private javax.swing.JButton Eliminar;
    private javax.swing.JPanel EliminarPanel;
    private javax.swing.JFrame Escritorio;
    private javax.swing.JLabel Ip;
    private javax.swing.JFrame Laptop;
    private javax.swing.JTabbedPane Listar;
    private javax.swing.JPanel ListarPanel;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnCRUD1;
    private javax.swing.JButton btnSimulacion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton escritorio;
    private javax.swing.JLabel host1;
    private javax.swing.JRadioButton jBFalse;
    private javax.swing.JRadioButton jBFalsee;
    private javax.swing.JRadioButton jBTrue;
    private javax.swing.JRadioButton jBTruee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFalmacenamiento;
    private javax.swing.JTextField jTFhost;
    private javax.swing.JTextField jTFip;
    private javax.swing.JTextField jTFmarca;
    private javax.swing.JTextField jTFmascara;
    private javax.swing.JTextField jTFpantalla;
    private javax.swing.JTextField jTFram;
    private javax.swing.JTextField jTFtipo;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton laptop;
    private javax.swing.JLabel mascaraRed;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}
