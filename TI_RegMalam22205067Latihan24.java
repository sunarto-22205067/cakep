/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Perbandingan Dua Buah Nilai
 */
import java.util.Scanner;

public class TI_RegMalam22205067Latihan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========Program Perbandingan Nilai========");

        String ulangiAktivitas;
        do {
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = input.nextInt();

            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = input.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }
            System.out.println(" ");
            
            System.out.print("Ulangi Aktivitas? (Ya/Tidak): ");
            ulangiAktivitas = input.next().toLowerCase();
           System.out.println(" ");
        } while (ulangiAktivitas.equals("ya"));
           
        System.out.println("Terima kasih!");
    }
}