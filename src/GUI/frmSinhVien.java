/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.SinhVienBUS;
import DTO.SinhVienDTO;
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

/**
 *
 * @author Viet Anh
 */
public class frmSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form SinhVien
     */
    public frmSinhVien() throws SQLException {
        initComponents();
        setTitle("Sinh viên");

        LoadDataSinhVien(tbSV);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();
        txtMSSV = new javax.swing.JTextField();
        txtKhoa = new javax.swing.JTextField();
        txtEmailSV = new javax.swing.JTextField();
        txtSDTSV = new javax.swing.JTextField();
        cbxGioiTinhSV = new javax.swing.JComboBox<>();
        jbtnThem = new javax.swing.JButton();
        jbtnXoa = new javax.swing.JButton();
        jbtnSua = new javax.swing.JButton();
        dtNgaySinhSV = new com.toedter.calendar.JDateChooser();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSV = new javax.swing.JTable(){
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
        //Srouce: stackoverflow.com;
        jPanel3 = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sinh viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã số sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên sinh viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ngày sinh");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Khoa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Giới tính");

        cbxGioiTinhSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jbtnThem.setText("Thêm");
        jbtnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThemActionPerformed(evt);
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

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtTimKiem.setText("Tìm theo mã hoặc tên SV");
        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dtNgaySinhSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTenSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(txtMSSV, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnThem)
                        .addGap(31, 31, 31)
                        .addComponent(jbtnSua)
                        .addGap(37, 37, 37)
                        .addComponent(jbtnXoa)
                        .addGap(134, 134, 134)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxGioiTinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSDTSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(cbxGioiTinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtNgaySinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiem)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnThem)
                        .addComponent(jbtnXoa)
                        .addComponent(jbtnSua)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sinh viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        tbSV.setModel(new javax.swing.table.DefaultTableModel(
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
        tbSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSV);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        setSize(new java.awt.Dimension(861, 430));
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

    private void jbtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThemActionPerformed

        SinhVienBUS SVBUS = new SinhVienBUS();
        SinhVienDTO SV = new SinhVienDTO();

        try {
            SV.setMSSV(txtMSSV.getText().trim());
            SV.setHoTen(txtTenSV.getText().trim());

            String NgaySinh = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            NgaySinh = dateFormat.format(dtNgaySinhSV.getDate());

            SV.setNgaySinh(NgaySinh);
            SV.setPhai(cbxGioiTinhSV.getSelectedItem().toString().trim());
            SV.setKhoa(txtKhoa.getText().trim());
            SV.setEmail(txtEmailSV.getText().trim());
            SV.setSDT(txtSDTSV.getText().trim());

            String MSSV = txtMSSV.getText().trim();

            if (!(SVBUS.CheckID(MSSV))) {
                SVBUS.Insert(SV);
                LoadDataSinhVien(tbSV);
            } else {
                JOptionPane.showConfirmDialog(null, "Mã sinh viên " + MSSV.toString() + " đã tồn tại", "Thông báo", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Thêm bị lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION);
        } finally {
            SVBUS.Close();
        }

    }//GEN-LAST:event_jbtnThemActionPerformed

    private void tbSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSVMouseClicked

        DefaultTableModel model = (DefaultTableModel) tbSV.getModel();
        int selectedRowIndex = tbSV.getSelectedRow();

        //bắt đầu từ 1, vì vị trí 0 là STT nên kh lấy
        txtMSSV.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtTenSV.setText(model.getValueAt(selectedRowIndex, 2).toString());

        String NgaySinh = model.getValueAt(selectedRowIndex, 3).toString();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = format.parse(NgaySinh);
        } catch (ParseException ex) {
            Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        dtNgaySinhSV.setDate(date);

        cbxGioiTinhSV.setSelectedItem(model.getValueAt(selectedRowIndex, 4).toString());
        txtKhoa.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtEmailSV.setText(model.getValueAt(selectedRowIndex, 6).toString());
        txtSDTSV.setText(model.getValueAt(selectedRowIndex, 7).toString());
    }//GEN-LAST:event_tbSVMouseClicked


    private void jbtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSuaActionPerformed
        SinhVienDTO SV = new SinhVienDTO();
        SinhVienBUS SVBUS = new SinhVienBUS();

        try {
            SV.setMSSV(txtMSSV.getText().trim());
            SV.setHoTen(txtTenSV.getText().trim());

            String NgaySinh = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            NgaySinh = dateFormat.format(dtNgaySinhSV.getDate()); //chuyển về String

            SV.setNgaySinh(NgaySinh);
            SV.setPhai(cbxGioiTinhSV.getSelectedItem().toString().trim());
            SV.setKhoa(txtKhoa.getText().trim());
            SV.setEmail(txtEmailSV.getText().trim());
            SV.setSDT(txtSDTSV.getText().trim());

            SVBUS.Update(SV);
            LoadDataSinhVien(tbSV);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Sửa bị lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION);
        } finally {
            SVBUS.Close();
        }


    }//GEN-LAST:event_jbtnSuaActionPerformed

    private void jbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaActionPerformed
        SinhVienBUS SVBUS = new SinhVienBUS();
        try {
            String MSSV = txtMSSV.getText().trim();
            SVBUS.Delete(MSSV);
            LoadDataSinhVien(tbSV);
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Xóa bị lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION);
        } finally {
            SVBUS.Close();
        }

    }//GEN-LAST:event_jbtnXoaActionPerformed

    private void txtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseClicked
        txtTimKiem.setText("");

    }//GEN-LAST:event_txtTimKiemMouseClicked

    //TÌM KIẾM BẰNG NÚT, TÌM KIẾM TỰ ĐỘNG LÀM KHI NÀO CÓ THỜI GIAN
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed

        String search = txtTimKiem.getText().trim();
        
        SinhVienBUS SVBUS = new SinhVienBUS();
        DefaultTableModel tm = new DefaultTableModel();

        String[] title = {"STT", "MSSV", "Họ Tên", "Ngày Sinh", "Giới Tính", "Khoa", "Email", "SDT"};
        tm.setColumnIdentifiers(title);

        //nạp dữ liệu vào DefaultTableModel  
        ResultSet rs = SVBUS.TimKiem(search);
        try {
            int i = 1;
            while (rs.next()) {
                
                tm.addRow(new Object[]{i, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7)});
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        // gán DefaultTableModel và JTable và đóng kết nối  
        tbSV.setModel(tm);
        SVBUS.Close();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void LoadDataSinhVien(JTable tb) throws SQLException {
        SinhVienBUS SVBUS = new SinhVienBUS();
        DefaultTableModel tm = new DefaultTableModel();

        String[] title = {"STT", "MSSV", "Họ Tên", "Ngày Sinh", "Giới Tính", "Khoa", "Email", "SDT"};
        tm.setColumnIdentifiers(title);

        //nạp dữ liệu vào DefaultTableModel  
        ResultSet rs = SVBUS.GetData();
        int i = 1;
        while (rs.next()) {

            tm.addRow(new Object[]{i, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                rs.getString(5), rs.getString(6), rs.getString(7)});
            i++;
        }

        // gán DefaultTableModel và JTable và đóng kết nối  
        tb.setModel(tm);
        SVBUS.Close();
    }

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
            java.util.logging.Logger.getLogger(frmSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmSinhVien f = null;
                try {
                    f = new frmSinhVien();
                } catch (SQLException ex) {
                    Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                }

                f.setVisible(true); //Hiện form lên
                f.setSize(842, 492);
                f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
                f.setResizable(false); //người dùng không được chỉnh kích thước frm
                f.setDefaultCloseOperation(frmSinhVien.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbxGioiTinhSV;
    private com.toedter.calendar.JDateChooser dtNgaySinhSV;
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
    private javax.swing.JButton jbtnSua;
    private javax.swing.JButton jbtnThem;
    private javax.swing.JButton jbtnXoa;
    private javax.swing.JTable tbSV;
    private javax.swing.JTextField txtEmailSV;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtSDTSV;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
