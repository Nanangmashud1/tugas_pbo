/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author userl
 */
public class Perusahaan {
    public String name;
    public String bidang_usaha;
    
    public class Jabatan{
        private String jbt_karyawan;
        private String bidang;

        public String getJbt_karyawan() {
            return jbt_karyawan;
        }

        public void setJbt_karyawan(String jbt_karyawan) {
            this.jbt_karyawan = jbt_karyawan;
        }

        public String getBidang() {
            return bidang;
        }

        public void setBidang(String bidang) {
            this.bidang = bidang;
        }
        
        
    }
}
