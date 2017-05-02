/**
 * Created by Handoko on 4/12/2017.
 */

public class Penjualan {
    String barang;
    int hargaJual, jumlah;

    public Penjualan(String barang, int hargaJual) {
        this.barang = barang;
        this.hargaJual = hargaJual;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getBarang() {
        return barang;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public int getJumlah() {
        return jumlah;
    }

    public static void main(String[] args) {
        Penjualan jual = new Penjualan("Rinso", 25000);
        jual.setJumlah(3);
    }
}