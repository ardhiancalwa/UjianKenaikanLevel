
import java.util.Scanner;


public class laundry {

    public static void main(String[] args) {
        // prepare untuk menangangi input dari user
        Scanner input = new Scanner(System.in);
        
        // membuat variabel untuk mengondisikan program masih berjalan atau berhenti
        boolean stay = true;
        
        // prepare variabel untuk menyimpan input user
        String key;
        
        // prepare object yang berisi daftar janis laundry
        ListJenisLaundry listlaundry = new ListJenisLaundry();
        
        // prepare object yang berisi daftar petugas
        ListPetugas listPetugas = new ListPetugas();
        
        // prepare object yang berisi client
        ListClient listClient = new ListClient();
        
        while (stay){ // selama nilai "stay" = ture maka program akan terus berjalan
            
            // tampilan menu
            System.out.println("-- Jack's Laundry --");
            System.out.println("1. List Laundry");
            System.out.println("2. List Petuagas");
            System.out.println("3. List Client");
            System.out.println("4. Transaksi");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            
            // pengondisian pilihan menu user 
            if (menu == 1) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                // menampilkan daftar jenis laundry
                listlaundry.viewJenisLaundry();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 2) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                // menampilkan daftar petugas
                listPetugas.viewListPetugas();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 3) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                // menampilkan daftar client
                listClient.viewListClient();
                System.out.println("Press any key and enter...");
                key  = input.next();
            } else if (menu == 5) {
                // variabel "stay" diset false menyebabkan program berhenti
                stay = false;
            } else if (menu == 4) {
                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("--- Transaksi Laundry ---");
                
                // prepare variabel "jumlahLaundry" untuk menyimpan data
                // banyaknya jenis laundry yang dipilih
                // variabel "selectedIDClient" untuk menyimpan data id client yang dipilih
                
                int jumlahLaundry, selectedIDClient;
                
                System.out.print("Masukkan id client: ");
                selectedIDClient = input.nextInt();
                
                // "foundIndex" menyimpan posisi index dari data client yg dipilih
                int foundIndex = listClient.cariClient(selectedIDClient);
                
                // "selectedIDClient" menyimpan data client yg dipilh
                client selectedClient = listClient.list[foundIndex];
                
                System.out.println("\nMasukkan jumlah laundry pada transaksi ini: ");
                jumlahLaundry = input.nextInt();
                
                
                // prepare array transaksi dengan space sebanyak yg diinputkan user
                transaksi[] listTransaksi = new transaksi[jumlahLaundry];
                
                // proses pemilihan jenis laundry
                for (int i = 0; i < jumlahLaundry; i++) {
                    // menampilkan daftar jenis laundry
                    listlaundry.viewJenisLaundry();
                    
                    System.out.println("Pilih id laundry yang diinginkan: ");
                    int selectedIDJenisLaundry = input.nextInt();
                    
                    // "foundLaundry" menyimpan posisi index dari jenis laundry yg dipilih 
                    int foundLaundry = listlaundry.cariJenisLaundry(selectedIDJenisLaundry);
                    
                    // "selectedLaundry" menyimpan data jenis laundry yg dipilih
                    JenisLaundry selectedLaundry = listlaundry.list[foundLaundry];
                    
                    System.out.print("\nMasukkan jumlah "+ listlaundry.list[foundLaundry].getJenisLaundry()
                    + "yang dicuci: ");
                    
                    int qty = input.nextInt();
                    
                    // penambahan data transaksi ke dalam array
                    listTransaksi[i] = new transaksi(selectedLaundry, qty);
                }
                
                // prepare variabel untuk menyimpan total seluruh transaksi 
                double total = 0;
                
                // menampilkan daftar transaksi
                System.out.println("--- List Transaksi ---");
                System.out.println("Client: "+ selectedClient.getNama());
                System.out.println("Jenis Laundry \t Harga \t Jumlah \t Total");
                for (int i = 0; i < listTransaksi.length; i++) {
                    System.out.println(listTransaksi[i].selectedLaundry.getJenisLaundry() + "\t" +
                            listTransaksi[i].selectedLaundry.getHarga() + " \t " +
                            listTransaksi[i].jumlah + " \t " + listTransaksi[i].total);
                    
                    total += listTransaksi[i].total;
                }
                
                System.out.println("Total Harga: " + total);
                
                // pengurangan saldo dari client yg dipilih
                listClient.list[foundIndex].kurangiSaldo(total);
                
                System.out.println("Press any key and enter...");
                key = input.next();
            }
            
        }
    }
    
}
