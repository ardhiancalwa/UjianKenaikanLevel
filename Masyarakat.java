import java.util.ArrayList;

// implementasi inherintace
public class Masyarakat extends User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();

    public void Masyarakat(String nama, String alamat, String telp){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telp);
        setIdMasyarakat(namaMasyarakat.indexOf(nama));
    }

    public int getIndexFromName(String nama){
        return namaMasyarakat.indexOf(nama);
    }
    public int getIdMasyarakat(int id) {
        return idMasyarakat.get(id);
    }

    public void setIdMasyarakat(int id) {
        this.idMasyarakat.add(id);
    }
    
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    @Override
    public String getNama(int ID) {
        return namaMasyarakat.get(ID);
    }

    @Override
    public String getAlamat(int ID) {
        return alamat.get(ID);
    }

    @Override
    public String getTelepon(int ID) {
        return alamat.get(ID);
    }

}
