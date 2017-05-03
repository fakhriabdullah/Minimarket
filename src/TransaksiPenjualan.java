import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Handoko on 5/2/2017.
 */
public class TransaksiPenjualan {
    int idTransaksiPenjualan;
    int total, tunai;
    Karyawan kasir;
    Date waktuPenjualan;

    ArrayList<Penjualan> arrPenjualan = new ArrayList<>();

    public void addPenjualan(Penjualan p) {
        arrPenjualan.add(p);
    }

    public TransaksiPenjualan(int idTransaksiPenjualan,Karyawan kasir) {
        this.idTransaksiPenjualan=idTransaksiPenjualan;
        this.kasir=kasir;
    }

    public int hitungTotalPenjualan() {
        int totalPenjualan = 0;
        for (Penjualan p : arrPenjualan) {
            totalPenjualan = totalPenjualan + (p.getJumlah() * p.getHargaJual());
        }
        return totalPenjualan;
    }

    public int hitungKembalianPenjualan() {
        int kembalian = 0;
        kembalian = tunai - hitungTotalPenjualan();
        return kembalian;
    }

    public void setTunai(int tunai) {
        this.tunai = tunai;
    }

    public void setWaktuPenjualan(Date waktuPenjualan) {
        this.waktuPenjualan = waktuPenjualan;
    }

    public void printPenjualan() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Nama Karyawan : "+kasir.namaKaryawan);
        System.out.println("Waktu Penjualan : "+dateFormat.format(waktuPenjualan));
        for (Penjualan p : arrPenjualan) {
            p.print();
        }
        System.out.println("Total Penjualan : "+hitungTotalPenjualan());
        System.out.println("Cash : "+tunai);
        System.out.println("Kembalian : "+hitungKembalianPenjualan());
    }

    public static void main(String[] args) {
        Karyawan kasir = new Karyawan(1, "Budi", "Gerlong", "0888811212");
        TransaksiPenjualan transaksiPenjualan = new TransaksiPenjualan(1,kasir);
        Barang b = new Barang(1,"Rinsi",1000,900,"18-12-2020",0,"Sabun");
        Penjualan p = new Penjualan(b, b.getHargaJual());
        p.setJumlah(1);
        transaksiPenjualan.addPenjualan(p);
        Barang b2 = new Barang(1,"Indomi",2000,1500,"18-12-2020",0,"Makanan");
        p = new Penjualan(b2, b2.getHargaJual());
        p.setJumlah(2);
        transaksiPenjualan.addPenjualan(p);
        transaksiPenjualan.setTunai(100000);
        Date date = new Date();
        transaksiPenjualan.setWaktuPenjualan(date);
        System.out.println();
        System.out.println("Nota Penjualan");
        System.out.println("====================");
        transaksiPenjualan.printPenjualan();
    }
}
