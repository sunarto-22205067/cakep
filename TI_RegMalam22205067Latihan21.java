/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Rata-Rata Nilai
 */

import java.util.Scanner;

public class TI_RegMalam22205067Latihan21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int banyakMahasiswa = input.nextInt();

        int totalNilai = 0;

        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            int nilai = input.nextInt();
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / banyakMahasiswa;

        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by : Sunarto");
    }
}