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
            printPenjualan();
        }
        System.out.println("Total Penjualan : "+hitungTotalPenjualan());
    }

    public static void main(String[] args) {
//        Karyawan kasir = new Karyawan(1, "Budi", "Gerlong", "0888811212");
//        TransaksiPenjualan transP = new TransaksiPenjualan(kasir);
////        Penjualan p = new Penjualan("Rinso", 25000);
//        transP.setTunai(50000);
//        Date date = new Date();
//        transP.setWaktuPembelian(date);
//        p.setJumlah(1);
//        transP.addPenjualan(p);
//        transP.printPenjualan();
        Karyawan kasir = new Karyawan(1, "Budi", "Gerlong", "0888811212");
        TransaksiPenjualan transaksiPenjualan = new TransaksiPenjualan(1,kasir);
        Gudang gudang = new Gudang();
        gudang.isiGudang();
        Barang b = gudang.cariBarang(1);
        if(b!=null)
        {
            Penjualan p = new Penjualan(b.idBarang, b.getHargaJual());
            p.setJumlah(1);
            transaksiPenjualan.addPenjualan(p);
        }else
        {
            System.out.println("Stok Barang Habis");
        }
        b = gudang.cariBarang(1);
        if(b!=null)
        {
            if(b!=null)
            {
                Penjualan p = new Penjualan(b, b.getHargaJual());
                p.setJumlah(2);
                transaksiPenjualan.addPenjualan(p);
            }else
            {
                System.out.println("Stok Barang Habis");
            }
        }
        transaksiPenjualan.setTunai(100000);
        Date date = new Date();
        transaksiPenjualan.setWaktuPenjualan(date);
       // minimarket.addPenjualan(transaksiPenjualan);
        System.out.println();
        System.out.println("Nota Penjualan");
        System.out.println("====================");
        transaksiPenjualan.printPenjualan();
    }
}
