import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Yusup Andrianto
 * 1400429.
 */
public class Gudang {
    private HashMap<Integer, Barang> barangGudang = new HashMap<>();

    public void addBarang(Barang b)
    {
        barangGudang.put(b.getIdBarang(),b);
    }

    public Barang cariBarang(int idBarang)
    {
        Barang brg = barangGudang.get(idBarang);
        if (brg!=null && brg.getStok()>0) {
            return brg;
        } else {
            return null;
        }
    }

    public void isiGudang()//untuk data dummy mengisi gudang
    {
        addBarang(new Barang(1, "Indomie", 2500, 2000, "2 Juni 2018", 20,"Makanan"));
        addBarang(new Barang(2, "Clear", 2500, 2000, "2 Juni 2018", 30,"Alat Mandi"));
        addBarang(new Barang(3, "Gatsby", 20000, 9000, "2 Juni 2018", 15, "Minyak Rambut"));
    }
    public static void main (String[] args){
        Gudang gdg = new Gudang();
        gdg.isiGudang();
        Barang brg = gdg.cariBarang(1);
        if (brg!=null){
            brg.printBarang();
        }
        else{
            System.out.println("Barang Kosong");
        }
    }
}