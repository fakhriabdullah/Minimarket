/**
 * Created by Handoko on 4/12/2017.
 */
public class Penjualan {
    String barang;
    int hargaJual;
    int jumlah;
    int total;
    int tunai;

    public Transaksi trans;


    public Penjualan(int hargaJual, int jumlah, int total, int tunai, Transaksi trans) {
        this.barang = barang;
        this.hargaJual = hargaJual;
        this.jumlah = jumlah;
        this.total = total;
        this.tunai = tunai;
        this.trans = trans;
    }

    public int getTotalHargaPenjualan() {
        return total;
    }

    public int getHargaJual(){
        return hargaJual;
    }

    public int getJumlah(){
        return jumlah;
    }

    public int getTunai(){
        return tunai;
    }

    public static void main(String[] args) {
        Transaksi trans;

    }

    public void printTransaksiPenjualan() {
    }
}
