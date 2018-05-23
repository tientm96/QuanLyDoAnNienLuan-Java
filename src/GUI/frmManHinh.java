package GUI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmManHinh extends javax.swing.JFrame {

    public frmManHinh() {
        initComponents();
        setTitle("Quản Lý Đồ Án Niên Luận");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        MenuTrangChinh = new javax.swing.JMenu();
        MitemTaiKhoan = new javax.swing.JMenuItem();
        MitemQuyenDoAn = new javax.swing.JMenuItem();
        MitemThongKe = new javax.swing.JMenuItem();
        MitemDangXuat = new javax.swing.JMenuItem();
        MenuQuanLy = new javax.swing.JMenu();
        MitemDangKyDT = new javax.swing.JMenuItem();
        MitemRaDT = new javax.swing.JMenuItem();
        MitemPhanCong = new javax.swing.JMenuItem();
        MenuGV = new javax.swing.JMenu();
        MitemContentsGV = new javax.swing.JMenuItem();
        MitemAboutGV = new javax.swing.JMenuItem();
        MenuSV = new javax.swing.JMenu();
        MitemContentsSV = new javax.swing.JMenuItem();
        MitemAboutSV = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Quản lý đồ án - niên luận"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("PHẦN MỀM QUẢN LÝ ĐỒ ÁN - NIÊN LUẬN ");

        MenuTrangChinh.setMnemonic('f');
        MenuTrangChinh.setText("Trang Chính          ");

        MitemTaiKhoan.setText("Tài Khoản");
        MitemTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemTaiKhoanActionPerformed(evt);
            }
        });
        MenuTrangChinh.add(MitemTaiKhoan);

        MitemQuyenDoAn.setText("Quyển Đồ Án");
        MitemQuyenDoAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemQuyenDoAnActionPerformed(evt);
            }
        });
        MenuTrangChinh.add(MitemQuyenDoAn);

        MitemThongKe.setText("Thống Kê");
        MitemThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemThongKeActionPerformed(evt);
            }
        });
        MenuTrangChinh.add(MitemThongKe);

        MitemDangXuat.setText("Đăng Xuất");
        MitemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemDangXuatActionPerformed(evt);
            }
        });
        MenuTrangChinh.add(MitemDangXuat);

        menuBar.add(MenuTrangChinh);

        MenuQuanLy.setMnemonic('e');
        MenuQuanLy.setText("Quản Lý          ");

        MitemDangKyDT.setText("Đăng Ký Đề Tài");
        MitemDangKyDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemDangKyDTActionPerformed(evt);
            }
        });
        MenuQuanLy.add(MitemDangKyDT);

        MitemRaDT.setMnemonic('y');
        MitemRaDT.setText("Ra Đề Tài");
        MitemRaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemRaDTActionPerformed(evt);
            }
        });
        MenuQuanLy.add(MitemRaDT);

        MitemPhanCong.setText("Phân Công");
        MitemPhanCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemPhanCongActionPerformed(evt);
            }
        });
        MenuQuanLy.add(MitemPhanCong);

        menuBar.add(MenuQuanLy);

        MenuGV.setMnemonic('h');
        MenuGV.setText("Giảng Viên          ");

        MitemContentsGV.setText("Contents");
        MitemContentsGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemContentsGVActionPerformed(evt);
            }
        });
        MenuGV.add(MitemContentsGV);

        MitemAboutGV.setText("About");
        MenuGV.add(MitemAboutGV);

        menuBar.add(MenuGV);

        MenuSV.setText("Sinh Viên          ");

        MitemContentsSV.setText("Contents");
        MitemContentsSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitemContentsSVActionPerformed(evt);
            }
        });
        MenuSV.add(MitemContentsSV);

        MitemAboutSV.setMnemonic('c');
        MitemAboutSV.setText("About");
        MenuSV.add(MitemAboutSV);

        menuBar.add(MenuSV);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1))
        );

        setSize(new java.awt.Dimension(849, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MitemQuyenDoAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemQuyenDoAnActionPerformed

         this.dispose(); //ẩn frmManHinh

        frmQuyenDoAn f = null;
        try {
            f = new frmQuyenDoAn();
            //f.setUndecorated(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmManHinh.class.getName()).log(Level.SEVERE, null, ex);
        }

        f.setVisible(true);
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmThongKe.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows
        

    }//GEN-LAST:event_MitemQuyenDoAnActionPerformed

    private void MitemThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemThongKeActionPerformed
        this.dispose(); //ẩn frmManHinh

        frmThongKe f = null;
        try {
            f = new frmThongKe();
            //f.setUndecorated(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmManHinh.class.getName()).log(Level.SEVERE, null, ex);
        }

        f.setVisible(true);
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmThongKe.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows
    }//GEN-LAST:event_MitemThongKeActionPerformed

    private void MitemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemDangXuatActionPerformed
        this.dispose();
        frmLogin f = new frmLogin();

        f.setUndecorated(true); //của sổ sẽ kh có các điều khiển viền ngoài của hệ điều hành
        //cái này phải đặt ở dòng đầu tiên sau khi khởi tạo form
        f.setVisible(true);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
    }//GEN-LAST:event_MitemDangXuatActionPerformed

    private void MitemDangKyDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemDangKyDTActionPerformed
        this.dispose(); //ẩn frmManHinh
        frmDangKy f = null;
        try {
            f = new frmDangKy();
        } catch (SQLException ex) {
            Logger.getLogger(frmManHinh.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        //f.setUndecorated(true);
        f.setVisible(true);
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmDangKy.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows

        // TODO add your handling code here:
    }//GEN-LAST:event_MitemDangKyDTActionPerformed

    private void MitemRaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemRaDTActionPerformed
        this.dispose(); //ẩn frmManHinh
        frmRaDeTai f = null;
        try {
            f = new frmRaDeTai();
            //  f.setUndecorated(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmManHinh.class.getName()).log(Level.SEVERE, null, ex);
        }

        f.setVisible(true);
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmRaDeTai.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows


    }//GEN-LAST:event_MitemRaDTActionPerformed

    private void MitemPhanCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemPhanCongActionPerformed

        this.dispose(); //ẩn frmManHinh
        frmPhanCong f = null;
        try {
            f = new frmPhanCong();
            //f.setUndecorated(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmManHinh.class.getName()).log(Level.SEVERE, null, ex);
        }

        f.setVisible(true);
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmPhanCong.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows
    }//GEN-LAST:event_MitemPhanCongActionPerformed

    private void MitemContentsGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemContentsGVActionPerformed
        this.dispose();

        frmGiangVien f = null;
        try {
            f = new frmGiangVien();
            // f.setUndecorated(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmManHinh.class.getName()).log(Level.SEVERE, null, ex);
        }

        f.setVisible(true); //Hiện form lên
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmGiangVien.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows
    }//GEN-LAST:event_MitemContentsGVActionPerformed

    private void MitemContentsSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemContentsSVActionPerformed
        this.dispose();

        frmSinhVien f = null;
        try {
            f = new frmSinhVien();
            //  f.setUndecorated(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmManHinh.class.getName()).log(Level.SEVERE, null, ex);
        }

        f.setVisible(true); //Hiện form lên
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmSinhVien.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows

    }//GEN-LAST:event_MitemContentsSVActionPerformed

    private void MitemTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitemTaiKhoanActionPerformed

         this.dispose(); //ẩn frmManHinh

        frmTaiKhoan f = new frmTaiKhoan();
        //f.setUndecorated(true);

        f.setVisible(true);
        f.setSize(842, 492);
        f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
        f.setResizable(false); //người dùng không được chỉnh kích thước frm
        f.setDefaultCloseOperation(frmThongKe.DO_NOTHING_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows
    }//GEN-LAST:event_MitemTaiKhoanActionPerformed

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
            java.util.logging.Logger.getLogger(frmManHinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmManHinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmManHinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmManHinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmManHinh f = new frmManHinh();

                f.setVisible(true); //Hiện form lên
                f.setSize(842, 492);

                f.setLocationRelativeTo(null); //cho form f ở giữa màn hình desktop
                f.setResizable(false); //người dùng không được chỉnh kích thước frm

                f.setDefaultCloseOperation(frmLogin.EXIT_ON_CLOSE); //thoát khi ta bấm nút đỏ của windows

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuGV;
    private javax.swing.JMenu MenuQuanLy;
    private javax.swing.JMenu MenuSV;
    private javax.swing.JMenu MenuTrangChinh;
    private javax.swing.JMenuItem MitemAboutGV;
    private javax.swing.JMenuItem MitemAboutSV;
    private javax.swing.JMenuItem MitemContentsGV;
    private javax.swing.JMenuItem MitemContentsSV;
    private javax.swing.JMenuItem MitemDangKyDT;
    private javax.swing.JMenuItem MitemDangXuat;
    private javax.swing.JMenuItem MitemPhanCong;
    private javax.swing.JMenuItem MitemQuyenDoAn;
    private javax.swing.JMenuItem MitemRaDT;
    private javax.swing.JMenuItem MitemTaiKhoan;
    private javax.swing.JMenuItem MitemThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
