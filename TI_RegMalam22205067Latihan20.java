/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Target Saldo Tabungan
 */

import java.text.DecimalFormat;

public class TI_RegMalam22205067Latihan20 {
    public static void main(String[] args) {
        DecimalFormat currencyFormat = new DecimalFormat("Rp #,###,###");

        double saldoAwal = 3500000;  // Saldo Awal
        double bungaBulan = 8.0;     // Bunga per Bulan dalam persen
        double saldoTarget = 6000000; // Saldo Target

        int bulan = 1;

        while (saldoAwal < saldoTarget) {
            double bunga = (saldoAwal * bungaBulan / 100);
            saldoAwal += bunga;
            System.out.println("Saldo di bulan ke-" + bulan + " " + currencyFormat.format(saldoAwal));
            bulan++;
        }
    }
}