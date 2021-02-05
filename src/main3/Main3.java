
package main3;

/**
 *
 * @author Yusuf Isra
 */
public class Main3 {

    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();
       mobil.isidata("Mobil", "Agya", 988, 148000000, 2012);

        System.out.println("<-----< PEMBELIAN KENDARAAN >----->");
       System.out.println("Jenis kendaraan : "+ mobil.jenis);
       System.out.println("Merk Kendaraan  : "+ mobil.merk);
       System.out.println("CC              : "+ mobil.cc);
       System.out.println("Harga Kendaraan : "+ mobil.harga);
       System.out.println("Tahun Pembelian : "+ mobil.tanggal);
    }
    
}
