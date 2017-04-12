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

class TransPenjualan extends Transaksi{
    String barang;
    int hargaJual;
    int jumlah;
    int total;
    int tunai;

    public TransPenjualan(int id, String tgl, String barang, int hargaJual, int jumlah, int total, int tunai) {
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
        TransPenjualan p = new TransPenjualan(1, "2-11-2017","Pepsodent", 3000, 3, 9000, 10000);

        p.printTransaksiPenjualan();
    }
}

class Pembelian extends Transaksi{
    int hargaBeli;
    int jumlah;
    int total;
    private HashMap<Integer,Barang> hmBarang = new HashMap<>();

    public Pembelian (int hargaBeli, int jumlah){
        this.hargaBeli = hargaBeli;
        this.jumlah = jumlah;
    }

    public int setHitungTotalHargaPembelian(){
        int total=0;
        for(Barang b:hmBarang.values()){
            total = total+b.hargaBeli*jumlah;
        }
        return total;
    }

    public int getHitungTotalHargaPembelian() {
        int total = setHitungTotalHargaPembelian();
        return total;
    }

    public void setBarang(Barang b){
        hmBarang.put(b.idBarang,b);
    }

    public void getBarang(){
        for (Barang b: hmBarang.values()){
            b.printBarang();
        }
        System.out.println("--------------------");
    }

    public int setHargaBeli(){return hargaBeli;}

    public int getHargaBeli(){return hargaBeli;}

    public int setJumlah(){return total;}

    public int getJumlah(){return total;}

    public void print(){
        System.out.println("======================");
        System.out.println("===Daftar Pembelian===");
        this.getBarang();
        total = getHitungTotalHargaPembelian();
        System.out.println("Total Harga Pembelian:"+total);
    }

    public static void main(String[] args) {
        Pembelian pembelian = new Pembelian(5000,100);
        Barang brg = new Barang(1, "Indomie", 2500, 2000, "2 Juni 2018", 20);
        pembelian.setBarang(brg);
        brg = new Barang(2, "Clear", 2500, 2000, "2 Juni 2018", 30);
        pembelian.setBarang(brg);
        brg = new Barang(2, "Gatsby", 20000, 9000, "2 Juni 2018", 15);
        pembelian.setBarang(brg);
        pembelian.print();
    }
}