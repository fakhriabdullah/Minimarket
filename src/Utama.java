import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by fakhriabdullah on 12/04/2017.
 */
/*
    untuk test semua class
 */
public class Utama {
    private HashMap<Integer, TransaksiPembelian> daftarPembelian = new HashMap<>();
    private HashMap<Integer, TransaksiPenjualan> daftarPenjualan = new HashMap<>();

    public void addPembelian(TransaksiPembelian pembelian)
    {
        daftarPembelian.put(pembelian.idTransaksiPembelian,pembelian);
    }
    public void addPenjualan(TransaksiPenjualan penjualan)
    {
        daftarPenjualan.put(penjualan.idTransaksiPenjualan, penjualan);
    }

    public void printLaporanHariIni()
    {
        Laporan laporan = new Laporan(daftarPenjualan,daftarPembelian);
        laporan.laporanHariIni();
    }

    public void printLaporanBulanIni()
    {
        Laporan laporan = new Laporan(daftarPenjualan,daftarPembelian);
        laporan.laporanBulanIni();
    }

    public static void main(String[] args)
    {
        Utama minimarket = new Utama();
        //pertama isi dulu gudangnya
        Gudang gudang=new Gudang();
        gudang.isiGudang();
        //tambahkan penjualan
        Karyawan kasir = new Karyawan(1, "Budi", "Gerlong", "0888811212");
        TransaksiPenjualan transaksiPenjualan = new TransaksiPenjualan(1,kasir);
        Barang b = gudang.cariBarang(1);
        if(b!=null)
        {
            Penjualan p = new Penjualan(b, b.getHargaJual());
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
        minimarket.addPenjualan(transaksiPenjualan);
        System.out.println();
        System.out.println("Nota Penjualan");
        System.out.println("====================");
        transaksiPenjualan.printPenjualan();
        //penjualan kedua
        TransaksiPenjualan transaksiPenjualan2 = new TransaksiPenjualan(2, kasir);
        b = gudang.cariBarang(3);
        if(b!=null)
        {
            if(b!=null)
            {
                Penjualan p = new Penjualan(b, b.getHargaJual());
                p.setJumlah(1);
                transaksiPenjualan2.addPenjualan(p);
            }else
            {
                System.out.println("Stok Barang Habis");
            }
        }
        transaksiPenjualan2.setTunai(100000);
        date = new Date();
        transaksiPenjualan2.setWaktuPenjualan(date);
        minimarket.addPenjualan(transaksiPenjualan2);
        System.out.println();
        System.out.println("Nota Penjualan");
        System.out.println("====================");
        transaksiPenjualan2.printPenjualan();

        //tambah pembelian
        Supplier supplier = new Supplier(1,"indofood","jakarta","021-99111");
        TransaksiPembelian transPembelian = new TransaksiPembelian(1,supplier);
        b = gudang.cariBarang(1);
        Pembelian p = new Pembelian(b.hargaBeli, b);
        p.setJumlah(100);
        transPembelian.addPembelian(p);
        Date hariIni = new Date();
        transPembelian.setWaktuPembelian(hariIni);
        System.out.println();
        System.out.println("Nota Pembelian");
        System.out.println("====================");
        transPembelian.print();
        minimarket.addPembelian(transPembelian);
        minimarket.printLaporanHariIni();

        ///returrr pembelian
        TransaksiPembelian transRetur = minimarket.daftarPembelian.get(1);
        Retur retur = new Retur(1, transRetur);
        Barang brgRetur= transRetur.arrPembelian.get(0).barang;
        DetailRetur detail = new DetailRetur(brgRetur, brgRetur.hargaBeli);
        detail.setJumlah(5);
        retur.addDetailRetur(detail);
        retur.print();
    }
}
