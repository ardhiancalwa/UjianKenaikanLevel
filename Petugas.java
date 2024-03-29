import java.util.ArrayList;

// implementasi inherintace
public class Petugas extends User{

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public void doYourJob(Barang barang){
        System.out.print("Nama Barang : ");
        barang.addNamaBarang();
        System.out.print("Harga Awal Barang : ");
        barang.addHargaAwal();
        barang.setStatus(true);
    }

    public Petugas(String nama, String alamat, String telp){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telp);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public String getNama(int ID) {
        return namaPetugas.get(ID);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public String getAlamat(int ID) {
        return alamat.get(ID);
    }
    
    // membuat ulang method pada sub-class
    @Override
    public String getTelepon(int ID) {
        return alamat.get(ID);
    }
}
