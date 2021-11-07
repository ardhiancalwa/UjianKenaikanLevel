package perpustakaan;

import java.util.ArrayList;

// implementasi inheritance
public class Petugas implements User {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> status = new ArrayList<String>();
    
    public Petugas(){
         //0
        this.namaPetugas.add("Jaja");
        this.alamat.add("Malang");
        this.telepon.add("08105672315");
        
        //1
        this.namaPetugas.add("Lala");
        this.alamat.add("Jakarta");
        this.telepon.add("084331072611");
        
        //2
        this.namaPetugas.add("Steve");
        this.alamat.add("Surabaya");
        this.telepon.add("081001266110");
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }
    
    // membuat ulang method pada sub-class
    @Override
     public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
     }
     
     // membuat ulang method pada sub-class
     @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    } 
}