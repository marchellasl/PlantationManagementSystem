package plantation;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


public class ViewKegiatan extends javax.swing.JFrame 
{
    KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
    public DefaultTableModel model;

   
    public ViewKegiatan() 
    {
        initComponents();
        setLocationRelativeTo(this);        
        setVisible(true);
        
        model = new DefaultTableModel ( );
        tabelkegiatan.setModel(model);
        model.addColumn("ID Kegiatan");
        model.addColumn("Tanggal Kegiatan");
        model.addColumn("Nama Tanaman");
        model.addColumn("Ukuran Lahan");
        model.addColumn("Nama Karyawan");
        model.addColumn("Biaya Kegiatan");
        
        readKegiatan();
    }
    
    public String getIDKegiatan()
    {
        return tfIDKegiatan.getText();
    }
    
    public String getIDTanaman()
    {
        return tfIDTanaman.getText();
    }
    
    public String getIDLahan()
    {
        return tfIDLahan.getText();
    }
    
    public String getIDKaryawan()
    {
        return tfIDKaryawan.getText();
    }
    
    public String getTanggalKegiatan()
    {
        return tfTanggalKegiatan.getText();
    }
    
    public String getBiayaKegiatan()
    {
        return tfBiayaKegiatan.getText();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tfIDKegiatan2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        lIDKegiatan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfIDLahan = new javax.swing.JTextField();
        tfBiayaKegiatan = new javax.swing.JTextField();
        tfIDTanaman = new javax.swing.JTextField();
        tfIDKegiatan = new javax.swing.JTextField();
        tfIDKaryawan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfTanggalKegiatan = new javax.swing.JTextField();
        btnInputKegiatan = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelkegiatan = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
        jScrollPane3.setViewportView(jTable2);

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
        jScrollPane4.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 565));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 565));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabel7.setFont(new java.awt.Font("Adobe Arabic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Data Kegiatan");
        jLabel7.setToolTipText("");

        btnKembali.setText("Back");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lIDKegiatan.setText("ID Kegiatan");

        jLabel2.setText("ID Tanaman");

        jLabel3.setText("ID Lahan");

        jLabel4.setText("ID Karyawan");

        jLabel5.setText("Tanggal Kegiatan");

        jLabel6.setText("Biaya Kegiatan");

        jLabel1.setText("Rp");

        btnInputKegiatan.setText("Input");
        btnInputKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputKegiatan(evt);
            }
        });

        tabelkegiatan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tabelkegiatan);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lIDKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInputKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfIDTanaman, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIDKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIDLahan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBiayaKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfIDKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTanggalKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIDKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIDKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIDKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfIDTanaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTanggalKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfIDLahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfBiayaKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputKegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputKegiatan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputKegiatan
        String idkegiatan = getIDKegiatan();
        String idtanaman = getIDTanaman();
        String idlahan = getIDLahan();
        String idkaryawan = getIDKaryawan();
        String tanggalkegiatan = getTanggalKegiatan();
        String biayakegiatan = getBiayaKegiatan();
           
        insertKegiatan(idkegiatan, idtanaman, idlahan, idkaryawan, tanggalkegiatan, biayakegiatan);
        readKegiatan();
        
        tfIDKegiatan.setText("");
        tfIDTanaman.setText("");
        tfIDLahan.setText("");
        tfIDKaryawan.setText("");
        tfTanggalKegiatan.setText("");
        tfBiayaKegiatan.setText("");
        
    }//GEN-LAST:event_btnInputKegiatan

    private void btnKembali(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali
            ViewAdmin admin = new ViewAdmin();
            dispose();
    }//GEN-LAST:event_btnKembali

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int baris = tabelkegiatan.getSelectedRow();
        int kolom = tabelkegiatan.getSelectedColumn();
        String dataterpilih = tabelkegiatan.getValueAt(baris, 0).toString();
        System.out.println(dataterpilih);
        int input = JOptionPane.showConfirmDialog(null,
            "Are you sure want to delete " +dataterpilih+ " ?", "Choose an option",JOptionPane.YES_NO_CANCEL_OPTION);
                if(input==0)
                {
                    deleteKegiatan(dataterpilih);
                    readKegiatan();
                }else
                {
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }          

    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = getIDKegiatan();
        searchKegiatan(search);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        readKegiatan();
        
        tfIDKegiatan.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void insertKegiatan(String idkegiatan, String idtanaman, String idlahan, String idkaryawan, String tanggalkegiatan, String biayakegiatan)
    {
        String biayaKegiatan = biayakegiatan;
        int biaya_kegiatan = Integer.parseInt(biayaKegiatan);
        
        String tanggalKegiatan = tanggalkegiatan;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        LocalDate date1 = LocalDate.parse(tanggalKegiatan, formatter);
        try
        {
            String query = "INSERT INTO `kegiatan` (`id_kegiatan`, `id_tanaman`,`id_lahan`,`id_karyawan`, `tanggal_kegiatan`, `biaya_kegiatan`)"
                    + "VALUES ('"+idkegiatan+"','"+idtanaman+"', '"+idlahan+"', '"+idkaryawan+"','"+date1+"', '"+biaya_kegiatan+"' )";
            koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
            koneksiDatabase.statement.executeUpdate(query);
            
            System.out.println("Added");
            JOptionPane.showMessageDialog(null, "Data Added");
        }
        catch(Exception sql)
        {
            System.out.println(sql.getMessage());
        }
        
        try
        {
            String q_sql = "INSERT INTO `detail_tanaman` (`id_kegiatan`, `umur_tanaman`) VALUES ('"+idkegiatan+"', '"+0+"');";
            koneksiDatabase.statement.executeUpdate(q_sql);          
        }
        catch(Exception sql)
        {
            System.out.println(sql.getMessage());
        }
        
        try
        {
            String q_sql = "INSERT INTO `biaya` (`id_kegiatan`, `id_tanaman`, `total_biaya`) VALUES ('"+idkegiatan+"', '"+idtanaman+"', '"+0+"');";
            koneksiDatabase.statement.executeUpdate(q_sql);          
        }
        catch(Exception sql)
        {
            System.out.println(sql.getMessage());
        }        
        
        this.umurTanaman(idkegiatan, tanggalKegiatan);
        this.biayaKegiatan(idkegiatan, idtanaman, biayakegiatan, idlahan);
    }
    
    public void umurTanaman(String idkegiatan, String tanggalkegiatan)
    {
        String tanggalKegiatan = tanggalkegiatan;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        LocalDate tanam = LocalDate.parse(tanggalKegiatan, formatter);       
        LocalDate panen = LocalDate.now();
        
        Period diff = Period.between(tanam, panen);
        int umur = (diff.getYears()*365) + (diff.getMonths()*30) + diff.getDays();
        try
        {
            String query = "UPDATE `detail_tanaman` SET `umur_tanaman`= '"+umur+"' WHERE `id_kegiatan` = '"+idkegiatan+"';";
            koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
            koneksiDatabase.statement.executeUpdate(query);
        }
        catch(Exception sql)
        {
            System.out.println(sql.getMessage());
        }         
    }
    
    public void biayaKegiatan(String idkegiatan, String idtanaman, String biayakegiatan, String idlahan)
    {
        
        
     try
     {
           koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
           String query = "SELECT * FROM kegiatan JOIN lahan ON `kegiatan`.`id_lahan` = `lahan`.`id_lahan` JOIN `tanaman` ON `kegiatan`.`id_tanaman`=`tanaman`.`id_tanaman` where `kegiatan`.`id_kegiatan` = '"+idkegiatan+"';";
           ResultSet resultSet = koneksiDatabase.statement.executeQuery(query);

           while(resultSet.next ())
           {   
               int biaya_kegiatan = Integer.parseInt(biayakegiatan);
               String biaya;
               String size;
               size = resultSet.getString("ukuran_lahan");
               biaya = resultSet.getString("biaya_bibit");
               int biayabibit = Integer.parseInt(biaya);
               int lahan = Integer.parseInt(size);
               long totalbiaya;
               totalbiaya = (long)(biayabibit*lahan)+biaya_kegiatan;
               try
               {
                     String qsql = "UPDATE `biaya` SET `total_biaya`= '"+totalbiaya+"' WHERE `id_kegiatan` = '"+idkegiatan+"';";
                     koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
                     koneksiDatabase.statement.executeUpdate(qsql);
               }
               catch(Exception sql)
               {
                     System.out.println(sql.getMessage());
               } 
               
           }
      }
     catch(SQLException err)
     {
            JOptionPane.showMessageDialog(null, err.getMessage() );
     }

     
    
     
 }
        
    public void readKegiatan()
    {
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );
     try
     {
           koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
           String query = "SELECT * FROM `kegiatan` JOIN `tanaman`ON `kegiatan`.`id_tanaman` = `tanaman`.`id_tanaman` JOIN `lahan` ON `kegiatan`.`id_lahan` = `lahan`.`id_lahan` JOIN `karyawan` ON `kegiatan`.`id_karyawan` = `karyawan`.`id_karyawan`;";
           ResultSet resultSet = koneksiDatabase.statement.executeQuery(query);

           while(resultSet.next ())
           {
                Object[ ] obj = new Object[6];
                obj[0] = resultSet.getString("id_kegiatan");
                obj[1] = resultSet.getString("tanggal_kegiatan");
                obj[2] = resultSet.getString("nama_tanaman");
                obj[3] = resultSet.getString("ukuran_lahan");
                obj[4] = resultSet.getString("nama_karyawan");
                obj[5] = resultSet.getString("biaya_kegiatan");

                model.addRow(obj);
            }
      }
     catch(SQLException err)
     {
            JOptionPane.showMessageDialog(null, err.getMessage() );
     }
    }    
    
    public void deleteKegiatan(String dataterpilih)
    {
        try{
            String query = "DELETE FROM `kegiatan` WHERE `id_kegiatan` = '"+dataterpilih+"'";
            koneksiDatabase.statement = koneksiDatabase.koneksi.createStatement();
            koneksiDatabase.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Deleted");
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
        try{
            String query = "DELETE FROM `detail_tanaman` WHERE `id_kegiatan` = '"+dataterpilih+"'";
            koneksiDatabase.statement = koneksiDatabase.koneksi.createStatement();
            koneksiDatabase.statement.executeUpdate(query);
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }        
    }
    
    public void searchKegiatan(String search)
    {
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );
     try
     {
           koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
           String query = "SELECT * FROM `kegiatan` JOIN `tanaman`ON `kegiatan`.`id_tanaman` = `tanaman`.`id_tanaman` JOIN `lahan` ON `kegiatan`.`id_lahan` = `lahan`.`id_lahan` JOIN `karyawan` ON `kegiatan`.`id_karyawan` = `karyawan`.`id_karyawan` WHERE `kegiatan`.`id_kegiatan` LIKE '%"+search+"%';";
           ResultSet resultSet = koneksiDatabase.statement.executeQuery(query);

           while(resultSet.next ())
           {
                Object[ ] obj = new Object[6];
                obj[0] = resultSet.getString("id_kegiatan");
                obj[1] = resultSet.getString("tanggal_kegiatan");
                obj[2] = resultSet.getString("nama_tanaman");
                obj[3] = resultSet.getString("ukuran_lahan");
                obj[4] = resultSet.getString("nama_karyawan");
                obj[5] = resultSet.getString("biaya_kegiatan");

                model.addRow(obj);
            }
      }
     catch(SQLException err)
     {
            JOptionPane.showMessageDialog(null, err.getMessage() );
     }
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    public javax.swing.JButton btnInputKegiatan;
    public javax.swing.JButton btnKembali;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lIDKegiatan;
    private javax.swing.JTable tabelkegiatan;
    private javax.swing.JTextField tfBiayaKegiatan;
    private javax.swing.JTextField tfIDKaryawan;
    private javax.swing.JTextField tfIDKegiatan;
    private javax.swing.JTextField tfIDKegiatan2;
    private javax.swing.JTextField tfIDLahan;
    private javax.swing.JTextField tfIDTanaman;
    private javax.swing.JTextField tfTanggalKegiatan;
    // End of variables declaration//GEN-END:variables
//int baris = 0 ;
//static Object kolom[] = {" ID Kegiatan ", " ID Tanaman ", " ID Lahan ", " ID Karyawan ", " Tanggal Kegiatan ", " Biaya Kegiatan "} ;
//DefaultTableModel model = new DefaultTableModel(kolom,baris) ; 

}
