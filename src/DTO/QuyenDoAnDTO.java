/*
 * Class Quyển Đồ Án
 */
package DTO;


/**
 *
 * @author MT IT
 */
public class QuyenDoAnDTO {

    private String MaQuyenDA;
    private String NgayNop;
    private String DiemDA;
    private String NhanXet;
    private String MaPhieuDK;
    
    /*Get, set*/
    public void setMaQuyenDA(String MaQuyenDA) {
        this.MaQuyenDA = MaQuyenDA;
    }
    public String getMaQuyenDA() {
        return this.MaQuyenDA;
    }

    public void setNgayNop(String NgayNop) {
        this.NgayNop = NgayNop;
    }
    public String getNgayNop() {
        return this.NgayNop;
    }
    
    public void setDiemDA(String DiemDA) {
        this.DiemDA = DiemDA;
    }
    public String getDiemDA() {
        return this.DiemDA;
    }
    
    public void setNhanXet(String NhanXet) {
        this.NhanXet = NhanXet;
    }
    public String getNhanXet() {
        return this.NhanXet;
    }
    
    public void setMaPhieuDK(String MaPhieuDK) {
        this.MaPhieuDK = MaPhieuDK;
    }
    public String getMaPhieuDK() {
        return this.MaPhieuDK;
    }
    
}
