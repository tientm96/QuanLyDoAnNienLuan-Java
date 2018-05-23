package BUS;

import DAO.DataConfig;
import DTO.SinhVienDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MT IT
 */
public class SinhVienBUS {

    //Hàm get data
    public ResultSet GetData() {
        ResultSet result = null;
        DataConfig config = new DataConfig();//tao ket noi

        String strQuery = "select * from TBL_SINHVIEN";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm tìm kiếm
    public ResultSet TimKiem(String item) {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_SINHVIEN Where MSSV like '%" + item + "%' or HoTen like N'%" + item + "%'";
        result = config.ExecuteQuery(strQuery);// truy vấn theo câu lệnh sql
        return result;
    }

    //Hàm check ID
    public boolean CheckID(String MSSV) throws SQLException {
        ResultSet result = null;
        DataConfig config = new DataConfig();

        String strQuery = "select * from TBL_SINHVIEN where MSSV='" + MSSV + "'";
        result = config.ExecuteQuery(strQuery);
      
        while (result.next()) { //nếu rs có chứa dữ liệu
               return true;
        }
        return false;
    }

    //Hàm thêm
    public int Insert(SinhVienDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "insert into TBL_SINHVIEN (MSSV,HoTen,NgaySinh,Phai,Email,SDT,Khoa) values ('" + obj.getMSSV() + "',N'" + obj.getHoTen() + "','" + obj.getNgaySinh() + "',N'" + obj.getPhai() + "','" + obj.getEmail() + "','" + obj.getSDT() + "',N'" + obj.getKhoa() + "')";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    //Hàm sửa
    public int Update(SinhVienDTO obj) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "update TBL_SINHVIEN set HoTen=N'" + obj.getHoTen() + "',NgaySinh='" + obj.getNgaySinh() + "',Phai=N'" + obj.getPhai() + "',Khoa=N'" + obj.getKhoa()+ "',Email='" + obj.getEmail() + "',SDT='" + obj.getSDT() + "' where MSSV='" + obj.getMSSV() + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }

    // Xóa
    public int Delete(String MSSV) {
        int result = 0;
        DataConfig config = new DataConfig();

        String strQuery = "delete from TBL_SINHVIEN where MSSV='" + MSSV + "'";
        result = config.Executenonquery(strQuery);
        return result; //tra ve so ghi nhan thuc hien
    }
 //Đóng kết nối
    public void Close() {
        DataConfig config = new DataConfig();
        config.Close();
    }
}
