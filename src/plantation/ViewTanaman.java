package plantation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewTanaman extends javax.swing.JFrame 
{
    KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
    public DefaultTableModel model;
    
    public ViewTanaman() 
    {

        initComponents();
        setLocationRelativeTo(this);        
        setVisible(true);
        
        model = new DefaultTableModel ( );
        tabeltanaman.setModel(model);
        model.addColumn("ID Tanaman");
        model.addColumn("Nama Tanaman");
        model.addColumn("Biaya Bibit / m2");
        
        readTanaman();
     
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
        tfIDTanaman = new javax.swing.JTextField();
        tfNamaTanaman = new javax.swing.JTextField();
        tfBiayaBibit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltanaman = new javax.swing.JTable();
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
        jLabel1.setText("Data Tanaman");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setText("ID Tanaman");

        jLabel3.setText("Nama Tanaman");

        jLabel4.setText("Biaya Bibit/m2");

        jLabel5.setText("Rp");

        tabeltanaman.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabeltanaman);

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
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIDTanaman, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBiayaBibit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNamaTanaman, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addGap(0, 41, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIDTanaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInput)
                            .addComponent(btnSearch))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfNamaTanaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfBiayaBibit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDelete)
                                    .addComponent(btnRefresh))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String getIDTanaman()
    {
        return tfIDTanaman.getText();
    }
    
    public String getNamaTanaman()
    {
        return tfNamaTanaman.getText();
    }
    
    public String getBiayaBibit()
    {
        return tfBiayaBibit.getText();
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ViewAdmin admin = new ViewAdmin();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        String idtanaman = getIDTanaman();
        String namatanaman = getNamaTanaman();
        String biayabibit = getBiayaBibit();
        
        insertTanaman(idtanaman, namatanaman, biayabibit);
        readTanaman();
        
        tfIDTanaman.setText("");
        tfNamaTanaman.setText("");
        tfBiayaBibit.setText("");
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int baris = tabeltanaman.getSelectedRow();
        int kolom = tabeltanaman.getSelectedColumn();
        String dataterpilih = tabeltanaman.getValueAt(baris, 0).toString();
        System.out.println(dataterpilih);
        int input = JOptionPane.showConfirmDialog(null,
            "Are you sure want to delete " +dataterpilih+ " ?", "Choose an option",JOptionPane.YES_NO_CANCEL_OPTION);
                if(input==0)
                {
                    deleteTanaman(dataterpilih);
                    readTanaman();
                }else
                {
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = getIDTanaman();
        searchTanaman(search);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        readTanaman();
        tfIDTanaman.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void insertTanaman(String idtanaman, String namatanaman, String biayabibit)
    {
        String biayaBibit = biayabibit;
        int biaya_bibit= Integer.parseInt(biayaBibit);
        
        try
        {
            String query = "INSERT INTO `tanaman` (`id_tanaman`, `nama_tanaman`,`biaya_bibit`)"
                    + "VALUES ('"+idtanaman+"','"+namatanaman+"', '"+biaya_bibit+"' )";
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
    
    public void readTanaman()
    {
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );
     try
     {
           koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
           String query = "SELECT * FROM `tanaman`;";
           ResultSet resultSet = koneksiDatabase.statement.executeQuery(query);

           while(resultSet.next ())
           {
                Object[ ] obj = new Object[3];
                obj[0] = resultSet.getString("id_tanaman");
                obj[1] = resultSet.getString("nama_tanaman");
                obj[2] = resultSet.getString("biaya_bibit");

                model.addRow(obj);
            }
      }
     catch(SQLException err)
     {
            JOptionPane.showMessageDialog(null, err.getMessage() );
     }
    }
    
    public void deleteTanaman(String dataterpilih)
    {
        try{
            String query = "DELETE FROM `tanaman` WHERE `id_tanaman` = '"+dataterpilih+"'";
            koneksiDatabase.statement = koneksiDatabase.koneksi.createStatement();
            koneksiDatabase.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Deleted");
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    public void searchTanaman(String search)
    {
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );
     try
     {
           koneksiDatabase.statement = (Statement) koneksiDatabase.koneksi.createStatement();
           String query = "SELECT * FROM `tanaman` WHERE `id_tanaman` LIKE '%"+search+"%';";
           ResultSet resultSet = koneksiDatabase.statement.executeQuery(query);

           while(resultSet.next ())
           {
                Object[ ] obj = new Object[3];
                obj[0] = resultSet.getString("id_tanaman");
                obj[1] = resultSet.getString("nama_tanaman");
                obj[2] = resultSet.getString("biaya_bibit");

                model.addRow(obj);
            }
      }
     catch(SQLException err)
     {
            JOptionPane.showMessageDialog(null, err.getMessage() );
     }
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
    private javax.swing.JTable tabeltanaman;
    private javax.swing.JTextField tfBiayaBibit;
    private javax.swing.JTextField tfIDTanaman;
    private javax.swing.JTextField tfNamaTanaman;
    // End of variables declaration//GEN-END:variables
}
