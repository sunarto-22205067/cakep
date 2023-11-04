/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Tunjangan
 */
 
import java.util.Scanner;

public class TI_RegMalam22205067Latihan17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===========Program Tunjangan===========");

        // Meminta input gaji pokok 
        System.out.print("Berapa gaji pokok Anda perbulan? Rp. ");
        double gajiPokok = input.nextDouble();

        // Meminta input status pernikahan
        System.out.print("Apakah Anda sudah menikah? (Menikah/Belum): ");
        String statusPernikahan = input.next();

        double tunjangan = 2100000;

        // Cek status pernikahan
        if (statusPernikahan.equalsIgnoreCase("Menikah")) {
            // Jika menikah, berikan tunjangan 35% dari gaji pokok
            tunjangan = 0.35 * gajiPokok;
        }
        
        if (statusPernikahan.equalsIgnoreCase("Belum")) {
            // Jika belum, berikan tunjangan 25% dari gaji pokok
            tunjangan = 0.25 * gajiPokok;
        }

        // Hitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Tampilkan hasil
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t: Rp " + totalGaji);
        System.out.println("(Developed by: Sunarto)");

        input.close();
    }
}