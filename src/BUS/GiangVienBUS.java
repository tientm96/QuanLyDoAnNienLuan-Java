
package BUS;

import DAO.DataConfig;
import DTO.GiangVienDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MT IT
 */
public class GiangVienBUS {
     
    //Hàm get data
    public ResultSet GetData() {
        ResultSet result = null;
        DataConfig config = new DataConfig();//tao ket noi

        String strQuery = "select * from TBL_GIANGVIEN";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        
        return result;
    }

    //Hàm tìm kiếm
    public ResultSet TimKiem(String item) {
        ResultSet result = null;
        DataConfig config = new DataConfig();
        
        String strQuery = "select * from TBL_GIANGVIEN Where MaGV like'%" + item + "%' or HoTenGV like N'%" + item + "%'";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm check ID
    public boolean CheckID(String MaGV) throws SQLException {
        ResultSet result = null;
        DataConfig config = new DataConfig();
        
        String strQuery = "select * from TBL_GIANGVIEN where MaGV='" + MaGV + "'";
        result = config.ExecuteQuery(strQuery);

        while (result.next()) { //nếu rs có chứa dữ liệu
               return true;
        }
        return false;
        
    }

    //Hàm thêm
    public int Insert(GiangVienDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "insert into TBL_GIANGVIEN (MaGV,HoTenGV,MaChucDanh,Phai,Email,SDT,SoDARa,SoDACham) values ('" + obj.getMaGV() + "',N'" + obj.getHoTenGV() + "','" + obj.getMaChucDanh() + "',N'" + obj.getPhai() + "','" + obj.getEmail() + "','" + obj.getSDT() + "','" + obj.getSoDARa() + "','" + obj.getSoDACham() + "')";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Hàm sửa
    public int Update(GiangVienDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "update TBL_GIANGVIEN set HoTenGV=N'" + obj.getHoTenGV() + "',MaChucDanh='" + obj.getMaChucDanh() + "',Phai=N'" + obj.getPhai() + "',Email='" + obj.getEmail() + "',SDT='" + obj.getSDT() + "',SoDARa ='" + obj.getSoDARa() + "',SoDACham='" + obj.getSoDACham() + "' where MaGV='" + obj.getMaGV() + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    // Xóa
    public int Delete(String MaGV) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "delete from TBL_GIANGVIEN where MaGV='" + MaGV + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Đóng kết nối
    public void Close() {
        DataConfig config = new DataConfig();
        config.Close();
    }
    
}
