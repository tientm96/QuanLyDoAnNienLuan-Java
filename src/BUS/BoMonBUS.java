package BUS;

import DAO.DataConfig;
import DTO.BoMonDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MT IT
 */
public class BoMonBUS {

    //Hàm get data
    public ResultSet GetData() {
        ResultSet result = null;
        DataConfig config = new DataConfig();//tao ket noi

        String strQuery = "select * from TBL_BOMON";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm tìm kiếm
    public ResultSet TimKiem(String item) {
        ResultSet result = null;
        DataConfig config = new DataConfig();
        String strQuery = "select * from TBL_BOMON Where MaChucVu like'%" + item + "%' or ChucVu like N'%" + item + "%'";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm check ID
    public boolean CheckID(String MaChucVu) throws SQLException {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_BOMON where MaChucVu='" + MaChucVu + "'";
        result = config.ExecuteQuery(strQuery);

        
        while (result.next()) { //nếu rs có chứa dữ liệu
               return true;
        }
        return false;
    }

    //Hàm thêm
    public int Insert(BoMonDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "insert into TBL_BOMON (MaChucVu,ChucVu,TenCanBo) values ('" + obj.getMaChucVu() + "',N'" + obj.getChucVu() + "',N'" + obj.getTenCanBo() + "')";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Hàm sửa
    public int Update(BoMonDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "update TBL_BOMON set MaChucVu='" + obj.getMaChucVu() + "',ChucVu=N'" + obj.getChucVu() + "',TenCanBo=N'" + obj.getTenCanBo() + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    // Xóa
    public int Delete(String MaChucVu) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "delete from TBL_BOMON where MaChucVu='" + MaChucVu + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }
    
     //Đóng kết nối
    public void Close() {
        DataConfig config = new DataConfig();
        config.Close();
    }

}
