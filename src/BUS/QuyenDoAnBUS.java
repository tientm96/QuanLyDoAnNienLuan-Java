package BUS;

import DAO.DataConfig;
import DTO.QuyenDoAnDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MT IT
 */
public class QuyenDoAnBUS {

    //Hàm get data
    public ResultSet GetData() {
        ResultSet result = null;
        DataConfig config = new DataConfig();//tao ket noi

        String strQuery = "select * from TBL_QUYENDOAN";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm tìm kiếm
    public ResultSet TimKiem(String item) {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_QUYENDOAN Where MaQuyenDA like'%" + item + "%'";   // tim kiem theo ma
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm check ID
    public boolean CheckID(String MaQuyenDA) throws SQLException {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_QUYENDOAN  where MaQuyenDA='" + MaQuyenDA + "'";
        result = config.ExecuteQuery(strQuery);
   
        while (result.next()) { //nếu rs có chứa dữ liệu
               return true;
        }
        return false;
    }

    //Hàm thêm
    public int Insert(QuyenDoAnDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "insert into TBL_QUYENDOAN (MaQuyenDA,NgayNop,NhanXet,DiemDA,FK_MaPhieuDK) values ('" + obj.getMaQuyenDA() + "','" + obj.getNgayNop() + "',N'" + obj.getNhanXet() + "','" + obj.getDiemDA() + "','" + obj.getMaPhieuDK() + "')";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Hàm sửa
    public int Update(QuyenDoAnDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "update TBL_QUYENDOAN set NgayNop='" + obj.getNgayNop() + "',DiemDA='" + obj.getDiemDA() + "',NhanXet=N'" + obj.getNhanXet() + "',FK_MaPhieuDK='" + obj.getMaPhieuDK() + "' where MaQuyenDA='" + obj.getMaQuyenDA() + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    // Xóa
    public int Delete(String MaQuyenDA) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "delete from TBL_QUYENDOAN where MaQuyenDA='" + MaQuyenDA + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }
 //Đóng kết nối
    public void Close() {
        DataConfig config = new DataConfig();
        config.Close();
    }
}
