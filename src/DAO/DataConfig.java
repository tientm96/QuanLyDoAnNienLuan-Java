
package DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataConfig {
    private static Connection con = null;

    //Xuất thông báo khi ngoại lệ
    public static void displayError(SQLException ex) {
        System.out.println("Error Message:" + ex.getMessage());
        System.out.println("SQL State:" + ex.getSQLState());
        System.out.println("Error Code:" + ex.getErrorCode());
    }

    
    //MỞ kết nối CSDL
    public static Connection getConnection() {
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
    
    
    /*Lấy dữ liệu bằng cách thực thi các truy vấn SQL. Tương tự GetData trong C#
    * Execute Query: Thực hiện truy vấn
    * =>ResultSet tương tự DataTable trong C#
    */
    public ResultSet ExecuteQuery(String sql) {
        ResultSet rs = null;
        
        try {
            Connection connect = getConnection();
          
            // stm = (Statement) connect.createStatement();
            // rs = stm.executeQuery(sql);

            PreparedStatement pstm = connect.prepareStatement(sql);
            rs = pstm.executeQuery();
        } catch (SQLException ex) {
            displayError(ex);
        }
        
      //  Close(); //đóng kết nối  // KHÔNG ĐƯỢC ĐÓNG, ĐÓNG SẼ LỖI
        return rs;

    }
    
    
    /*
    * Cập nhật dữ liệu: INSERT, UPDATE, DELETE
    * Executenonquery: Điều hành
    * Return: Số dòng ảnh hưởng
    */
    public int Executenonquery(String sql) {
        int rs = 0;

        try {
            Connection con = getConnection();
            
//            Statement stm = (Statement) con.createStatement();
//            rs = stm.executeUpdate(sql);

            PreparedStatement pstm = con.prepareStatement(sql);
            rs = pstm.executeUpdate();

        } catch (SQLException ex) {
            displayError(ex);
        }

        return rs;
    }
    
    
    /* 
    * Trả về một đối tượng nào đó.
    * Sử dụng cho mọi đt, nhưng khi dùng ta phải ép kiểu dl.
    */
    public Object ExeCuteScalarQuery(String sql){
        Object rs = 0;
        
        try {
            Connection con = getConnection();

//            Statement stm = (Statement) con.createStatement();
//            rs = stm.executeUpdate(sql);

            PreparedStatement pstm = con.prepareStatement(sql);
            rs = pstm.executeUpdate();

            
        } catch (SQLException ex) {
            displayError(ex);
        }

        return rs;
    }


    //Đóng kết nối
    public static void Close() {
        if (con != null) { //Con = null thì chưa mở kết nối, nên kh cần đóng.
            try {
                if (!con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                displayError(ex);
            }
        }

        con = null;
    }
    
}
