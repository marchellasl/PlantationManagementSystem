package plantation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewKaryawan extends javax.swing.JFrame
{
    KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
    public DefaultTableModel model;
    
    public ViewKaryawan() 
    {
        initComponents();
        setLocationRelativeTo(this);        
        setVisible(true);
          
        model = new DefaultTableModel ( );
        tabelkaryawan.setModel(model);
        model.addColumn("ID Karyawan");
        model.addColumn("Nama Karyawan");
        model.addColumn("Jenis Kelamin");
        model.addColumn("No. HP");
        
        readKaryawan();        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbPerempuan = new javax.swing.JRadioButton();
        tfIDKaryawan = new javax.swing.JTextField();
        tfNamaKaryawan = new javax.swing.JTextField();
        tfNoHP = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelkaryawan = new javax.swing.JTable();
        btnInput = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 565));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 565));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(625, 142));

        jLabel1.setFont(new java.awt.Font("Adobe Arabic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Data Karyawan");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("ID Karyawan");

        jLabel3.setText("Nama Karyawan");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("No. HP");

        rbPerempuan.setText("Perempuan");

        rbLaki.setText("Laki-Laki");

        tabelkaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelkaryawan);

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfIDKaryawan)
                            .addComponent(tfNamaKaryawan)
                            .addComponent(tfNoHP, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(btnInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbPerempuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbLaki)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfIDKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInput)
                    .addComponent(btnSearch))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPerempuan)
                            .addComponent(rbLaki))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ViewAdmin admin = new ViewAdmin();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        String idkaryawan = getIDKaryawan();
        String namakaryawan = getNamaKaryawan();
        String jeniskelamin = getJK();
        String notelepon = getNoHP();
        
        insertKaryawan(idkaryawan, namakaryawan, jeniskelamin, notelepon);
        readKaryawan();
        
        tfIDKaryawan.setText("");
        tfNamaKaryawan.setText("");
        tfNoHP.setText("");        
        rbPerempuan.setSelected(false);
        rbLaki.setSelected(false);
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = getIDKaryawan();
        searchKaryawan(search);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int baris = tabelkaryawan.getSelectedRow();
        int kolom = tabelkaryawan.getSelectedColumn();
        String dataterpilih = tabelkaryawan.getValueAt(baris, 0).toString();
        System.out.println(dataterpilih);
        int input = JOptionPane.showConfirmDialog(null,
            "Are you sure want to delete " +dataterpilih+ " ?", "Choose an option",JOptionPane.YES_NO_CANCEL_OPTION);
                if(input==0)
                {
                    deleteKaryawan(dataterpilih);
                    readKaryawan();
                }else
                {
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }          
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        readKaryawan();
        tfIDKaryawan.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void insertKaryawan(String idkaryawan, String namakaryawan, String jeniskelamin, String notelepon)
    {
        try
        {
            String query = "INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`,`jenis_kelamin`, `no_telepon`)"
                    + "VALUES ('"+idkaryawan+"','"+namakaryawan+"', '"+jeniskelamin+"', '"+notelepon+"' )";
            koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
            koneksiDatabase.statement.executeUpdate(query);
            System.out.println("Added");
            JOptionPane.showMessageDialog(null, "Data Added");
        }
        catch(Exception sql)
        {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }        
    } 
    
    public void readKaryawan()
    {
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );
     try
     {
           koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
           String query = "SELECT * FROM `karyawan`;";
           ResultSet resultSet = koneksiDatabase.statement.executeQuery(query);

           while(resultSet.next ())
           {
                Object[ ] obj = new Object[4];
                obj[0] = resultSet.getString("id_karyawan");
                obj[1] = resultSet.getString("nama_karyawan");
                obj[2] = resultSet.getString("jenis_kelamin");
                obj[3] = resultSet.getString("no_telepon");

                model.addRow(obj);
            }
      }
     
     catch(SQLException err)
     {
            JOptionPane.showMessageDialog(null, err.getMessage() );
     }        
    }    

    public void searchKaryawan(String search)
    {
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );
     try
     {
           koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
           String query = "SELECT * FROM `karyawan` WHERE `id_karyawan` LIKE '%"+search+"%';";
           ResultSet resultSet = koneksiDatabase.statement.executeQuery(query);

           while(resultSet.next ())
           {
                Object[ ] obj = new Object[4];
                obj[0] = resultSet.getString("id_karyawan");
                obj[1] = resultSet.getString("nama_karyawan");
                obj[2] = resultSet.getString("jenis_kelamin");
                obj[3] = resultSet.getString("no_telepon");

                model.addRow(obj);
            }
      }
     
     catch(SQLException err)
     {
            JOptionPane.showMessageDialog(null, err.getMessage() );
     }        
    }

    public void deleteKaryawan(String dataterpilih)
    {
        try{
            String query = "DELETE FROM `karyawan` WHERE `id_karyawan` = '"+dataterpilih+"'";
            koneksiDatabase.statement = koneksiDatabase.koneksi.createStatement();
            koneksiDatabase.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Deleted");
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }    
    
    public String getIDKaryawan()
    {
        return tfIDKaryawan.getText();
    }
    
    public String getNamaKaryawan()
    {
        return tfNamaKaryawan.getText();
    }
    
    public String getNoHP()
    {
        return tfNoHP.getText();
    }
    
    public String getJK()
    {
        if(rbPerempuan.isSelected())
        {
            return rbPerempuan.getText();
        }
        else if(rbLaki.isSelected())
        {
            return rbLaki.getText();
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTable tabelkaryawan;
    private javax.swing.JTextField tfIDKaryawan;
    private javax.swing.JTextField tfNamaKaryawan;
    private javax.swing.JTextField tfNoHP;
    // End of variables declaration//GEN-END:variables
}
