/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Saldo Tabungan
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class TI_RegMalam22205067Latihan19 {
    public static void main(String[] args) {
        DecimalFormat currencyFormat = new DecimalFormat("Rp #,###,###");
        
        double saldoAwal = 2500000;  // Saldo Awal
        double bungaBulan = 15.0;    // Bunga per Bulan dalam persen
        int lamaBulan = 6;           // Lama dalam bulan
        
        System.out.println("Saldo Awal: " + currencyFormat.format(saldoAwal));
        System.out.println("Bunga/Bulan(%): " + bungaBulan);
        System.out.println("Lama (bulan): " + lamaBulan);
        System.out.println("Output:");
        
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            double bunga = (saldoAwal * bungaBulan / 100);
            saldoAwal += bunga;
            System.out.println("Saldo di bulan ke-" + bulan + " " + currencyFormat.format(saldoAwal));
        }
    }
}