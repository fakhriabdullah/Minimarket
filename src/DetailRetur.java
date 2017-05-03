/**
 * Created by fakhriabdullah on 03/05/2017.
 */
public class DetailRetur {
    Barang barang;
    int jumlah;
    int hargaBeli;

    public DetailRetur(Barang barang, int hargaBeli) {
        this.barang = barang;
        this.hargaBeli = hargaBeli;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }
}
