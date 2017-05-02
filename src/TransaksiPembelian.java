import java.util.ArrayList;

/**
 * Created by anwar on 02/05/2017.
 */
public class TransaksiPembelian {
    int total;
    Supplier supplier;
    String waktuPembelian;

    ArrayList<Pembelian> arrPembelian = new ArrayList<>();

    public void addPembelian(Pembelian p){
        arrPembelian.add(p);
    }

    public TransaksiPembelian(Supplier supplier){
        this.supplier=supplier;
    }

    public int hitungTotalPembelian(){
        int totalPembelian = 0;
        for (Pembelian p : arrPembelian) {
            totalPembelian = p.jumlah * p.getHargaBeli();
        }
        return totalPembelian;
    }

    public void setWaktuPembelian(String waktuPembelian) {
        this.waktuPembelian = waktuPembelian;
    }

    public void print(){}

    public static void main(String[] args) {
        Supplier supplier = new Supplier(1,"indofood","jakarta","021-99111");
        TransaksiPembelian transPembelian = new TransaksiPembelian(supplier);
        transPembelian.waktuPembelian = "08 April 2017";
        System.out.println("Nama Supplier : "+supplier.namaSupplier);
        System.out.println("Total Penjualan : "+transPembelian.hitungTotalPembelian());
    }
}
