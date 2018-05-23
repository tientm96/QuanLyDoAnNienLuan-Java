/*
 * Class Đề Tài
 */
package DTO;


/**
 *
 * @author MT IT
 */
public class DeTaiDTO {
    private String MaDeTai;
    private String TenDeTai;
    private String LoaiDeTai;
    private String MaGV;
    private String NgayRaDT;

    //get, set
    public void setMaDeTai(String MaDeTai) {
        this.MaDeTai = MaDeTai;
    }
    public String getMaDeTai() {
        return this.MaDeTai;
    }

    public void setTenDeTai(String TenDeTai) {
        this.TenDeTai = TenDeTai;
    }
    public String getTenDeTai() {
        return this.TenDeTai;
    }

    public void setLoaiDeTai(String LoaiDeTai) {
        this.LoaiDeTai = LoaiDeTai;
    }
    public String getLoaiDeTai() {
        return this.LoaiDeTai;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }
    public String getMaGV() {
        return this.MaGV;
    }

    public void setNgayRaDT(String NgayRaDT) {
        this.NgayRaDT = NgayRaDT;
    }
    
    public String getNgayRaDT() {
        return this.NgayRaDT;
    }
}
