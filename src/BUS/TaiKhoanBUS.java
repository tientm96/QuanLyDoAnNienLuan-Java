
package BUS;

import DAO.DataConfig;
import DTO.TaiKhoanDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MT IT
 */
public class TaiKhoanBUS {
        
      //Hàm get data
    public ResultSet GetData() {
        ResultSet result = null;
        DataConfig config = new DataConfig();//tao ket noi

        String strQuery = "select * from TBL_TAIKHOAN";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm tìm kiếm
    public ResultSet TimKiem(String item) {
        ResultSet result = null;
        DataConfig config = new DataConfig();
        
        String strQuery = "select * from TBL_TAIKHOAN Where TaiKhoanID like'%" + item+ "%'";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm check ID
    public boolean CheckID(String TaiKhoanID) throws SQLException {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_TAIKHOAN where TaiKhoanID ='" + TaiKhoanID + "' or Pass ='" + TaiKhoanID + "'";
        result = config.ExecuteQuery(strQuery);
        
        while (result.next()) { //nếu rs có chứa dữ liệu
               return true;
        }
        return false;
    }

    //Hàm thêm
    public int Insert(TaiKhoanDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "insert into TBL_TAIKHOAN (TaiKhoanID,Pass,TaiKhoanGhiChu) values ('" + obj.getTaiKhoanID() + "','" + obj.getPass() + "',N'" + obj.getTaiKhoanGhiChu() + "')";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Hàm sửa
    public int Update(TaiKhoanDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();
        
        String strQuery = "update TBL_TAIKHOAN set Pass ='" + obj.getPass() + "' where TaiKhoanID =N'" + obj.getTaiKhoanID()+ "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    // Xóa
    public int Delete(String TaiKhoanID) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "delete from TBL_TAIKHOAN where TaiKhoanID ='" + TaiKhoanID + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

      //Đóng kết nối
    public void Close() {
        DataConfig config = new DataConfig();
        config.Close();
    }
    
}
