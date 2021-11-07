import java.util.Random;

public class bot {
    public int generateHarga(int hargaSebelum){
        Random rand = new Random();
        int lelang = rand.nextInt(2);
        if(lelang != 1){
            int hargaBot = rand.nextInt(hargaSebelum) + hargaSebelum;
            return hargaBot;
        }else{
            return 0;
        }
    }
}