/*
 * Class Phiếu Phân Công
 */
package DTO;


/**
 *
 * @author MT IT
 */
public class PhieuPhanCongDTO {

    private String MaPhieuPC;
    private String NgayPC;
    private String MaChucVu;
    private String MaQuyenDA;
    private String MaGV;
    
    /*Get, set*/
    public void setMaPhieuPC(String MaPhieuPC) {
        this.MaPhieuPC = MaPhieuPC;
    }
    public String getMaPhieuPC() {
        return this.MaPhieuPC;
    }
    
    public void setNgayPC(String NgayPC) {
        this.NgayPC = NgayPC;
    }
    public String getNgayPC() {
        return this.NgayPC;
    }
    
    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }
    public String getMaChucVu() {
        return this.MaChucVu;
    }
    
    public void setMaQuyenDA(String MaQuyenDA) {
        this.MaQuyenDA = MaQuyenDA;
    }
    public String getMaQuyenDA() {
        return this.MaQuyenDA;
    }
    
    public void setMaGV(String MaGV){
        this.MaGV = MaGV;
    }
    public String getMaGV( ){
        return this.MaGV;
    }
}
