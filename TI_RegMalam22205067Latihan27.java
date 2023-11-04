/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Huruf Besar Kecil
 */

import java.util.Scanner;

public class TI_RegMalam22205067Latihan27 {

    // Execute the main method
    public static void main(String[] args) {

        // Initialize a scanner for input and set variables
        Scanner input = new Scanner(System.in);
        String sentence;

        // Enter a sentence
        System.out.print("Masukan Kalimat: ");
        sentence = input.nextLine();

        // Display the result
        System.out.println();
        System.out.println("==== Hasil Formatting ====");

        // Uppercase result
        System.out.println("Uppercase: " + sentence.toUpperCase());

        // Lowercase result
        System.out.println("Lowercase: " + sentence.toLowerCase());
    }
}