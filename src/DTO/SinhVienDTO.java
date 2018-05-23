/*
 * Class Sinh Viên
 */
package DTO;


/**
 *
 * @author MT IT
 */
public class SinhVienDTO {

    private String MSSV;
    private String HoTen;
    private String NgaySinh;    //Riêng ngày thì DTO là String, dưới CSDL là String (do java dẽ bị lỗi nên kh đặt dưới
    private String Phai;        //csdl là smallDatetime mà phải đặt String luôn như DTO).
    private String Khoa;        //Còn trên form thì dùng JDateChoose. 
    private String Email;
    private String SDT;
    
    /*Get, set*/
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    public String getMSSV() {
        return this.MSSV;
    }
    
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    public String getHoTen() {
        return this.HoTen;
    }
    
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public String getNgaySinh() {
        return this.NgaySinh;
    }
    
    public void setPhai(String Phai) {
        this.Phai = Phai;
    }
    public String getPhai() {
        return this.Phai;
    }
    
    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }
    public String getKhoa() {
        return this.Khoa;
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
    
}
