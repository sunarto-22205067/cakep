/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Perhitungan Lingkaran
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class TI_RegMalam22205067Latihan22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("###0.00");

        System.out.println("=====Perhitungan Lingkaran=====");

        double diameter = 0;
        boolean inputValid = false;

        while (!inputValid) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            String userInput = input.next();

            try {
                diameter = Double.parseDouble(userInput);
                if (diameter > 0) {
                    inputValid = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }

        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("\n=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + decimalFormat.format(jariJari) + " cm");
        System.out.println("Luas Lingkaran = " + decimalFormat.format(luas) + " cm");
        System.out.println("Keliling Lingkaran = " + decimalFormat.format(keliling) + " cm");
    }
}
