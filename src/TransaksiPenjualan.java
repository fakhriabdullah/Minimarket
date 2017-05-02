import java.util.ArrayList;

/**
 * Created by Handoko on 5/2/2017.
 */
public class TransaksiPenjualan {
    int total, tunai;
    Karyawan kasir;
    String waktuPembelian;

    ArrayList<Penjualan> arrPenjualan = new ArrayList<>();

    public void addPenjualan(Penjualan p) {
        arrPenjualan.add(p);
    }

    public TransaksiPenjualan(Karyawan kasir) {
        this.kasir=kasir;
    }

    public int hitungTotalPenjualan() {
        int totalPenjualan = 0;
        for (Penjualan p : arrPenjualan) {
            totalPenjualan = p.jumlah * p.hargaJual;
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

    public void setWaktuPembelian(String waktuPembelian) {
        this.waktuPembelian = waktuPembelian;
    }

    public static void main(String[] args) {
        Karyawan kasir = new Karyawan(1, "Budi", "Gerlong", "0888811212");
        TransaksiPenjualan transP = new TransaksiPenjualan(kasir);
        transP.setTunai(50000);
        transP.waktuPembelian = "08 April 2017";
        System.out.println("Nama Karyawan : "+kasir.namaKaryawan);
        System.out.println("Total Penjualan : "+transP.hitungTotalPenjualan());
        System.out.println("Nama Karyawan : "+kasir.namaKaryawan);

    }
}
