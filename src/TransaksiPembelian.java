import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by anwar on 02/05/2017.
 */
public class TransaksiPembelian {
    int idTransaksiPembelian;
    int total;
    Supplier supplier;
    Date waktuPembelian;

    ArrayList<Pembelian> arrPembelian = new ArrayList<>();

    public void addPembelian(Pembelian p){
        arrPembelian.add(p);
    }

    public TransaksiPembelian(int idTransaksiPembelian,Supplier supplier){
        this.idTransaksiPembelian=idTransaksiPembelian;
        this.supplier=supplier;
    }

    public int hitungTotalPembelian(){
        int totalPembelian = 0;
        for (Pembelian p : arrPembelian) {
            totalPembelian = p.jumlah * p.getHargaBeli();
        }
        return totalPembelian;
    }

    public void setWaktuPembelian(Date waktuPembelian) {
        this.waktuPembelian = waktuPembelian;
    }

    public void print(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Nama Supplier : "+supplier.namaSupplier);
        System.out.println("Waktu Pembelian : "+dateFormat.format(waktuPembelian));
        for (Pembelian p : arrPembelian) {
            p.print();
        }
        System.out.println("Total Pembelian : "+hitungTotalPembelian());
    }

    public static void main(String[] args) {
        Supplier supplier = new Supplier(1,"indiefood","jakarta","021-99111");
        TransaksiPembelian transPembelian = new TransaksiPembelian(1,supplier);
        Date hariIni = new Date();
        transPembelian.setWaktuPembelian(hariIni);
        Barang brg = new Barang(1,"Rinsi",1000,900,"18-12-2020",0,"Sabun");
        Pembelian p = new Pembelian(5000,brg);
        p.setJumlah(100);
        transPembelian.addPembelian(p);
        transPembelian.print();

    }
}
