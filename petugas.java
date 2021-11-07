
public class petugas extends person {
    // class petugas hanya menambahkan attribute idPetugas dan jabatan
    // untuk nama, alamat, dan telepon menawarkan dari class person
    
    private int idPetugas;
    private String jabatan;
    
    public petugas(int idPetugas, String nama, String alamat, String telepon, String jabatan) {
        super(nama, alamat, telepon); // pemanggilan constructor person
        this.idPetugas = idPetugas;
        this.jabatan = jabatan;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idPetugas" */
    public int getIdPetugas() {
        return idPetugas;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "jabatan" */
    public String getJabatan() {
        return jabatan;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "nama" */
    public String getNama() {
        return nama;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat" */
    public String getAlamat() {
        return alamat;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon" */
    public String getTelepon() {
        return telepon;
    }
}
