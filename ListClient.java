
public class ListClient {
    // pemerian nilai pada array "list" dengan tipe class client
    client[] list = {
        new client(1, "Aldi", "Ngawi", "0101", 50000),
        new client(2, "Dino", "Kediri", "022", 100000),
        new client(3, "Iqbal", "Blitar", "0133", 150000)
    };
    
    // method untuk menampilkan data list client
    public void viewListClient() {
        System.out.println("--- List Client ---");
        System.out.println("ID \t Nama \t Alamat \t Saldo");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdClient() + "\t"
            + list[i].getNama() +  "\t"
            + list[i].getAlamat() + "\t"
            + list[i].getSaldo());
        }
    }
    
    public int cariClient(int id) {
        int foundIndex = 0;
        // pencarian data berdasarkan id
        for (int i = 0; i < list.length; i++) {
            // jika id yang dicari ditemukan
            if (list[i].getIdClient()== id) {
                foundIndex = i; //menyimpan nilai index dari data yg ditemukan
            }
        }
        return foundIndex;
    }
}
