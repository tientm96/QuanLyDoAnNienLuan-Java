/*
 * Class Tài Khoản
 */
package DTO;

/**
 *
 * @author MT IT
 */
public class TaiKhoanDTO {

    private String TaiKhoanID;
    private String Pass;
    private String TaiKhoanGhiChu;

    /*Get, set*/
    public void setTaiKhoanID(String TaiKhoanID) {
        this.TaiKhoanID = TaiKhoanID;
    }
    public String getTaiKhoanID() {
        return this.TaiKhoanID;
    }
    
    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    public String getPass() {
        return this.Pass;
    }
    
    public void setTaiKhoanGhiChu(String TaiKhoanGhiChu) {
        this.TaiKhoanGhiChu = TaiKhoanGhiChu;
    }
    public String getTaiKhoanGhiChu() {
        return this.TaiKhoanGhiChu;
    }
}
