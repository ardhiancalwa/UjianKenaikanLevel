
package perpustakaan;

public class Perpustakaan {
    public static void main(String[] args) {
        // membuat object dari class class tersebut
        Buku buku = new Buku();
        Laporan laporan = new Laporan();
        Siswa siswa= new Siswa();
        Peminjaman peminjaman = new Peminjaman();
        
        laporan.laporan(buku);
        laporan.laporan(siswa);
        peminjaman.prosesPeminjaman(siswa, peminjaman, buku);

        laporan.laporan(buku);
        laporan.laporan(siswa);
    
    }
}
