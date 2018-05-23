package BUS;

import DAO.DataConfig;
import DTO.PhieuDangKyDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MT IT
 */
public class PhieuDangKyBUS {

    //Hàm get data
    public ResultSet GetData() {
        ResultSet result = null;
        DataConfig config = new DataConfig();//tao ket noi

        String strQuery = "select * from TBL_PHIEUDANGKY";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm tìm kiếm
    public ResultSet TimKiem(String item) {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_PHIEUDANGKY where MaPhieuDK like'%" + item + "%'";   // tim kiem theo ma
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm check ID
    public boolean CheckID(String MaPhieuDK) throws SQLException {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_PHIEUDANGKY  where MaPhieuDK='" + MaPhieuDK + "'";
        result = config.ExecuteQuery(strQuery);
        
        while (result.next()) { //nếu rs có chứa dữ liệu
               return true;
        }
        return false;
    }

    //Hàm thêm
    public int Insert(PhieuDangKyDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "insert into TBL_PHIEUDANGKY (MaPhieuDK,NgayDK,FK_MaDeTai,FK_MSSV) values ('" + obj.getMaPhieuDK() + "','" + obj.getNgayDK() + "','" + obj.getMaDeTai() + "','" + obj.getMSSV() + "')";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Hàm sửa
    public int Update(PhieuDangKyDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "update TBL_PHIEUDANGKY set NgayDK='" + obj.getNgayDK() + "',FK_MaDeTai='" + obj.getMaDeTai() + "' where MaPhieuDK='" + obj.getMaPhieuDK() + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    // Xóa
    public int Delete(String MaPhieuDK) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "delete from TBL_PHIEUDANGKY where MaPhieuDK='" + MaPhieuDK + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }
    
     //Đóng kết nối
    public void Close() {
        DataConfig config = new DataConfig();
        config.Close();
    }

}
