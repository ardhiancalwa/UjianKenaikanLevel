

/** implementasi inherintace */
public class client extends person {
    /** class Client hanya menambahkan attribut idClient dan saldo
     untuk nama, alamat, dan telepon mewariskan dari claas Person */
    private int idClient;
    private double saldo;

    public client(int idClient, String nama, String alamat, String telepon, double saldo) {
        super(nama, alamat, telepon); /** pemanggilan constructor Person */
        this.idClient = idClient;
        this.saldo = saldo;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idClient" */
    public int getIdClient() {
        return idClient;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "saldo" */
    public double getSaldo() {
        return saldo;
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
    
    /** method untuk menguragi saldo dari client */
    public void kurangiSaldo(double jumlah){
        this.saldo -= jumlah;
    }
              
}