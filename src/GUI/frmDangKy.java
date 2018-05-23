package GUI;

import BUS.DeTaiBUS;
import BUS.PhieuDangKyBUS;
import BUS.SinhVienBUS;
import DTO.ComboBoxDTO;
import DTO.PhieuDangKyDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frmDangKy extends javax.swing.JFrame {

    public frmDangKy() throws SQLException {
        initComponents();
        setTitle("Đăng Ký Đề Tài");

        loadComboBoxMSSV();
        loadComboBoxDT();
        LoadDataPDK(tbDK);
    }

    private void loadComboBoxMSSV() {
        SinhVienBUS SVBUS = new SinhVienBUS();

        ResultSet rs = SVBUS.GetData();
        ComboBoxDTO.LoadDuLieuCombobox(rs, cbxMSSV_FK, "MSSV", "MSSV");
    }

    private void loadComboBoxDT() {
        DeTaiBUS DTBUS = new DeTaiBUS();

        ResultSet rs = DTBUS.GetData();
        ComboBoxDTO.LoadDuLieuCombobox(rs, cbxMaDT_FK, "MaDeTai", "MaDeTai");
    }

    private void LoadDataPDK(JTable tb) throws SQLException {
        PhieuDangKyBUS PDKBUS = new PhieuDangKyBUS();
        DefaultTableModel tm = new DefaultTableModel();

        String[] title = {"STT", "Mã PDK", "MSSV", "Mã DT", "Ngày DK"};
        tm.setColumnIdentifiers(title);

        //nạp dữ liệu vào DefaultTableModel  
        ResultSet rs = PDKBUS.GetData();
        int i = 1;
        while (rs.next()) {
            tm.addRow(new Object[]{i, rs.getString(1), rs.getString(4), rs.getString(3), rs.getString(2)});
            i++;
        }

        // gán DefaultTableModel và JTable và đóng kết nối  
        tb.setModel(tm);
        PDKBUS.Close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaPhieuDK = new javax.swing.JTextField();
        dtNgayDK = new com.toedter.calendar.JDateChooser();
        cbxMSSV_FK = new javax.swing.JComboBox<>();
        cbxMaDT_FK = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDK = new javax.swing.JTable(){
            private boolean inLayout;

            @Override
            public boolean getScrollableTracksViewportWidth() {
                return hasExcessWidth();

            }

            @Override
            public void doLayout() {
                if (hasExcessWidth()) {
                    // fool super
                    autoResizeMode = AUTO_RESIZE_SUBSEQUENT_COLUMNS;
                }
                inLayout = true;
                super.doLayout();
                inLayout = false;
                autoResizeMode = AUTO_RESIZE_OFF;
            }

            protected boolean hasExcessWidth() {
                return getPreferredSize().width < getParent().getWidth();
            }

            @Override
            public void columnMarginChanged(ChangeEvent e) {
                if (isEditing()) {
                    // JW: darn - cleanup to terminate editing ...
                    removeEditor();
                }
                TableColumn resizingColumn = getTableHeader().getResizingColumn();
                // Need to do this here, before the parent's
                // layout manager calls getPreferredSize().
                if (resizingColumn != null && autoResizeMode == AUTO_RESIZE_OFF
                    && !inLayout) {
                    resizingColumn.setPreferredWidth(resizingColumn.getWidth());
                }
                resizeAndRepaint();
            }

        };
        //Srouce: stackoverflow.coms;
        jbtnDangKy = new javax.swing.JButton();
        jbtnXoa = new javax.swing.JButton();
        jbtnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sinh viên đăng ký đề tài", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã số sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã phiếu đăng ký");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã đề tài");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày đăng ký");

        cbxMSSV_FK.setMaximumRowCount(20);

        cbxMaDT_FK.setMaximumRowCount(20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtMaPhieuDK, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxMSSV_FK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtNgayDK, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(cbxMaDT_FK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxMSSV_FK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxMaDT_FK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dtNgayDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách đăng ký đề tài", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        tbDK.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDKMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDK);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jbtnDangKy.setText("Đăng ký");
        jbtnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDangKyActionPerformed(evt);
            }
        });

        jbtnXoa.setText("Xóa");
        jbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXoaActionPerformed(evt);
            }
        });

        jbtnSua.setText("Sửa");
        jbtnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSuaActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtTimKiem.setText("Tìm theo mã phiếu DK");
        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnDangKy)
                                    .addComponent(jbtnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTimKiem)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnDangKy)
                                .addComponent(jbtnXoa)))
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSua)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimKiem)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jPanel2.getAccessibleContext().setAccessibleName("aaaaaaaaaaaaaaa");

        setSize(new java.awt.Dimension(820, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();

        frmManHinh f = new frmManHinh();

        f.setVisible(true); //Hiện form lên
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmLogin.EXIT_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows

    }//GEN-LAST:event_btnThoatActionPerformed

    private void jbtnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDangKyActionPerformed
        PhieuDangKyBUS PDKBUS = new PhieuDangKyBUS();
        PhieuDangKyDTO PDK = new PhieuDangKyDTO();

        try {
            PDK.setMaPhieuDK(txtMaPhieuDK.getText().trim());

            String MSSV = ComboBoxDTO.getSelectedItemID(cbxMSSV_FK).trim();
            PDK.setMSSV(MSSV);

            String MaDT = ComboBoxDTO.getSelectedItemID(cbxMaDT_FK).trim();
            PDK.setMaDeTai(MaDT);

            String NgayDK = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            NgayDK = dateFormat.format(dtNgayDK.getDate());
            PDK.setNgayDK(NgayDK);

            String MaPDK = txtMaPhieuDK.getText().trim();

            if (!(PDKBUS.CheckID(MaPDK))) {
                PDKBUS.Insert(PDK);
                LoadDataPDK(tbDK);
            } else {
                JOptionPane.showConfirmDialog(null, "Mã phiếu đăng ký " + MaPDK.toString() + " đã tồn tại", "Thông báo", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Đăng ký bị lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION);
        } finally {
            PDKBUS.Close();
        }


    }//GEN-LAST:event_jbtnDangKyActionPerformed

    private void tbDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDKMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbDK.getModel();

        int selectedRowIndex = tbDK.getSelectedRow();

        //bắt đầu từ 1, vì vị trí 0 là STT nên kh lấy
        txtMaPhieuDK.setText(model.getValueAt(selectedRowIndex, 1).toString());

        String valua1 = model.getValueAt(selectedRowIndex, 2).toString();
        ComboBoxDTO.setSelectedComboBox(cbxMSSV_FK, valua1);

        String valua2 = model.getValueAt(selectedRowIndex, 3).toString();
        ComboBoxDTO.setSelectedComboBox(cbxMaDT_FK, valua2);

        String NgayDK = model.getValueAt(selectedRowIndex, 4).toString();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = format.parse(NgayDK);
        } catch (ParseException ex) {
            Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        dtNgayDK.setDate(date);


    }//GEN-LAST:event_tbDKMouseClicked

    //SỬA. ĐẶT LỘN TÊN THÀNH XÓA, KH SỬA LẠI ĐC
    private void jbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaActionPerformed
        PhieuDangKyBUS PDKBUS = new PhieuDangKyBUS();
        try {
            String MaPDK = txtMaPhieuDK.getText().trim();
            PDKBUS.Delete(MaPDK);
            LoadDataPDK(tbDK);
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Xóa bị lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION);
        } finally {
            PDKBUS.Close();
        }

    }//GEN-LAST:event_jbtnXoaActionPerformed

    private void jbtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSuaActionPerformed

        PhieuDangKyBUS PDKBUS = new PhieuDangKyBUS();
        PhieuDangKyDTO PDK = new PhieuDangKyDTO();

        try {
            PDK.setMaPhieuDK(txtMaPhieuDK.getText().trim());

            String MSSV = ComboBoxDTO.getSelectedItemID(cbxMSSV_FK).trim();
            PDK.setMSSV(MSSV);

            String MaDT = ComboBoxDTO.getSelectedItemID(cbxMaDT_FK).trim();
            PDK.setMaDeTai(MaDT);

            String NgayDK = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            NgayDK = dateFormat.format(dtNgayDK.getDate());
            PDK.setNgayDK(NgayDK);

            PDKBUS.Update(PDK);
            LoadDataPDK(tbDK);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Sửa bị lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION);
        } finally {
            PDKBUS.Close();
        }
    }//GEN-LAST:event_jbtnSuaActionPerformed

    private void txtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseClicked
        txtTimKiem.setText("");
    }//GEN-LAST:event_txtTimKiemMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed

        String search = txtTimKiem.getText().trim();

        
        PhieuDangKyBUS PDKBUS = new PhieuDangKyBUS();
        DefaultTableModel tm = new DefaultTableModel();

        String[] title = {"STT", "Mã PDK", "MSSV", "Mã DT", "Ngày DK"};
        tm.setColumnIdentifiers(title);

        //nạp dữ liệu vào DefaultTableModel  
        ResultSet rs = PDKBUS.TimKiem(search);
        int i = 1;
        try {
            while (rs.next()) {
                tm.addRow(new Object[]{i, rs.getString(1), rs.getString(4), rs.getString(3), rs.getString(2)});
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmDangKy.class.getName()).log(Level.SEVERE, null, ex);
        }

        // gán DefaultTableModel và JTable và đóng kết nối  
        tbDK.setModel(tm);
        PDKBUS.Close();
        
        
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmDangKy f = null;
                try {
                    f = new frmDangKy();
                } catch (SQLException ex) {
                    Logger.getLogger(frmDangKy.class.getName()).log(Level.SEVERE, null, ex);
                }

                f.setVisible(true);
                f.setSize(842, 492);
                f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
                f.setResizable(false); //người dùng không được chỉnh kích thước frm
                f.setDefaultCloseOperation(frmThongKe.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbxMSSV_FK;
    private javax.swing.JComboBox<String> cbxMaDT_FK;
    private com.toedter.calendar.JDateChooser dtNgayDK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnDangKy;
    private javax.swing.JButton jbtnSua;
    private javax.swing.JButton jbtnXoa;
    private javax.swing.JTable tbDK;
    private javax.swing.JTextField txtMaPhieuDK;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
