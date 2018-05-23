/*
 * Class Giảng Viên
 */
package DTO;

/**
 *
 * @author MT IT
 */
public class GiangVienDTO {

    private String MaGV;
    private String HoTenGV;
    private String Phai;
    private String Email;
    private String SDT;
    private String MaChucDanh;
    private int SoDARa;
    private int SoDACham;
    
    /*get, set*/
    public void setMaGV(String MaGV){
        this.MaGV = MaGV;
    }
    public String getMaGV( ){
        return this.MaGV;
    }

    public void setHoTenGV(String HoTenGV){
        this.HoTenGV = HoTenGV;
    }
    public String getHoTenGV( ){
        return this.HoTenGV;
    }
    
    public void setPhai(String Phai){
        this.Phai = Phai;
    }
    public String getPhai( ){
        return this.Phai;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getEmail( ){
        return this.Email;
    }
    
    public void setSDT(String SDT){
        this.SDT = SDT;
    }
    public String getSDT( ){
        return this.SDT;
    }
    
    public void setMaChucDanh(String MaChucDanh){
        this.MaChucDanh = MaChucDanh;
    }
    public String getMaChucDanh( ){
        return this.MaChucDanh;
    }
    
    public void setSoDARa(int SoDARa){
        this.SoDARa = SoDARa;
    }
    public int getSoDARa( ){
        return this.SoDARa;
    }
    
    
    public void setSoDACham(int SoDACham){
        this.SoDACham = SoDACham;
    }
    public int getSoDACham( ){
        return this.SoDACham;
    }
}
