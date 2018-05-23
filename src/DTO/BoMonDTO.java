/*
 * Class Bộ Môn
 */
package DTO;

/**
 *
 * @author MT IT
 */
public class BoMonDTO {
        private String MaChucVu;
        private String ChucVu;
        private String TenCanBo;
        
        //get, set
        public void setMaChucVu(String MaChucVu){
            this.MaChucVu = MaChucVu;
        }
        public String getMaChucVu( ){
            return this.MaChucVu;
        }

        public void setChucVu(String ChucVu){
            this.ChucVu = ChucVu;
        }
        public String getChucVu( ){
            return this.ChucVu;
        }
        
        public void setTenCanBo(String TenCanBo){
            this.TenCanBo = TenCanBo;
        }
        public String getTenCanBo( ){
            return this.TenCanBo;
        }
}
