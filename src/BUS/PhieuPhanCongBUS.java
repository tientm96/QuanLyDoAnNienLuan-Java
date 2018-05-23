package BUS;

import DAO.DataConfig;
import DTO.PhieuPhanCongDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MT IT
 */
public class PhieuPhanCongBUS {
    //Hàm get data

    public ResultSet GetData() {
        ResultSet result = null;
        DataConfig config = new DataConfig();//tao ket noi

        String strQuery = "select * from TBL_PHIEUPHANCONG";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm tìm kiếm
    public ResultSet TimKiem(String item) {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_PHIEUPHANCONG Where MaPhieuPC like'%" + item + "%'";   // tim kiem theo ma
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm check ID
    public boolean CheckID(String MaPhieuPC) throws SQLException {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_PHIEUPHANCONG where MaPhieuPC='" + MaPhieuPC + "'";
        result = config.ExecuteQuery(strQuery);
        
        while (result.next()) { //nếu rs có chứa dữ liệu
               return true;
        }
        return false;
    }

    //Hàm thêm
    public int Insert(PhieuPhanCongDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "insert into TBL_PHIEUPHANCONG (MaPhieuPC,NgayPC,FK_MaQuyenDA,FK_MaGV,FK_MaChucVu) values ('" + obj.getMaPhieuPC() + "','" + obj.getNgayPC() + "','" + obj.getMaQuyenDA() + "','" + obj.getMaGV() + "','" + obj.getMaChucVu() + "')";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Hàm sửa
    public int Update(PhieuPhanCongDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "update TBL_PHIEUPHANCONG set NgayPC='" + obj.getNgayPC() + "',FK_MaQuyenDA='" + obj.getMaQuyenDA() + "',FK_MaGV='" + obj.getMaGV() + "',FK_MaChucVu='" + obj.getMaChucVu() + "' where MaPhieuPC='" + obj.getMaPhieuPC() + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    // Xóa
    public int Delete(String MaPhieuPC) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "delete from TBL_PHIEUPHANCONG where MaPhieuPC='" + MaPhieuPC + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }
 //Đóng kết nối
    public void Close() {
        DataConfig config = new DataConfig();
        config.Close();
    }
}
