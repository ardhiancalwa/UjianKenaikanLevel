
public class transaksi {
    JenisLaundry selectedLaundry;
    double jumlah;
    double total;
    
    public transaksi(JenisLaundry selectedLaundry, double jumlah) {
        this.selectedLaundry = selectedLaundry;
        this.jumlah = jumlah;
        this.total = selectedLaundry.getHarga() * jumlah;
    }
}
