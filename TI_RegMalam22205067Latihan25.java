/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Ejaan Nama
 */
// Impor perpustakaan Java
import java.util.Scanner;

// Inisialisasi kelas Utama
public class TI_RegMalam22205067Latihan25 {

    // Jalankan metode utama
    public static void main(String[] args) {

        // Inisialisasi pemindai untuk input dan setel variabel
        Scanner input = new Scanner(System.in);
        String name;

        // Masukkan nama depan
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        name = input.nextLine();

        // Tampilkan ejaannya
        System.out.println("Ejaan untuk " + "\"" + name + "\"" + " adalah: ");

        // Ulangi sebagai pemutus huruf demi huruf menggunakan charAt
        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);

            // Dan tampilkan
            System.out.println("Huruf ke- " + (i + 1) + " : " + character);
        }
    }
}