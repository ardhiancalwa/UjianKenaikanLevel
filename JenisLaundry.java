
public class JenisLaundry {
    private int idJenisLaundry, durasi;
    private String jenisLaundry;
    private double harga;
    
    
//    public JenisLaundry(int idJenisLaundry, String jenisLaundry, double harga, int durasi) {
//        
//        
//        
//
//    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idJenisLaundry" */
    public int getIdJenisLaundry() {
        return idJenisLaundry;
    }
    
    public void setIdJenisLaundry(int idJenisLaundry) {
        this.idJenisLaundry = idJenisLaundry;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "durasi" */
    public int getDurasi() {
        return durasi;
    }
    
    public void setJenisLaundry(int durasi) {
        this.durasi = durasi;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "jenisLaundry" */
    public String getJenisLaundry() {
        return jenisLaundry;
    }
    
    public void setJenisLaundry(String jenisLaundry) {
        this.jenisLaundry = jenisLaundry;
    }
            
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "harga" */
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
}
