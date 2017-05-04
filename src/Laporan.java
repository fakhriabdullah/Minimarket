import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by fakhriabdullah on 03/05/2017.
 */
public class Laporan {
    HashMap<Integer, TransaksiPenjualan> arrPenjualan = new HashMap<>();
    HashMap<Integer, TransaksiPembelian> arrPembelian = new HashMap<>();

    public Laporan(HashMap<Integer, TransaksiPenjualan> arrPenjualan, HashMap<Integer, TransaksiPembelian> arrPembelian) {
        this.arrPenjualan = arrPenjualan;
        this.arrPembelian = arrPembelian;
    }

    public void laporanHariIni()
    {
        Integer masuk=0, keluar=0;
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date hariIni=new Date();
        System.out.println("PENJUALAN HARI INI");
        System.out.println("Nama Karyawan|Waktu|Total Penjualan|Tunai|Kembalian|");
        for(TransaksiPenjualan p : arrPenjualan.values())
        {
            if(dateFormat.format(hariIni).equals(dateFormat.format(p.waktuPenjualan)))
            {
                System.out.println(p.kasir.getNamaKaryawan()+"|"+dateFormat.format(p.waktuPenjualan)+"|"+p.hitungTotalPenjualan()+"|"+p.tunai+"|"+p.hitungKembalianPenjualan());
                masuk+=p.hitungTotalPenjualan();
            }
        }
        System.out.println("=========================");
        System.out.println("PEMBELIAN HARI INI");
        System.out.println("Nama Supplier|Waktu Pembelian|Total Pembelian");
        for (TransaksiPembelian b:arrPembelian.values())
        {
            if(dateFormat.format(hariIni).equals(dateFormat.format(b.waktuPembelian)))
            {
                System.out.println(b.supplier.getNamaSupplier()+"|"+dateFormat.format(b.waktuPembelian)+"|"+b.hitungTotalPembelian());
                keluar+=b.hitungTotalPembelian();
            }
        }

        System.out.println("Total Pemasukan   : Rp"+masuk);
        System.out.println("Total Pengeluaran : Rp"+keluar);
        System.out.println("Keuntungan        : Rp"+(masuk-keluar));
    }

    public void laporanBulanIni()
    {
        Integer masuk=0, keluar=0;
        DateFormat dateFormat = new SimpleDateFormat("MM-yyyy");
        Date hariIni=new Date();
        System.out.println("==========================");
        System.out.println("LAPORAN");
        System.out.println("==========================");
        System.out.println("PENJUALAN BULAN INI");
        System.out.println("Nama Karyawan|Waktu|Total Penjualan|Tunai|Kembalian|");
        for(TransaksiPenjualan p : arrPenjualan.values())
        {
            if(dateFormat.format(hariIni).equals(dateFormat.format(p.waktuPenjualan)))
            {
                System.out.println(p.kasir.getNamaKaryawan()+"|"+dateFormat.format(p.waktuPenjualan)+"|"+p.hitungTotalPenjualan()+"|"+p.tunai+"|"+p.hitungKembalianPenjualan());
                masuk+=p.hitungTotalPenjualan();
            }
        }
        System.out.println("=========================");
        System.out.println("PEMBELIAN HARI INI");
        System.out.println("Nama Supplier|Waktu Pembelian|Total Pembelian");
        for (TransaksiPembelian b:arrPembelian.values())
        {
            if(dateFormat.format(hariIni).equals(dateFormat.format(b.waktuPembelian)))
            {
                System.out.println(b.supplier.getNamaSupplier()+"|"+dateFormat.format(b.waktuPembelian)+"|"+b.hitungTotalPembelian());
                keluar+=b.hitungTotalPembelian();
            }
        }

        System.out.println("Total Pemasukan   : Rp"+masuk);
        System.out.println("Total Pengeluaran : Rp"+keluar);
        System.out.println("Keuntungan        : Rp"+(masuk-keluar));
    }

    public static void main(String[] args)
    {
//        Laporan laporan = new Laporan();
//        laporan.laporanHariIni();
    }
}
