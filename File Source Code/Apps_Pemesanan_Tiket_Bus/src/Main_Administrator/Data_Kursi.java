/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Administrator;

/**
 *
 * @author MiftakhulAziz
 */

import javax.swing.table.DefaultTableModel; 
import javax.swing.DefaultListModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Data_Kursi extends javax.swing.JFrame {

    /**
     * Creates new form Data_Kursi
     */
    int xMouse;
    int yMouse;
    Connection conn = KonektorDatabase.Conn();
    Statement st;
    ResultSet rs;
    static String Bus_id;
    
    public Data_Kursi() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    private void TampilData(){
       
       // DefaultTableModel model = new DefaultTableModel();
        //model.addColumn("Kode Kursi");
       
        DefaultListModel model = new DefaultListModel();
        
        
        try {
            
            
            
           String sql = "select * from kursi";
           
            //String sql = "select * from kursi";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no=0;
            
            while(rs.next()){
               // no++;
               // model.addRow(new Object[]{
                 //    rs.getString("id_kursi")
               // });
               String aku = rs.getString("id_kursi");
               model.addElement(aku);
            } //jTable5.setModel(model);
            jList1.setModel(model);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void Tampil(){
       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Kursi");
        
        
        try {
            
            
            Bus_id = tKodeBus1.getText();
           //id_kursi = "select tempat.id_kursi from tempat";
           String sql = "select tempat.id_kursi from tempat where tempat.id_bus = '"+Bus_id+"'";
           
            //String sql = "select * from kursi";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no=0;
            
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                     rs.getString("id_kursi")
                });
            } jTable1.setModel(model);
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
      
    private void clear(){
        tKursi.setText("");
        tKodeBus1.setText("");
        kodeTempat.setText("");
        tCari.setText("");
        tKursi.setEditable(true);
    }
    
    
    
    private void TampilKodeBus(){
       /*
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Bus");
       */
       DefaultListModel model = new DefaultListModel();
        
        try {
           
            String sql = "select id_bus from bus";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no=0;
            
            while(rs.next()){
                /*
                no++;
                model.addRow(new Object[]{
                     rs.getString("id_bus")
                });
                */
                String a = rs.getString("id_bus");
               model.addElement(a);
            } //jTable6.setModel(model);
            jList1.setModel(model);
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void TampilTempat(){
       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id_tempat");
        model.addColumn("kode kursi");
        model.addColumn("kode bus");
        
        try {
           
            String sql = "select * from tempat";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no=0;
            
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                     rs.getString("id_tempat"),
                     rs.getString("id_kursi"),
                     rs.getString("id_bus")
                });
            }jTable1.setModel(model);
            jTable1.setShowGrid(true);
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tCari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tKursi = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        kodeTempat = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tKodeBus1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 470));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tCariMousePressed(evt);
            }
        });
        tCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCariActionPerformed(evt);
            }
        });
        jPanel1.add(tCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 350, 30));

        jButton1.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton1.setText("Cari");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, 30));

        jButton3.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 80, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Input Kode Tempat");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 130, -1));
        jPanel1.add(tKursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 270, 40));

        jButton5.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 90, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Database Tempat Duduk");

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Long_Arrow_Left_64px.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        exit1.setBackground(new java.awt.Color(255, 255, 255));
        exit1.setFont(new java.awt.Font("Meiryo UI", 1, 30)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setText("X");
        exit1.setMaximumSize(new java.awt.Dimension(64, 64));
        exit1.setMinimumSize(new java.awt.Dimension(64, 64));
        exit1.setPreferredSize(new java.awt.Dimension(64, 64));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 706, Short.MAX_VALUE)
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 120));

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tambah Data Kursi");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 170, -1));

        jButton2.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton2.setText("Tampilkan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 100, -1));

        kodeTempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeTempatActionPerformed(evt);
            }
        });
        jPanel1.add(kodeTempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 100, 40));

        jButton6.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton6.setText("tambah");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 80, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Daftar Tempat Duduk Pada Bus");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 240, -1));

        tKodeBus1.setEditable(false);
        tKodeBus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKodeBus1ActionPerformed(evt);
            }
        });
        jPanel1.add(tKodeBus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 100, 40));

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_tempat", "kode kursi", "kode bus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 210, 240));

        jButton7.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton7.setText("Simpan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 100, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pilih Kode Bus");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 100, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kode Kursi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jList1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 150, 240));

        jComboBox1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daftar Tempat Duduk", "Daftar Bus" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 150, 30));

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tCariMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCariMousePressed
        // TODO add your handling code here:
        Tampil();
    }//GEN-LAST:event_tCariMousePressed

    private void tCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("id_tempat");
        mdl.addColumn("Kode Kursi");
        mdl.addColumn("Kode bus");
        DefaultListModel model = new DefaultListModel();

        try {
            String sql= "select * from kursi where id_kursi like '%"+tCari.getText()+"%'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int no=0;

            while(rs.next()){
            /*
                no++;
                model.addRow(new Object[]{
                    rs.getString("id_kursi")
                });
            */
            String sa = rs.getString("id_kursi");
               model.addElement(sa);
            }
            //jTable5.setModel(model);
            jList1.setModel(model);
        }
        catch(Exception e){
            System.out.println("salah");
        }
        
        try{
            String sql= "select * from tempat where id_tempat like '%"+tCari.getText()+
                        "%' or id_kursi like '%"+tCari.getText()+
                        "%' or id_bus like '%"+tCari.getText()+"%'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int no=0;

            while(rs.next()){
         
                no++;
                mdl.addRow(new Object[]{
                    rs.getString("id_tempat"),
                    rs.getString("id_kursi"),
                    rs.getString("id_bus")
                });
            }jTable1.setModel(mdl);
            
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "delete from tempat where id_tempat='"+kodeTempat.getText()+"'";
            st = conn.createStatement();
            st.executeUpdate(sql);
            TampilTempat();
            Tampil();
            JOptionPane.showMessageDialog(null, "Data Berhasil DiHapus");
            clear();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal DiHapus");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        dispose();
        new Database_Bus().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        dispose();
        new Database_Bus().setVisible(true);
    }//GEN-LAST:event_backMousePressed

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //id_bus=tBus.getText().toString();
        Tampil();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        TampilData();
        //TampilKodeBus();
        TampilTempat();
    }//GEN-LAST:event_formWindowOpened

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "insert into kursi values('"+tKursi.getText()+"')";
            

            st = conn.createStatement();
            st.executeUpdate(sql);
            
            //String query = "insert into tempat values ('"+kodeTempat.getText()+"','"+tKursi.getText()+"','"+tKodeBus1+"')";
            //st = conn.createStatement();
            //st.executeUpdate(query);
            TampilData();
            clear();
            JOptionPane.showMessageDialog(null, "data kursi berhasil ditambahkan");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void kodeTempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeTempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeTempatActionPerformed

    private void tKodeBus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKodeBus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKodeBus1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
            //String sql = "insert into kursi values('"+tKursi.getText()+"')";
            

            //st = conn.createStatement();
            //st.executeUpdate(sql);
            
            String query = "insert into tempat values ('"+kodeTempat.getText()+"','"+tKursi.getText()+"','"+tKodeBus1.getText()+"')";
            st = conn.createStatement();
            st.executeUpdate(query);
            TampilTempat();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            clear();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
         
        if(jComboBox1.getSelectedItem().equals("Daftar Tempat Duduk")){
            int baris = jList1.getSelectedIndex();
            tKursi.setText(jList1.getSelectedValue().toString());
        }else if(jComboBox1.getSelectedItem().equals("Daftar Bus")){
            int baris = jList1.getSelectedIndex();
            tKodeBus1.setText(jList1.getSelectedValue().toString());
        }
        
       
    }//GEN-LAST:event_jList1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem().equals("Daftar Tempat Duduk")){
            TampilData();
        }else if(jComboBox1.getSelectedItem().equals("Daftar Bus")){
            TampilKodeBus();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clear();
        TampilData();
        TampilTempat();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int s = jTable1.getSelectedRow();
        kodeTempat.setText(jTable1.getModel().getValueAt(s, 0).toString());
        tKodeBus1.setText(jTable1.getModel().getValueAt(s, 1).toString());
        tKursi.setText(jTable1.getModel().getValueAt(s, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(Data_Kursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Kursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Kursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Kursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Kursi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kodeTempat;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tKodeBus1;
    private javax.swing.JTextField tKursi;
    // End of variables declaration//GEN-END:variables
}
