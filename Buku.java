package perpustakaan;

import java.util.ArrayList;

public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    
    public Buku() {
        this.namaBuku.add("Programming PHP");
        this.stok.add(20);
        this.harga.add(250000);
        
        this.namaBuku.add("Web Design Interactive");
        this.stok.add(7);
        this.harga.add(310000);
        
        this.namaBuku.add("Matematika");
        this.stok.add(12);
        this.harga.add(76000);
      
        this.namaBuku.add("History");
        this.stok.add(19);
        this.harga.add(110000);
    }
    
    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idJenisLaundry"
    public int getJmlBuku() {
        return this.namaBuku.size();
    }
    
    public void setNamaBuku(String namaBuku ) {
        this.namaBuku.add(namaBuku);
    }
    
    public String getNamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    } 

    public void setStok(int stok ) {
        this.stok.add(stok);
    }
    
    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    } 
    
    public void editStok(int idBuku, int stok) {
        this.stok.set(idBuku, stok);;
    } 
    
    public void setHarga(int harga ) {
        this.harga.add(harga);
    }
    
    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    } 
}
