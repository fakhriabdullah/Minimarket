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

    public void print(){
        System.out.println("Nama Supplier : "+supplier.namaSupplier);
        System.out.println("Waktu Pembelian : "+waktuPembelian);
        for (Pembelian p : arrPembelian) {
            p.print();
        }
        System.out.println("Total Pembelian : "+hitungTotalPembelian());
    }

    public static void main(String[] args) {
        Supplier supplier = new Supplier(1,"indofood","jakarta","021-99111");
        TransaksiPembelian transPembelian = new TransaksiPembelian(supplier);
        transPembelian.setWaktuPembelian("08 April 2017");
        Pembelian p = new Pembelian(5000,"rinso");
        p.setJumlah(100);
        transPembelian.addPembelian(p);
        transPembelian.print();

    }
}
