/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Pengguna;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Main_Pengguna.Koneksi.rs;
import static Main_Pengguna.Pemesanan_Tiket.con;
import static Main_Pengguna.Pemesanan_Tiket.st;

/**
 *
 * @author MiftakhulAziz
 */
public class Jenis_Bus extends javax.swing.JFrame {
    private  DefaultTableModel model ;
    Koneksi db = new Koneksi();

    /**
     * Creates new form Jenis_Bus
     */
    public Jenis_Bus() {
        initComponents();
        this.model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
            
        };
        
        tblbus.setModel(model);
        
        model.addColumn("Plat Nomor");
        model.addColumn("Kapasitas Bus");
        model.addColumn("Kelas Bus");
        model.addColumn("Tahun Produksi Bus");
        
        databis();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        exit2 = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbus = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 76, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));
        jPanel2.setPreferredSize(new java.awt.Dimension(588, 207));

        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jenis Bus Yang Beroperasi");

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));

        exit2.setBackground(new java.awt.Color(255, 255, 255));
        exit2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        exit2.setForeground(new java.awt.Color(255, 255, 255));
        exit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit2.setText("X");
        exit2.setMaximumSize(new java.awt.Dimension(64, 64));
        exit2.setMinimumSize(new java.awt.Dimension(64, 64));
        exit2.setPreferredSize(new java.awt.Dimension(64, 64));
        exit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit2MousePressed(evt);
            }
        });

        back1.setBackground(new java.awt.Color(255, 255, 255));
        back1.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Long_Arrow_Left_64px.png"))); // NOI18N
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(back1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 790, 157));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblbus.setBackground(new java.awt.Color(240, 240, 240));
        tblbus.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        tblbus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblbus.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblbus);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 185, 770, 230));

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 790, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 790, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void databis () {
        String query;
         try{
            con = db.con;
            query = "SELECT distinct bus.plat, bus.kapasitas, bus.kelas, bus.tahun_produksi from bus \n";
                    
                   
            
            /*query = "SELECT distinct jadwal.hari_tgl, jadwal.jam, \n"
                    + "bus.plat, bus.kelas, rute.asal, rute.tujuan, rute.waktu_tempuh, rute.jarak, bus.id_bus \n"
                    +" from jadwal, bus, rute, lintasan \n"
                    +" where jadwal.id_lintasan = lintasan.id_lintasan  and lintasan.Id_Bus = bus.id_bus \n"
                    +" and lintasan.id_rute = rute.id_rute \n";*/
            
            
          
            st = (Statement) con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()){
                Object[] obj = new Object[4];
              
                obj[0] = rs.getString("plat");
                obj[1] = rs.getString("kapasitas");
                obj[2] = rs.getString("kelas");
                obj[3] = rs.getString("tahun_produksi");                
                
               
                model.addRow(obj);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void exit2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit2MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit2MousePressed

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        // TODO add your handling code here:
        dispose();
        Menu_Default md = new Menu_Default();
        md.setVisible(true);
    }//GEN-LAST:event_back1MouseClicked

    private void back1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_back1MousePressed

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
            java.util.logging.Logger.getLogger(Jenis_Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jenis_Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jenis_Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jenis_Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jenis_Bus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back1;
    private javax.swing.JLabel exit2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbus;
    // End of variables declaration//GEN-END:variables
}
