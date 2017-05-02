import java.util.HashMap;

/**
 * Created by anwar on 12/04/2017.
 */
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
        Barang brg = new Barang(1, "Indomie", 2500, 2000, "2 Juni 2018", 20, "Makanan");
        pembelian.setBarang(brg);
        brg = new Barang(2, "Clear", 2500, 2000, "2 Juni 2018", 30, "Alat Mandi");
        pembelian.setBarang(brg);
        brg = new Barang(2, "Gatsby", 20000, 9000, "2 Juni 2018", 15, "Minyak Rambut");
        pembelian.setBarang(brg);
        pembelian.print();
    }
}
