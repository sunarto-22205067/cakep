package TugasPBO;

/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Ganti Kata
 */

import java.util.Scanner;

public class TI_RegMalam22205067Latihan28 {

    // Execute the main method
    public static void main(String[] args) {

        // Initialize a scanner for input and set variables
        Scanner input = new Scanner(System.in);
        String sentence, replaceWord, newWord, formattedNewWord;

        System.out.println("====Program Mengganti Kata====");
        System.out.println(" ");
        
        // Enter a sentence
        System.out.print("Masukan Kalimat : ");
        sentence = input.nextLine();

        // Enter the word to replace
        System.out.print("Ganti Kata : ");
        replaceWord = input.nextLine();

        // Enter the new word
        System.out.print("Menjadi Kata : ");
        newWord = input.nextLine();

        // Set a variable to replace the new word
        formattedNewWord = sentence.replace(replaceWord, newWord);
        System.out.println();

        // Display the result
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + sentence);
        System.out.println("Kalimat Baru : " + formattedNewWord);

    }
}