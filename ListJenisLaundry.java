
public class ListJenisLaundry {
    // pemberin nilai pada array "list" dengan tipe class JenisLaundry
    JenisLaundry[] list = {
        new JenisLaundry(1, "Pakaian", 5000,1),
        new JenisLaundry(2, "Selimut", 10000, 1),
        new JenisLaundry(3, "Karpet", 20000, 2),
    };
    
    // method untuk menampilkan data list jenis laundry
    public void viewJenisLaundry() {
        System.out.println("--- List Laundry ---");
        System.out.println("ID \t Jenis \t Harga \t Durasi");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdJenisLaundry() + "\t"
            + list[i].getJenisLaundry() + "\t"
            + list[i].getHarga() + "\t"
            + list[i].getDurasi());
        }
    }
    
    public int cariJenisLaundry(int id) {
        int foundIndex = 0;
        // pencarian data berdasarkan id
        for (int i = 0; i < list.length; i++) {
            // jika id yang dicari ditemukan
            if(list[i].getIdJenisLaundry()== id){
                foundIndex = i; // menyimpan nilai index dari data yang ditemukan
            }
        }
        return foundIndex;
    }
}
