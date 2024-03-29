import java.util.ArrayList;

// implementasi inherintace
public class Lelang implements mengLelang {
    ArrayList<Boolean> Status = new ArrayList<Boolean>();
    ArrayList<Integer> idPenawar = new ArrayList<>();
    ArrayList<Integer> idBarang = new ArrayList<>();
    ArrayList<Integer> hargaTawar = new ArrayList<>();
    
    @Override
    public void addPenawar(int ID) {
        this.idPenawar.add(ID);
    }

    @Override
    public void addIdBarang(int ID) {
        this.idBarang.add(ID);
    }

    @Override
    public void addHargaTawar(int harga) {
        this.hargaTawar.add(harga);
    }

    @Override
    public void setStatus(boolean status) {
        this.Status.add(status);
    }

    @Override
    public int getHargaTertinggi() {
        return 0;
    }

    @Override
    public int getIdPenawar() {
        return 0;
    }

    @Override
    public boolean getStatus(int id) {
        return this.Status.get(id);
    }
}
 
    

