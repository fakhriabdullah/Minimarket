import java.util.HashMap;

/**
 * Created by Handoko on 4/11/2017.
 */
public class Transaksi {
    int id;
    String tgl;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public static void main(String[] args) {
        Transaksi t = new Transaksi();
    }
}

class Penjualan extends Transaksi{
    String barang;
    int hargaJual;
    int jumlah;
    int total;
    int tunai;

    public Penjualan(int id, String tgl, String barang, int hargaJual, int jumlah, int total, int tunai) {
        this.id = id;
        this.tgl = tgl;
        this.barang = barang;
        this.hargaJual = hargaJual;
        this.jumlah = jumlah;
        this.total = total;
        this.tunai = tunai;
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
        Penjualan p = new Penjualan(1, "2-11-2017","Pepsodent", 3000, 3, 9000, 10000);

        p.printTransaksiPenjualan();
    }
}

class Pembelian extends Transaksi{
    private HashMap<Integer,Barang> hmBarang = new HashMap<>();
    int hargaBeli;
    int jumlah;
    int total;

    public Pembelian (Barang b, int hargaBeli, int jumlah, int total){
        this.hmBarang.put(b.idBarang,b);
        this.hargaBeli = hargaBeli;
        this.jumlah = jumlah;
        this.total = total;
    }

    public int setHitungTotalHargaPembelian(){
        int total=0;
        for(Barang b:hmBarang.values()){
            total = total+b.hargaBeli*jumlah;
        }
        return total;
    }

    public int getHitungTotalHargaPembelian(){
        return total;
    }

    public void setBarang(){}
    public void getBarang(){}
    public int setHargaBeli(){return total;}
    public int getHargaBeli(){return total;}
    public int setJumlah(){return total;}
    public int getJumlah(){return total;}
}