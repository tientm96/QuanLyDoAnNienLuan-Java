package BUS;

import DAO.DataConfig;
import DTO.DeTaiDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MT IT
 */
public class DeTaiBUS {

    //Hàm get data
    public ResultSet GetData() {
        ResultSet result = null;
        DataConfig config = new DataConfig();//tao ket noi

        String strQuery = "select * from TBL_DETAI";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm tìm kiếm
    public ResultSet TimKiem(String item) {
        ResultSet result = null;
        DataConfig config = new DataConfig();
        
        String strQuery = "select * from TBL_DETAI Where MaDeTai like'%" + item + "%' or TenDeTai like N'%" + item + "%'";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm check ID
    public boolean CheckID(String MaDeTai) throws SQLException {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_DETAI where MaDeTai='" + MaDeTai + "'";
        result = config.ExecuteQuery(strQuery);
      
        while (result.next()) { //nếu rs có chứa dữ liệu
               return true;
        }
        return false;
    }

    //Hàm thêm
    public int Insert(DeTaiDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "insert into TBL_DETAI (MaDeTai,TenDeTai,LoaiDeTai,NgayRaDT,FK_MaGV) values ('" + obj.getMaDeTai() + "',N'" + obj.getTenDeTai() + "',N'" + obj.getLoaiDeTai() + "','" + obj.getNgayRaDT() + "','" + obj.getMaGV() + "')";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Hàm sửa
    public int Update(DeTaiDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "update TBL_DETAI set TenDeTai=N'" + obj.getTenDeTai() + "',LoaiDeTai=N'" + obj.getLoaiDeTai() + "',NgayRaDT='" + obj.getNgayRaDT() + "',FK_MaGV='" + obj.getMaGV() + "' where MaDeTai='" + obj.getMaDeTai() + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    // Xóa
    public int Delete(String MaDeTai) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "delete from TBL_DETAI where MaDeTai='" + MaDeTai + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }
 //Đóng kết nối
    public void Close() {
        DataConfig config = new DataConfig();
        config.Close();
    }
}
