
public class ListPetugas {
    // pemberian nilai pada array "list" dengan tipe class petugas
    petugas[] list = {
        new petugas(1, "Ana", "Lampung", "0341", "Supervisor"),
        new petugas(2, "Bambang", "Ponorogo", "0341", "Kasir"),
        new petugas(3, "Dani", "Ngantru", "0341", "Manager"),
    };
    
    // method untuk menampilkan data list petugas
    public void viewListPetugas() {
        System.out.println("--- List Petugas ---");
        System.out.println("ID \t Nama \t Alamat \t Jabatan");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdPetugas() + "\t"
            + list[i].getNama() + "\t"
            + list[i].getAlamat() + "\t"
            + list[i].getJabatan());
        }
    }
    
    public int cariPetugas(int id) {
        int foundIndex = 0;
        // pencarian data berdasarkan id
        for (int i = 0; i < list.length; i++) {
            // jika id yang dicari ditemukan
            if (list[i].getIdPetugas()== id) {
                foundIndex = i; // menyimpan nilai index dari data yang ditemukan
            }
        }
        return foundIndex;
    }
}
