/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


/**
 *
 * @author MT IT
 */
public class PhieuDangKyDTO {

    private String MSSV;
    private String MaPhieuDK;
    private String NgayDK;
    private String MaDeTai;
    
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    public String getMSSV() {
        return this.MSSV;
    }
    
    public void setMaPhieuDK(String MaPhieuDK) {
        this.MaPhieuDK = MaPhieuDK;
    }
    public String getMaPhieuDK() {
        return this.MaPhieuDK;
    }
    
    public void setNgayDK(String NgayDK) {
        this.NgayDK = NgayDK;
    }
    public String getNgayDK() {
        return this.NgayDK;
    }
    
    public void setMaDeTai(String MaDeTai) {
        this.MaDeTai = MaDeTai;
    }
    public String getMaDeTai() {
        return this.MaDeTai;
    }
    
}
