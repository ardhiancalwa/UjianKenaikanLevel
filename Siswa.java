package perpustakaan;

import java.util.ArrayList;

// implemenstasi inheritance
public class Siswa implements User{
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
     public Siswa() {
        //0
        this.namaSiswa.add("Fadilla Ratna Dwita");
        this.alamat.add("Tulungagung");
        this.telepon.add("082335162065");
        this.status.add(true);

        //1
        this.namaSiswa.add("Aizar Rahima Suprayitno");
        this.alamat.add("Blitar");
        this.telepon.add("081009172611");
        this.status.add(true);
        
        //2
        this.namaSiswa.add("Cessalya Dea Ivana Putri");
        this.alamat.add("Tulungagung");
        this.telepon.add("085259177913");
        this.status.add(true);
    }

      public void setStatus(boolean status) {
        this.status.add(status);
    }
    
    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    } 
    
    public void editStatus(int idSiswa, boolean status) {
         this.status.set(idSiswa, status);
    } 
    
    public int getJmlSiswa() {
         return this.status.size();                                                                                                               
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setNama(String namaSiswa ) {
        this.namaSiswa.add(namaSiswa);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setAlamat(String alamat ) {
        this.alamat.add(alamat);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setTelepon(String telepon ) {
        this.telepon.add(telepon);
    }

    // membuat ulang method pada sub-class
    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }
 
    // membuat ulang method pada sub-class
    @Override
     public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
     }
 
     // membuat ulang method pada sub-class
    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    } 

}