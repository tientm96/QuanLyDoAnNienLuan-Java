package DAO;

import static DAO.DataConfig.displayError;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AccountDAO {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Driver driver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();// nap driver 
            DriverManager.registerDriver(driver);// dang ky driver 

            String url = "jdbc:sqlserver://DESKTOP-J45K4LK:1433;databaseName=QL_DANL_JAVA";

            con = DriverManager.getConnection(url, "sa", "123456");//tao ket noi den co so du lieu 

        } catch (SQLException ex) {
            displayError(ex);
        }

        return con;
    }

    public static boolean Login(String user, String pass) throws SQLException {

        ResultSet rs = null;
        Connection con = null;
        PreparedStatement pstm = null;
        String query = "SELECT * FROM TBL_TAIKHOAN WHERE TaiKhoanID = ? AND Pass = ?";

        try {
            con = getConnection();
            pstm = con.prepareStatement(query);
            
            pstm.setString(1, user);
            pstm.setString(2, pass);

            rs = pstm.executeQuery();

            
            while (rs.next()) { //nếu rs có chứa dữ liệu
               return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        } finally {
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        
      return false;
    }
}
