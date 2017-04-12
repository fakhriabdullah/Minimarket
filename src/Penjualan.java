import java.util.ArrayList;

/**
 * Created by Handoko on 4/12/2017.
 */
class Penjualan extends Transaksi{
    Barang barang;
    int hargaJual;
    int jumlah;
    int total;
    int tunai;

    private ArrayList<Transaksi> transaksiPenjualan = new ArrayList<>();

    public Penjualan(int hargaJual, int jumlah, int total, int tunai) {
        this.hargaJual = hargaJual;
        this.jumlah = jumlah;
        this.total = total;
        this.tunai = tunai;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getTotal() {
        return total;
    }

    public int getTunai() {
        return tunai;
    }

    public int hitungKembalian(int uang){
        return uang;
    }

    public void printTransaksiPenjualan()
    {
        System.out.println("ID Transaksi : "+id);
        System.out.println("Tgl Transaksi : "+tgl);
        System.out.println("Barang : "+barang);
        System.out.println("Harga Jual : "+hargaJual);
        System.out.println("Jumlah Barang : "+jumlah);
        System.out.println("Total Bayar : "+total);
        System.out.println("Tunai : "+tunai);

    }

    public static void main(String[] args) {
        Penjualan p = new Penjualan(3000, 3, 9000, 10000);
        p.printTransaksiPenjualan();

    }
}
