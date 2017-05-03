import java.util.ArrayList;
import java.util.Date;

/**
 * Created by fakhriabdullah on 03/05/2017.
 */
public class Retur {
    int idRetur;
    TransaksiPembelian transaksiPembelian;
    Date waktuRetur;
    ArrayList<DetailRetur> arrDetailRetur = new ArrayList<DetailRetur>();

    public Retur(int idRetur, TransaksiPembelian transaksiPembelian) {
        this.idRetur = idRetur;
        this.transaksiPembelian = transaksiPembelian;
    }

    public void setWaktuRetur(Date waktuRetur) {
        this.waktuRetur = waktuRetur;
    }

    public void addDetailRetur(DetailRetur detailRetur)
    {
        arrDetailRetur.add(detailRetur);
    }

    public void print()
    {
        System.out.println();
        System.out.println("RETUR BARANG");
        System.out.println("==================");
        System.out.println("Supplier : "+transaksiPembelian.supplier.getNamaSupplier());
        System.out.println("Waktu   : "+transaksiPembelian.waktuPembelian);
        System.out.println("Barang yang diretur: ");
        for (DetailRetur dr : arrDetailRetur)
        {
            System.out.println("Nama    :"+dr.barang.getNamaBarang());
            System.out.println("Jumlah  :"+dr.getJumlah());
        }
        System.out.println("Total biaya retur: "+hitungTotalRetur());
    }

    private int hitungTotalRetur() {
        int total=0;
        for (DetailRetur dr : arrDetailRetur)
        {
            total=total+(dr.getJumlah()*dr.getHargaBeli());
        }
        return total;
    }

}
