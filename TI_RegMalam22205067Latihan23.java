/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Nilai Terbesar Dan Terkecil
 */
import java.util.Scanner;

public class TI_RegMalam22205067Latihan23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = input.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int banyakNilai = input.nextInt();

        int[] nilaiMahasiswa = new int[banyakNilai];

        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < banyakNilai; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int i = 1; i < banyakNilai; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("\nPetugas: " + namaPetugas);
    }
}
