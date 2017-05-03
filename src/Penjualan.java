/**
 * Created by Handoko on 4/12/2017.
 */

public class Penjualan {
    Barang barang;
    int hargaJual, jumlah;

    public Penjualan(Barang barang, int hargaJual) {
        this.barang = barang;
        this.hargaJual = hargaJual;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Barang getBarang() {
        return barang;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public int getJumlah() {
        return jumlah;
    }

    public static void main(String[] args) {
//        Penjualan jual = new Penjualan("Rinso", 25000);
//        jual.setJumlah(1);
//        System.out.println("Nama Barang : "+jual.barang);
//        System.out.println("Harga Jual : "+jual.hargaJual);
//        System.out.println("Jumlah : "+jual.jumlah);
    }
}