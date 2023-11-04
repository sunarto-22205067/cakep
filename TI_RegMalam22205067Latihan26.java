/**
 *
 * @author mr.sun
 * Nama : Sunarto
 * Kelas : Malam
 * NIM : 22205067
 * Description Program : Program Waktu Saat Ini
 */
// Impor perpustakaan Java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.DayOfWeek;

public class TI_RegMalam22205067Latihan26 {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        DayOfWeek currentDayOfWeek = currentTime.getDayOfWeek();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss", Locale.forLanguageTag("in-ID"));
        String formattedTime = currentTime.format(formatter);

        String dayOfWeekInIndonesian = currentDayOfWeek.getDisplayName(TextStyle.FULL, new Locale("in", "ID"));

        System.out.println("Hari ini adalah hari : " + dayOfWeekInIndonesian + ", " + formattedTime);
    }
}