package perpustakaan;

public class Laporan {

    public void laporan(Buku buku) {     
        int x=buku.getJmlBuku();

        System.out.println();
        System.out.println("Tabel Buku");
        System.out.println();
        System.out.println("Nama Buku \t Stok \t harga ");
        
        for (int i = 0; i < x; i++) {
            System.out.println(buku.getNamaBuku(i)+"\t"+ buku.getStok(i) +"\t"+ buku.getHarga(i));
        }
    }
    
    public void laporan(Siswa siswa) {
        int x=siswa.getJmlSiswa();

        System.out.println();
        System.out.println("Tabel Siswa");
        System.out.println();
        System.out.println("Nama \t Alamat \t Telepon \t Status");
        for (int i = 0; i < x; i++) {
            System.out.println(siswa.getNama(i)+"\t"+
            siswa.getAlamat(i)+"\t"+siswa.getTelepon(i)+"\t"+
            siswa.getStatus(i));
        }
    }

    public void laporan(Peminjaman peminjaman, Buku buku) {
        int x = peminjaman.getJmlPeminjaman();

        System.out.println();
        System.out.println("Laporan Peminjaman");
        System.out.println();
        System.out.println("Nama Buku \t Qty \t Harga \t Jumlah");

        int total=0;
        for (int i = 0; i < x; i++) {
            int jumlah=peminjaman.getBanyaknya(i)*buku.getHarga(peminjaman.getIdBuku(i));
            total+=jumlah;

               System.out.println(buku.getNamaBuku(peminjaman.getIdBuku(i))+"\t"+

               peminjaman.getBanyaknya(i)+"\t"+buku.getHarga(peminjaman.getIdBuku(i))+"\t"+jumlah);
        }
        System.out.println("Total Omset = "+total);
    }
}
        
       



